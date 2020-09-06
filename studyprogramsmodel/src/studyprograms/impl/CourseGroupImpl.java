/**
 */
package studyprograms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import studyprograms.Course;
import studyprograms.CourseGroup;
import studyprograms.CourseGroupeType;
import studyprograms.Specialisations;
import studyprograms.StudyProgram;
import studyprograms.StudyprogramsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.impl.CourseGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyprograms.impl.CourseGroupImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link studyprograms.impl.CourseGroupImpl#getType <em>Type</em>}</li>
 *   <li>{@link studyprograms.impl.CourseGroupImpl#getStudyprogram <em>Studyprogram</em>}</li>
 *   <li>{@link studyprograms.impl.CourseGroupImpl#getSpecialisations <em>Specialisations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseGroupImpl extends MinimalEObjectImpl.Container implements CourseGroup {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CourseGroupeType TYPE_EDEFAULT = CourseGroupeType.MANDATORY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CourseGroupeType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudyprogram() <em>Studyprogram</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyprogram()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyProgram> studyprogram;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramsPackage.Literals.COURSE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectWithInverseResolvingEList.ManyInverse<Course>(Course.class, this, StudyprogramsPackage.COURSE_GROUP__COURSES, StudyprogramsPackage.COURSE__COURSEGROUPS);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseGroupeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(CourseGroupeType newType) {
		CourseGroupeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE_GROUP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StudyProgram> getStudyprogram() {
		if (studyprogram == null) {
			studyprogram = new EObjectWithInverseResolvingEList.ManyInverse<StudyProgram>(StudyProgram.class, this, StudyprogramsPackage.COURSE_GROUP__STUDYPROGRAM, StudyprogramsPackage.STUDY_PROGRAM__COURSEGROUP);
		}
		return studyprogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialisations> getSpecialisations() {
		if (specialisations == null) {
			specialisations = new EObjectWithInverseResolvingEList.ManyInverse<Specialisations>(Specialisations.class, this, StudyprogramsPackage.COURSE_GROUP__SPECIALISATIONS, StudyprogramsPackage.SPECIALISATIONS__COURSEGROUP);
		}
		return specialisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogramsPackage.COURSE_GROUP__COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourses()).basicAdd(otherEnd, msgs);
			case StudyprogramsPackage.COURSE_GROUP__STUDYPROGRAM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStudyprogram()).basicAdd(otherEnd, msgs);
			case StudyprogramsPackage.COURSE_GROUP__SPECIALISATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecialisations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogramsPackage.COURSE_GROUP__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
			case StudyprogramsPackage.COURSE_GROUP__STUDYPROGRAM:
				return ((InternalEList<?>)getStudyprogram()).basicRemove(otherEnd, msgs);
			case StudyprogramsPackage.COURSE_GROUP__SPECIALISATIONS:
				return ((InternalEList<?>)getSpecialisations()).basicRemove(otherEnd, msgs);
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
			case StudyprogramsPackage.COURSE_GROUP__NAME:
				return getName();
			case StudyprogramsPackage.COURSE_GROUP__COURSES:
				return getCourses();
			case StudyprogramsPackage.COURSE_GROUP__TYPE:
				return getType();
			case StudyprogramsPackage.COURSE_GROUP__STUDYPROGRAM:
				return getStudyprogram();
			case StudyprogramsPackage.COURSE_GROUP__SPECIALISATIONS:
				return getSpecialisations();
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
			case StudyprogramsPackage.COURSE_GROUP__NAME:
				setName((String)newValue);
				return;
			case StudyprogramsPackage.COURSE_GROUP__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case StudyprogramsPackage.COURSE_GROUP__TYPE:
				setType((CourseGroupeType)newValue);
				return;
			case StudyprogramsPackage.COURSE_GROUP__STUDYPROGRAM:
				getStudyprogram().clear();
				getStudyprogram().addAll((Collection<? extends StudyProgram>)newValue);
				return;
			case StudyprogramsPackage.COURSE_GROUP__SPECIALISATIONS:
				getSpecialisations().clear();
				getSpecialisations().addAll((Collection<? extends Specialisations>)newValue);
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
			case StudyprogramsPackage.COURSE_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyprogramsPackage.COURSE_GROUP__COURSES:
				getCourses().clear();
				return;
			case StudyprogramsPackage.COURSE_GROUP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case StudyprogramsPackage.COURSE_GROUP__STUDYPROGRAM:
				getStudyprogram().clear();
				return;
			case StudyprogramsPackage.COURSE_GROUP__SPECIALISATIONS:
				getSpecialisations().clear();
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
			case StudyprogramsPackage.COURSE_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyprogramsPackage.COURSE_GROUP__COURSES:
				return courses != null && !courses.isEmpty();
			case StudyprogramsPackage.COURSE_GROUP__TYPE:
				return type != TYPE_EDEFAULT;
			case StudyprogramsPackage.COURSE_GROUP__STUDYPROGRAM:
				return studyprogram != null && !studyprogram.isEmpty();
			case StudyprogramsPackage.COURSE_GROUP__SPECIALISATIONS:
				return specialisations != null && !specialisations.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CourseGroupImpl
