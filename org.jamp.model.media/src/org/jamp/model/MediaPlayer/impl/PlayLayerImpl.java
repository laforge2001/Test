/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jamp.model.MediaPlayer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.jamp.model.MediaPlayer.Library;
import org.jamp.model.MediaPlayer.MediaApi;
import org.jamp.model.MediaPlayer.MediaPlayerPackage;
import org.jamp.model.MediaPlayer.PlayLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Play Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jamp.model.MediaPlayer.impl.PlayLayerImpl#getInstalledApi <em>Installed Api</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.impl.PlayLayerImpl#getMyLibrary <em>My Library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlayLayerImpl extends EObjectImpl implements PlayLayer {
	/**
	 * The cached value of the '{@link #getInstalledApi() <em>Installed Api</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalledApi()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaApi> installedApi;

	/**
	 * The cached value of the '{@link #getMyLibrary() <em>My Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyLibrary()
	 * @generated
	 * @ordered
	 */
	protected Library myLibrary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MediaPlayerPackage.Literals.PLAY_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MediaApi> getInstalledApi() {
		if (installedApi == null) {
			installedApi = new EObjectResolvingEList<MediaApi>(MediaApi.class, this, MediaPlayerPackage.PLAY_LAYER__INSTALLED_API);
		}
		return installedApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library getMyLibrary() {
		if (myLibrary != null && myLibrary.eIsProxy()) {
			InternalEObject oldMyLibrary = (InternalEObject)myLibrary;
			myLibrary = (Library)eResolveProxy(oldMyLibrary);
			if (myLibrary != oldMyLibrary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MediaPlayerPackage.PLAY_LAYER__MY_LIBRARY, oldMyLibrary, myLibrary));
			}
		}
		return myLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library basicGetMyLibrary() {
		return myLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyLibrary(Library newMyLibrary) {
		Library oldMyLibrary = myLibrary;
		myLibrary = newMyLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediaPlayerPackage.PLAY_LAYER__MY_LIBRARY, oldMyLibrary, myLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void locateApis() {
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
			case MediaPlayerPackage.PLAY_LAYER__INSTALLED_API:
				return getInstalledApi();
			case MediaPlayerPackage.PLAY_LAYER__MY_LIBRARY:
				if (resolve) return getMyLibrary();
				return basicGetMyLibrary();
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
			case MediaPlayerPackage.PLAY_LAYER__INSTALLED_API:
				getInstalledApi().clear();
				getInstalledApi().addAll((Collection<? extends MediaApi>)newValue);
				return;
			case MediaPlayerPackage.PLAY_LAYER__MY_LIBRARY:
				setMyLibrary((Library)newValue);
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
			case MediaPlayerPackage.PLAY_LAYER__INSTALLED_API:
				getInstalledApi().clear();
				return;
			case MediaPlayerPackage.PLAY_LAYER__MY_LIBRARY:
				setMyLibrary((Library)null);
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
			case MediaPlayerPackage.PLAY_LAYER__INSTALLED_API:
				return installedApi != null && !installedApi.isEmpty();
			case MediaPlayerPackage.PLAY_LAYER__MY_LIBRARY:
				return myLibrary != null;
		}
		return super.eIsSet(featureID);
	}

} //PlayLayerImpl
