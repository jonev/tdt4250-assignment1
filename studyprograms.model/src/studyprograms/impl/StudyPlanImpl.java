/**
 */
package studyprograms.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.InternalEList;
import studyprograms.Semester;
import studyprograms.Specialisations;
import studyprograms.StudyPlan;
import studyprograms.StudyProgram;
import studyprograms.StudyprogramsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.impl.StudyPlanImpl#getStudentName <em>Student Name</em>}</li>
 *   <li>{@link studyprograms.impl.StudyPlanImpl#getStudyprogram <em>Studyprogram</em>}</li>
 *   <li>{@link studyprograms.impl.StudyPlanImpl#getSpecialisations <em>Specialisations</em>}</li>
 *   <li>{@link studyprograms.impl.StudyPlanImpl#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyPlanImpl extends MinimalEObjectImpl.Container implements StudyPlan {
	/**
	 * The default value of the '{@link #getStudentName() <em>Student Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentName()
	 * @generated
	 * @ordered
	 */
	protected static final String STUDENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStudentName() <em>Student Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentName()
	 * @generated
	 * @ordered
	 */
	protected String studentName = STUDENT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudyprogram() <em>Studyprogram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyprogram()
	 * @generated
	 * @ordered
	 */
	protected StudyProgram studyprogram;

	/**
	 * The cached value of the '{@link #getSpecialisations() <em>Specialisations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialisations> specialisations;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semester;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramsPackage.Literals.STUDY_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStudentName() {
		return studentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudentName(String newStudentName) {
		String oldStudentName = studentName;
		studentName = newStudentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.STUDY_PLAN__STUDENT_NAME, oldStudentName, studentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyProgram getStudyprogram() {
		if (studyprogram != null && studyprogram.eIsProxy()) {
			InternalEObject oldStudyprogram = (InternalEObject)studyprogram;
			studyprogram = (StudyProgram)eResolveProxy(oldStudyprogram);
			if (studyprogram != oldStudyprogram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyprogramsPackage.STUDY_PLAN__STUDYPROGRAM, oldStudyprogram, studyprogram));
			}
		}
		return studyprogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyProgram basicGetStudyprogram() {
		return studyprogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyprogram(StudyProgram newStudyprogram) {
		StudyProgram oldStudyprogram = studyprogram;
		studyprogram = newStudyprogram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.STUDY_PLAN__STUDYPROGRAM, oldStudyprogram, studyprogram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialisations> getSpecialisations() {
		if (specialisations == null) {
			specialisations = new EObjectResolvingEList<Specialisations>(Specialisations.class, this, StudyprogramsPackage.STUDY_PLAN__SPECIALISATIONS);
		}
		return specialisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemester() {
		if (semester == null) {
			semester = new EObjectContainmentEList<Semester>(Semester.class, this, StudyprogramsPackage.STUDY_PLAN__SEMESTER);
		}
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addSemester(Semester semester) {
		if(this.studyprogram.getNrOfSemesters() <= this.getSemester().size()) {
			throw new IllegalArgumentException("Max nr of semester is reached");
		}
		for(Semester s : this.getSemester()) {
			if(s.getLevel() == semester.getLevel() && s.getPart() == semester.getPart()) {
				throw new IllegalArgumentException("Semester already exist");
			}
		}
		this.getSemester().add(semester);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogramsPackage.STUDY_PLAN__SEMESTER:
				return ((InternalEList<?>)getSemester()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyprogramsPackage.STUDY_PLAN__STUDENT_NAME:
				return getStudentName();
			case StudyprogramsPackage.STUDY_PLAN__STUDYPROGRAM:
				if (resolve) return getStudyprogram();
				return basicGetStudyprogram();
			case StudyprogramsPackage.STUDY_PLAN__SPECIALISATIONS:
				return getSpecialisations();
			case StudyprogramsPackage.STUDY_PLAN__SEMESTER:
				return getSemester();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyprogramsPackage.STUDY_PLAN__STUDENT_NAME:
				setStudentName((String)newValue);
				return;
			case StudyprogramsPackage.STUDY_PLAN__STUDYPROGRAM:
				setStudyprogram((StudyProgram)newValue);
				return;
			case StudyprogramsPackage.STUDY_PLAN__SPECIALISATIONS:
				getSpecialisations().clear();
				getSpecialisations().addAll((Collection<? extends Specialisations>)newValue);
				return;
			case StudyprogramsPackage.STUDY_PLAN__SEMESTER:
				getSemester().clear();
				getSemester().addAll((Collection<? extends Semester>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyprogramsPackage.STUDY_PLAN__STUDENT_NAME:
				setStudentName(STUDENT_NAME_EDEFAULT);
				return;
			case StudyprogramsPackage.STUDY_PLAN__STUDYPROGRAM:
				setStudyprogram((StudyProgram)null);
				return;
			case StudyprogramsPackage.STUDY_PLAN__SPECIALISATIONS:
				getSpecialisations().clear();
				return;
			case StudyprogramsPackage.STUDY_PLAN__SEMESTER:
				getSemester().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyprogramsPackage.STUDY_PLAN__STUDENT_NAME:
				return STUDENT_NAME_EDEFAULT == null ? studentName != null : !STUDENT_NAME_EDEFAULT.equals(studentName);
			case StudyprogramsPackage.STUDY_PLAN__STUDYPROGRAM:
				return studyprogram != null;
			case StudyprogramsPackage.STUDY_PLAN__SPECIALISATIONS:
				return specialisations != null && !specialisations.isEmpty();
			case StudyprogramsPackage.STUDY_PLAN__SEMESTER:
				return semester != null && !semester.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StudyprogramsPackage.STUDY_PLAN___ADD_SEMESTER__SEMESTER:
				addSemester((Semester)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (studentName: ");
		result.append(studentName);
		result.append(')');
		return result.toString();
	}

} //StudyPlanImpl
