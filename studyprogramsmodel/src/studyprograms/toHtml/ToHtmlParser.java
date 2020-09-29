package studyprograms.toHtml;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import studyprograms.Course;
import studyprograms.CourseGroup;
import studyprograms.CourseGroupeType;
import studyprograms.NTNU;
import studyprograms.Semester;
import studyprograms.SemesterPart;
import studyprograms.Specialisations;
import studyprograms.StudyPlan;
import studyprograms.StudyProgram;
import studyprograms.StudyprogramsPackage;
import studyprogramsmodel.example.Studyprograms;

// HTML Lib: https://jsoup.org/cookbook/extracting-data/dom-navigation
public class ToHtmlParser {
	private static final String DESTINATION_FILE = "/home/jone/repos/tdt4250-assignment1/studyprogramsmodel/src/studyprograms/toHtml/frakode.html";
	
	public static void main(String[] args) throws Exception {
		ToHtmlParser parser = new ToHtmlParser();
		EList<EObject> objects = parser.getResource(Studyprograms.class.getResource("ExampleInstances.xmi").toString());
		print(objects, "");
		Document doc = parser.createDocument((NTNU)objects.get(0));
		BufferedWriter writer = new BufferedWriter(new FileWriter(DESTINATION_FILE));
	    System.out.println(doc.toString());
		writer.write(doc.toString());   
	    writer.close();
	}
	
	private final String htmlTemplate = "<html><head><link rel=\"stylesheet\" href=\"styles.css\"></head>"
            + "<body></body></html>";
	
