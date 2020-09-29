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
	void testParseCourses() throws Exception {
		ToHtmlParser parser = new ToHtmlParser();
		Course course = StudyprogramsFactory.eINSTANCE.createCourse();
		course.setName("Informasjonsteknologi");
		course.setCredit(7.5);
		course.setCode("TDTXXX");
		course.setLevel(2);
		course.setTaughtIn(SemesterPart.FALL);
		
		Element element = parser.parse(course);
		
		assertEquals("<tr>\n" + 
				" <td>Informasjonsteknologi</td>\n" + 
				" <td>7.5</td>\n" + 
				" <td>TDTXXX</td>\n" + 
				" <td>2</td>\n" + 
				" <td>FALL</td>\n" + 
				"</tr>", element.toString());
	}

}
