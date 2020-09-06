/**
 */
package studyprograms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.CourseGroup#getName <em>Name</em>}</li>
 *   <li>{@link studyprograms.CourseGroup#getCourses <em>Courses</em>}</li>
 *   <li>{@link studyprograms.CourseGroup#getType <em>Type</em>}</li>
 *   <li>{@link studyprograms.CourseGroup#getStudyprogram <em>Studyprogram</em>}</li>
 *   <li>{@link studyprograms.CourseGroup#getSpecialisations <em>Specialisations</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getCourseGroup()
 * @model
 * @generated
 */
public interface CourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyprograms.StudyprogramsPackage#getCourseGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyprograms.CourseGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link studyprograms.Course}.
	 * It is bidirectional and its opposite is '{@link studyprograms.Course#getCoursegroups <em>Coursegroups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see studyprograms.StudyprogramsPackage#getCourseGroup_Courses()
	 * @see studyprograms.Course#getCoursegroups
	 * @model opposite="coursegroups"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link studyprograms.CourseGroupeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see studyprograms.CourseGroupeType
	 * @see #setType(CourseGroupeType)
	 * @see studyprograms.StudyprogramsPackage#getCourseGroup_Type()
	 * @model
	 * @generated
	 */
	CourseGroupeType getType();

	/**
	 * Sets the value of the '{@link studyprograms.CourseGroup#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see studyprograms.CourseGroupeType
	 * @see #getType()
	 * @generated
	 */
	void setType(CourseGroupeType value);

	/**
	 * Returns the value of the '<em><b>Studyprogram</b></em>' reference list.
	 * The list contents are of type {@link studyprograms.StudyProgram}.
	 * It is bidirectional and its opposite is '{@link studyprograms.StudyProgram#getCoursegroup <em>Coursegroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studyprogram</em>' reference list.
	 * @see studyprograms.StudyprogramsPackage#getCourseGroup_Studyprogram()
	 * @see studyprograms.StudyProgram#getCoursegroup
	 * @model opposite="coursegroup"
	 * @generated
	 */
	EList<StudyProgram> getStudyprogram();

	/**
	 * Returns the value of the '<em><b>Specialisations</b></em>' reference list.
	 * The list contents are of type {@link studyprograms.Specialisations}.
	 * It is bidirectional and its opposite is '{@link studyprograms.Specialisations#getCoursegroup <em>Coursegroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisations</em>' reference list.
	 * @see studyprograms.StudyprogramsPackage#getCourseGroup_Specialisations()
	 * @see studyprograms.Specialisations#getCoursegroup
	 * @model opposite="coursegroup"
	 * @generated
	 */
	EList<Specialisations> getSpecialisations();

} // CourseGroup