	public EList<EObject> getResource(String fileResource) {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(StudyprogramsPackage.eNS_URI, StudyprogramsPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		return resSet.getResource(URI.createURI(fileResource), true).getContents();
	}
	
	public static void print(EList<EObject> list, String indent) {
		for(EObject obj : list) {
			if(obj.eContents().size() == 0) {
				System.out.println(indent + obj.toString());
			} else {
				System.out.println(indent + obj.toString());
				print(obj.eContents(), indent + "\t");
			}
		}
	}
	
	public Document createDocument(NTNU container) throws Exception {
		Document d = Jsoup.parse(htmlTemplate);
		d.title("StudyPrograms overview fra kode");
		Element el = parse(container);
		d.body().appendChild(el);
		return d;
	}
		
	
	public Element parse(NTNU container) throws Exception {
		Element elNtnu = new Element(Tag.valueOf("div"), "");
		elNtnu.appendChild(getH1("NTNU"));
		elNtnu.appendChild(getH2("Study Programs"));
		
		for(StudyProgram program : container.getStudyprograms()) {
			Element elProgram = parse(program);
			elNtnu.appendChild(elProgram);
			// Add courses outside of specialization
			elProgram.appendChild(getH3("Courses"));
			for(int i = 1; i <= program.getNrOfSemesters()/2; i++) {
				for(CourseGroupeType type: CourseGroupeType.values()) {
					EList<Course> coursesForSemesterFall = program.getCoursesForSemester(i, SemesterPart.FALL, type);
					EList<Course> coursesForSemesterSpring = program.getCoursesForSemester(i, SemesterPart.SPRING, type);
					if(coursesForSemesterFall.size() > 0) {
						elProgram.appendChild(getH4("Year: " + i + " part: " + SemesterPart.FALL + " type: " + type));								
						elProgram.appendChild(parse(coursesForSemesterFall));				
					}
					if(coursesForSemesterSpring.size() > 0) {
						elProgram.appendChild(getH4("Year: " + i + " part: " + SemesterPart.SPRING + " type: " + type));
						elProgram.appendChild(parse(coursesForSemesterSpring));					
					}					
				}
			}
			
			elProgram.appendChild(getH3("Specialisations with courses"));
			for(Specialisations spec : program.getSpecialisations()) {
				Element elSpecialisations = parse(spec);
				elProgram.appendChild(elSpecialisations);

				for(int i = 1; i <= program.getNrOfSemesters()/2; i++) {
					for(CourseGroupeType type: CourseGroupeType.values()) {
						EList<Course> coursesForSemesterBySpecializationFall = program.getCoursesForSemesterBySpecialization(i, SemesterPart.FALL, spec, type);
						EList<Course> coursesForSemesterBySpecializationSpring = program.getCoursesForSemesterBySpecialization(i, SemesterPart.SPRING, spec, type);
						if(coursesForSemesterBySpecializationFall.size() > 0) {
							elProgram.appendChild(getH4("Year: " + i + " part: " + SemesterPart.FALL + " type: " + type));
							elProgram.appendChild(parse(coursesForSemesterBySpecializationFall));
						}
						if(coursesForSemesterBySpecializationSpring.size() > 0) {
							elProgram.appendChild(getH4("Year: " + i + " part: " + SemesterPart.SPRING + " type: " + type));
							elProgram.appendChild(parse(coursesForSemesterBySpecializationSpring));										
						}
					}
				}
			}
		}
		return elNtnu;
	}
	
	public Element parse(StudyProgram program) throws Exception {
		Element el = new Element(Tag.valueOf("div"), "");
		el.appendChild(getH3(program.getName()));
		return el;
	}
	
	public Element parse(StudyPlan plan) throws Exception {
		Element el = new Element(Tag.valueOf("div"), "");
		el.appendChild(getP("Student Name", plan.getStudentName()));
		return el;
	}
	
	public Element parse(Semester semester) throws Exception {
		Element el = new Element(Tag.valueOf("div"), "");
		el.appendChild(getP("Semester Name", semester.getName()));
		return el;
	}
	
	public Element parse(Specialisations spesialisation) throws Exception {
		Element el = new Element(Tag.valueOf("div"), "");
		el.appendChild(getH3("Spesialization: " + spesialisation.getName()));
		return el;
	}

	public Element parse(CourseGroup group) throws Exception {
		Element el = new Element(Tag.valueOf("div"), "");
		el.appendChild(getP("Name", group.getName()));
		return el;
	}
	
	public Element parse(List<Course> courses) throws Exception {
		Element el = new Element(Tag.valueOf("table"), "");
		el.appendChild(getCourseHeadings());
		for(Course course : courses) {
			el.appendChild(parse(course));
		}
		
		return el;
	}
	
	public Element parse(Course course) throws Exception {
		Element el = getTr();
		el.appendChild(getTd(course.getName()));
		el.appendChild(getTd(course.getCredit() + ""));
		el.appendChild(getTd(course.getCode()));
		el.appendChild(getTd(course.getLevel() + ""));
		el.appendChild(getTd(course.getTaughtIn()+ ""));
		return el;
	}
	
	public Element getCourseHeadings() throws Exception {
		Element el = getTr();
		el.appendChild(getTh("Name"));
		el.appendChild(getTh("Credit"));
		el.appendChild(getTh("Code"));
		el.appendChild(getTh("Level"));
		el.appendChild(getTh("Taught in"));
		return el;
	}
	
	private Element getP(String value, String content) {
		Element el = new Element(Tag.valueOf("p"), "");
		el.appendText(value + ": " + content);
		return el;
	}
	
	private Element getTr() {
		Element el = new Element(Tag.valueOf("tr"), "");
		return el;
	}
	
	private Element getTh(String value) {
		Element el = new Element(Tag.valueOf("th"), "");
		el.appendText(value);
		return el;
	}
	
	private Element getTd(String value) {
		Element el = new Element(Tag.valueOf("td"), "");
		el.appendText(value);
		return el;
	}
	
	private Element getH1(String value) {
		Element el = new Element(Tag.valueOf("h1"), "");
		el.appendText(value);
		return el;
	}
	
	private Element getH2(String value) {
		Element el = new Element(Tag.valueOf("h2"), "");
		el.appendText(value);
		return el;
	}
	
	private Element getH3(String value) {
		Element el = new Element(Tag.valueOf("h3"), "");
		el.appendText(value);
		return el;
	}
	
	private Element getH4(String value) {
		Element el = new Element(Tag.valueOf("h4"), "");
		el.appendText(value);
		return el;
	}
	
}
