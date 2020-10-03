package studyprograms.toHtml;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import studyprograms.Course;
import studyprograms.SemesterPart;
import studyprograms.StudyprogramsFactory;

class ToHtmlParserTest extends ToHtmlParser {

	@Test
	void testParseCourse() throws Exception {
		ToHtmlParser parser = new ToHtmlParser();
		Course course = StudyprogramsFactory.eINSTANCE.createCourse();
		course.setName("Informasjonsteknologi");
		course.setCredit(7.5);
		course.setCode("TDTXXX");
		course.setLevel(2);
		course.setTaughtIn(SemesterPart.FALL);
		
		Element element = parser.parse(course);
		
		assertEquals(
				"<tr>\n" + 
				" <td>Informasjonsteknologi</td>\n" + 
				" <td>7.5</td>\n" + 
				" <td>TDTXXX</td>\n" + 
				" <td>2</td>\n" + 
				" <td>FALL</td>\n" + 
				"</tr>", 
				element.toString());
	}
	
	@Test
	void testCourseHeadings() throws Exception {
		ToHtmlParser parser = new ToHtmlParser();
		Element element = parser.getCourseHeadings();
		
		assertEquals(
				"<tr>\n" + 
				" <th>Name</th>\n" + 
				" <th>Credit</th>\n" + 
				" <th>Code</th>\n" + 
				" <th>Level</th>\n" + 
				" <th>Taught in</th>\n" + 
				"</tr>", element.toString());
	}
	
	@Test
	void testParseCourses() throws Exception {
		ToHtmlParser parser = new ToHtmlParser();
		List<Course> courses = new ArrayList<>();
		
		Course course = StudyprogramsFactory.eINSTANCE.createCourse();
		course.setName("Informasjonsteknologi1");
		course.setCredit(7.5);
		course.setCode("TDTXXX1");
		course.setLevel(2);
		course.setTaughtIn(SemesterPart.FALL);
		
		Course course2 = StudyprogramsFactory.eINSTANCE.createCourse();
		course2.setName("Informasjonsteknologi2");
		course2.setCredit(7.5);
		course2.setCode("TDTXXX2");
		course2.setLevel(2);
		course2.setTaughtIn(SemesterPart.FALL);
		
		courses.add(course);
		courses.add(course2);
		
		
		Element element = parser.parse(courses);
		
		assertEquals(
				"<table>\n" + 
				" <tr>\n" + 
				"  <th>Name</th>\n" + 
				"  <th>Credit</th>\n" + 
				"  <th>Code</th>\n" + 
				"  <th>Level</th>\n" + 
				"  <th>Taught in</th>\n" + 
				" </tr>\n" + 
				" <tr>\n" + 
				"  <td>Informasjonsteknologi1</td>\n" + 
				"  <td>7.5</td>\n" + 
				"  <td>TDTXXX1</td>\n" + 
				"  <td>2</td>\n" + 
				"  <td>FALL</td>\n" + 
				" </tr>\n" + 
				" <tr>\n" + 
				"  <td>Informasjonsteknologi2</td>\n" + 
				"  <td>7.5</td>\n" + 
				"  <td>TDTXXX2</td>\n" + 
				"  <td>2</td>\n" + 
				"  <td>FALL</td>\n" + 
				" </tr>\n" + 
				"</table>", 
				element.toString());
	}

}
