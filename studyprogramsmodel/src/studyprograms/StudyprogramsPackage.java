/**
 */
package studyprograms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see studyprograms.StudyprogramsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface StudyprogramsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "studyprograms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "studyprogramsmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "studyprograms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StudyprogramsPackage eINSTANCE = studyprograms.impl.StudyprogramsPackageImpl.init();

	/**
	 * The meta object id for the '{@link studyprograms.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprograms.impl.CourseImpl
	 * @see studyprograms.impl.StudyprogramsPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDIT = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Taught In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__TAUGHT_IN = 4;

	/**
	 * The feature id for the '<em><b>Coursegroups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSEGROUPS = 5;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyprograms.impl.StudyProgramImpl <em>Study Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprograms.impl.StudyProgramImpl
	 * @see studyprograms.impl.StudyprogramsPackageImpl#getStudyProgram()
	 * @generated
	 */
	int STUDY_PROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nr Of Semesters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__NR_OF_SEMESTERS = 1;

	/**
	 * The feature id for the '<em><b>Specialisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__SPECIALISATIONS = 2;

	/**
	 * The feature id for the '<em><b>Coursegroup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__COURSEGROUP = 3;

	/**
	 * The number of structural features of the '<em>Study Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Courses For Semester</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM___GET_COURSES_FOR_SEMESTER__INT_SEMESTERPART = 0;

	/**
	 * The number of operations of the '<em>Study Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link studyprograms.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprograms.impl.SemesterImpl
	 * @see studyprograms.impl.StudyprogramsPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__PART = 1;

	/**
	 * The feature id for the '<em><b>Credit Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__CREDIT_LIMIT = 2;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__COURSE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__NAME = 4;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyprograms.impl.SpecialisationsImpl <em>Specialisations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprograms.impl.SpecialisationsImpl
	 * @see studyprograms.impl.StudyprogramsPackageImpl#getSpecialisations()
	 * @generated
	 */
	int SPECIALISATIONS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATIONS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Coursegroup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATIONS__COURSEGROUP = 1;

	/**
	 * The number of structural features of the '<em>Specialisations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specialisations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyprograms.impl.CourseGroupImpl <em>Course Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprograms.impl.CourseGroupImpl
	 * @see studyprograms.impl.StudyprogramsPackageImpl#getCourseGroup()
	 * @generated
	 */
	int COURSE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__COURSES = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Studyprogram</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__STUDYPROGRAM = 3;

	/**
	 * The feature id for the '<em><b>Specialisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__SPECIALISATIONS = 4;

	/**
	 * The number of structural features of the '<em>Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyprograms.impl.NTNUImpl <em>NTNU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprograms.impl.NTNUImpl
	 * @see studyprograms.impl.StudyprogramsPackageImpl#getNTNU()
	 * @generated
	 */
	int NTNU = 5;

	/**
	 * The feature id for the '<em><b>Studyprograms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTNU__STUDYPROGRAMS = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTNU__COURSES = 1;

	/**
	 * The feature id for the '<em><b>Coursegroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTNU__COURSEGROUP = 2;

	/**
	 * The feature id for the '<em><b>Studyplan</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTNU__STUDYPLAN = 3;

	/**
	 * The number of structural features of the '<em>NTNU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTNU_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>NTNU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTNU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyprograms.impl.StudyPlanImpl <em>Study Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprograms.impl.StudyPlanImpl
	 * @see studyprograms.impl.StudyprogramsPackageImpl#getStudyPlan()
	 * @generated
	 */
	int STUDY_PLAN = 6;

	/**
	 * The feature id for the '<em><b>Student Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__STUDENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Studyprogram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__STUDYPROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Specialisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__SPECIALISATIONS = 2;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__SEMESTER = 3;

	/**
	 * The number of structural features of the '<em>Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Add Semester</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN___ADD_SEMESTER__SEMESTER = 0;

	/**
	 * The number of operations of the '<em>Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link studyprograms.SemesterPart <em>Semester Part</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprograms.SemesterPart
	 * @see studyprograms.impl.StudyprogramsPackageImpl#getSemesterPart()
	 * @generated
	 */
	int SEMESTER_PART = 7;

	/**
	 * The meta object id for the '{@link studyprograms.CourseGroupeType <em>Course Groupe Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprograms.CourseGroupeType
	 * @see studyprograms.impl.StudyprogramsPackageImpl#getCourseGroupeType()
	 * @generated
	 */
	int COURSE_GROUPE_TYPE = 8;


	/**
	 * The meta object id for the '<em>Student Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see studyprograms.impl.StudyprogramsPackageImpl#getStudentId()
	 * @generated
	 */
	int STUDENT_ID = 9;


	/**
	 * Returns the meta object for class '{@link studyprograms.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see studyprograms.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link studyprograms.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyprograms.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link studyprograms.Course#getCredit <em>Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit</em>'.
	 * @see studyprograms.Course#getCredit()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credit();

	/**
	 * Returns the meta object for the attribute '{@link studyprograms.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see studyprograms.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link studyprograms.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see studyprograms.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for the attribute '{@link studyprograms.Course#getTaughtIn <em>Taught In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taught In</em>'.
	 * @see studyprograms.Course#getTaughtIn()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_TaughtIn();

	/**
	 * Returns the meta object for the reference list '{@link studyprograms.Course#getCoursegroups <em>Coursegroups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coursegroups</em>'.
	 * @see studyprograms.Course#getCoursegroups()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Coursegroups();

	/**
	 * Returns the meta object for class '{@link studyprograms.StudyProgram <em>Study Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Program</em>'.
	 * @see studyprograms.StudyProgram
	 * @generated
	 */
	EClass getStudyProgram();

	/**
	 * Returns the meta object for the attribute '{@link studyprograms.StudyProgram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyprograms.StudyProgram#getName()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EAttribute getStudyProgram_Name();

	/**
	 * Returns the meta object for the attribute '{@link studyprograms.StudyProgram#getNrOfSemesters <em>Nr Of Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Of Semesters</em>'.
	 * @see studyprograms.StudyProgram#getNrOfSemesters()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EAttribute getStudyProgram_NrOfSemesters();

	/**
	 * Returns the meta object for the containment reference list '{@link studyprograms.StudyProgram#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specialisations</em>'.
	 * @see studyprograms.StudyProgram#getSpecialisations()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EReference getStudyProgram_Specialisations();

	/**
	 * Returns the meta object for the reference list '{@link studyprograms.StudyProgram#getCoursegroup <em>Coursegroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coursegroup</em>'.
	 * @see studyprograms.StudyProgram#getCoursegroup()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EReference getStudyProgram_Coursegroup();

	/**
	 * Returns the meta object for the '{@link studyprograms.StudyProgram#getCoursesForSemester(int, studyprograms.SemesterPart) <em>Get Courses For Semester</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Courses For Semester</em>' operation.
	 * @see studyprograms.StudyProgram#getCoursesForSemester(int, studyprograms.SemesterPart)
	 * @generated
	 */
	EOperation getStudyProgram__GetCoursesForSemester__int_SemesterPart();

	/**
	 * Returns the meta object for class '{@link studyprograms.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see studyprograms.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link studyprograms.Semester#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see studyprograms.Semester#getLevel()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Level();

	/**
	 * Returns the meta object for the attribute '{@link studyprograms.Semester#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see studyprograms.Semester#getPart()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Part();

	/**
	 * Returns the meta object for the attribute '{@link studyprograms.Semester#getCreditLimit <em>Credit Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Limit</em>'.
	 * @see studyprograms.Semester#getCreditLimit()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_CreditLimit();

	/**
	 * Returns the meta object for the reference list '{@link studyprograms.Semester#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course</em>'.
	 * @see studyprograms.Semester#getCourse()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Course();

	/**
	 * Returns the meta object for the attribute '{@link studyprograms.Semester#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyprograms.Semester#getName()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Name();

	/**
	 * Returns the meta object for class '{@link studyprograms.Specialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialisations</em>'.
	 * @see studyprograms.Specialisations
	 * @generated
	 */
	EClass getSpecialisations();

	/**
	 * Returns the meta object for the attribute '{@link studyprograms.Specialisations#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyprograms.Specialisations#getName()
	 * @see #getSpecialisations()
	 * @generated
	 */
	EAttribute getSpecialisations_Name();

	/**
	 * Returns the meta object for the reference list '{@link studyprograms.Specialisations#getCoursegroup <em>Coursegroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coursegroup</em>'.
	 * @see studyprograms.Specialisations#getCoursegroup()
	 * @see #getSpecialisations()
	 * @generated
	 */
	EReference getSpecialisations_Coursegroup();

	/**
	 * Returns the meta object for class '{@link studyprograms.CourseGroup <em>Course Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Group</em>'.
	 * @see studyprograms.CourseGroup
	 * @generated
	 */
	EClass getCourseGroup();

	/**
	 * Returns the meta object for the attribute '{@link studyprograms.CourseGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyprograms.CourseGroup#getName()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EAttribute getCourseGroup_Name();

	/**
	 * Returns the meta object for the reference list '{@link studyprograms.CourseGroup#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see studyprograms.CourseGroup#getCourses()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EReference getCourseGroup_Courses();

	/**
	 * Returns the meta object for the attribute '{@link studyprograms.CourseGroup#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see studyprograms.CourseGroup#getType()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EAttribute getCourseGroup_Type();

	/**
	 * Returns the meta object for the reference list '{@link studyprograms.CourseGroup#getStudyprogram <em>Studyprogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Studyprogram</em>'.
	 * @see studyprograms.CourseGroup#getStudyprogram()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EReference getCourseGroup_Studyprogram();

	/**
	 * Returns the meta object for the reference list '{@link studyprograms.CourseGroup#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specialisations</em>'.
	 * @see studyprograms.CourseGroup#getSpecialisations()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EReference getCourseGroup_Specialisations();

	/**
	 * Returns the meta object for class '{@link studyprograms.NTNU <em>NTNU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NTNU</em>'.
	 * @see studyprograms.NTNU
	 * @generated
	 */
	EClass getNTNU();

	/**
	 * Returns the meta object for the containment reference list '{@link studyprograms.NTNU#getStudyprograms <em>Studyprograms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Studyprograms</em>'.
	 * @see studyprograms.NTNU#getStudyprograms()
	 * @see #getNTNU()
	 * @generated
	 */
	EReference getNTNU_Studyprograms();

	/**
	 * Returns the meta object for the containment reference list '{@link studyprograms.NTNU#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see studyprograms.NTNU#getCourses()
	 * @see #getNTNU()
	 * @generated
	 */
	EReference getNTNU_Courses();

	/**
	 * Returns the meta object for the containment reference list '{@link studyprograms.NTNU#getCoursegroup <em>Coursegroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coursegroup</em>'.
	 * @see studyprograms.NTNU#getCoursegroup()
	 * @see #getNTNU()
	 * @generated
	 */
	EReference getNTNU_Coursegroup();

	/**
	 * Returns the meta object for the containment reference list '{@link studyprograms.NTNU#getStudyplan <em>Studyplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Studyplan</em>'.
	 * @see studyprograms.NTNU#getStudyplan()
	 * @see #getNTNU()
	 * @generated
	 */
	EReference getNTNU_Studyplan();

	/**
	 * Returns the meta object for class '{@link studyprograms.StudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Plan</em>'.
	 * @see studyprograms.StudyPlan
	 * @generated
	 */
	EClass getStudyPlan();

	/**
	 * Returns the meta object for the attribute '{@link studyprograms.StudyPlan#getStudentName <em>Student Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Student Name</em>'.
	 * @see studyprograms.StudyPlan#getStudentName()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EAttribute getStudyPlan_StudentName();

	/**
	 * Returns the meta object for the reference '{@link studyprograms.StudyPlan#getStudyprogram <em>Studyprogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Studyprogram</em>'.
	 * @see studyprograms.StudyPlan#getStudyprogram()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Studyprogram();

	/**
	 * Returns the meta object for the reference list '{@link studyprograms.StudyPlan#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specialisations</em>'.
	 * @see studyprograms.StudyPlan#getSpecialisations()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Specialisations();

	/**
	 * Returns the meta object for the containment reference list '{@link studyprograms.StudyPlan#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semester</em>'.
	 * @see studyprograms.StudyPlan#getSemester()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Semester();

	/**
	 * Returns the meta object for the '{@link studyprograms.StudyPlan#addSemester(studyprograms.Semester) <em>Add Semester</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Semester</em>' operation.
	 * @see studyprograms.StudyPlan#addSemester(studyprograms.Semester)
	 * @generated
	 */
	EOperation getStudyPlan__AddSemester__Semester();

	/**
	 * Returns the meta object for enum '{@link studyprograms.SemesterPart <em>Semester Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semester Part</em>'.
	 * @see studyprograms.SemesterPart
	 * @generated
	 */
	EEnum getSemesterPart();

	/**
	 * Returns the meta object for enum '{@link studyprograms.CourseGroupeType <em>Course Groupe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Course Groupe Type</em>'.
	 * @see studyprograms.CourseGroupeType
	 * @generated
	 */
	EEnum getCourseGroupeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Student Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Student Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getStudentId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StudyprogramsFactory getStudyprogramsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link studyprograms.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprograms.impl.CourseImpl
		 * @see studyprograms.impl.StudyprogramsPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDIT = eINSTANCE.getCourse_Credit();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '<em><b>Taught In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__TAUGHT_IN = eINSTANCE.getCourse_TaughtIn();

		/**
		 * The meta object literal for the '<em><b>Coursegroups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__COURSEGROUPS = eINSTANCE.getCourse_Coursegroups();

		/**
		 * The meta object literal for the '{@link studyprograms.impl.StudyProgramImpl <em>Study Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprograms.impl.StudyProgramImpl
		 * @see studyprograms.impl.StudyprogramsPackageImpl#getStudyProgram()
		 * @generated
		 */
		EClass STUDY_PROGRAM = eINSTANCE.getStudyProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_PROGRAM__NAME = eINSTANCE.getStudyProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Nr Of Semesters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_PROGRAM__NR_OF_SEMESTERS = eINSTANCE.getStudyProgram_NrOfSemesters();

		/**
		 * The meta object literal for the '<em><b>Specialisations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PROGRAM__SPECIALISATIONS = eINSTANCE.getStudyProgram_Specialisations();

		/**
		 * The meta object literal for the '<em><b>Coursegroup</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PROGRAM__COURSEGROUP = eINSTANCE.getStudyProgram_Coursegroup();

		/**
		 * The meta object literal for the '<em><b>Get Courses For Semester</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDY_PROGRAM___GET_COURSES_FOR_SEMESTER__INT_SEMESTERPART = eINSTANCE.getStudyProgram__GetCoursesForSemester__int_SemesterPart();

		/**
		 * The meta object literal for the '{@link studyprograms.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprograms.impl.SemesterImpl
		 * @see studyprograms.impl.StudyprogramsPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__LEVEL = eINSTANCE.getSemester_Level();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__PART = eINSTANCE.getSemester_Part();

		/**
		 * The meta object literal for the '<em><b>Credit Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__CREDIT_LIMIT = eINSTANCE.getSemester_CreditLimit();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__COURSE = eINSTANCE.getSemester_Course();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__NAME = eINSTANCE.getSemester_Name();

		/**
		 * The meta object literal for the '{@link studyprograms.impl.SpecialisationsImpl <em>Specialisations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprograms.impl.SpecialisationsImpl
		 * @see studyprograms.impl.StudyprogramsPackageImpl#getSpecialisations()
		 * @generated
		 */
		EClass SPECIALISATIONS = eINSTANCE.getSpecialisations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATIONS__NAME = eINSTANCE.getSpecialisations_Name();

		/**
		 * The meta object literal for the '<em><b>Coursegroup</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATIONS__COURSEGROUP = eINSTANCE.getSpecialisations_Coursegroup();

		/**
		 * The meta object literal for the '{@link studyprograms.impl.CourseGroupImpl <em>Course Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprograms.impl.CourseGroupImpl
		 * @see studyprograms.impl.StudyprogramsPackageImpl#getCourseGroup()
		 * @generated
		 */
		EClass COURSE_GROUP = eINSTANCE.getCourseGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_GROUP__NAME = eINSTANCE.getCourseGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_GROUP__COURSES = eINSTANCE.getCourseGroup_Courses();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_GROUP__TYPE = eINSTANCE.getCourseGroup_Type();

		/**
		 * The meta object literal for the '<em><b>Studyprogram</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_GROUP__STUDYPROGRAM = eINSTANCE.getCourseGroup_Studyprogram();

		/**
		 * The meta object literal for the '<em><b>Specialisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_GROUP__SPECIALISATIONS = eINSTANCE.getCourseGroup_Specialisations();

		/**
		 * The meta object literal for the '{@link studyprograms.impl.NTNUImpl <em>NTNU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprograms.impl.NTNUImpl
		 * @see studyprograms.impl.StudyprogramsPackageImpl#getNTNU()
		 * @generated
		 */
		EClass NTNU = eINSTANCE.getNTNU();

		/**
		 * The meta object literal for the '<em><b>Studyprograms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NTNU__STUDYPROGRAMS = eINSTANCE.getNTNU_Studyprograms();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NTNU__COURSES = eINSTANCE.getNTNU_Courses();

		/**
		 * The meta object literal for the '<em><b>Coursegroup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NTNU__COURSEGROUP = eINSTANCE.getNTNU_Coursegroup();

		/**
		 * The meta object literal for the '<em><b>Studyplan</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NTNU__STUDYPLAN = eINSTANCE.getNTNU_Studyplan();

		/**
		 * The meta object literal for the '{@link studyprograms.impl.StudyPlanImpl <em>Study Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprograms.impl.StudyPlanImpl
		 * @see studyprograms.impl.StudyprogramsPackageImpl#getStudyPlan()
		 * @generated
		 */
		EClass STUDY_PLAN = eINSTANCE.getStudyPlan();

		/**
		 * The meta object literal for the '<em><b>Student Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_PLAN__STUDENT_NAME = eINSTANCE.getStudyPlan_StudentName();

		/**
		 * The meta object literal for the '<em><b>Studyprogram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__STUDYPROGRAM = eINSTANCE.getStudyPlan_Studyprogram();

		/**
		 * The meta object literal for the '<em><b>Specialisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__SPECIALISATIONS = eINSTANCE.getStudyPlan_Specialisations();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__SEMESTER = eINSTANCE.getStudyPlan_Semester();

		/**
		 * The meta object literal for the '<em><b>Add Semester</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDY_PLAN___ADD_SEMESTER__SEMESTER = eINSTANCE.getStudyPlan__AddSemester__Semester();

		/**
		 * The meta object literal for the '{@link studyprograms.SemesterPart <em>Semester Part</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprograms.SemesterPart
		 * @see studyprograms.impl.StudyprogramsPackageImpl#getSemesterPart()
		 * @generated
		 */
		EEnum SEMESTER_PART = eINSTANCE.getSemesterPart();

		/**
		 * The meta object literal for the '{@link studyprograms.CourseGroupeType <em>Course Groupe Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprograms.CourseGroupeType
		 * @see studyprograms.impl.StudyprogramsPackageImpl#getCourseGroupeType()
		 * @generated
		 */
		EEnum COURSE_GROUPE_TYPE = eINSTANCE.getCourseGroupeType();

		/**
		 * The meta object literal for the '<em>Student Id</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see studyprograms.impl.StudyprogramsPackageImpl#getStudentId()
		 * @generated
		 */
		EDataType STUDENT_ID = eINSTANCE.getStudentId();

	}

} //StudyprogramsPackage
