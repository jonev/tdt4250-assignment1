/**
 */
package studyprograms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import studyprograms.Course;
import studyprograms.CourseGroup;
import studyprograms.NTNU;
import studyprograms.StudyPlan;
import studyprograms.StudyProgram;
import studyprograms.StudyprogramsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NTNU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.impl.NTNUImpl#getStudyprograms <em>Studyprograms</em>}</li>
 *   <li>{@link studyprograms.impl.NTNUImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link studyprograms.impl.NTNUImpl#getCoursegroup <em>Coursegroup</em>}</li>
 *   <li>{@link studyprograms.impl.NTNUImpl#getStudyplan <em>Studyplan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NTNUImpl extends MinimalEObjectImpl.Container implements NTNU {
	/**
	 * The cached value of the '{@link #getStudyprograms() <em>Studyprograms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyprograms()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyProgram> studyprograms;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getCoursegroup() <em>Coursegroup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoursegroup()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseGroup> coursegroup;

	/**
	 * The cached value of the '{@link #getStudyplan() <em>Studyplan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyplan()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyPlan> studyplan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NTNUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramsPackage.Literals.NTNU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StudyProgram> getStudyprograms() {
		if (studyprograms == null) {
			studyprograms = new EObjectContainmentEList<StudyProgram>(StudyProgram.class, this, StudyprogramsPackage.NTNU__STUDYPROGRAMS);
		}
		return studyprograms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentEList<Course>(Course.class, this, StudyprogramsPackage.NTNU__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseGroup> getCoursegroup() {
		if (coursegroup == null) {
			coursegroup = new EObjectContainmentEList<CourseGroup>(CourseGroup.class, this, StudyprogramsPackage.NTNU__COURSEGROUP);
		}
		return coursegroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StudyPlan> getStudyplan() {
		if (studyplan == null) {
			studyplan = new EObjectContainmentEList<StudyPlan>(StudyPlan.class, this, StudyprogramsPackage.NTNU__STUDYPLAN);
		}
		return studyplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogramsPackage.NTNU__STUDYPROGRAMS:
				return ((InternalEList<?>)getStudyprograms()).basicRemove(otherEnd, msgs);
			case StudyprogramsPackage.NTNU__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
			case StudyprogramsPackage.NTNU__COURSEGROUP:
				return ((InternalEList<?>)getCoursegroup()).basicRemove(otherEnd, msgs);
			case StudyprogramsPackage.NTNU__STUDYPLAN:
				return ((InternalEList<?>)getStudyplan()).basicRemove(otherEnd, msgs);
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
			case StudyprogramsPackage.NTNU__STUDYPROGRAMS:
				return getStudyprograms();
			case StudyprogramsPackage.NTNU__COURSES:
				return getCourses();
			case StudyprogramsPackage.NTNU__COURSEGROUP:
				return getCoursegroup();
			case StudyprogramsPackage.NTNU__STUDYPLAN:
				return getStudyplan();
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
			case StudyprogramsPackage.NTNU__STUDYPROGRAMS:
				getStudyprograms().clear();
				getStudyprograms().addAll((Collection<? extends StudyProgram>)newValue);
				return;
			case StudyprogramsPackage.NTNU__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case StudyprogramsPackage.NTNU__COURSEGROUP:
				getCoursegroup().clear();
				getCoursegroup().addAll((Collection<? extends CourseGroup>)newValue);
				return;
			case StudyprogramsPackage.NTNU__STUDYPLAN:
				getStudyplan().clear();
				getStudyplan().addAll((Collection<? extends StudyPlan>)newValue);
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
			case StudyprogramsPackage.NTNU__STUDYPROGRAMS:
				getStudyprograms().clear();
				return;
			case StudyprogramsPackage.NTNU__COURSES:
				getCourses().clear();
				return;
			case StudyprogramsPackage.NTNU__COURSEGROUP:
				getCoursegroup().clear();
				return;
			case StudyprogramsPackage.NTNU__STUDYPLAN:
				getStudyplan().clear();
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
			case StudyprogramsPackage.NTNU__STUDYPROGRAMS:
				return studyprograms != null && !studyprograms.isEmpty();
			case StudyprogramsPackage.NTNU__COURSES:
				return courses != null && !courses.isEmpty();
			case StudyprogramsPackage.NTNU__COURSEGROUP:
				return coursegroup != null && !coursegroup.isEmpty();
			case StudyprogramsPackage.NTNU__STUDYPLAN:
				return studyplan != null && !studyplan.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NTNUImpl
