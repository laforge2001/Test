/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jamp.model.MediaPlayer.impl;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.jamp.model.MediaPlayer.BaseObject;
import org.jamp.model.MediaPlayer.Library;
import org.jamp.model.MediaPlayer.MediaApi;
import org.jamp.model.MediaPlayer.MediaObject;
import org.jamp.model.MediaPlayer.MediaPlayerFactory;
import org.jamp.model.MediaPlayer.MediaPlayerPackage;
import org.jamp.model.MediaPlayer.PlayLayer;
import org.jamp.model.MediaPlayer.Playlist;
import org.jamp.model.MediaPlayer.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MediaPlayerPackageImpl extends EPackageImpl implements MediaPlayerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playlistEClass = null;

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
	private EClass mediaApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyChangeSupportEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyChangeListenerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyChangeEventEDataType = null;

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
	 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MediaPlayerPackageImpl() {
		super(eNS_URI, MediaPlayerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MediaPlayerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MediaPlayerPackage init() {
		if (isInited) return (MediaPlayerPackage)EPackage.Registry.INSTANCE.getEPackage(MediaPlayerPackage.eNS_URI);

		// Obtain or create and register package
		MediaPlayerPackageImpl theMediaPlayerPackage = (MediaPlayerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MediaPlayerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MediaPlayerPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMediaPlayerPackage.createPackageContents();

		// Initialize created meta-data
		theMediaPlayerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMediaPlayerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MediaPlayerPackage.eNS_URI, theMediaPlayerPackage);
		return theMediaPlayerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaylist() {
		return playlistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaylist_MediaList() {
		return (EReference)playlistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaylist_Name() {
		return (EAttribute)playlistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaylist_Repeat() {
		return (EAttribute)playlistEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getMediaObject_Location() {
		return (EAttribute)mediaObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaObject_Title() {
		return (EAttribute)mediaObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaObject_Artist() {
		return (EAttribute)mediaObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaObject_Year() {
		return (EAttribute)mediaObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaObject_State() {
		return (EAttribute)mediaObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaObject_Album() {
		return (EAttribute)mediaObjectEClass.getEStructuralFeatures().get(5);
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
	public EReference getMediaApi_CurrentlyPlaying() {
		return (EReference)mediaApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediaApi_CurrentlyPaused() {
		return (EReference)mediaApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayLayer() {
		return playLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayLayer_InstalledApi() {
		return (EReference)playLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayLayer_MyLibrary() {
		return (EReference)playLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_MediaLibrary() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseObject() {
		return baseObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseObject_Id() {
		return (EAttribute)baseObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseObject_PropertyChangeSupport() {
		return (EAttribute)baseObjectEClass.getEStructuralFeatures().get(1);
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
	public EDataType getPropertyChangeSupport() {
		return propertyChangeSupportEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyChangeListener() {
		return propertyChangeListenerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyChangeEvent() {
		return propertyChangeEventEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaPlayerFactory getMediaPlayerFactory() {
		return (MediaPlayerFactory)getEFactoryInstance();
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
		playlistEClass = createEClass(PLAYLIST);
		createEReference(playlistEClass, PLAYLIST__MEDIA_LIST);
		createEAttribute(playlistEClass, PLAYLIST__NAME);
		createEAttribute(playlistEClass, PLAYLIST__REPEAT);

		mediaObjectEClass = createEClass(MEDIA_OBJECT);
		createEAttribute(mediaObjectEClass, MEDIA_OBJECT__LOCATION);
		createEAttribute(mediaObjectEClass, MEDIA_OBJECT__TITLE);
		createEAttribute(mediaObjectEClass, MEDIA_OBJECT__ARTIST);
		createEAttribute(mediaObjectEClass, MEDIA_OBJECT__YEAR);
		createEAttribute(mediaObjectEClass, MEDIA_OBJECT__STATE);
		createEAttribute(mediaObjectEClass, MEDIA_OBJECT__ALBUM);

		mediaApiEClass = createEClass(MEDIA_API);
		createEReference(mediaApiEClass, MEDIA_API__CURRENTLY_PLAYING);
		createEReference(mediaApiEClass, MEDIA_API__CURRENTLY_PAUSED);

		playLayerEClass = createEClass(PLAY_LAYER);
		createEReference(playLayerEClass, PLAY_LAYER__INSTALLED_API);
		createEReference(playLayerEClass, PLAY_LAYER__MY_LIBRARY);

		libraryEClass = createEClass(LIBRARY);
		createEReference(libraryEClass, LIBRARY__MEDIA_LIBRARY);

		baseObjectEClass = createEClass(BASE_OBJECT);
		createEAttribute(baseObjectEClass, BASE_OBJECT__ID);
		createEAttribute(baseObjectEClass, BASE_OBJECT__PROPERTY_CHANGE_SUPPORT);

		// Create enums
		stateEEnum = createEEnum(STATE);

		// Create data types
		propertyChangeSupportEDataType = createEDataType(PROPERTY_CHANGE_SUPPORT);
		propertyChangeListenerEDataType = createEDataType(PROPERTY_CHANGE_LISTENER);
		propertyChangeEventEDataType = createEDataType(PROPERTY_CHANGE_EVENT);
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
		playlistEClass.getESuperTypes().add(this.getBaseObject());
		mediaObjectEClass.getESuperTypes().add(this.getBaseObject());
		libraryEClass.getESuperTypes().add(this.getBaseObject());

		// Initialize classes and features; add operations and parameters
		initEClass(playlistEClass, Playlist.class, "Playlist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaylist_MediaList(), this.getMediaObject(), null, "mediaList", null, 0, -1, Playlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaylist_Name(), ecorePackage.getEString(), "name", null, 0, 1, Playlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaylist_Repeat(), ecorePackage.getEBoolean(), "repeat", null, 0, 1, Playlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(playlistEClass, null, "shuffle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mediaObjectEClass, MediaObject.class, "MediaObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMediaObject_Location(), ecorePackage.getEString(), "location", null, 0, 1, MediaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaObject_Title(), ecorePackage.getEString(), "title", null, 0, 1, MediaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaObject_Artist(), ecorePackage.getEString(), "artist", null, 0, 1, MediaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaObject_Year(), ecorePackage.getEInt(), "year", null, 0, 1, MediaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaObject_State(), this.getState(), "state", null, 0, 1, MediaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaObject_Album(), ecorePackage.getEString(), "album", null, 0, 1, MediaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaApiEClass, MediaApi.class, "MediaApi", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMediaApi_CurrentlyPlaying(), this.getMediaObject(), null, "currentlyPlaying", null, 0, -1, MediaApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediaApi_CurrentlyPaused(), this.getMediaObject(), null, "currentlyPaused", null, 0, -1, MediaApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mediaApiEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(mediaApiEClass, null, "play", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMediaObject(), "playMe", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mediaApiEClass, null, "pause", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMediaObject(), "pauseMe", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mediaApiEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMediaObject(), "stopMe", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mediaApiEClass, null, "dispose", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mediaApiEClass, ecorePackage.getEBoolean(), "canPlay", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMediaObject(), "media", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mediaApiEClass, null, "updateMediaObjectInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMediaObject(), "updateMe", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(playLayerEClass, PlayLayer.class, "PlayLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayLayer_InstalledApi(), this.getMediaApi(), null, "installedApi", null, 0, -1, PlayLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayLayer_MyLibrary(), this.getLibrary(), null, "myLibrary", null, 0, 1, PlayLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(playLayerEClass, null, "registerApi", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMediaApi(), "addMe", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(playLayerEClass, null, "unregisterApi", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMediaApi(), "unregisterMe", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibrary_MediaLibrary(), this.getMediaObject(), null, "mediaLibrary", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseObjectEClass, BaseObject.class, "BaseObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseObject_Id(), ecorePackage.getEInt(), "id", null, 0, 1, BaseObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseObject_PropertyChangeSupport(), this.getPropertyChangeEvent(), "propertyChangeSupport", null, 0, 1, BaseObject.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(baseObjectEClass, null, "addPropertyChangeListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPropertyChangeListener(), "listener", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(baseObjectEClass, null, "removePropertyChangeListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPropertyChangeListener(), "listener", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(stateEEnum, State.class, "State");
		addEEnumLiteral(stateEEnum, State.PLAYING);
		addEEnumLiteral(stateEEnum, State.PAUSED);
		addEEnumLiteral(stateEEnum, State.STOPPED);

		// Initialize data types
		initEDataType(propertyChangeSupportEDataType, PropertyChangeSupport.class, "PropertyChangeSupport", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyChangeListenerEDataType, PropertyChangeListener.class, "PropertyChangeListener", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyChangeEventEDataType, PropertyChangeEvent.class, "PropertyChangeEvent", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MediaPlayerPackageImpl
