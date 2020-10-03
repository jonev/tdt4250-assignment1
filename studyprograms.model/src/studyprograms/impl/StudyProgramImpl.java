/**
 */
package studyprograms.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import studyprograms.Course;
import studyprograms.CourseGroup;
import studyprograms.CourseGroupeType;
import studyprograms.SemesterPart;
import studyprograms.Specialisations;
import studyprograms.StudyProgram;
import studyprograms.StudyprogramsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.impl.StudyProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyprograms.impl.StudyProgramImpl#getNrOfSemesters <em>Nr Of Semesters</em>}</li>
 *   <li>{@link studyprograms.impl.StudyProgramImpl#getSpecialisations <em>Specialisations</em>}</li>
 *   <li>{@link studyprograms.impl.StudyProgramImpl#getCoursegroup <em>Coursegroup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyProgramImpl extends MinimalEObjectImpl.Container implements StudyProgram {
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
	 * The default value of the '{@link #getNrOfSemesters() <em>Nr Of Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfSemesters()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_OF_SEMESTERS_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getNrOfSemesters() <em>Nr Of Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfSemesters()
	 * @generated
	 * @ordered
	 */
	protected int nrOfSemesters = NR_OF_SEMESTERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecialisations() <em>Specialisations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialisations> specialisations;

	/**
	 * The cached value of the '{@link #getCoursegroup() <em>Coursegroup</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoursegroup()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseGroup> coursegroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramsPackage.Literals.STUDY_PROGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.STUDY_PROGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNrOfSemesters() {
		return nrOfSemesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNrOfSemesters(int newNrOfSemesters) {
		int oldNrOfSemesters = nrOfSemesters;
		nrOfSemesters = newNrOfSemesters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.STUDY_PROGRAM__NR_OF_SEMESTERS, oldNrOfSemesters, nrOfSemesters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialisations> getSpecialisations() {
		if (specialisations == null) {
			specialisations = new EObjectContainmentEList<Specialisations>(Specialisations.class, this, StudyprogramsPackage.STUDY_PROGRAM__SPECIALISATIONS);
		}
		return specialisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseGroup> getCoursegroup() {
		if (coursegroup == null) {
			coursegroup = new EObjectWithInverseResolvingEList.ManyInverse<CourseGroup>(CourseGroup.class, this, StudyprogramsPackage.STUDY_PROGRAM__COURSEGROUP, StudyprogramsPackage.COURSE_GROUP__STUDYPROGRAM);
		}
		return coursegroup;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Course> getCoursesForSemesterBySpecialization(int level, SemesterPart part, Specialisations specialization, CourseGroupeType courseGroupType) {
		EList<Course> list = new BasicEList<>();
		for(CourseGroup g : specialization.getCoursegroup()) {
			if(g.getType() != courseGroupType) continue;
			for(Course c : g.getCourses()) {
				if(c.getLevel() == level && c.getTaughtIn() == part) {
					list.add(c);
				}
			}
		}
		
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Course> getCoursesForSemester(int level, SemesterPart part, CourseGroupeType courseGroupType) {
			EList<Course> list = new BasicEList<>();
		for(CourseGroup g : this.getCoursegroup()) {
			if(g.getType() != courseGroupType) continue;
			for(Course c : g.getCourses()) {
				if(c.getLevel() == level && c.getTaughtIn() == part) {
					list.add(c);
				}
			}
		}
		return list;
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
			case StudyprogramsPackage.STUDY_PROGRAM__COURSEGROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCoursegroup()).basicAdd(otherEnd, msgs);
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
			case StudyprogramsPackage.STUDY_PROGRAM__SPECIALISATIONS:
				return ((InternalEList<?>)getSpecialisations()).basicRemove(otherEnd, msgs);
			case StudyprogramsPackage.STUDY_PROGRAM__COURSEGROUP:
				return ((InternalEList<?>)getCoursegroup()).basicRemove(otherEnd, msgs);
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
			case StudyprogramsPackage.STUDY_PROGRAM__NAME:
				return getName();
			case StudyprogramsPackage.STUDY_PROGRAM__NR_OF_SEMESTERS:
				return getNrOfSemesters();
			case StudyprogramsPackage.STUDY_PROGRAM__SPECIALISATIONS:
				return getSpecialisations();
			case StudyprogramsPackage.STUDY_PROGRAM__COURSEGROUP:
				return getCoursegroup();
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
			case StudyprogramsPackage.STUDY_PROGRAM__NAME:
				setName((String)newValue);
				return;
			case StudyprogramsPackage.STUDY_PROGRAM__NR_OF_SEMESTERS:
				setNrOfSemesters((Integer)newValue);
				return;
			case StudyprogramsPackage.STUDY_PROGRAM__SPECIALISATIONS:
				getSpecialisations().clear();
				getSpecialisations().addAll((Collection<? extends Specialisations>)newValue);
				return;
			case StudyprogramsPackage.STUDY_PROGRAM__COURSEGROUP:
				getCoursegroup().clear();
				getCoursegroup().addAll((Collection<? extends CourseGroup>)newValue);
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
			case StudyprogramsPackage.STUDY_PROGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyprogramsPackage.STUDY_PROGRAM__NR_OF_SEMESTERS:
				setNrOfSemesters(NR_OF_SEMESTERS_EDEFAULT);
				return;
			case StudyprogramsPackage.STUDY_PROGRAM__SPECIALISATIONS:
				getSpecialisations().clear();
				return;
			case StudyprogramsPackage.STUDY_PROGRAM__COURSEGROUP:
				getCoursegroup().clear();
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
			case StudyprogramsPackage.STUDY_PROGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyprogramsPackage.STUDY_PROGRAM__NR_OF_SEMESTERS:
				return nrOfSemesters != NR_OF_SEMESTERS_EDEFAULT;
			case StudyprogramsPackage.STUDY_PROGRAM__SPECIALISATIONS:
				return specialisations != null && !specialisations.isEmpty();
			case StudyprogramsPackage.STUDY_PROGRAM__COURSEGROUP:
				return coursegroup != null && !coursegroup.isEmpty();
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
			case StudyprogramsPackage.STUDY_PROGRAM___GET_COURSES_FOR_SEMESTER__INT_SEMESTERPART_COURSEGROUPETYPE:
				return getCoursesForSemester((Integer)arguments.get(0), (SemesterPart)arguments.get(1), (CourseGroupeType)arguments.get(2));
			case StudyprogramsPackage.STUDY_PROGRAM___GET_COURSES_FOR_SEMESTER_BY_SPECIALIZATION__INT_SEMESTERPART_SPECIALISATIONS_COURSEGROUPETYPE:
				return getCoursesForSemesterBySpecialization((Integer)arguments.get(0), (SemesterPart)arguments.get(1), (Specialisations)arguments.get(2), (CourseGroupeType)arguments.get(3));
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
		result.append(" (name: ");
		result.append(name);
		result.append(", nrOfSemesters: ");
		result.append(nrOfSemesters);
		result.append(')');
		return result.toString();
	}

} //StudyProgramImpl
