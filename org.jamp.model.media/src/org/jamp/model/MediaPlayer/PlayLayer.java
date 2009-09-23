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
 * A representation of the model object '<em><b>Play Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jamp.model.MediaPlayer.PlayLayer#getInstalledApi <em>Installed Api</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.PlayLayer#getMyLibrary <em>My Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getPlayLayer()
 * @model
 * @generated
 */
public interface PlayLayer extends EObject {
	/**
	 * Returns the value of the '<em><b>Installed Api</b></em>' reference list.
	 * The list contents are of type {@link org.jamp.model.MediaPlayer.MediaApi}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installed Api</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installed Api</em>' reference list.
	 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getPlayLayer_InstalledApi()
	 * @model
	 * @generated
	 */
	EList<MediaApi> getInstalledApi();

	/**
	 * Returns the value of the '<em><b>My Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Library</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Library</em>' reference.
	 * @see #setMyLibrary(Library)
	 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getPlayLayer_MyLibrary()
	 * @model
	 * @generated
	 */
	Library getMyLibrary();

	/**
	 * Sets the value of the '{@link org.jamp.model.MediaPlayer.PlayLayer#getMyLibrary <em>My Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Library</em>' reference.
	 * @see #getMyLibrary()
	 * @generated
	 */
	void setMyLibrary(Library value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerApi(MediaApi addMe);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unregisterApi(MediaApi unregisterMe);

} // PlayLayer
