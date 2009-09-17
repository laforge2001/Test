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
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jamp.model.MediaPlayer.Library#getMediaLibrary <em>Media Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>Media Library</b></em>' containment reference list.
	 * The list contents are of type {@link org.jamp.model.MediaPlayer.MediaObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media Library</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media Library</em>' containment reference list.
	 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getLibrary_MediaLibrary()
	 * @model containment="true"
	 * @generated
	 */
	EList<MediaObject> getMediaLibrary();

} // Library
