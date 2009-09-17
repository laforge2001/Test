/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jamp.model.MediaPlayer.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.jamp.model.MediaPlayer.MediaApi;
import org.jamp.model.MediaPlayer.MediaObject;
import org.jamp.model.MediaPlayer.MediaPlayerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jamp.model.MediaPlayer.impl.MediaApiImpl#getCurrentlyPlaying <em>Currently Playing</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.impl.MediaApiImpl#getCurrentlyPaused <em>Currently Paused</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MediaApiImpl extends EObjectImpl implements MediaApi {
	/**
	 * The cached value of the '{@link #getCurrentlyPlaying() <em>Currently Playing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentlyPlaying()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaObject> currentlyPlaying;

	/**
	 * The cached value of the '{@link #getCurrentlyPaused() <em>Currently Paused</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentlyPaused()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaObject> currentlyPaused;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MediaPlayerPackage.Literals.MEDIA_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MediaObject> getCurrentlyPlaying() {
		if (currentlyPlaying == null) {
			currentlyPlaying = new EObjectResolvingEList<MediaObject>(MediaObject.class, this, MediaPlayerPackage.MEDIA_API__CURRENTLY_PLAYING);
		}
		return currentlyPlaying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MediaObject> getCurrentlyPaused() {
		if (currentlyPaused == null) {
			currentlyPaused = new EObjectResolvingEList<MediaObject>(MediaObject.class, this, MediaPlayerPackage.MEDIA_API__CURRENTLY_PAUSED);
		}
		return currentlyPaused;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void play(MediaObject playMe) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pause(MediaObject pauseMe) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop(MediaObject stopMe) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canPlay(MediaObject media) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MediaPlayerPackage.MEDIA_API__CURRENTLY_PLAYING:
				return getCurrentlyPlaying();
			case MediaPlayerPackage.MEDIA_API__CURRENTLY_PAUSED:
				return getCurrentlyPaused();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MediaPlayerPackage.MEDIA_API__CURRENTLY_PLAYING:
				getCurrentlyPlaying().clear();
				getCurrentlyPlaying().addAll((Collection<? extends MediaObject>)newValue);
				return;
			case MediaPlayerPackage.MEDIA_API__CURRENTLY_PAUSED:
				getCurrentlyPaused().clear();
				getCurrentlyPaused().addAll((Collection<? extends MediaObject>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MediaPlayerPackage.MEDIA_API__CURRENTLY_PLAYING:
				getCurrentlyPlaying().clear();
				return;
			case MediaPlayerPackage.MEDIA_API__CURRENTLY_PAUSED:
				getCurrentlyPaused().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MediaPlayerPackage.MEDIA_API__CURRENTLY_PLAYING:
				return currentlyPlaying != null && !currentlyPlaying.isEmpty();
			case MediaPlayerPackage.MEDIA_API__CURRENTLY_PAUSED:
				return currentlyPaused != null && !currentlyPaused.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MediaApiImpl
