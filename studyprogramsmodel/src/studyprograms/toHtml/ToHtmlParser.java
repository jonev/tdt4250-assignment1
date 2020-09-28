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
import studyprograms.NTNU;
import studyprograms.Semester;
import studyprograms.Specialisations;
import studyprograms.StudyPlan;
import studyprograms.StudyProgram;
import studyprograms.StudyprogramsPackage;
import studyprogramsmodel.example.Studyprograms;

// HTML Lib: https://jsoup.org/cookbook/extracting-data/dom-navigation
public class ToHtmlParser {
	public static void main(String[] args) throws Exception {
		ToHtmlParser parser = new ToHtmlParser();
		EList<EObject> objects = parser.getResource(Studyprograms.class.getResource("NTNU.xmi").toString());
		Document doc = parser.createDocument((NTNU)objects.get(0));
		BufferedWriter writer = new BufferedWriter(new FileWriter("/home/jone/repos/tdt4250-assignment1/studyprogramsmodel/src/studyprograms/toHtml/frakode.html"));
	    System.out.println(doc.toString());
		writer.write(doc.toString());   
	    writer.close();
	}
	
	private final String htmlTemplate = "<html><head></head>"
            + "<body></body></html>";
	
	public EList<EObject> getResource(String fileResource) {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(StudyprogramsPackage.eNS_URI, StudyprogramsPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		return resSet.getResource(URI.createURI(fileResource), true).getContents();
	}
	
	public void printAll() {
		EList<EObject> list = getResource(Studyprograms.class.getResource("NTNU.xmi").toString());
				
		print(list, "");
	}
	
	public void print(EList<EObject> list, String indent) {
		for(EObject obj : list) {
			if(obj.eContents().size() == 0) {
				System.out.println(indent + obj.toString());
			} else {
				System.out.println(indent + obj.toString());
				print(obj.eContents(), indent + "\t");
			}
		}
	}
	
	//public Element parse(EList<EObject> list) throws Exception {
	//	Element el = new Element(Tag.valueOf("div"), "");
	//		if(obj.eContents().size() == 0) {
	//			el.appendChild(parse(obj));
	//		} else {
	//			el.appendChild(parse(obj.eContents()));
	//		}
	//	}		
	//	return el;
	//}
	
	public Document createDocument(NTNU container) throws Exception {
		Document d = Jsoup.parse(htmlTemplate);
		d.title("StudyPrograms overview fra kode");
		Element el = parse(container);
		d.body().appendChild(el);
		return d;
	}
		
	
	public Element parse(NTNU container) throws Exception {
		Element elNtnu = new Element(Tag.valueOf("div"), "");
		elNtnu.appendChild(getH3("NTNU fra kode"));
		elNtnu.appendChild(getH3("Programs:"));
		for(StudyProgram program : container.getStudyprograms()) {
			Element elProgram = parse(program);
			elProgram.appendChild(getH3("Specialisation:"));
			elNtnu.appendChild(elProgram);
			for(Specialisations spec : program.getSpecialisations()) {
				Element elSpecialisations = parse(spec);
				elSpecialisations.appendChild(getH3("Groups:"));
				elProgram.appendChild(elSpecialisations);
				for(CourseGroup group : container.getCoursegroup()) {
					Element elGroup = parse(group);
					elSpecialisations.appendChild(elGroup);
					elGroup.appendChild(getH3("Courses:"));
					for(Course c : group.getCourses()) {
						elGroup.appendChild(parse(c));
					}
				}
				
				
			}
		}
		return elNtnu;
	}
	
	public Element parse(StudyProgram program) throws Exception {
		Element el = new Element(Tag.valueOf("div"), "");
		el.appendChild(getP("Name", program.getName()));
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
		el.appendChild(getP("Name", spesialisation.getName()));
		return el;
	}

	public Element parse(CourseGroup group) throws Exception {
		Element el = new Element(Tag.valueOf("div"), "");
		el.appendChild(getP("Name", group.getName()));
		return el;
	}
	
	public Element parse(Course course) throws Exception {
		Element el = new Element(Tag.valueOf("div"), "");
		el.appendChild(getP("Name", course.getName()));
		el.appendChild(getP("Credit", course.getCredit() + ""));
		el.appendChild(getP("Code", course.getCode()));
		el.appendChild(getP("Level", course.getLevel() + ""));
		el.appendChild(getP("Taught in", course.getTaughtIn()+ ""));
		return el;
	}
	
	private Element getP(String value, String content) {
		Element el = new Element(Tag.valueOf("p"), "");
		el.appendText(value + ": " + content);
		return el;
	}
	
	private Element getH3(String value) {
		Element el = new Element(Tag.valueOf("h3"), "");
		el.appendText(value);
		return el;
	}
	
}
