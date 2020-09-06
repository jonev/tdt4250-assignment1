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
import studyprograms.SemesterPart;
import studyprograms.StudyprogramsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyprograms.impl.CourseImpl#getCredit <em>Credit</em>}</li>
 *   <li>{@link studyprograms.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link studyprograms.impl.CourseImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link studyprograms.impl.CourseImpl#getTaughtIn <em>Taught In</em>}</li>
 *   <li>{@link studyprograms.impl.CourseImpl#getCoursegroups <em>Coursegroups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
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
	 * The default value of the '{@link #getCredit() <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit()
	 * @generated
	 * @ordered
	 */
	protected static final double CREDIT_EDEFAULT = 7.5;

	/**
	 * The cached value of the '{@link #getCredit() <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit()
	 * @generated
	 * @ordered
	 */
	protected double credit = CREDIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaughtIn() <em>Taught In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaughtIn()
	 * @generated
	 * @ordered
	 */
	protected static final SemesterPart TAUGHT_IN_EDEFAULT = SemesterPart.FALL;

	/**
	 * The cached value of the '{@link #getTaughtIn() <em>Taught In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaughtIn()
	 * @generated
	 * @ordered
	 */
	protected SemesterPart taughtIn = TAUGHT_IN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoursegroups() <em>Coursegroups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoursegroups()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseGroup> coursegroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramsPackage.Literals.COURSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCredit() {
		return credit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredit(double newCredit) {
		double oldCredit = credit;
		credit = newCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE__CREDIT, oldCredit, credit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemesterPart getTaughtIn() {
		return taughtIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaughtIn(SemesterPart newTaughtIn) {
		SemesterPart oldTaughtIn = taughtIn;
		taughtIn = newTaughtIn == null ? TAUGHT_IN_EDEFAULT : newTaughtIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE__TAUGHT_IN, oldTaughtIn, taughtIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseGroup> getCoursegroups() {
		if (coursegroups == null) {
			coursegroups = new EObjectWithInverseResolvingEList.ManyInverse<CourseGroup>(CourseGroup.class, this, StudyprogramsPackage.COURSE__COURSEGROUPS, StudyprogramsPackage.COURSE_GROUP__COURSES);
		}
		return coursegroups;
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
			case StudyprogramsPackage.COURSE__COURSEGROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCoursegroups()).basicAdd(otherEnd, msgs);
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
			case StudyprogramsPackage.COURSE__COURSEGROUPS:
				return ((InternalEList<?>)getCoursegroups()).basicRemove(otherEnd, msgs);
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
			case StudyprogramsPackage.COURSE__NAME:
				return getName();
			case StudyprogramsPackage.COURSE__CREDIT:
				return getCredit();
			case StudyprogramsPackage.COURSE__CODE:
				return getCode();
			case StudyprogramsPackage.COURSE__LEVEL:
				return getLevel();
			case StudyprogramsPackage.COURSE__TAUGHT_IN:
				return getTaughtIn();
			case StudyprogramsPackage.COURSE__COURSEGROUPS:
				return getCoursegroups();
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
			case StudyprogramsPackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case StudyprogramsPackage.COURSE__CREDIT:
				setCredit((Double)newValue);
				return;
			case StudyprogramsPackage.COURSE__CODE:
				setCode((String)newValue);
				return;
			case StudyprogramsPackage.COURSE__LEVEL:
				setLevel((Integer)newValue);
				return;
			case StudyprogramsPackage.COURSE__TAUGHT_IN:
				setTaughtIn((SemesterPart)newValue);
				return;
			case StudyprogramsPackage.COURSE__COURSEGROUPS:
				getCoursegroups().clear();
				getCoursegroups().addAll((Collection<? extends CourseGroup>)newValue);
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
			case StudyprogramsPackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyprogramsPackage.COURSE__CREDIT:
				setCredit(CREDIT_EDEFAULT);
				return;
			case StudyprogramsPackage.COURSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case StudyprogramsPackage.COURSE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case StudyprogramsPackage.COURSE__TAUGHT_IN:
				setTaughtIn(TAUGHT_IN_EDEFAULT);
				return;
			case StudyprogramsPackage.COURSE__COURSEGROUPS:
				getCoursegroups().clear();
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
			case StudyprogramsPackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyprogramsPackage.COURSE__CREDIT:
				return credit != CREDIT_EDEFAULT;
			case StudyprogramsPackage.COURSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case StudyprogramsPackage.COURSE__LEVEL:
				return level != LEVEL_EDEFAULT;
			case StudyprogramsPackage.COURSE__TAUGHT_IN:
				return taughtIn != TAUGHT_IN_EDEFAULT;
			case StudyprogramsPackage.COURSE__COURSEGROUPS:
				return coursegroups != null && !coursegroups.isEmpty();
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
		result.append(", credit: ");
		result.append(credit);
		result.append(", code: ");
		result.append(code);
		result.append(", level: ");
		result.append(level);
		result.append(", taughtIn: ");
		result.append(taughtIn);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
