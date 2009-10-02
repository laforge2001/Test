/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jamp.model.MediaPlayer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jamp.model.MediaPlayer.MediaObject#getLocation <em>Location</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.MediaObject#getTitle <em>Title</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.MediaObject#getArtist <em>Artist</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.MediaObject#getYear <em>Year</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.MediaObject#getState <em>State</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.MediaObject#getAlbum <em>Album</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getMediaObject()
 * @model
 * @generated
 */
public interface MediaObject extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getMediaObject_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.jamp.model.MediaPlayer.MediaObject#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getMediaObject_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.jamp.model.MediaPlayer.MediaObject#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Artist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artist</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artist</em>' attribute.
	 * @see #setArtist(String)
	 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getMediaObject_Artist()
	 * @model
	 * @generated
	 */
	String getArtist();

	/**
	 * Sets the value of the '{@link org.jamp.model.MediaPlayer.MediaObject#getArtist <em>Artist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artist</em>' attribute.
	 * @see #getArtist()
	 * @generated
	 */
	void setArtist(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getMediaObject_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link org.jamp.model.MediaPlayer.MediaObject#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.jamp.model.MediaPlayer.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.jamp.model.MediaPlayer.State
	 * @see #setState(State)
	 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getMediaObject_State()
	 * @model
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org.jamp.model.MediaPlayer.MediaObject#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.jamp.model.MediaPlayer.State
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Album</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Album</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Album</em>' attribute.
	 * @see #setAlbum(String)
	 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getMediaObject_Album()
	 * @model
	 * @generated
	 */
	String getAlbum();

	/**
	 * Sets the value of the '{@link org.jamp.model.MediaPlayer.MediaObject#getAlbum <em>Album</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Album</em>' attribute.
	 * @see #getAlbum()
	 * @generated
	 */
	void setAlbum(String value);

} // MediaObject
