/**
 */
package examplePackage.impl;

import examplePackage.ExamplePackagePackage;
import examplePackage.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link examplePackage.impl.ModelImpl#getContainsObjects <em>Contains Objects</em>}</li>
 *   <li>{@link examplePackage.impl.ModelImpl#getReferToObjects <em>Refer To Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getContainsObjects() <em>Contains Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> containsObjects;

	/**
	 * The cached value of the '{@link #getReferToObjects() <em>Refer To Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferToObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> referToObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExamplePackagePackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getContainsObjects() {
		if (containsObjects == null) {
			containsObjects = new EObjectContainmentEList<EObject>(EObject.class, this, ExamplePackagePackage.MODEL__CONTAINS_OBJECTS);
		}
		return containsObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getReferToObjects() {
		if (referToObjects == null) {
			referToObjects = new EObjectResolvingEList<EObject>(EObject.class, this, ExamplePackagePackage.MODEL__REFER_TO_OBJECTS);
		}
		return referToObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExamplePackagePackage.MODEL__CONTAINS_OBJECTS:
				return ((InternalEList<?>)getContainsObjects()).basicRemove(otherEnd, msgs);
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
			case ExamplePackagePackage.MODEL__CONTAINS_OBJECTS:
				return getContainsObjects();
			case ExamplePackagePackage.MODEL__REFER_TO_OBJECTS:
				return getReferToObjects();
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
			case ExamplePackagePackage.MODEL__CONTAINS_OBJECTS:
				getContainsObjects().clear();
				getContainsObjects().addAll((Collection<? extends EObject>)newValue);
				return;
			case ExamplePackagePackage.MODEL__REFER_TO_OBJECTS:
				getReferToObjects().clear();
				getReferToObjects().addAll((Collection<? extends EObject>)newValue);
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
			case ExamplePackagePackage.MODEL__CONTAINS_OBJECTS:
				getContainsObjects().clear();
				return;
			case ExamplePackagePackage.MODEL__REFER_TO_OBJECTS:
				getReferToObjects().clear();
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
			case ExamplePackagePackage.MODEL__CONTAINS_OBJECTS:
				return containsObjects != null && !containsObjects.isEmpty();
			case ExamplePackagePackage.MODEL__REFER_TO_OBJECTS:
				return referToObjects != null && !referToObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
