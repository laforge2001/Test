/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jamp.model.MediaPlayer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jamp.model.MediaPlayer.Playlist#getMediaList <em>Media List</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.Playlist#getName <em>Name</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.Playlist#isRepeat <em>Repeat</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getPlaylist()
 * @model
 * @generated
 */
public interface Playlist extends EObject {
	/**
	 * Returns the value of the '<em><b>Media List</b></em>' reference list.
	 * The list contents are of type {@link org.jamp.model.MediaPlayer.MediaObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media List</em>' reference list.
	 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getPlaylist_MediaList()
	 * @model
	 * @generated
	 */
	EList<MediaObject> getMediaList();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getPlaylist_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.jamp.model.MediaPlayer.Playlist#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat</em>' attribute.
	 * @see #setRepeat(boolean)
	 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getPlaylist_Repeat()
	 * @model
	 * @generated
	 */
	boolean isRepeat();

	/**
	 * Sets the value of the '{@link org.jamp.model.MediaPlayer.Playlist#isRepeat <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat</em>' attribute.
	 * @see #isRepeat()
	 * @generated
	 */
	void setRepeat(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void shuffle();

} // Playlist
