/**
 */
package studyprograms.tests;

import static org.junit.Assert.assertThrows;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import studyprograms.Course;
import studyprograms.CourseGroup;
import studyprograms.SemesterPart;
import studyprograms.Specialisations;
import studyprograms.StudyProgram;
import studyprograms.StudyprogramsFactory;
import studyprograms.impl.StudyprogramsFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Study Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link studyprograms.StudyProgram#getCoursesForSemester(int, studyprograms.SemesterPart) <em>Get Courses For Semester</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StudyProgramTest extends TestCase {

	/**
	 * The fixture for this Study Program test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyProgram fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StudyProgramTest.class);
	}

	/**
	 * Constructs a new Study Program test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyProgramTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Study Program test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StudyProgram fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Study Program test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyProgram getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StudyprogramsFactory.eINSTANCE.createStudyProgram());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link studyprograms.StudyProgram#getCoursesForSemester(int, studyprograms.SemesterPart) <em>Get Courses For Semester</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprograms.StudyProgram#getCoursesForSemester(int, studyprograms.SemesterPart)
	 * @generated NOT
	 */
	public void testGetCoursesForSemester__int_SemesterPart() {
		StudyProgram program = StudyprogramsFactory.eINSTANCE.createStudyProgram();
		CourseGroup group = StudyprogramsFactory.eINSTANCE.createCourseGroup();
		Course course = StudyprogramsFactory.eINSTANCE.createCourse();
		course.setLevel(1);
		course.setTaughtIn(SemesterPart.FALL);
		
		Course course2 = StudyprogramsFactory.eINSTANCE.createCourse();
		course2.setLevel(2);
		course2.setTaughtIn(SemesterPart.FALL);
		
		Course course3 = StudyprogramsFactory.eINSTANCE.createCourse();
		course3.setLevel(2);
		course3.setTaughtIn(SemesterPart.SPRING);
		program.getCoursegroup().add(group);
		group.getCourses().add(course);
		group.getCourses().add(course2);
		group.getCourses().add(course3);
		
		assertEquals(1, program.getCoursesForSemester(1, SemesterPart.FALL).size());
		assertEquals(2, program.getCoursesForSemester(2, SemesterPart.FALL).size());
		assertEquals(1, program.getCoursesForSemester(2, SemesterPart.SPRING).size());
		assertEquals(0, program.getCoursesForSemester(1, SemesterPart.SPRING).size());
		assertEquals(0, program.getCoursesForSemester(1, SemesterPart.SPRING).size());
		
		
		Specialisations spes = StudyprogramsFactory.eINSTANCE.createSpecialisations();
		program.getSpecialisations().add(spes);
		CourseGroup group2 = StudyprogramsFactory.eINSTANCE.createCourseGroup();
		spes.getCoursegroup().add(group2);
		Course course4 = StudyprogramsFactory.eINSTANCE.createCourse();
		course4.setLevel(1);
		course4.setTaughtIn(SemesterPart.FALL);
		group2.getCourses().add(course4);
		
		assertEquals(2, program.getCoursesForSemester(1, SemesterPart.FALL).size());
		assertEquals(3, program.getCoursesForSemester(2, SemesterPart.FALL).size());
		assertEquals(0, program.getCoursesForSemester(1, SemesterPart.SPRING).size());
		
		Course course5 = StudyprogramsFactory.eINSTANCE.createCourse();
		course5.setLevel(2);
		course5.setTaughtIn(SemesterPart.FALL);
		group2.getCourses().add(course5);
		
		assertEquals(2, program.getCoursesForSemester(1, SemesterPart.FALL).size());
		assertEquals(4, program.getCoursesForSemester(2, SemesterPart.FALL).size());
		assertEquals(0, program.getCoursesForSemester(1, SemesterPart.SPRING).size());
				
	}
	
	/**
	 * @generated NOT
	 */
	public void testcreateStudentIdFromString() {
		StudyprogramsFactoryImpl fact = new StudyprogramsFactoryImpl();
		assertThrows(IllegalArgumentException.class, () -> fact.createStudentIdFromString(null, "q"));
				
	}

	
} //StudyProgramTest
