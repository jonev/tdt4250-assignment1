/**
 */
package studyprograms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.StudyPlan#getStudentName <em>Student Name</em>}</li>
 *   <li>{@link studyprograms.StudyPlan#getStudyprogram <em>Studyprogram</em>}</li>
 *   <li>{@link studyprograms.StudyPlan#getSpecialisations <em>Specialisations</em>}</li>
 *   <li>{@link studyprograms.StudyPlan#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getStudyPlan()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nrOfSemestersIsOk'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 nrOfSemestersIsOk='self.semester-&gt;size() == self.studyprogram.nrOfSemesters'"
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Student Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student Name</em>' attribute.
	 * @see #setStudentName(String)
	 * @see studyprograms.StudyprogramsPackage#getStudyPlan_StudentName()
	 * @model dataType="studyprograms.StudentId"
	 * @generated
	 */
	String getStudentName();

	/**
	 * Sets the value of the '{@link studyprograms.StudyPlan#getStudentName <em>Student Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student Name</em>' attribute.
	 * @see #getStudentName()
	 * @generated
	 */
	void setStudentName(String value);

	/**
	 * Returns the value of the '<em><b>Studyprogram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studyprogram</em>' reference.
	 * @see #setStudyprogram(StudyProgram)
	 * @see studyprograms.StudyprogramsPackage#getStudyPlan_Studyprogram()
	 * @model required="true"
	 * @generated
	 */
	StudyProgram getStudyprogram();

	/**
	 * Sets the value of the '{@link studyprograms.StudyPlan#getStudyprogram <em>Studyprogram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studyprogram</em>' reference.
	 * @see #getStudyprogram()
	 * @generated
	 */
	void setStudyprogram(StudyProgram value);

	/**
	 * Returns the value of the '<em><b>Specialisations</b></em>' reference list.
	 * The list contents are of type {@link studyprograms.Specialisations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisations</em>' reference list.
	 * @see studyprograms.StudyprogramsPackage#getStudyPlan_Specialisations()
	 * @model
	 * @generated
	 */
	EList<Specialisations> getSpecialisations();

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' containment reference list.
	 * The list contents are of type {@link studyprograms.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' containment reference list.
	 * @see studyprograms.StudyprogramsPackage#getStudyPlan_Semester()
	 * @model containment="true" upper="10"
	 * @generated
	 */
	EList<Semester> getSemester();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addSemester(Semester semester);

} // StudyPlan
