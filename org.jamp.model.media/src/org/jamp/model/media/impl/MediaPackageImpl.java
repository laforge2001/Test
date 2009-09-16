/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jamp.model.media.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.jamp.model.media.MediaApi;
import org.jamp.model.media.MediaFactory;
import org.jamp.model.media.MediaObject;
import org.jamp.model.media.MediaPackage;
import org.jamp.model.media.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MediaPackageImpl extends EPackageImpl implements MediaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.jamp.model.media.MediaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MediaPackageImpl() {
		super(eNS_URI, MediaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MediaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MediaPackage init() {
		if (isInited) return (MediaPackage)EPackage.Registry.INSTANCE.getEPackage(MediaPackage.eNS_URI);

		// Obtain or create and register package
		MediaPackageImpl theMediaPackage = (MediaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MediaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MediaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMediaPackage.createPackageContents();

		// Initialize created meta-data
		theMediaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMediaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MediaPackage.eNS_URI, theMediaPackage);
		return theMediaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediaApi() {
		return mediaApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaApi_URL() {
		return (EAttribute)mediaApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediaObject() {
		return mediaObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediaObject_API() {
		return (EReference)mediaObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaObject_Location() {
		return (EAttribute)mediaObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaObject_Title() {
		return (EAttribute)mediaObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaObject_Artist() {
		return (EAttribute)mediaObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaObject_Year() {
		return (EAttribute)mediaObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaObject_State() {
		return (EAttribute)mediaObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getState() {
		return stateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaFactory getMediaFactory() {
		return (MediaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mediaApiEClass = createEClass(MEDIA_API);
		createEAttribute(mediaApiEClass, MEDIA_API__URL);

		mediaObjectEClass = createEClass(MEDIA_OBJECT);
		createEReference(mediaObjectEClass, MEDIA_OBJECT__API);
		createEAttribute(mediaObjectEClass, MEDIA_OBJECT__LOCATION);
		createEAttribute(mediaObjectEClass, MEDIA_OBJECT__TITLE);
		createEAttribute(mediaObjectEClass, MEDIA_OBJECT__ARTIST);
		createEAttribute(mediaObjectEClass, MEDIA_OBJECT__YEAR);
		createEAttribute(mediaObjectEClass, MEDIA_OBJECT__STATE);

		// Create enums
		stateEEnum = createEEnum(STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mediaApiEClass, MediaApi.class, "MediaApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMediaApi_URL(), ecorePackage.getEString(), "uRL", null, 0, 1, MediaApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mediaApiEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mediaApiEClass, null, "play", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mediaApiEClass, null, "pause", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mediaApiEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mediaApiEClass, null, "dispose", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mediaObjectEClass, MediaObject.class, "MediaObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMediaObject_API(), this.getMediaApi(), null, "aPI", null, 0, 1, MediaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaObject_Location(), ecorePackage.getEString(), "location", null, 0, 1, MediaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaObject_Title(), ecorePackage.getEString(), "title", null, 0, 1, MediaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaObject_Artist(), ecorePackage.getEString(), "artist", null, 0, 1, MediaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaObject_Year(), ecorePackage.getEInt(), "year", null, 0, 1, MediaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaObject_State(), this.getState(), "state", null, 0, 1, MediaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mediaObjectEClass, null, "play", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mediaObjectEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mediaObjectEClass, null, "pause", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(stateEEnum, State.class, "State");
		addEEnumLiteral(stateEEnum, State.PLAYING);
		addEEnumLiteral(stateEEnum, State.PAUSED);
		addEEnumLiteral(stateEEnum, State.STOPPED);

		// Create resource
		createResource(eNS_URI);
	}

} //MediaPackageImpl
