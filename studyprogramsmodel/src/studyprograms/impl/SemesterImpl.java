/**
 */
package studyprograms.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import studyprograms.Course;
import studyprograms.Semester;
import studyprograms.SemesterPart;
import studyprograms.StudyPlan;
import studyprograms.StudyprogramsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.impl.SemesterImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link studyprograms.impl.SemesterImpl#getPart <em>Part</em>}</li>
 *   <li>{@link studyprograms.impl.SemesterImpl#getCreditLimit <em>Credit Limit</em>}</li>
 *   <li>{@link studyprograms.impl.SemesterImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link studyprograms.impl.SemesterImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
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
	 * The default value of the '{@link #getPart() <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected static final SemesterPart PART_EDEFAULT = SemesterPart.FALL;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected SemesterPart part = PART_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreditLimit() <em>Credit Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int CREDIT_LIMIT_EDEFAULT = 30;

	/**
	 * The cached value of the '{@link #getCreditLimit() <em>Credit Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditLimit()
	 * @generated
	 * @ordered
	 */
	protected int creditLimit = CREDIT_LIMIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> course;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramsPackage.Literals.SEMESTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.SEMESTER__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemesterPart getPart() {
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPart(SemesterPart newPart) {
		SemesterPart oldPart = part;
		part = newPart == null ? PART_EDEFAULT : newPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.SEMESTER__PART, oldPart, part));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCreditLimit() {
		return creditLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreditLimit(int newCreditLimit) {
		int oldCreditLimit = creditLimit;
		creditLimit = newCreditLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.SEMESTER__CREDIT_LIMIT, oldCreditLimit, creditLimit));
	}

	


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourse() {
		if (course == null) {
			course = new EObjectResolvingEList<Course>(Course.class, this, StudyprogramsPackage.SEMESTER__COURSE);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		if(this.eContainer() instanceof StudyPlan) {
			StudyPlan plan = (StudyPlan)this.eContainer();
			return plan.getStudentName() + " level " + this.getLevel() + " part " + this.getPart();
		} else
		{
			return "ERROR";
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyprogramsPackage.SEMESTER__LEVEL:
				return getLevel();
			case StudyprogramsPackage.SEMESTER__PART:
				return getPart();
			case StudyprogramsPackage.SEMESTER__CREDIT_LIMIT:
				return getCreditLimit();
			case StudyprogramsPackage.SEMESTER__COURSE:
				return getCourse();
			case StudyprogramsPackage.SEMESTER__NAME:
				return getName();
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
			case StudyprogramsPackage.SEMESTER__LEVEL:
				setLevel((Integer)newValue);
				return;
			case StudyprogramsPackage.SEMESTER__PART:
				setPart((SemesterPart)newValue);
				return;
			case StudyprogramsPackage.SEMESTER__CREDIT_LIMIT:
				setCreditLimit((Integer)newValue);
				return;
			case StudyprogramsPackage.SEMESTER__COURSE:
				getCourse().clear();
				getCourse().addAll((Collection<? extends Course>)newValue);
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
			case StudyprogramsPackage.SEMESTER__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case StudyprogramsPackage.SEMESTER__PART:
				setPart(PART_EDEFAULT);
				return;
			case StudyprogramsPackage.SEMESTER__CREDIT_LIMIT:
				setCreditLimit(CREDIT_LIMIT_EDEFAULT);
				return;
			case StudyprogramsPackage.SEMESTER__COURSE:
				getCourse().clear();
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
			case StudyprogramsPackage.SEMESTER__LEVEL:
				return level != LEVEL_EDEFAULT;
			case StudyprogramsPackage.SEMESTER__PART:
				return part != PART_EDEFAULT;
			case StudyprogramsPackage.SEMESTER__CREDIT_LIMIT:
				return creditLimit != CREDIT_LIMIT_EDEFAULT;
			case StudyprogramsPackage.SEMESTER__COURSE:
				return course != null && !course.isEmpty();
			case StudyprogramsPackage.SEMESTER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
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
		result.append(" (level: ");
		result.append(level);
		result.append(", part: ");
		result.append(part);
		result.append(", creditLimit: ");
		result.append(creditLimit);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
