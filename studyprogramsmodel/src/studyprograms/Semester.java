/**
 */
package studyprograms;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.Semester#getLevel <em>Level</em>}</li>
 *   <li>{@link studyprograms.Semester#getPart <em>Part</em>}</li>
 *   <li>{@link studyprograms.Semester#getCreditLimit <em>Credit Limit</em>}</li>
 *   <li>{@link studyprograms.Semester#getCourse <em>Course</em>}</li>
 *   <li>{@link studyprograms.Semester#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='coursesHasRightLevel taughtAtTheRigthTimeOfTheYear'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see studyprograms.StudyprogramsPackage#getSemester_Level()
	 * @model required="true"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link studyprograms.Semester#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' attribute.
	 * The literals are from the enumeration {@link studyprograms.SemesterPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' attribute.
	 * @see studyprograms.SemesterPart
	 * @see #setPart(SemesterPart)
	 * @see studyprograms.StudyprogramsPackage#getSemester_Part()
	 * @model
	 * @generated
	 */
	SemesterPart getPart();

	/**
	 * Sets the value of the '{@link studyprograms.Semester#getPart <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' attribute.
	 * @see studyprograms.SemesterPart
	 * @see #getPart()
	 * @generated
	 */
	void setPart(SemesterPart value);

	/**
	 * Returns the value of the '<em><b>Credit Limit</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Limit</em>' attribute.
	 * @see #setCreditLimit(int)
	 * @see studyprograms.StudyprogramsPackage#getSemester_CreditLimit()
	 * @model default="30" required="true"
	 * @generated
	 */
	int getCreditLimit();

	/**
	 * Sets the value of the '{@link studyprograms.Semester#getCreditLimit <em>Credit Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Limit</em>' attribute.
	 * @see #getCreditLimit()
	 * @generated
	 */
	void setCreditLimit(int value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference list.
	 * The list contents are of type {@link studyprograms.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference list.
	 * @see studyprograms.StudyprogramsPackage#getSemester_Course()
	 * @model
	 * @generated
	 */
	EList<Course> getCourse();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see studyprograms.StudyprogramsPackage#getSemester_Name()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addCourse(Course course);

} // Semester
