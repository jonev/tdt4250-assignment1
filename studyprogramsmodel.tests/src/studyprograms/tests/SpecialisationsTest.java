/**
 */
package studyprograms.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import studyprograms.Specialisations;
import studyprograms.StudyprogramsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Specialisations</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecialisationsTest extends TestCase {

	/**
	 * The fixture for this Specialisations test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Specialisations fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpecialisationsTest.class);
	}

	/**
	 * Constructs a new Specialisations test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialisationsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Specialisations test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Specialisations fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Specialisations test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Specialisations getFixture() {
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
		setFixture(StudyprogramsFactory.eINSTANCE.createSpecialisations());
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

} //SpecialisationsTest
