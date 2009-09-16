package org.jamp.model.media;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 * @author georde
 * 
 */
public interface MediaApi extends EObject {

	/**
	 * @model
	 */
	public void init();

	/**
	 * @model
	 */
	public String getURL();

	/**
	 * Sets the value of the '{@link org.jamp.model.media.MediaApi#getURL <em>URL</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>URL</em>' attribute.
	 * @see #getURL()
	 * @generated
	 */
	void setURL(String value);

	/**
	 * @model
	 */
	public void play();

	/**
	 * @model
	 */
	public void pause();

	/**
	 * @model
	 */
	public void stop();

	/**
	 * @model
	 */
	public void dispose();

}
