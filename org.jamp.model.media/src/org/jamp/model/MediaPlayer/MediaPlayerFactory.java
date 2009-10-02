/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jamp.model.MediaPlayer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage
 * @generated
 */
public interface MediaPlayerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MediaPlayerFactory eINSTANCE = org.jamp.model.MediaPlayer.impl.MediaPlayerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Playlist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Playlist</em>'.
	 * @generated
	 */
	Playlist createPlaylist();

	/**
	 * Returns a new object of class '<em>Media Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Media Object</em>'.
	 * @generated
	 */
	MediaObject createMediaObject();

	/**
	 * Returns a new object of class '<em>Play Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Play Layer</em>'.
	 * @generated
	 */
	PlayLayer createPlayLayer();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MediaPlayerPackage getMediaPlayerPackage();

} //MediaPlayerFactory
