/**
 */
package studyprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Course Groupe Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see studyprograms.StudyprogramsPackage#getCourseGroupeType()
 * @model
 * @generated
 */
public enum CourseGroupeType implements Enumerator {
	/**
	 * The '<em><b>MANDATORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANDATORY_VALUE
	 * @generated
	 * @ordered
	 */
	MANDATORY(0, "MANDATORY", "MANDATORY"),

	/**
	 * The '<em><b>TWO OF FOUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_OF_FOUR_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_OF_FOUR(1, "TWO_OF_FOUR", "TWO_OF_FOUR"),

	/**
	 * The '<em><b>ELECTIVE NO CRASH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTIVE_NO_CRASH_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTIVE_NO_CRASH(2, "ELECTIVE_NO_CRASH", "ELECTIVE_NO_CRASH"),

	/**
	 * The '<em><b>ELECTIVE CAN CRASH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTIVE_CAN_CRASH_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTIVE_CAN_CRASH(3, "ELECTIVE_CAN_CRASH", "ELECTIVE_CAN_CRASH"), /**
	 * The '<em><b>ONE IN GROUP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_IN_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_IN_GROUP(4, "ONE_IN_GROUP", "ONE_IN_GROUP");

	/**
	 * The '<em><b>MANDATORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANDATORY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANDATORY_VALUE = 0;

	/**
	 * The '<em><b>TWO OF FOUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_OF_FOUR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWO_OF_FOUR_VALUE = 1;

	/**
	 * The '<em><b>ELECTIVE NO CRASH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTIVE_NO_CRASH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELECTIVE_NO_CRASH_VALUE = 2;

	/**
	 * The '<em><b>ELECTIVE CAN CRASH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTIVE_CAN_CRASH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELECTIVE_CAN_CRASH_VALUE = 3;

	/**
	 * The '<em><b>ONE IN GROUP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_IN_GROUP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_IN_GROUP_VALUE = 4;

	/**
	 * An array of all the '<em><b>Course Groupe Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CourseGroupeType[] VALUES_ARRAY =
		new CourseGroupeType[] {
			MANDATORY,
			TWO_OF_FOUR,
			ELECTIVE_NO_CRASH,
			ELECTIVE_CAN_CRASH,
			ONE_IN_GROUP,
		};

	/**
	 * A public read-only list of all the '<em><b>Course Groupe Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CourseGroupeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Course Groupe Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseGroupeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CourseGroupeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course Groupe Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseGroupeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CourseGroupeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course Groupe Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseGroupeType get(int value) {
		switch (value) {
			case MANDATORY_VALUE: return MANDATORY;
			case TWO_OF_FOUR_VALUE: return TWO_OF_FOUR;
			case ELECTIVE_NO_CRASH_VALUE: return ELECTIVE_NO_CRASH;
			case ELECTIVE_CAN_CRASH_VALUE: return ELECTIVE_CAN_CRASH;
			case ONE_IN_GROUP_VALUE: return ONE_IN_GROUP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CourseGroupeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CourseGroupeType
