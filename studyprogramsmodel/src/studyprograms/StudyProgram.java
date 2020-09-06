/**
 */
package studyprograms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.StudyProgram#getName <em>Name</em>}</li>
 *   <li>{@link studyprograms.StudyProgram#getNrOfSemesters <em>Nr Of Semesters</em>}</li>
 *   <li>{@link studyprograms.StudyProgram#getSpecialisations <em>Specialisations</em>}</li>
 *   <li>{@link studyprograms.StudyProgram#getCoursegroup <em>Coursegroup</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getStudyProgram()
 * @model
 * @generated
 */
public interface StudyProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyprograms.StudyprogramsPackage#getStudyProgram_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyprograms.StudyProgram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nr Of Semesters</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Of Semesters</em>' attribute.
	 * @see #setNrOfSemesters(int)
	 * @see studyprograms.StudyprogramsPackage#getStudyProgram_NrOfSemesters()
	 * @model default="10" required="true"
	 * @generated
	 */
	int getNrOfSemesters();

	/**
	 * Sets the value of the '{@link studyprograms.StudyProgram#getNrOfSemesters <em>Nr Of Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Of Semesters</em>' attribute.
	 * @see #getNrOfSemesters()
	 * @generated
	 */
	void setNrOfSemesters(int value);

	/**
	 * Returns the value of the '<em><b>Specialisations</b></em>' containment reference list.
	 * The list contents are of type {@link studyprograms.Specialisations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisations</em>' containment reference list.
	 * @see studyprograms.StudyprogramsPackage#getStudyProgram_Specialisations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialisations> getSpecialisations();

	/**
	 * Returns the value of the '<em><b>Coursegroup</b></em>' reference list.
	 * The list contents are of type {@link studyprograms.CourseGroup}.
	 * It is bidirectional and its opposite is '{@link studyprograms.CourseGroup#getStudyprogram <em>Studyprogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coursegroup</em>' reference list.
	 * @see studyprograms.StudyprogramsPackage#getStudyProgram_Coursegroup()
	 * @see studyprograms.CourseGroup#getStudyprogram
	 * @model opposite="studyprogram"
	 * @generated
	 */
	EList<CourseGroup> getCoursegroup();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Course> getCoursesForSemester(int maxLevel, SemesterPart part);

} // StudyProgram
