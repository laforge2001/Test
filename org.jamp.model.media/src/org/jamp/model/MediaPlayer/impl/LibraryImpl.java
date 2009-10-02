/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jamp.model.MediaPlayer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.jamp.model.MediaPlayer.Library;
import org.jamp.model.MediaPlayer.MediaObject;
import org.jamp.model.MediaPlayer.MediaPlayerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jamp.model.MediaPlayer.impl.LibraryImpl#getMediaLibrary <em>Media Library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibraryImpl extends BaseObjectImpl implements Library {
	/**
	 * The cached value of the '{@link #getMediaLibrary() <em>Media Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaObject> mediaLibrary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MediaPlayerPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MediaObject> getMediaLibrary() {
		if (mediaLibrary == null) {
			mediaLibrary = new EObjectContainmentEList<MediaObject>(MediaObject.class, this, MediaPlayerPackage.LIBRARY__MEDIA_LIBRARY);
		}
		return mediaLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MediaPlayerPackage.LIBRARY__MEDIA_LIBRARY:
				return ((InternalEList<?>)getMediaLibrary()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MediaPlayerPackage.LIBRARY__MEDIA_LIBRARY:
				return getMediaLibrary();
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
			case MediaPlayerPackage.LIBRARY__MEDIA_LIBRARY:
				getMediaLibrary().clear();
				getMediaLibrary().addAll((Collection<? extends MediaObject>)newValue);
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
			case MediaPlayerPackage.LIBRARY__MEDIA_LIBRARY:
				getMediaLibrary().clear();
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
			case MediaPlayerPackage.LIBRARY__MEDIA_LIBRARY:
				return mediaLibrary != null && !mediaLibrary.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LibraryImpl
