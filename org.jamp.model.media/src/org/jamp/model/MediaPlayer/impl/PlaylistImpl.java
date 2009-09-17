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

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.jamp.model.MediaPlayer.MediaObject;
import org.jamp.model.MediaPlayer.MediaPlayerPackage;
import org.jamp.model.MediaPlayer.Playlist;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jamp.model.MediaPlayer.impl.PlaylistImpl#getMediaList <em>Media List</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.impl.PlaylistImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.impl.PlaylistImpl#isRepeat <em>Repeat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaylistImpl extends EObjectImpl implements Playlist {
	/**
	 * The cached value of the '{@link #getMediaList() <em>Media List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaList()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaObject> mediaList;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isRepeat() <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepeat()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPEAT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRepeat() <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepeat()
	 * @generated
	 * @ordered
	 */
	protected boolean repeat = REPEAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaylistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MediaPlayerPackage.Literals.PLAYLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MediaObject> getMediaList() {
		if (mediaList == null) {
			mediaList = new EObjectResolvingEList<MediaObject>(MediaObject.class, this, MediaPlayerPackage.PLAYLIST__MEDIA_LIST);
		}
		return mediaList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediaPlayerPackage.PLAYLIST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRepeat() {
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeat(boolean newRepeat) {
		boolean oldRepeat = repeat;
		repeat = newRepeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediaPlayerPackage.PLAYLIST__REPEAT, oldRepeat, repeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void shuffle() {
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
			case MediaPlayerPackage.PLAYLIST__MEDIA_LIST:
				return getMediaList();
			case MediaPlayerPackage.PLAYLIST__NAME:
				return getName();
			case MediaPlayerPackage.PLAYLIST__REPEAT:
				return isRepeat();
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
			case MediaPlayerPackage.PLAYLIST__MEDIA_LIST:
				getMediaList().clear();
				getMediaList().addAll((Collection<? extends MediaObject>)newValue);
				return;
			case MediaPlayerPackage.PLAYLIST__NAME:
				setName((String)newValue);
				return;
			case MediaPlayerPackage.PLAYLIST__REPEAT:
				setRepeat((Boolean)newValue);
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
			case MediaPlayerPackage.PLAYLIST__MEDIA_LIST:
				getMediaList().clear();
				return;
			case MediaPlayerPackage.PLAYLIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MediaPlayerPackage.PLAYLIST__REPEAT:
				setRepeat(REPEAT_EDEFAULT);
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
			case MediaPlayerPackage.PLAYLIST__MEDIA_LIST:
				return mediaList != null && !mediaList.isEmpty();
			case MediaPlayerPackage.PLAYLIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MediaPlayerPackage.PLAYLIST__REPEAT:
				return repeat != REPEAT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", repeat: ");
		result.append(repeat);
		result.append(')');
		return result.toString();
	}

} //PlaylistImpl
