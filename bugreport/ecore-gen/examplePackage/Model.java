/**
 */
package examplePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link examplePackage.Model#getContainsObjects <em>Contains Objects</em>}</li>
 *   <li>{@link examplePackage.Model#getReferToObjects <em>Refer To Objects</em>}</li>
 * </ul>
 *
 * @see examplePackage.ExamplePackagePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Objects</em>' containment reference list.
	 * @see examplePackage.ExamplePackagePackage#getModel_ContainsObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getContainsObjects();

	/**
	 * Returns the value of the '<em><b>Refer To Objects</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refer To Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refer To Objects</em>' reference list.
	 * @see examplePackage.ExamplePackagePackage#getModel_ReferToObjects()
	 * @model
	 * @generated
	 */
	EList<EObject> getReferToObjects();

} // Model
