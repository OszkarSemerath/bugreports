/**
 */
package examplePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see examplePackage.ExamplePackageFactory
 * @model kind="package"
 * @generated
 */
public interface ExamplePackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "examplePackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "examplePackage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "examplePackage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExamplePackagePackage eINSTANCE = examplePackage.impl.ExamplePackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link examplePackage.impl.TrackElementImpl <em>Track Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see examplePackage.impl.TrackElementImpl
	 * @see examplePackage.impl.ExamplePackagePackageImpl#getTrackElement()
	 * @generated
	 */
	int TRACK_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Track Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Track Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link examplePackage.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see examplePackage.impl.SegmentImpl
	 * @see examplePackage.impl.ExamplePackagePackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 1;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = TRACK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_OPERATION_COUNT = TRACK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link examplePackage.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see examplePackage.impl.SwitchImpl
	 * @see examplePackage.impl.ExamplePackagePackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__STATE = TRACK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = TRACK_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPERATION_COUNT = TRACK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link examplePackage.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see examplePackage.impl.ModelImpl
	 * @see examplePackage.impl.ExamplePackagePackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 3;

	/**
	 * The feature id for the '<em><b>Contains Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTAINS_OBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Refer To Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__REFER_TO_OBJECTS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link examplePackage.impl.RailwaySystemImpl <em>Railway System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see examplePackage.impl.RailwaySystemImpl
	 * @see examplePackage.impl.ExamplePackagePackageImpl#getRailwaySystem()
	 * @generated
	 */
	int RAILWAY_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_SYSTEM__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Railway System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Railway System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link examplePackage.SwitchState <em>Switch State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see examplePackage.SwitchState
	 * @see examplePackage.impl.ExamplePackagePackageImpl#getSwitchState()
	 * @generated
	 */
	int SWITCH_STATE = 5;


	/**
	 * Returns the meta object for class '{@link examplePackage.TrackElement <em>Track Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track Element</em>'.
	 * @see examplePackage.TrackElement
	 * @generated
	 */
	EClass getTrackElement();

	/**
	 * Returns the meta object for class '{@link examplePackage.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see examplePackage.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for class '{@link examplePackage.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see examplePackage.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for the attribute '{@link examplePackage.Switch#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see examplePackage.Switch#getState()
	 * @see #getSwitch()
	 * @generated
	 */
	EAttribute getSwitch_State();

	/**
	 * Returns the meta object for class '{@link examplePackage.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see examplePackage.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link examplePackage.Model#getContainsObjects <em>Contains Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Objects</em>'.
	 * @see examplePackage.Model#getContainsObjects()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ContainsObjects();

	/**
	 * Returns the meta object for the reference list '{@link examplePackage.Model#getReferToObjects <em>Refer To Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refer To Objects</em>'.
	 * @see examplePackage.Model#getReferToObjects()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ReferToObjects();

	/**
	 * Returns the meta object for class '{@link examplePackage.RailwaySystem <em>Railway System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Railway System</em>'.
	 * @see examplePackage.RailwaySystem
	 * @generated
	 */
	EClass getRailwaySystem();

	/**
	 * Returns the meta object for the containment reference list '{@link examplePackage.RailwaySystem#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see examplePackage.RailwaySystem#getElements()
	 * @see #getRailwaySystem()
	 * @generated
	 */
	EReference getRailwaySystem_Elements();

	/**
	 * Returns the meta object for enum '{@link examplePackage.SwitchState <em>Switch State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Switch State</em>'.
	 * @see examplePackage.SwitchState
	 * @generated
	 */
	EEnum getSwitchState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExamplePackageFactory getExamplePackageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link examplePackage.impl.TrackElementImpl <em>Track Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see examplePackage.impl.TrackElementImpl
		 * @see examplePackage.impl.ExamplePackagePackageImpl#getTrackElement()
		 * @generated
		 */
		EClass TRACK_ELEMENT = eINSTANCE.getTrackElement();

		/**
		 * The meta object literal for the '{@link examplePackage.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see examplePackage.impl.SegmentImpl
		 * @see examplePackage.impl.ExamplePackagePackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '{@link examplePackage.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see examplePackage.impl.SwitchImpl
		 * @see examplePackage.impl.ExamplePackagePackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH__STATE = eINSTANCE.getSwitch_State();

		/**
		 * The meta object literal for the '{@link examplePackage.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see examplePackage.impl.ModelImpl
		 * @see examplePackage.impl.ExamplePackagePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Contains Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTAINS_OBJECTS = eINSTANCE.getModel_ContainsObjects();

		/**
		 * The meta object literal for the '<em><b>Refer To Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__REFER_TO_OBJECTS = eINSTANCE.getModel_ReferToObjects();

		/**
		 * The meta object literal for the '{@link examplePackage.impl.RailwaySystemImpl <em>Railway System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see examplePackage.impl.RailwaySystemImpl
		 * @see examplePackage.impl.ExamplePackagePackageImpl#getRailwaySystem()
		 * @generated
		 */
		EClass RAILWAY_SYSTEM = eINSTANCE.getRailwaySystem();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_SYSTEM__ELEMENTS = eINSTANCE.getRailwaySystem_Elements();

		/**
		 * The meta object literal for the '{@link examplePackage.SwitchState <em>Switch State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see examplePackage.SwitchState
		 * @see examplePackage.impl.ExamplePackagePackageImpl#getSwitchState()
		 * @generated
		 */
		EEnum SWITCH_STATE = eINSTANCE.getSwitchState();

	}

} //ExamplePackagePackage
