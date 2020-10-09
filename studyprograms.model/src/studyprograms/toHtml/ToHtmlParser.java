package studyprograms.toHtml;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;


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
	private static final String DESTINATION_FILE = "./src/studyprograms/toHtml/ExampleInstances.html";
	
	public static void main(String[] args) throws Exception {
		ToHtmlParser parser = new ToHtmlParser();
		EList<EObject> objects = parser.getResource(Studyprograms.class.getResource("ExampleInstances.xmi").toString());
		print(objects, ""); // For debugging
		// Transform the instance of NTNU to HTML
		Document doc = parser.createDocument((NTNU)objects.get(0));
		BufferedWriter writer = new BufferedWriter(new FileWriter(DESTINATION_FILE));
	    System.out.println(doc.toString()); // For debugging
		writer.write(doc.toString()); // Writes the HTML instance to file
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
		d.title("StudyPrograms and StudyPlan overview");
		Element el = parse(container);
		d.body().appendChild(el);
		return d;
	}
		
	// Parses and builds the structure of the HTML instance
	public Element parse(NTNU container) throws Exception {
		Element elNtnu = new Element(Tag.valueOf("div"), "");
		elNtnu.appendChild(getH1("NTNU"));
		elNtnu.appendChild(getH2("Study Programs"));
		
		for(StudyProgram program : container.getStudyprograms()) {
			Element elProgram = parse(program);
			elNtnu.appendChild(elProgram);
			
			// Add courses outside of specialization
			elProgram.appendChild(getH4("Courses"));
			// Collecting courses for each year
			for(int year = 1; year <= program.getNrOfSemesters()/2; year++) {
				// Collecting courses for each course type: MANDATORY, ELECTIVE_CAN_CRASH, ELECTIVE_NO_CRASH
				for(CourseGroupeType courseType: CourseGroupeType.values()) {
					// Collecting courses for each semester
					EList<Course> coursesForSemesterFall = program.getCoursesForSemester(year, SemesterPart.FALL, courseType);
					EList<Course> coursesForSemesterSpring = program.getCoursesForSemester(year, SemesterPart.SPRING, courseType);
					
					// If courses exist, heading and courses are added to the HTML
					if(coursesForSemesterFall.size() > 0) {
						elProgram.appendChild(getH5("Year: " + year + " part: " + SemesterPart.FALL + " type: " + courseType));								
						elProgram.appendChild(parse(coursesForSemesterFall));				
					}
					if(coursesForSemesterSpring.size() > 0) {
						elProgram.appendChild(getH5("Year: " + year + " part: " + SemesterPart.SPRING + " type: " + courseType));
						elProgram.appendChild(parse(coursesForSemesterSpring));					
					}					
				}
			}
			
			// Collecting courses fore each specialization in the same matter as the courses that are not specialization dependent (above)
			if(program.getSpecialisations().size() > 0) {
				elProgram.appendChild(getH4("Specializations with courses:"));	
			}
			
			for(Specialisations spec : program.getSpecialisations()) {
				Element elSpecializations = parse(spec);
				elProgram.appendChild(elSpecializations);

				for(int year = 1; year <= program.getNrOfSemesters()/2; year++) {
					for(CourseGroupeType type: CourseGroupeType.values()) {
						EList<Course> coursesForSemesterBySpecializationFall = program.getCoursesForSemesterBySpecialization(year, SemesterPart.FALL, spec, type);
						EList<Course> coursesForSemesterBySpecializationSpring = program.getCoursesForSemesterBySpecialization(year, SemesterPart.SPRING, spec, type);
						
						if(coursesForSemesterBySpecializationFall.size() > 0) {
							elProgram.appendChild(getH5("Year: " + year + " part: " + SemesterPart.FALL + " type: " + type));
							elProgram.appendChild(parse(coursesForSemesterBySpecializationFall));
						}
						if(coursesForSemesterBySpecializationSpring.size() > 0) {
							elProgram.appendChild(getH5("Year: " + year + " part: " + SemesterPart.SPRING + " type: " + type));
							elProgram.appendChild(parse(coursesForSemesterBySpecializationSpring));										
						}
					}
				}
			}
		}
		// Appending the chosen study plans to the model
		elNtnu.appendChild(getH2("Study Plans"));
		for(StudyPlan plan : container.getStudyplan()) {
			Element elPlan = parse(plan);
			elNtnu.appendChild(elPlan);
			
			for(Semester semester : plan.getSemester()) {
				Element elSemester = parse(semester);
				elPlan.appendChild(elSemester);
				elSemester.appendChild(parse(semester.getCourse()));
			}
		}
		
		return elNtnu;
	}
	
	// Parses list of courses to a table
	public Element parse(List<Course> courses) throws Exception {
		Element el = new Element(Tag.valueOf("table"), "");
		el.appendChild(getCourseHeadings());
		for(Course course : courses) {
			el.appendChild(parse(course));
		}	
		return el;
	}
	
	// Creates heading for the courses table
	public Element getCourseHeadings() throws Exception {
		Element el = getTr();
		el.appendChild(getTh("Name"));
		el.appendChild(getTh("Credit"));
		el.appendChild(getTh("Code"));
		el.appendChild(getTh("Level"));
		el.appendChild(getTh("Taught in"));
		return el;
	}
	
	// Parses a course to a row in the table
	public Element parse(Course course) throws Exception {
		Element el = getTr();
		el.appendChild(getTd(course.getName()));
		el.appendChild(getTd(String.valueOf(course.getCredit())));
		el.appendChild(getTd(course.getCode()));
		el.appendChild(getTd(String.valueOf(course.getLevel())));
		el.appendChild(getTd(String.valueOf(course.getTaughtIn())));
		return el;
	}
	
	// Rest of the methods pares singl objects to HTML objects
	
	public Element parse(StudyProgram program) throws Exception {
		Element el = new Element(Tag.valueOf("div"), "");
		el.appendChild(getH3(program.getName()));
		el.appendChild(getH4("Number of semesters: " + program.getNrOfSemesters()));
		return el;
	}
	
	public Element parse(StudyPlan plan) throws Exception {
		Element el = new Element(Tag.valueOf("div"), "");
		el.appendChild(getH3("Student Name: " + plan.getStudentName()));
		return el;
	}
	
	public Element parse(Semester semester) throws Exception {
		Element el = new Element(Tag.valueOf("div"), "");
		el.appendChild(getH4("Semester: " + semester.getName()));
		return el;
	}
	
	public Element parse(Specialisations spesialisation) throws Exception {
		Element el = new Element(Tag.valueOf("div"), "");
		el.appendChild(getH4("Spesialization: " + spesialisation.getName()));
		return el;
	}

	public Element parse(CourseGroup group) throws Exception {
		Element el = new Element(Tag.valueOf("div"), "");
		el.appendChild(getP("Name", group.getName()));
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
	
	private Element getH5(String value) {
		Element el = new Element(Tag.valueOf("h5"), "");
		el.appendText(value);
		return el;
	}
	
}
