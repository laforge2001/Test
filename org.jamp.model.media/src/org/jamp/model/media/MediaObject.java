package org.jamp.model.media;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 * @author georde
 * 
 */
public interface MediaObject extends EObject {

	/**
	 * @model
	 * @return
	 */
	public MediaApi getAPI();

	/**
	 * Sets the value of the '{@link org.jamp.model.media.MediaObject#getAPI <em>API</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>API</em>' reference.
	 * @see #getAPI()
	 * @generated
	 */
	void setAPI(MediaApi value);

	/**
	 * @model
	 * @return
	 */
	public abstract String getLocation();

	/**
	 * Sets the value of the '{@link org.jamp.model.media.MediaObject#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * @model
	 * @return
	 */

	public abstract String getTitle();

	/**
	 * Sets the value of the '{@link org.jamp.model.media.MediaObject#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * @model
	 * @return
	 */
	public abstract String getArtist();

	/**
	 * Sets the value of the '{@link org.jamp.model.media.MediaObject#getArtist
	 * <em>Artist</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Artist</em>' attribute.
	 * @see #getArtist()
	 * @generated
	 */
	void setArtist(String value);

	/**
	 * @model
	 * @return
	 */
	public abstract int getYear();

	/**
	 * Sets the value of the '{@link org.jamp.model.media.MediaObject#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute. The literals
	 * are from the enumeration {@link org.jamp.model.media.State}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.jamp.model.media.State
	 * @see #setState(State)
	 * @see org.jamp.model.media.MediaPackage#getMediaObject_State()
	 * @model
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org.jamp.model.media.MediaObject#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.jamp.model.media.State
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * @model
	 * @return
	 */
	public abstract void play();

	/**
	 * @model
	 * @return
	 */
	public abstract void stop();

	/**
	 * @model
	 * @return
	 */
	public abstract void pause();

}
