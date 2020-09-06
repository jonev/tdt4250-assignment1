/**
 */
package studyprograms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.Course#getName <em>Name</em>}</li>
 *   <li>{@link studyprograms.Course#getCredit <em>Credit</em>}</li>
 *   <li>{@link studyprograms.Course#getCode <em>Code</em>}</li>
 *   <li>{@link studyprograms.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link studyprograms.Course#getTaughtIn <em>Taught In</em>}</li>
 *   <li>{@link studyprograms.Course#getCoursegroups <em>Coursegroups</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyprograms.StudyprogramsPackage#getCourse_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyprograms.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Credit</b></em>' attribute.
	 * The default value is <code>"7.5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit</em>' attribute.
	 * @see #setCredit(double)
	 * @see studyprograms.StudyprogramsPackage#getCourse_Credit()
	 * @model default="7.5" required="true"
	 * @generated
	 */
	double getCredit();

	/**
	 * Sets the value of the '{@link studyprograms.Course#getCredit <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit</em>' attribute.
	 * @see #getCredit()
	 * @generated
	 */
	void setCredit(double value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see studyprograms.StudyprogramsPackage#getCourse_Code()
	 * @model required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link studyprograms.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see studyprograms.StudyprogramsPackage#getCourse_Level()
	 * @model required="true"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link studyprograms.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Taught In</b></em>' attribute.
	 * The literals are from the enumeration {@link studyprograms.SemesterPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taught In</em>' attribute.
	 * @see studyprograms.SemesterPart
	 * @see #setTaughtIn(SemesterPart)
	 * @see studyprograms.StudyprogramsPackage#getCourse_TaughtIn()
	 * @model required="true"
	 * @generated
	 */
	SemesterPart getTaughtIn();

	/**
	 * Sets the value of the '{@link studyprograms.Course#getTaughtIn <em>Taught In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taught In</em>' attribute.
	 * @see studyprograms.SemesterPart
	 * @see #getTaughtIn()
	 * @generated
	 */
	void setTaughtIn(SemesterPart value);

	/**
	 * Returns the value of the '<em><b>Coursegroups</b></em>' reference list.
	 * The list contents are of type {@link studyprograms.CourseGroup}.
	 * It is bidirectional and its opposite is '{@link studyprograms.CourseGroup#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coursegroups</em>' reference list.
	 * @see studyprograms.StudyprogramsPackage#getCourse_Coursegroups()
	 * @see studyprograms.CourseGroup#getCourses
	 * @model opposite="courses"
	 * @generated
	 */
	EList<CourseGroup> getCoursegroups();

} // Course
