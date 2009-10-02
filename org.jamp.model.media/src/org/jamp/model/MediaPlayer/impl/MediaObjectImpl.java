/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jamp.model.MediaPlayer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.jamp.model.MediaPlayer.MediaObject;
import org.jamp.model.MediaPlayer.MediaPlayerPackage;
import org.jamp.model.MediaPlayer.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jamp.model.MediaPlayer.impl.MediaObjectImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.impl.MediaObjectImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.impl.MediaObjectImpl#getArtist <em>Artist</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.impl.MediaObjectImpl#getYear <em>Year</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.impl.MediaObjectImpl#getState <em>State</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.impl.MediaObjectImpl#getAlbum <em>Album</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MediaObjectImpl extends BaseObjectImpl implements MediaObject {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtist() <em>Artist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtist()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtist() <em>Artist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtist()
	 * @generated
	 * @ordered
	 */
	protected String artist = ARTIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final State STATE_EDEFAULT = State.PLAYING;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlbum() <em>Album</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlbum()
	 * @generated
	 * @ordered
	 */
	protected static final String ALBUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlbum() <em>Album</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlbum()
	 * @generated
	 * @ordered
	 */
	protected String album = ALBUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MediaPlayerPackage.Literals.MEDIA_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediaPlayerPackage.MEDIA_OBJECT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediaPlayerPackage.MEDIA_OBJECT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtist(String newArtist) {
		String oldArtist = artist;
		artist = newArtist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediaPlayerPackage.MEDIA_OBJECT__ARTIST, oldArtist, artist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediaPlayerPackage.MEDIA_OBJECT__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		State oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediaPlayerPackage.MEDIA_OBJECT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlbum() {
		return album;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlbum(String newAlbum) {
		String oldAlbum = album;
		album = newAlbum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediaPlayerPackage.MEDIA_OBJECT__ALBUM, oldAlbum, album));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MediaPlayerPackage.MEDIA_OBJECT__LOCATION:
				return getLocation();
			case MediaPlayerPackage.MEDIA_OBJECT__TITLE:
				return getTitle();
			case MediaPlayerPackage.MEDIA_OBJECT__ARTIST:
				return getArtist();
			case MediaPlayerPackage.MEDIA_OBJECT__YEAR:
				return getYear();
			case MediaPlayerPackage.MEDIA_OBJECT__STATE:
				return getState();
			case MediaPlayerPackage.MEDIA_OBJECT__ALBUM:
				return getAlbum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MediaPlayerPackage.MEDIA_OBJECT__LOCATION:
				setLocation((String)newValue);
				return;
			case MediaPlayerPackage.MEDIA_OBJECT__TITLE:
				setTitle((String)newValue);
				return;
			case MediaPlayerPackage.MEDIA_OBJECT__ARTIST:
				setArtist((String)newValue);
				return;
			case MediaPlayerPackage.MEDIA_OBJECT__YEAR:
				setYear((Integer)newValue);
				return;
			case MediaPlayerPackage.MEDIA_OBJECT__STATE:
				setState((State)newValue);
				return;
			case MediaPlayerPackage.MEDIA_OBJECT__ALBUM:
				setAlbum((String)newValue);
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
			case MediaPlayerPackage.MEDIA_OBJECT__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case MediaPlayerPackage.MEDIA_OBJECT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case MediaPlayerPackage.MEDIA_OBJECT__ARTIST:
				setArtist(ARTIST_EDEFAULT);
				return;
			case MediaPlayerPackage.MEDIA_OBJECT__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case MediaPlayerPackage.MEDIA_OBJECT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case MediaPlayerPackage.MEDIA_OBJECT__ALBUM:
				setAlbum(ALBUM_EDEFAULT);
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
			case MediaPlayerPackage.MEDIA_OBJECT__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case MediaPlayerPackage.MEDIA_OBJECT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case MediaPlayerPackage.MEDIA_OBJECT__ARTIST:
				return ARTIST_EDEFAULT == null ? artist != null : !ARTIST_EDEFAULT.equals(artist);
			case MediaPlayerPackage.MEDIA_OBJECT__YEAR:
				return year != YEAR_EDEFAULT;
			case MediaPlayerPackage.MEDIA_OBJECT__STATE:
				return state != STATE_EDEFAULT;
			case MediaPlayerPackage.MEDIA_OBJECT__ALBUM:
				return ALBUM_EDEFAULT == null ? album != null : !ALBUM_EDEFAULT.equals(album);
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
		result.append(" (location: ");
		result.append(location);
		result.append(", title: ");
		result.append(title);
		result.append(", artist: ");
		result.append(artist);
		result.append(", year: ");
		result.append(year);
		result.append(", state: ");
		result.append(state);
		result.append(", album: ");
		result.append(album);
		result.append(')');
		return result.toString();
	}

} //MediaObjectImpl
