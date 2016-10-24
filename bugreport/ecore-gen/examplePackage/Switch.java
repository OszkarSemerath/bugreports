/**
 */
package examplePackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link examplePackage.Switch#getState <em>State</em>}</li>
 * </ul>
 *
 * @see examplePackage.ExamplePackagePackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends TrackElement {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link examplePackage.SwitchState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see examplePackage.SwitchState
	 * @see #setState(SwitchState)
	 * @see examplePackage.ExamplePackagePackage#getSwitch_State()
	 * @model
	 * @generated
	 */
	SwitchState getState();

	/**
	 * Sets the value of the '{@link examplePackage.Switch#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see examplePackage.SwitchState
	 * @see #getState()
	 * @generated
	 */
	void setState(SwitchState value);

} // Switch
