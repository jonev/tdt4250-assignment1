/**
 */
package studyprograms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialisations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.Specialisations#getName <em>Name</em>}</li>
 *   <li>{@link studyprograms.Specialisations#getCoursegroup <em>Coursegroup</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getSpecialisations()
 * @model
 * @generated
 */
public interface Specialisations extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyprograms.StudyprogramsPackage#getSpecialisations_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyprograms.Specialisations#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Coursegroup</b></em>' reference list.
	 * The list contents are of type {@link studyprograms.CourseGroup}.
	 * It is bidirectional and its opposite is '{@link studyprograms.CourseGroup#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coursegroup</em>' reference list.
	 * @see studyprograms.StudyprogramsPackage#getSpecialisations_Coursegroup()
	 * @see studyprograms.CourseGroup#getSpecialisations
	 * @model opposite="specialisations"
	 * @generated
	 */
	EList<CourseGroup> getCoursegroup();

} // Specialisations
