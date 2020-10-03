/**
 */
package studyprograms.tests;

import static org.junit.Assert.assertThrows;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import studyprograms.Course;
import studyprograms.Semester;
import studyprograms.SemesterPart;
import studyprograms.StudyPlan;
import studyprograms.StudyProgram;
import studyprograms.StudyprogramsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link studyprograms.Semester#getName() <em>Name</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link studyprograms.Semester#addCourse(studyprograms.Course) <em>Add Course</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SemesterTest extends TestCase {

	/**
	 * The fixture for this Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Semester fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SemesterTest.class);
	}

	/**
	 * Constructs a new Semester test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Semester fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Semester getFixture() {
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
		setFixture(StudyprogramsFactory.eINSTANCE.createSemester());
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
	 * Tests the '{@link studyprograms.Semester#getName() <em>Name</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprograms.Semester#getName()
	 * @generated NOT
	 */
	public void testGetName() {
		StudyProgram program = StudyprogramsFactory.eINSTANCE.createStudyProgram();
		program.setNrOfSemesters(10);
		StudyPlan plan = StudyprogramsFactory.eINSTANCE.createStudyPlan();
		plan.setStudyprogram(program);
		plan.setStudentName("Jone");
		Semester semester = StudyprogramsFactory.eINSTANCE.createSemester();
		assertTrue(semester.getName().contains("ERROR"));
		semester.setLevel(1);
		semester.setPart(SemesterPart.FALL);
		plan.addSemester(semester);
		assertEquals("Jone: level; 1 part; FALL", semester.getName());
	}

	/**
	 * Tests the '{@link studyprograms.Semester#addCourse(studyprograms.Course) <em>Add Course</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprograms.Semester#addCourse(studyprograms.Course)
	 * @generated NOT
	 */
	public void testAddCourse__Course() {
		Semester s = StudyprogramsFactory.eINSTANCE.createSemester();
		s.setCreditLimit(15);
		s.setLevel(1);
		Course c = StudyprogramsFactory.eINSTANCE.createCourse();
		c.setCredit(10.0);
		c.setTaughtIn(SemesterPart.FALL);
		c.setLevel(1);
		s.addCourse(c);
		assertEquals(c, s.getCourse().get(0));
		
		Course c2 = StudyprogramsFactory.eINSTANCE.createCourse();
		c2.setCredit(10.0);
		c2.setTaughtIn(SemesterPart.FALL);
		c2.setLevel(1);
		// Too high credit
		assertThrows(IllegalArgumentException.class, () -> s.addCourse(c2));
		
		Course c3 = StudyprogramsFactory.eINSTANCE.createCourse();
		c3.setCredit(1.0);
		c3.setTaughtIn(SemesterPart.SPRING);
		c3.setLevel(1);
		// Wrong semester part
		assertThrows(IllegalArgumentException.class, () -> s.addCourse(c3));
		
		Course c4 = StudyprogramsFactory.eINSTANCE.createCourse();
		c4.setCredit(1.0);
		c4.setTaughtIn(SemesterPart.FALL);
		c4.setLevel(2);
		// Wrong level
		assertThrows(IllegalArgumentException.class, () -> s.addCourse(c4));
		
		// OK
		Course c5 = StudyprogramsFactory.eINSTANCE.createCourse();
		c5.setCredit(5.0);
		c5.setTaughtIn(SemesterPart.FALL);
		c5.setLevel(1);
		s.addCourse(c5);
		assertEquals(c5, s.getCourse().get(1));
	}

	
	

	

} //SemesterTest
