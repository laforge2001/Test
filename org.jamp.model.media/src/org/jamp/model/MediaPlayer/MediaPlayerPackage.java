/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jamp.model.MediaPlayer;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.jamp.model.MediaPlayer.MediaPlayerFactory
 * @model kind="package"
 * @generated
 */
public interface MediaPlayerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MediaPlayer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/jamp/model/player/media.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.jamp.model.player";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MediaPlayerPackage eINSTANCE = org.jamp.model.MediaPlayer.impl.MediaPlayerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.jamp.model.MediaPlayer.impl.PlaylistImpl <em>Playlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jamp.model.MediaPlayer.impl.PlaylistImpl
	 * @see org.jamp.model.MediaPlayer.impl.MediaPlayerPackageImpl#getPlaylist()
	 * @generated
	 */
	int PLAYLIST = 0;

	/**
	 * The feature id for the '<em><b>Media List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__MEDIA_LIST = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__NAME = 1;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__REPEAT = 2;

	/**
	 * The number of structural features of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.jamp.model.MediaPlayer.impl.MediaObjectImpl <em>Media Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jamp.model.MediaPlayer.impl.MediaObjectImpl
	 * @see org.jamp.model.MediaPlayer.impl.MediaPlayerPackageImpl#getMediaObject()
	 * @generated
	 */
	int MEDIA_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OBJECT__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OBJECT__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Artist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OBJECT__ARTIST = 2;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OBJECT__YEAR = 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OBJECT__STATE = 4;

	/**
	 * The number of structural features of the '<em>Media Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OBJECT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.jamp.model.MediaPlayer.MediaApi <em>Media Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jamp.model.MediaPlayer.MediaApi
	 * @see org.jamp.model.MediaPlayer.impl.MediaPlayerPackageImpl#getMediaApi()
	 * @generated
	 */
	int MEDIA_API = 2;

	/**
	 * The feature id for the '<em><b>Currently Playing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_API__CURRENTLY_PLAYING = 0;

	/**
	 * The feature id for the '<em><b>Currently Paused</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_API__CURRENTLY_PAUSED = 1;

	/**
	 * The number of structural features of the '<em>Media Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_API_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.jamp.model.MediaPlayer.impl.PlayLayerImpl <em>Play Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jamp.model.MediaPlayer.impl.PlayLayerImpl
	 * @see org.jamp.model.MediaPlayer.impl.MediaPlayerPackageImpl#getPlayLayer()
	 * @generated
	 */
	int PLAY_LAYER = 3;

	/**
	 * The feature id for the '<em><b>Installed Api</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LAYER__INSTALLED_API = 0;

	/**
	 * The feature id for the '<em><b>My Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LAYER__MY_LIBRARY = 1;

	/**
	 * The number of structural features of the '<em>Play Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LAYER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.jamp.model.MediaPlayer.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jamp.model.MediaPlayer.impl.LibraryImpl
	 * @see org.jamp.model.MediaPlayer.impl.MediaPlayerPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 4;

	/**
	 * The feature id for the '<em><b>Media Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__MEDIA_LIBRARY = 0;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.jamp.model.MediaPlayer.State <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jamp.model.MediaPlayer.State
	 * @see org.jamp.model.MediaPlayer.impl.MediaPlayerPackageImpl#getState()
	 * @generated
	 */
	int STATE = 5;


	/**
	 * Returns the meta object for class '{@link org.jamp.model.MediaPlayer.Playlist <em>Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Playlist</em>'.
	 * @see org.jamp.model.MediaPlayer.Playlist
	 * @generated
	 */
	EClass getPlaylist();

	/**
	 * Returns the meta object for the reference list '{@link org.jamp.model.MediaPlayer.Playlist#getMediaList <em>Media List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Media List</em>'.
	 * @see org.jamp.model.MediaPlayer.Playlist#getMediaList()
	 * @see #getPlaylist()
	 * @generated
	 */
	EReference getPlaylist_MediaList();

	/**
	 * Returns the meta object for the attribute '{@link org.jamp.model.MediaPlayer.Playlist#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jamp.model.MediaPlayer.Playlist#getName()
	 * @see #getPlaylist()
	 * @generated
	 */
	EAttribute getPlaylist_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.jamp.model.MediaPlayer.Playlist#isRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat</em>'.
	 * @see org.jamp.model.MediaPlayer.Playlist#isRepeat()
	 * @see #getPlaylist()
	 * @generated
	 */
	EAttribute getPlaylist_Repeat();

	/**
	 * Returns the meta object for class '{@link org.jamp.model.MediaPlayer.MediaObject <em>Media Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Object</em>'.
	 * @see org.jamp.model.MediaPlayer.MediaObject
	 * @generated
	 */
	EClass getMediaObject();

	/**
	 * Returns the meta object for the attribute '{@link org.jamp.model.MediaPlayer.MediaObject#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.jamp.model.MediaPlayer.MediaObject#getLocation()
	 * @see #getMediaObject()
	 * @generated
	 */
	EAttribute getMediaObject_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.jamp.model.MediaPlayer.MediaObject#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.jamp.model.MediaPlayer.MediaObject#getTitle()
	 * @see #getMediaObject()
	 * @generated
	 */
	EAttribute getMediaObject_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.jamp.model.MediaPlayer.MediaObject#getArtist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artist</em>'.
	 * @see org.jamp.model.MediaPlayer.MediaObject#getArtist()
	 * @see #getMediaObject()
	 * @generated
	 */
	EAttribute getMediaObject_Artist();

	/**
	 * Returns the meta object for the attribute '{@link org.jamp.model.MediaPlayer.MediaObject#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see org.jamp.model.MediaPlayer.MediaObject#getYear()
	 * @see #getMediaObject()
	 * @generated
	 */
	EAttribute getMediaObject_Year();

	/**
	 * Returns the meta object for the attribute '{@link org.jamp.model.MediaPlayer.MediaObject#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.jamp.model.MediaPlayer.MediaObject#getState()
	 * @see #getMediaObject()
	 * @generated
	 */
	EAttribute getMediaObject_State();

	/**
	 * Returns the meta object for class '{@link org.jamp.model.MediaPlayer.MediaApi <em>Media Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Api</em>'.
	 * @see org.jamp.model.MediaPlayer.MediaApi
	 * @generated
	 */
	EClass getMediaApi();

	/**
	 * Returns the meta object for the reference list '{@link org.jamp.model.MediaPlayer.MediaApi#getCurrentlyPlaying <em>Currently Playing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Currently Playing</em>'.
	 * @see org.jamp.model.MediaPlayer.MediaApi#getCurrentlyPlaying()
	 * @see #getMediaApi()
	 * @generated
	 */
	EReference getMediaApi_CurrentlyPlaying();

	/**
	 * Returns the meta object for the reference list '{@link org.jamp.model.MediaPlayer.MediaApi#getCurrentlyPaused <em>Currently Paused</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Currently Paused</em>'.
	 * @see org.jamp.model.MediaPlayer.MediaApi#getCurrentlyPaused()
	 * @see #getMediaApi()
	 * @generated
	 */
	EReference getMediaApi_CurrentlyPaused();

	/**
	 * Returns the meta object for class '{@link org.jamp.model.MediaPlayer.PlayLayer <em>Play Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Play Layer</em>'.
	 * @see org.jamp.model.MediaPlayer.PlayLayer
	 * @generated
	 */
	EClass getPlayLayer();

	/**
	 * Returns the meta object for the reference list '{@link org.jamp.model.MediaPlayer.PlayLayer#getInstalledApi <em>Installed Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Installed Api</em>'.
	 * @see org.jamp.model.MediaPlayer.PlayLayer#getInstalledApi()
	 * @see #getPlayLayer()
	 * @generated
	 */
	EReference getPlayLayer_InstalledApi();

	/**
	 * Returns the meta object for the reference '{@link org.jamp.model.MediaPlayer.PlayLayer#getMyLibrary <em>My Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>My Library</em>'.
	 * @see org.jamp.model.MediaPlayer.PlayLayer#getMyLibrary()
	 * @see #getPlayLayer()
	 * @generated
	 */
	EReference getPlayLayer_MyLibrary();

	/**
	 * Returns the meta object for class '{@link org.jamp.model.MediaPlayer.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.jamp.model.MediaPlayer.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jamp.model.MediaPlayer.Library#getMediaLibrary <em>Media Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Media Library</em>'.
	 * @see org.jamp.model.MediaPlayer.Library#getMediaLibrary()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_MediaLibrary();

	/**
	 * Returns the meta object for enum '{@link org.jamp.model.MediaPlayer.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see org.jamp.model.MediaPlayer.State
	 * @generated
	 */
	EEnum getState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MediaPlayerFactory getMediaPlayerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.jamp.model.MediaPlayer.impl.PlaylistImpl <em>Playlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jamp.model.MediaPlayer.impl.PlaylistImpl
		 * @see org.jamp.model.MediaPlayer.impl.MediaPlayerPackageImpl#getPlaylist()
		 * @generated
		 */
		EClass PLAYLIST = eINSTANCE.getPlaylist();

		/**
		 * The meta object literal for the '<em><b>Media List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYLIST__MEDIA_LIST = eINSTANCE.getPlaylist_MediaList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYLIST__NAME = eINSTANCE.getPlaylist_Name();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYLIST__REPEAT = eINSTANCE.getPlaylist_Repeat();

		/**
		 * The meta object literal for the '{@link org.jamp.model.MediaPlayer.impl.MediaObjectImpl <em>Media Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jamp.model.MediaPlayer.impl.MediaObjectImpl
		 * @see org.jamp.model.MediaPlayer.impl.MediaPlayerPackageImpl#getMediaObject()
		 * @generated
		 */
		EClass MEDIA_OBJECT = eINSTANCE.getMediaObject();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_OBJECT__LOCATION = eINSTANCE.getMediaObject_Location();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_OBJECT__TITLE = eINSTANCE.getMediaObject_Title();

		/**
		 * The meta object literal for the '<em><b>Artist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_OBJECT__ARTIST = eINSTANCE.getMediaObject_Artist();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_OBJECT__YEAR = eINSTANCE.getMediaObject_Year();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_OBJECT__STATE = eINSTANCE.getMediaObject_State();

		/**
		 * The meta object literal for the '{@link org.jamp.model.MediaPlayer.MediaApi <em>Media Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jamp.model.MediaPlayer.MediaApi
		 * @see org.jamp.model.MediaPlayer.impl.MediaPlayerPackageImpl#getMediaApi()
		 * @generated
		 */
		EClass MEDIA_API = eINSTANCE.getMediaApi();

		/**
		 * The meta object literal for the '<em><b>Currently Playing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_API__CURRENTLY_PLAYING = eINSTANCE.getMediaApi_CurrentlyPlaying();

		/**
		 * The meta object literal for the '<em><b>Currently Paused</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_API__CURRENTLY_PAUSED = eINSTANCE.getMediaApi_CurrentlyPaused();

		/**
		 * The meta object literal for the '{@link org.jamp.model.MediaPlayer.impl.PlayLayerImpl <em>Play Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jamp.model.MediaPlayer.impl.PlayLayerImpl
		 * @see org.jamp.model.MediaPlayer.impl.MediaPlayerPackageImpl#getPlayLayer()
		 * @generated
		 */
		EClass PLAY_LAYER = eINSTANCE.getPlayLayer();

		/**
		 * The meta object literal for the '<em><b>Installed Api</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAY_LAYER__INSTALLED_API = eINSTANCE.getPlayLayer_InstalledApi();

		/**
		 * The meta object literal for the '<em><b>My Library</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAY_LAYER__MY_LIBRARY = eINSTANCE.getPlayLayer_MyLibrary();

		/**
		 * The meta object literal for the '{@link org.jamp.model.MediaPlayer.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jamp.model.MediaPlayer.impl.LibraryImpl
		 * @see org.jamp.model.MediaPlayer.impl.MediaPlayerPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Media Library</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__MEDIA_LIBRARY = eINSTANCE.getLibrary_MediaLibrary();

		/**
		 * The meta object literal for the '{@link org.jamp.model.MediaPlayer.State <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jamp.model.MediaPlayer.State
		 * @see org.jamp.model.MediaPlayer.impl.MediaPlayerPackageImpl#getState()
		 * @generated
		 */
		EEnum STATE = eINSTANCE.getState();

	}

} //MediaPlayerPackage
