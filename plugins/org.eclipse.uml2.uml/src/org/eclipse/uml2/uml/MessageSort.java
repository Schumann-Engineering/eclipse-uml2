/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: MessageSort.java,v 1.1 2005/11/14 22:26:00 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Message Sort</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * MessageSort is an enumeration of the following values:
 * ? synchCall - the message was generated by a synchronous call to an operation
 * ? asynchCall - the message was generated by an asynchronous call to an operation; i.e., a CallAction with ?isSynchronous= false?
 * ? asynchSignal -the message was generated by an asynchronous send action
 * 
 * <!-- end-model-doc -->
 * @see org.eclipse.uml2.uml.UMLPackage#getMessageSort()
 * @model
 * @generated
 */
public final class MessageSort
		extends AbstractEnumerator {

	/**
	 * The '<em><b>Synch Call</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message was generated by a synchronous call to an operation
	 * <!-- end-model-doc -->
	 * @see #SYNCH_CALL_LITERAL
	 * @model name="synchCall"
	 * @generated
	 * @ordered
	 */
	public static final int SYNCH_CALL = 0;

	/**
	 * The '<em><b>Asynch Call</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message was generated by an asynchronous call to an operation; i.e., a CallAction with ?isSynchronous
	 * = false?
	 * 
	 * <!-- end-model-doc -->
	 * @see #ASYNCH_CALL_LITERAL
	 * @model name="asynchCall"
	 * @generated
	 * @ordered
	 */
	public static final int ASYNCH_CALL = 1;

	/**
	 * The '<em><b>Asynch Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message was generated by an asynchronous send action
	 * <!-- end-model-doc -->
	 * @see #ASYNCH_SIGNAL_LITERAL
	 * @model name="asynchSignal"
	 * @generated
	 * @ordered
	 */
	public static final int ASYNCH_SIGNAL = 2;

	/**
	 * The '<em><b>Synch Call</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNCH_CALL
	 * @generated
	 * @ordered
	 */
	public static final MessageSort SYNCH_CALL_LITERAL = new MessageSort(
		SYNCH_CALL, "synchCall", "synchCall"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Asynch Call</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYNCH_CALL
	 * @generated
	 * @ordered
	 */
	public static final MessageSort ASYNCH_CALL_LITERAL = new MessageSort(
		ASYNCH_CALL, "asynchCall", "asynchCall"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Asynch Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYNCH_SIGNAL
	 * @generated
	 * @ordered
	 */
	public static final MessageSort ASYNCH_SIGNAL_LITERAL = new MessageSort(
		ASYNCH_SIGNAL, "asynchSignal", "asynchSignal"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * An array of all the '<em><b>Message Sort</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageSort[] VALUES_ARRAY = new MessageSort[]{
		SYNCH_CALL_LITERAL, ASYNCH_CALL_LITERAL, ASYNCH_SIGNAL_LITERAL,};

	/**
	 * A public read-only list of all the '<em><b>Message Sort</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays
		.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Sort</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageSort get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageSort result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Sort</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageSort getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageSort result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Sort</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageSort get(int value) {
		switch (value) {
			case SYNCH_CALL :
				return SYNCH_CALL_LITERAL;
			case ASYNCH_CALL :
				return ASYNCH_CALL_LITERAL;
			case ASYNCH_SIGNAL :
				return ASYNCH_SIGNAL_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MessageSort(int value, String name, String literal) {
		super(value, name, literal);
	}

} //MessageSort