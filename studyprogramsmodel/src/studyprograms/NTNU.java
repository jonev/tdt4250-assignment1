/**
 */
package studyprograms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NTNU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.NTNU#getStudyprograms <em>Studyprograms</em>}</li>
 *   <li>{@link studyprograms.NTNU#getCourses <em>Courses</em>}</li>
 *   <li>{@link studyprograms.NTNU#getCoursegroup <em>Coursegroup</em>}</li>
 *   <li>{@link studyprograms.NTNU#getStudyplan <em>Studyplan</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getNTNU()
 * @model
 * @generated
 */
public interface NTNU extends EObject {
	/**
	 * Returns the value of the '<em><b>Studyprograms</b></em>' containment reference list.
	 * The list contents are of type {@link studyprograms.StudyProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studyprograms</em>' containment reference list.
	 * @see studyprograms.StudyprogramsPackage#getNTNU_Studyprograms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StudyProgram> getStudyprograms();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link studyprograms.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see studyprograms.StudyprogramsPackage#getNTNU_Courses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Coursegroup</b></em>' containment reference list.
	 * The list contents are of type {@link studyprograms.CourseGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coursegroup</em>' containment reference list.
	 * @see studyprograms.StudyprogramsPackage#getNTNU_Coursegroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseGroup> getCoursegroup();

	/**
	 * Returns the value of the '<em><b>Studyplan</b></em>' containment reference list.
	 * The list contents are of type {@link studyprograms.StudyPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studyplan</em>' containment reference list.
	 * @see studyprograms.StudyprogramsPackage#getNTNU_Studyplan()
	 * @model containment="true"
	 * @generated
	 */
	EList<StudyPlan> getStudyplan();

} // NTNU
