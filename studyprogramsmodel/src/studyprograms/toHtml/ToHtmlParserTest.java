package studyprograms.toHtml;

import static org.junit.jupiter.api.Assertions.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import studyprograms.Course;
import studyprograms.NTNU;
import studyprograms.SemesterPart;
import studyprograms.StudyprogramsFactory;
import studyprogramsmodel.example.Studyprograms;

class ToHtmlParserTest extends ToHtmlParser {

	@Test
	void testPrintAll() {
		new ToHtmlParser().printAll();
		assertTrue(true);
	}
	
	@Test
	void testCreateDocument() throws Exception {
		ToHtmlParser parser = new ToHtmlParser();
		EList<EObject> objects = parser.getResource(Studyprograms.class.getResource("NTNU.xmi").toString());
		Document doc = parser.createDocument((NTNU)objects.get(0));
		
		System.out.println(doc.toString());
		assertTrue(true);
	}
	
	@Test
	void testParseAll() throws Exception {
		ToHtmlParser parser = new ToHtmlParser();
		EList<EObject> objects = parser.getResource(Studyprograms.class.getResource("NTNU.xmi").toString());
		Element element = parser.parse((NTNU)objects.get(0));
		System.out.println(element.toString());
		assertTrue(true);
	}
	
	@Test
	void testParseCourses() throws Exception {
		ToHtmlParser parser = new ToHtmlParser();
		Course course = StudyprogramsFactory.eINSTANCE.createCourse();
		course.setName("Informasjonsteknologi");
		course.setCredit(7.5);
		course.setCode("TDTXXX");
		course.setLevel(2);
		course.setTaughtIn(SemesterPart.FALL);
		
		Element element = parser.parse(course);
			
		assertEquals("<div>\n" + 
				" <p>Name: Informasjonsteknologi</p>\n" + 
				" <p>Credit: 7.5</p>\n" + 
				" <p>Code: TDTXXX</p>\n" + 
				" <p>Level: 2</p>\n" + 
				" <p>Taught in: FALL</p>\n" + 
				"</div>", element.toString());
	}

}
