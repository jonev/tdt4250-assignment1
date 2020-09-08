/**
 */
package studyprograms.tests;

import static org.junit.Assert.assertThrows;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import studyprograms.Semester;
import studyprograms.SemesterPart;
import studyprograms.StudyPlan;
import studyprograms.StudyProgram;
import studyprograms.StudyprogramsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link studyprograms.StudyPlan#addSemester(studyprograms.Semester) <em>Add Semester</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StudyPlanTest extends TestCase {

	/**
	 * The fixture for this Study Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlan fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StudyPlanTest.class);
	}

	/**
	 * Constructs a new Study Plan test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPlanTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Study Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StudyPlan fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Study Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlan getFixture() {
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
		setFixture(StudyprogramsFactory.eINSTANCE.createStudyPlan());
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
	 * Tests the '{@link studyprograms.StudyPlan#addSemester(studyprograms.Semester) <em>Add Semester</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprograms.StudyPlan#addSemester(studyprograms.Semester)
	 * @generated NOT
	 */
	public void testAddSemester__Semester() {
		StudyProgram program = StudyprogramsFactory.eINSTANCE.createStudyProgram();
		program.setNrOfSemesters(2);
		StudyPlan plan = StudyprogramsFactory.eINSTANCE.createStudyPlan();
		plan.setStudyprogram(program);
		Semester semester = StudyprogramsFactory.eINSTANCE.createSemester();
		semester.setLevel(1);
		semester.setPart(SemesterPart.FALL);
		
		assertFalse(plan.getSemester().contains(semester));
		
		plan.addSemester(semester);
		assertTrue(plan.getSemester().contains(semester));
		
		Semester semester2 = StudyprogramsFactory.eINSTANCE.createSemester();
		semester2.setLevel(1);
		semester2.setPart(SemesterPart.SPRING);
		assertFalse(plan.getSemester().contains(semester2));
		
		plan.addSemester(semester2);
		assertTrue(plan.getSemester().contains(semester2));
		
		// Testing errors
		
		Semester semester3 = StudyprogramsFactory.eINSTANCE.createSemester();
		// To many semesters
		assertThrows(IllegalArgumentException.class, () -> plan.addSemester(semester3));
		// Already exists
		semester3.setLevel(1);
		semester3.setPart(SemesterPart.FALL);
		assertThrows(IllegalArgumentException.class, () -> plan.addSemester(semester3));
		
		
		
		
		
	}

} //StudyPlanTest
