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
 * $Id: ObjectNode.java,v 1.1 2005/11/14 22:25:56 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An object node is an activity node that indicates an instance of a particular classifier, possibly in a particular state, may be available at a particular point in the activity. Object nodes can be used in a variety of ways, depending on where objects are flowing from and to, as described in the semantics section.
 * An object node is an activity node that indicates an instance of a particular classifier, possibly in a particular state, may be available at a particular point in the activity. Object nodes can be used in a variety of ways, depending on where objects are flowing from and to, as described in the semantics section.
 * 
 * Complete object nodes add support for token selection, limitation on the number of tokens, specifying the state required for tokens, and carrying control values.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ObjectNode#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectNode#isControlType <em>Is Control Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectNode#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectNode#getInStates <em>In State</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectNode#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getObjectNode()
 * @model abstract="true"
 * @generated
 */
public interface ObjectNode
		extends ActivityNode, TypedElement {

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * The default value is <code>"FIFO"</code>.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.ObjectNodeOrderingKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether and how the tokens in the object node are ordered for selection to traverse edges outgoing from the object node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see org.eclipse.uml2.uml.ObjectNodeOrderingKind
	 * @see #setOrdering(ObjectNodeOrderingKind)
	 * @see org.eclipse.uml2.uml.UMLPackage#getObjectNode_Ordering()
	 * @model default="FIFO" required="true" ordered="false"
	 * @generated
	 */
	ObjectNodeOrderingKind getOrdering();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ObjectNode#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see org.eclipse.uml2.uml.ObjectNodeOrderingKind
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(ObjectNodeOrderingKind value);

	/**
	 * Returns the value of the '<em><b>Is Control Type</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether the type of the object node is to be treated as control.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Control Type</em>' attribute.
	 * @see #setIsControlType(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getObjectNode_IsControlType()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isControlType();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ObjectNode#isControlType <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Control Type</em>' attribute.
	 * @see #isControlType()
	 * @generated
	 */
	void setIsControlType(boolean value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of tokens allowed in the node. Objects cannot flow into the node if the upper bound is reached.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(ValueSpecification)
	 * @see org.eclipse.uml2.uml.UMLPackage#getObjectNode_UpperBound()
	 * @model containment="true" resolveProxies="false" required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getUpperBound();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ObjectNode#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(ValueSpecification value);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.ValueSpecification} and sets the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * @see #getUpperBound()
	 * @generated
	 */
	ValueSpecification createUpperBound(EClass eClass);

	/**
	 * Returns the value of the '<em><b>In State</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required states of the object available at this point in the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In State</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getObjectNode_InState()
	 * @model type="org.eclipse.uml2.uml.State" ordered="false"
	 * @generated
	 */
	List getInStates();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.State} with the specified '<em><b>Name</b></em>' from the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.State} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.State} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInStates()
	 * @generated
	 */
	State getInState(String name);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Selects tokens for outgoing edges.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Behavior)
	 * @see org.eclipse.uml2.uml.UMLPackage#getObjectNode_Selection()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getSelection();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ObjectNode#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Behavior value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All edges coming into or going out of object nodes must be object flow edges.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateObjectFlowEdges(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Object nodes are not unique typed elements
	 * isUnique = false
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNotUnique(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If an object node has a selection behavior, then the ordering of the object node is ordered, and vice versa.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSelectionBehavior(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A selection behavior has one input parameter and one output parameter. The input parameter must be a bag of elements of the same type as the object node or a supertype of the type of object node. The output parameter must be the same or a subtype of the type of object node. The behavior cannot have side effects.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInputOutputParameter(DiagnosticChain diagnostics,
			Map context);

} // ObjectNode