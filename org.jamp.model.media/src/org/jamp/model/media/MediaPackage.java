/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jamp.model.media;

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
 * @see org.jamp.model.media.MediaFactory
 * @model kind="package"
 * @generated
 */
public interface MediaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "media";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/jamp/model/media.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.jamp.model.media";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MediaPackage eINSTANCE = org.jamp.model.media.impl.MediaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.jamp.model.media.impl.MediaApiImpl <em>Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jamp.model.media.impl.MediaApiImpl
	 * @see org.jamp.model.media.impl.MediaPackageImpl#getMediaApi()
	 * @generated
	 */
	int MEDIA_API = 0;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_API__URL = 0;

	/**
	 * The number of structural features of the '<em>Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_API_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.jamp.model.media.impl.MediaObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jamp.model.media.impl.MediaObjectImpl
	 * @see org.jamp.model.media.impl.MediaPackageImpl#getMediaObject()
	 * @generated
	 */
	int MEDIA_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>API</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OBJECT__API = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OBJECT__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OBJECT__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Artist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OBJECT__ARTIST = 3;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OBJECT__YEAR = 4;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OBJECT__STATE = 5;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OBJECT_FEATURE_COUNT = 6;


	/**
	 * The meta object id for the '{@link org.jamp.model.media.State <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jamp.model.media.State
	 * @see org.jamp.model.media.impl.MediaPackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;


	/**
	 * Returns the meta object for class '{@link org.jamp.model.media.MediaApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Api</em>'.
	 * @see org.jamp.model.media.MediaApi
	 * @generated
	 */
	EClass getMediaApi();

	/**
	 * Returns the meta object for the attribute '{@link org.jamp.model.media.MediaApi#getURL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URL</em>'.
	 * @see org.jamp.model.media.MediaApi#getURL()
	 * @see #getMediaApi()
	 * @generated
	 */
	EAttribute getMediaApi_URL();

	/**
	 * Returns the meta object for class '{@link org.jamp.model.media.MediaObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see org.jamp.model.media.MediaObject
	 * @generated
	 */
	EClass getMediaObject();

	/**
	 * Returns the meta object for the reference '{@link org.jamp.model.media.MediaObject#getAPI <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>API</em>'.
	 * @see org.jamp.model.media.MediaObject#getAPI()
	 * @see #getMediaObject()
	 * @generated
	 */
	EReference getMediaObject_API();

	/**
	 * Returns the meta object for the attribute '{@link org.jamp.model.media.MediaObject#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.jamp.model.media.MediaObject#getLocation()
	 * @see #getMediaObject()
	 * @generated
	 */
	EAttribute getMediaObject_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.jamp.model.media.MediaObject#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.jamp.model.media.MediaObject#getTitle()
	 * @see #getMediaObject()
	 * @generated
	 */
	EAttribute getMediaObject_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.jamp.model.media.MediaObject#getArtist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artist</em>'.
	 * @see org.jamp.model.media.MediaObject#getArtist()
	 * @see #getMediaObject()
	 * @generated
	 */
	EAttribute getMediaObject_Artist();

	/**
	 * Returns the meta object for the attribute '{@link org.jamp.model.media.MediaObject#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see org.jamp.model.media.MediaObject#getYear()
	 * @see #getMediaObject()
	 * @generated
	 */
	EAttribute getMediaObject_Year();

	/**
	 * Returns the meta object for the attribute '{@link org.jamp.model.media.MediaObject#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.jamp.model.media.MediaObject#getState()
	 * @see #getMediaObject()
	 * @generated
	 */
	EAttribute getMediaObject_State();

	/**
	 * Returns the meta object for enum '{@link org.jamp.model.media.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see org.jamp.model.media.State
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
	MediaFactory getMediaFactory();

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
		 * The meta object literal for the '{@link org.jamp.model.media.impl.MediaApiImpl <em>Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jamp.model.media.impl.MediaApiImpl
		 * @see org.jamp.model.media.impl.MediaPackageImpl#getMediaApi()
		 * @generated
		 */
		EClass MEDIA_API = eINSTANCE.getMediaApi();

		/**
		 * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_API__URL = eINSTANCE.getMediaApi_URL();

		/**
		 * The meta object literal for the '{@link org.jamp.model.media.impl.MediaObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jamp.model.media.impl.MediaObjectImpl
		 * @see org.jamp.model.media.impl.MediaPackageImpl#getMediaObject()
		 * @generated
		 */
		EClass MEDIA_OBJECT = eINSTANCE.getMediaObject();

		/**
		 * The meta object literal for the '<em><b>API</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_OBJECT__API = eINSTANCE.getMediaObject_API();

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
		 * The meta object literal for the '{@link org.jamp.model.media.State <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jamp.model.media.State
		 * @see org.jamp.model.media.impl.MediaPackageImpl#getState()
		 * @generated
		 */
		EEnum STATE = eINSTANCE.getState();

	}

} //MediaPackage
