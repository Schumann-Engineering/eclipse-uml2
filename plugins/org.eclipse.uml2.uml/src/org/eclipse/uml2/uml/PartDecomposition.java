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
 * $Id: PartDecomposition.java,v 1.1 2005/11/14 22:26:00 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Decomposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PartDecomposition is a description of the internal interactions of one Lifeline relative to an Interaction.
 * 
 * 
 * 
 * A Lifeline has a class associated as the type of the ConnectableElement that the Lifeline represents. That class may have an internal structure and the PartDecomposition is an Interaction that describes the behavior of that internal structure relative to the Interaction where the decomposition is referenced.
 * 
 * 
 * 
 * A PartDecomposition is a specialization of InteractionUse. It associates with the ConnectableElement that it decomposes.
 * 
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getPartDecomposition()
 * @model
 * @generated
 */
public interface PartDecomposition
		extends InteractionUse {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PartDecompositions apply only to Parts that are Parts of Internal Structures not to Parts of Collaborations.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validatePartsOfInternalStructures(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assume that within Interaction X, Lifeline L is of class C and decomposed to D. Within X there is a sequence of constructs along L (such constructs are CombinedFragments, InteractionUse and (plain) OccurrenceSpecifications). Then a corresponding sequence of constructs must appear within D, matched one-to-one in the same order.
	 * 
	 * 
	 * 
	 * i) CombinedFragment covering L are matched with an extra-global CombinedFragment in D
	 * 
	 * ii) An InteractionUse covering L are matched with a global (i.e. covering all Lifelines) InteractionUse in D.
	 * 
	 * iii) A plain OccurrenceSpecification on L is considered an actualGate that must be matched by a formalGate of D
	 * 
	 * 
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateAssume(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assume that within Interaction X, Lifeline L is of class C and decomposed to D. Assume also that there is within X an
	 * 
	 * InteractionUse (say) U that covers L. According to the constraint above U will have a counterpart CU within D. Within the Interaction referenced by U, L should also be decomposed, and the decomposition should reference CU. (This rule is called commutativity of decomposition)
	 * 
	 * 
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateCommutativityOfDecomposition(DiagnosticChain diagnostics,
			Map context);

} // PartDecomposition