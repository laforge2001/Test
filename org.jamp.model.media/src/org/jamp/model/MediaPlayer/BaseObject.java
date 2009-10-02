/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jamp.model.MediaPlayer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jamp.model.MediaPlayer.BaseObject#getId <em>Id</em>}</li>
 *   <li>{@link org.jamp.model.MediaPlayer.BaseObject#getPropertyChangeSupport <em>Property Change Support</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getBaseObject()
 * @model
 * @generated
 */
public interface BaseObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getBaseObject_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.jamp.model.MediaPlayer.BaseObject#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Change Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Change Support</em>' attribute.
	 * @see org.jamp.model.MediaPlayer.MediaPlayerPackage#getBaseObject_PropertyChangeSupport()
	 * @model dataType="org.jamp.model.MediaPlayer.PropertyChangeEvent" transient="true" changeable="false"
	 * @generated
	 */
	PropertyChangeEvent getPropertyChangeSupport();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listenerDataType="org.jamp.model.MediaPlayer.PropertyChangeListener"
	 * @generated
	 */
	void addPropertyChangeListener(PropertyChangeListener listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listenerDataType="org.jamp.model.MediaPlayer.PropertyChangeListener"
	 * @generated
	 */
	void removePropertyChangeListener(PropertyChangeListener listener);

} // BaseObject
