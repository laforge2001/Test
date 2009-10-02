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
 * A representation of the model object '<em><b>Media Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jamp.model.MediaPlayer.MediaApi#getCurrentlyPlaying <em>Currently Playing</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.MediaApi#getCurrentlyPaused <em>Currently Paused</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getMediaApi()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MediaApi extends EObject {
	/**
	 * Returns the value of the '<em><b>Currently Playing</b></em>' reference list.
	 * The list contents are of type {@link org.jamp.model.MediaPlayer.MediaObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currently Playing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currently Playing</em>' reference list.
	 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getMediaApi_CurrentlyPlaying()
	 * @model
	 * @generated
	 */
	EList<MediaObject> getCurrentlyPlaying();

	/**
	 * Returns the value of the '<em><b>Currently Paused</b></em>' reference list.
	 * The list contents are of type {@link org.jamp.model.MediaPlayer.MediaObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currently Paused</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currently Paused</em>' reference list.
	 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getMediaApi_CurrentlyPaused()
	 * @model
	 * @generated
	 */
	EList<MediaObject> getCurrentlyPaused();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void play(MediaObject playMe);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void pause(MediaObject pauseMe);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stop(MediaObject stopMe);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void dispose();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean canPlay(MediaObject media);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateMediaObjectInfo(MediaObject updateMe);

} // MediaApi
