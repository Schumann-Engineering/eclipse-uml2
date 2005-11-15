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
 * $Id: LoopNodeImpl.java,v 1.1 2005/11/14 22:26:07 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LoopNode;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.LoopNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#isTestedFirst <em>Is Tested First</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getBodyParts <em>Body Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getSetupParts <em>Setup Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getTests <em>Test</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getResults <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getLoopVariables <em>Loop Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getBodyOutputs <em>Body Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LoopNodeImpl#getLoopVariableInputs <em>Loop Variable Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopNodeImpl
		extends StructuredActivityNodeImpl
		implements LoopNode {

	/**
	 * The default value of the '{@link #isTestedFirst() <em>Is Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestedFirst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TESTED_FIRST_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isTestedFirst() <em>Is Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestedFirst()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_TESTED_FIRST_EFLAG = 1 << 10;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getLoopNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOutputs() {
		List output = (List) eVirtualGet(UMLPackage.LOOP_NODE__OUTPUT);
		if (output == null) {
			eVirtualSet(UMLPackage.LOOP_NODE__OUTPUT,
				output = new DerivedUnionEObjectEList(OutputPin.class, this,
					UMLPackage.LOOP_NODE__OUTPUT,
					new EStructuralFeature[]{UMLPackage.eINSTANCE
						.getLoopNode_Result()}));
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.LOOP_NODE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.LOOP_NODE__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.LOOP_NODE__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE.getNamedElement_NameExpression(),
						UMLPackage.eINSTANCE.getExecutableNode_Handler(),
						UMLPackage.eINSTANCE.getAction_Output(),
						UMLPackage.eINSTANCE.getAction_Input(),
						UMLPackage.eINSTANCE.getAction_LocalPrecondition(),
						UMLPackage.eINSTANCE.getAction_LocalPostcondition(),
						UMLPackage.eINSTANCE.getNamespace_ElementImport(),
						UMLPackage.eINSTANCE.getNamespace_PackageImport(),
						UMLPackage.eINSTANCE.getNamespace_OwnedMember(),
						UMLPackage.eINSTANCE.getActivityGroup_Subgroup(),
						UMLPackage.eINSTANCE.getLoopNode_LoopVariable()}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getInputs() {
		List input = (List) eVirtualGet(UMLPackage.LOOP_NODE__INPUT);
		if (input == null) {
			eVirtualSet(UMLPackage.LOOP_NODE__INPUT,
				input = new DerivedUnionEObjectEList(InputPin.class, this,
					UMLPackage.LOOP_NODE__INPUT,
					new EStructuralFeature[]{UMLPackage.eINSTANCE
						.getLoopNode_LoopVariableInput()}));
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTestedFirst() {
		return (eFlags & IS_TESTED_FIRST_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTestedFirst(boolean newIsTestedFirst) {
		boolean oldIsTestedFirst = (eFlags & IS_TESTED_FIRST_EFLAG) != 0;
		if (newIsTestedFirst)
			eFlags |= IS_TESTED_FIRST_EFLAG;
		else
			eFlags &= ~IS_TESTED_FIRST_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LOOP_NODE__IS_TESTED_FIRST, oldIsTestedFirst,
				newIsTestedFirst));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getBodyParts() {
		List bodyPart = (List) eVirtualGet(UMLPackage.LOOP_NODE__BODY_PART);
		if (bodyPart == null) {
			eVirtualSet(UMLPackage.LOOP_NODE__BODY_PART,
				bodyPart = new EObjectResolvingEList(ExecutableNode.class,
					this, UMLPackage.LOOP_NODE__BODY_PART));
		}
		return bodyPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getBodyPart(String name) {
		for (Iterator i = getBodyParts().iterator(); i.hasNext();) {
			ExecutableNode bodyPart = (ExecutableNode) i.next();
			if (name.equals(bodyPart.getName())) {
				return bodyPart;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSetupParts() {
		List setupPart = (List) eVirtualGet(UMLPackage.LOOP_NODE__SETUP_PART);
		if (setupPart == null) {
			eVirtualSet(UMLPackage.LOOP_NODE__SETUP_PART,
				setupPart = new EObjectResolvingEList(ExecutableNode.class,
					this, UMLPackage.LOOP_NODE__SETUP_PART));
		}
		return setupPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getSetupPart(String name) {
		for (Iterator i = getSetupParts().iterator(); i.hasNext();) {
			ExecutableNode setupPart = (ExecutableNode) i.next();
			if (name.equals(setupPart.getName())) {
				return setupPart;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getDecider() {
		OutputPin decider = (OutputPin) eVirtualGet(UMLPackage.LOOP_NODE__DECIDER);
		if (decider != null && decider.eIsProxy()) {
			OutputPin oldDecider = decider;
			decider = (OutputPin) eResolveProxy((InternalEObject) decider);
			if (decider != oldDecider) {
				eVirtualSet(UMLPackage.LOOP_NODE__DECIDER, decider);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.LOOP_NODE__DECIDER, oldDecider, decider));
			}
		}
		return decider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin basicGetDecider() {
		return (OutputPin) eVirtualGet(UMLPackage.LOOP_NODE__DECIDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecider(OutputPin newDecider) {
		OutputPin decider = newDecider;
		Object oldDecider = eVirtualSet(UMLPackage.LOOP_NODE__DECIDER, decider);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LOOP_NODE__DECIDER, oldDecider == EVIRTUAL_NO_VALUE
					? null
					: oldDecider, decider));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTests() {
		List test = (List) eVirtualGet(UMLPackage.LOOP_NODE__TEST);
		if (test == null) {
			eVirtualSet(UMLPackage.LOOP_NODE__TEST,
				test = new EObjectResolvingEList(ExecutableNode.class, this,
					UMLPackage.LOOP_NODE__TEST));
		}
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getTest(String name) {
		for (Iterator i = getTests().iterator(); i.hasNext();) {
			ExecutableNode test = (ExecutableNode) i.next();
			if (name.equals(test.getName())) {
				return test;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getResults() {
		List result = (List) eVirtualGet(UMLPackage.LOOP_NODE__RESULT);
		if (result == null) {
			eVirtualSet(UMLPackage.LOOP_NODE__RESULT,
				result = new EObjectContainmentEList(OutputPin.class, this,
					UMLPackage.LOOP_NODE__RESULT));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createResult() {
		OutputPin newResult = UMLFactory.eINSTANCE.createOutputPin();
		getResults().add(newResult);
		return newResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getResult(String name) {
		for (Iterator i = getResults().iterator(); i.hasNext();) {
			OutputPin result = (OutputPin) i.next();
			if (name.equals(result.getName())) {
				return result;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getLoopVariables() {
		List loopVariable = (List) eVirtualGet(UMLPackage.LOOP_NODE__LOOP_VARIABLE);
		if (loopVariable == null) {
			eVirtualSet(UMLPackage.LOOP_NODE__LOOP_VARIABLE,
				loopVariable = new EObjectContainmentEList(OutputPin.class,
					this, UMLPackage.LOOP_NODE__LOOP_VARIABLE));
		}
		return loopVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createLoopVariable() {
		OutputPin newLoopVariable = UMLFactory.eINSTANCE.createOutputPin();
		getLoopVariables().add(newLoopVariable);
		return newLoopVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getLoopVariable(String name) {
		for (Iterator i = getLoopVariables().iterator(); i.hasNext();) {
			OutputPin loopVariable = (OutputPin) i.next();
			if (name.equals(loopVariable.getName())) {
				return loopVariable;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getBodyOutputs() {
		List bodyOutput = (List) eVirtualGet(UMLPackage.LOOP_NODE__BODY_OUTPUT);
		if (bodyOutput == null) {
			eVirtualSet(UMLPackage.LOOP_NODE__BODY_OUTPUT,
				bodyOutput = new EObjectResolvingEList(OutputPin.class, this,
					UMLPackage.LOOP_NODE__BODY_OUTPUT));
		}
		return bodyOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getBodyOutput(String name) {
		for (Iterator i = getBodyOutputs().iterator(); i.hasNext();) {
			OutputPin bodyOutput = (OutputPin) i.next();
			if (name.equals(bodyOutput.getName())) {
				return bodyOutput;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getLoopVariableInputs() {
		List loopVariableInput = (List) eVirtualGet(UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT);
		if (loopVariableInput == null) {
			eVirtualSet(UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT,
				loopVariableInput = new EObjectContainmentEList(InputPin.class,
					this, UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT));
		}
		return loopVariableInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createLoopVariableInput(EClass eClass) {
		InputPin newLoopVariableInput = (InputPin) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getLoopVariableInputs().add(newLoopVariableInput);
		return newLoopVariableInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createLoopVariableInput() {
		InputPin newLoopVariableInput = UMLFactory.eINSTANCE.createInputPin();
		getLoopVariableInputs().add(newLoopVariableInput);
		return newLoopVariableInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getLoopVariableInput(String name) {
		for (Iterator i = getLoopVariableInputs().iterator(); i.hasNext();) {
			InputPin loopVariableInput = (InputPin) i.next();
			if (name.equals(loopVariableInput.getName())) {
				return loopVariableInput;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputEdges(DiagnosticChain diagnostics, Map context) {
		return LoopNodeOperations
			.validateInputEdges(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyOutput(DiagnosticChain diagnostics, Map context) {
		return LoopNodeOperations
			.validateBodyOutput(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultNoIncoming(DiagnosticChain diagnostics,
			Map context) {
		return LoopNodeOperations.validateResultNoIncoming(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.LOOP_NODE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.LOOP_NODE__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.LOOP_NODE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.LOOP_NODE__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.LOOP_NODE__OUTGOING :
					return ((InternalEList) getOutgoings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.LOOP_NODE__IN_PARTITION :
					return ((InternalEList) getInPartitions()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.LOOP_NODE__IN_STRUCTURED_NODE :
					return eBasicSetContainer(null,
						UMLPackage.LOOP_NODE__IN_STRUCTURED_NODE, msgs);
				case UMLPackage.LOOP_NODE__ACTIVITY :
					return eBasicSetContainer(null,
						UMLPackage.LOOP_NODE__ACTIVITY, msgs);
				case UMLPackage.LOOP_NODE__INCOMING :
					return ((InternalEList) getIncomings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.LOOP_NODE__IN_INTERRUPTIBLE_REGION :
					return ((InternalEList) getInInterruptibleRegions())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.LOOP_NODE__HANDLER :
					return ((InternalEList) getHandlers()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.LOOP_NODE__LOCAL_PRECONDITION :
					return ((InternalEList) getLocalPreconditions())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.LOOP_NODE__LOCAL_POSTCONDITION :
					return ((InternalEList) getLocalPostconditions())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.LOOP_NODE__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.LOOP_NODE__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.LOOP_NODE__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.LOOP_NODE__IN_ACTIVITY :
					return eBasicSetContainer(null,
						UMLPackage.LOOP_NODE__IN_ACTIVITY, msgs);
				case UMLPackage.LOOP_NODE__VARIABLE :
					return ((InternalEList) getVariables()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.LOOP_NODE__NODE :
					return ((InternalEList) getNodes()).basicRemove(otherEnd,
						msgs);
				case UMLPackage.LOOP_NODE__EDGE :
					return ((InternalEList) getEdges()).basicRemove(otherEnd,
						msgs);
				case UMLPackage.LOOP_NODE__RESULT :
					return ((InternalEList) getResults()).basicRemove(otherEnd,
						msgs);
				case UMLPackage.LOOP_NODE__LOOP_VARIABLE :
					return ((InternalEList) getLoopVariables()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT :
					return ((InternalEList) getLoopVariableInputs())
						.basicRemove(otherEnd, msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.LOOP_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.LOOP_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.LOOP_NODE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.LOOP_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.LOOP_NODE__NAME :
				return getName();
			case UMLPackage.LOOP_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.LOOP_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.LOOP_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.LOOP_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.LOOP_NODE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.LOOP_NODE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.LOOP_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.LOOP_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.LOOP_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.LOOP_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.LOOP_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.LOOP_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.LOOP_NODE__ACTIVITY :
				return getActivity();
			case UMLPackage.LOOP_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.LOOP_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.LOOP_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.LOOP_NODE__HANDLER :
				return getHandlers();
			case UMLPackage.LOOP_NODE__OUTPUT :
				return getOutputs();
			case UMLPackage.LOOP_NODE__INPUT :
				return getInputs();
			case UMLPackage.LOOP_NODE__CONTEXT :
				return getContext();
			case UMLPackage.LOOP_NODE__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.LOOP_NODE__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.LOOP_NODE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.LOOP_NODE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.LOOP_NODE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.LOOP_NODE__MEMBER :
				return getMembers();
			case UMLPackage.LOOP_NODE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.LOOP_NODE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.LOOP_NODE__SUBGROUP :
				return getSubgroups();
			case UMLPackage.LOOP_NODE__SUPER_GROUP :
				if (resolve)
					return getSuperGroup();
				return basicGetSuperGroup();
			case UMLPackage.LOOP_NODE__CONTAINED_NODE :
				return getContainedNodes();
			case UMLPackage.LOOP_NODE__IN_ACTIVITY :
				return getInActivity();
			case UMLPackage.LOOP_NODE__CONTAINED_EDGE :
				return getContainedEdges();
			case UMLPackage.LOOP_NODE__VARIABLE :
				return getVariables();
			case UMLPackage.LOOP_NODE__NODE :
				return getNodes();
			case UMLPackage.LOOP_NODE__MUST_ISOLATE :
				return isMustIsolate()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.LOOP_NODE__EDGE :
				return getEdges();
			case UMLPackage.LOOP_NODE__IS_TESTED_FIRST :
				return isTestedFirst()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.LOOP_NODE__BODY_PART :
				return getBodyParts();
			case UMLPackage.LOOP_NODE__SETUP_PART :
				return getSetupParts();
			case UMLPackage.LOOP_NODE__DECIDER :
				if (resolve)
					return getDecider();
				return basicGetDecider();
			case UMLPackage.LOOP_NODE__TEST :
				return getTests();
			case UMLPackage.LOOP_NODE__RESULT :
				return getResults();
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE :
				return getLoopVariables();
			case UMLPackage.LOOP_NODE__BODY_OUTPUT :
				return getBodyOutputs();
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT :
				return getLoopVariableInputs();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.LOOP_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.LOOP_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.LOOP_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.LOOP_NODE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.LOOP_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.LOOP_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.LOOP_NODE__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__IN_ACTIVITY :
				setInActivity((Activity) newValue);
				return;
			case UMLPackage.LOOP_NODE__VARIABLE :
				getVariables().clear();
				getVariables().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__NODE :
				getNodes().clear();
				getNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__MUST_ISOLATE :
				setMustIsolate(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.LOOP_NODE__EDGE :
				getEdges().clear();
				getEdges().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__IS_TESTED_FIRST :
				setIsTestedFirst(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.LOOP_NODE__BODY_PART :
				getBodyParts().clear();
				getBodyParts().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__SETUP_PART :
				getSetupParts().clear();
				getSetupParts().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__DECIDER :
				setDecider((OutputPin) newValue);
				return;
			case UMLPackage.LOOP_NODE__TEST :
				getTests().clear();
				getTests().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__RESULT :
				getResults().clear();
				getResults().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE :
				getLoopVariables().clear();
				getLoopVariables().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__BODY_OUTPUT :
				getBodyOutputs().clear();
				getBodyOutputs().addAll((Collection) newValue);
				return;
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT :
				getLoopVariableInputs().clear();
				getLoopVariableInputs().addAll((Collection) newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.LOOP_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.LOOP_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.LOOP_NODE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.LOOP_NODE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.LOOP_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.LOOP_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.LOOP_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.LOOP_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.LOOP_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.LOOP_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.LOOP_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.LOOP_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.LOOP_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.LOOP_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.LOOP_NODE__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.LOOP_NODE__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.LOOP_NODE__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.LOOP_NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.LOOP_NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.LOOP_NODE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.LOOP_NODE__IN_ACTIVITY :
				setInActivity((Activity) null);
				return;
			case UMLPackage.LOOP_NODE__VARIABLE :
				getVariables().clear();
				return;
			case UMLPackage.LOOP_NODE__NODE :
				getNodes().clear();
				return;
			case UMLPackage.LOOP_NODE__MUST_ISOLATE :
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
				return;
			case UMLPackage.LOOP_NODE__EDGE :
				getEdges().clear();
				return;
			case UMLPackage.LOOP_NODE__IS_TESTED_FIRST :
				setIsTestedFirst(IS_TESTED_FIRST_EDEFAULT);
				return;
			case UMLPackage.LOOP_NODE__BODY_PART :
				getBodyParts().clear();
				return;
			case UMLPackage.LOOP_NODE__SETUP_PART :
				getSetupParts().clear();
				return;
			case UMLPackage.LOOP_NODE__DECIDER :
				setDecider((OutputPin) null);
				return;
			case UMLPackage.LOOP_NODE__TEST :
				getTests().clear();
				return;
			case UMLPackage.LOOP_NODE__RESULT :
				getResults().clear();
				return;
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE :
				getLoopVariables().clear();
				return;
			case UMLPackage.LOOP_NODE__BODY_OUTPUT :
				getBodyOutputs().clear();
				return;
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT :
				getLoopVariableInputs().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.LOOP_NODE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.LOOP_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.LOOP_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.LOOP_NODE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.LOOP_NODE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.LOOP_NODE__NAME :
				String name = eVirtualIsSet(UMLPackage.LOOP_NODE__NAME)
					? (String) eVirtualGet(UMLPackage.LOOP_NODE__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.LOOP_NODE__VISIBILITY :
				return eVirtualIsSet(UMLPackage.LOOP_NODE__VISIBILITY)
					&& eVirtualGet(UMLPackage.LOOP_NODE__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.LOOP_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.LOOP_NODE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.LOOP_NODE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.LOOP_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.LOOP_NODE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.LOOP_NODE__NAME_EXPRESSION) != null;
			case UMLPackage.LOOP_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.LOOP_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.LOOP_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.LOOP_NODE__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.LOOP_NODE__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.LOOP_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.LOOP_NODE__IN_PARTITION :
				List inPartition = (List) eVirtualGet(UMLPackage.LOOP_NODE__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.LOOP_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.LOOP_NODE__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.LOOP_NODE__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.LOOP_NODE__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.LOOP_NODE__IN_INTERRUPTIBLE_REGION :
				List inInterruptibleRegion = (List) eVirtualGet(UMLPackage.LOOP_NODE__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.LOOP_NODE__REDEFINED_NODE :
				List redefinedNode = (List) eVirtualGet(UMLPackage.LOOP_NODE__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.LOOP_NODE__HANDLER :
				List handler = (List) eVirtualGet(UMLPackage.LOOP_NODE__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.LOOP_NODE__OUTPUT :
				return isSetOutputs();
			case UMLPackage.LOOP_NODE__INPUT :
				return isSetInputs();
			case UMLPackage.LOOP_NODE__CONTEXT :
				return getContext() != null;
			case UMLPackage.LOOP_NODE__LOCAL_PRECONDITION :
				List localPrecondition = (List) eVirtualGet(UMLPackage.LOOP_NODE__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.LOOP_NODE__LOCAL_POSTCONDITION :
				List localPostcondition = (List) eVirtualGet(UMLPackage.LOOP_NODE__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.LOOP_NODE__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.LOOP_NODE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.LOOP_NODE__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.LOOP_NODE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.LOOP_NODE__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.LOOP_NODE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.LOOP_NODE__MEMBER :
				return isSetMembers();
			case UMLPackage.LOOP_NODE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.LOOP_NODE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.LOOP_NODE__SUBGROUP :
				return isSetSubgroups();
			case UMLPackage.LOOP_NODE__SUPER_GROUP :
				return isSetSuperGroup();
			case UMLPackage.LOOP_NODE__CONTAINED_NODE :
				return isSetContainedNodes();
			case UMLPackage.LOOP_NODE__IN_ACTIVITY :
				return getInActivity() != null;
			case UMLPackage.LOOP_NODE__CONTAINED_EDGE :
				return isSetContainedEdges();
			case UMLPackage.LOOP_NODE__VARIABLE :
				List variable = (List) eVirtualGet(UMLPackage.LOOP_NODE__VARIABLE);
				return variable != null && !variable.isEmpty();
			case UMLPackage.LOOP_NODE__NODE :
				List node = (List) eVirtualGet(UMLPackage.LOOP_NODE__NODE);
				return node != null && !node.isEmpty();
			case UMLPackage.LOOP_NODE__MUST_ISOLATE :
				return ((eFlags & MUST_ISOLATE_EFLAG) != 0) != MUST_ISOLATE_EDEFAULT;
			case UMLPackage.LOOP_NODE__EDGE :
				List edge = (List) eVirtualGet(UMLPackage.LOOP_NODE__EDGE);
				return edge != null && !edge.isEmpty();
			case UMLPackage.LOOP_NODE__IS_TESTED_FIRST :
				return ((eFlags & IS_TESTED_FIRST_EFLAG) != 0) != IS_TESTED_FIRST_EDEFAULT;
			case UMLPackage.LOOP_NODE__BODY_PART :
				List bodyPart = (List) eVirtualGet(UMLPackage.LOOP_NODE__BODY_PART);
				return bodyPart != null && !bodyPart.isEmpty();
			case UMLPackage.LOOP_NODE__SETUP_PART :
				List setupPart = (List) eVirtualGet(UMLPackage.LOOP_NODE__SETUP_PART);
				return setupPart != null && !setupPart.isEmpty();
			case UMLPackage.LOOP_NODE__DECIDER :
				return eVirtualGet(UMLPackage.LOOP_NODE__DECIDER) != null;
			case UMLPackage.LOOP_NODE__TEST :
				List test = (List) eVirtualGet(UMLPackage.LOOP_NODE__TEST);
				return test != null && !test.isEmpty();
			case UMLPackage.LOOP_NODE__RESULT :
				List result = (List) eVirtualGet(UMLPackage.LOOP_NODE__RESULT);
				return result != null && !result.isEmpty();
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE :
				List loopVariable = (List) eVirtualGet(UMLPackage.LOOP_NODE__LOOP_VARIABLE);
				return loopVariable != null && !loopVariable.isEmpty();
			case UMLPackage.LOOP_NODE__BODY_OUTPUT :
				List bodyOutput = (List) eVirtualGet(UMLPackage.LOOP_NODE__BODY_OUTPUT);
				return bodyOutput != null && !bodyOutput.isEmpty();
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT :
				List loopVariableInput = (List) eVirtualGet(UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT);
				return loopVariableInput != null
					&& !loopVariableInput.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isTestedFirst: "); //$NON-NLS-1$
		result.append((eFlags & IS_TESTED_FIRST_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UMLPackage.eINSTANCE.getLoopNode_Result());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.eINSTANCE.getLoopNode_LoopVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.eINSTANCE.getLoopNode_LoopVariableInput());
	}

} //LoopNodeImpl