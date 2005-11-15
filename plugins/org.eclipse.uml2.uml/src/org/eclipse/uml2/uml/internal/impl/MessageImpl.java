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
 * $Id: MessageImpl.java,v 1.1 2005/11/14 22:26:06 khussey Exp $
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageKind;
import org.eclipse.uml2.uml.MessageSort;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.MessageOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MessageImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MessageImpl#getMessageKind <em>Message Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MessageImpl#getMessageSort <em>Message Sort</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MessageImpl#getReceiveEvent <em>Receive Event</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MessageImpl#getSendEvent <em>Send Event</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MessageImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MessageImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MessageImpl#getArguments <em>Argument</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.MessageImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl
		extends NamedElementImpl
		implements Message {

	/**
	 * The default value of the '{@link #getMessageKind() <em>Message Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageKind()
	 * @generated
	 * @ordered
	 */
	protected static final MessageKind MESSAGE_KIND_EDEFAULT = MessageKind.COMPLETE_LITERAL;

	/**
	 * The default value of the '{@link #getMessageSort() <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSort()
	 * @generated
	 * @ordered
	 */
	protected static final MessageSort MESSAGE_SORT_EDEFAULT = MessageSort.SYNCH_CALL_LITERAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getMessage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.MESSAGE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.MESSAGE__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.MESSAGE__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE.getNamedElement_NameExpression(),
						UMLPackage.eINSTANCE.getMessage_Argument()}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageKind getMessageKind() {
		// TODO: implement this method to return the 'Message Kind' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSort getMessageSort() {
		MessageSort messageSort = (MessageSort) eVirtualGet(UMLPackage.MESSAGE__MESSAGE_SORT);
		return messageSort == null
			? MESSAGE_SORT_EDEFAULT
			: messageSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageSort(MessageSort newMessageSort) {
		MessageSort messageSort = newMessageSort == null
			? MESSAGE_SORT_EDEFAULT
			: newMessageSort;
		Object oldMessageSort = eVirtualSet(UMLPackage.MESSAGE__MESSAGE_SORT,
			messageSort);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.MESSAGE__MESSAGE_SORT,
				oldMessageSort == EVIRTUAL_NO_VALUE
					? MESSAGE_SORT_EDEFAULT
					: oldMessageSort, messageSort));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEnd getReceiveEvent() {
		MessageEnd receiveEvent = (MessageEnd) eVirtualGet(UMLPackage.MESSAGE__RECEIVE_EVENT);
		if (receiveEvent != null && receiveEvent.eIsProxy()) {
			MessageEnd oldReceiveEvent = receiveEvent;
			receiveEvent = (MessageEnd) eResolveProxy((InternalEObject) receiveEvent);
			if (receiveEvent != oldReceiveEvent) {
				eVirtualSet(UMLPackage.MESSAGE__RECEIVE_EVENT, receiveEvent);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.MESSAGE__RECEIVE_EVENT, oldReceiveEvent,
						receiveEvent));
			}
		}
		return receiveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEnd basicGetReceiveEvent() {
		return (MessageEnd) eVirtualGet(UMLPackage.MESSAGE__RECEIVE_EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveEvent(MessageEnd newReceiveEvent) {
		MessageEnd receiveEvent = newReceiveEvent;
		Object oldReceiveEvent = eVirtualSet(UMLPackage.MESSAGE__RECEIVE_EVENT,
			receiveEvent);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.MESSAGE__RECEIVE_EVENT,
				oldReceiveEvent == EVIRTUAL_NO_VALUE
					? null
					: oldReceiveEvent, receiveEvent));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEnd getSendEvent() {
		MessageEnd sendEvent = (MessageEnd) eVirtualGet(UMLPackage.MESSAGE__SEND_EVENT);
		if (sendEvent != null && sendEvent.eIsProxy()) {
			MessageEnd oldSendEvent = sendEvent;
			sendEvent = (MessageEnd) eResolveProxy((InternalEObject) sendEvent);
			if (sendEvent != oldSendEvent) {
				eVirtualSet(UMLPackage.MESSAGE__SEND_EVENT, sendEvent);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.MESSAGE__SEND_EVENT, oldSendEvent, sendEvent));
			}
		}
		return sendEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEnd basicGetSendEvent() {
		return (MessageEnd) eVirtualGet(UMLPackage.MESSAGE__SEND_EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendEvent(MessageEnd newSendEvent) {
		MessageEnd sendEvent = newSendEvent;
		Object oldSendEvent = eVirtualSet(UMLPackage.MESSAGE__SEND_EVENT,
			sendEvent);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.MESSAGE__SEND_EVENT,
				oldSendEvent == EVIRTUAL_NO_VALUE
					? null
					: oldSendEvent, sendEvent));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnector() {
		Connector connector = (Connector) eVirtualGet(UMLPackage.MESSAGE__CONNECTOR);
		if (connector != null && connector.eIsProxy()) {
			Connector oldConnector = connector;
			connector = (Connector) eResolveProxy((InternalEObject) connector);
			if (connector != oldConnector) {
				eVirtualSet(UMLPackage.MESSAGE__CONNECTOR, connector);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.MESSAGE__CONNECTOR, oldConnector, connector));
			}
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetConnector() {
		return (Connector) eVirtualGet(UMLPackage.MESSAGE__CONNECTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		Connector connector = newConnector;
		Object oldConnector = eVirtualSet(UMLPackage.MESSAGE__CONNECTOR,
			connector);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.MESSAGE__CONNECTOR,
				oldConnector == EVIRTUAL_NO_VALUE
					? null
					: oldConnector, connector));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getInteraction() {
		if (eContainerFeatureID != UMLPackage.MESSAGE__INTERACTION)
			return null;
		return (Interaction) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(Interaction newInteraction) {
		if (newInteraction != eContainer
			|| (eContainerFeatureID != UMLPackage.MESSAGE__INTERACTION && newInteraction != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newInteraction))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInteraction != null)
				msgs = ((InternalEObject) newInteraction).eInverseAdd(this,
					UMLPackage.INTERACTION__MESSAGE, Interaction.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newInteraction,
				UMLPackage.MESSAGE__INTERACTION, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.MESSAGE__INTERACTION, newInteraction, newInteraction));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getArguments() {
		List argument = (List) eVirtualGet(UMLPackage.MESSAGE__ARGUMENT);
		if (argument == null) {
			eVirtualSet(UMLPackage.MESSAGE__ARGUMENT,
				argument = new EObjectContainmentEList(
					ValueSpecification.class, this,
					UMLPackage.MESSAGE__ARGUMENT));
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createArgument(EClass eClass) {
		ValueSpecification newArgument = (ValueSpecification) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		getArguments().add(newArgument);
		return newArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getArgument(String name) {
		for (Iterator i = getArguments().iterator(); i.hasNext();) {
			ValueSpecification argument = (ValueSpecification) i.next();
			if (name.equals(argument.getName())) {
				return argument;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getSignature() {
		NamedElement signature = basicGetSignature();
		return signature == null
			? null
			: (signature.eIsProxy()
				? (NamedElement) eResolveProxy((InternalEObject) signature)
				: signature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetSignature() {
		// TODO: implement this method to return the 'Signature' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendingReceivingMessageEvent(
			DiagnosticChain diagnostics, Map context) {
		return MessageOperations.validateSendingReceivingMessageEvent(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignatureReferTo(DiagnosticChain diagnostics,
			Map context) {
		return MessageOperations.validateSignatureReferTo(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignatureIsOperation(DiagnosticChain diagnostics,
			Map context) {
		return MessageOperations.validateSignatureIsOperation(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignatureIsSignal(DiagnosticChain diagnostics,
			Map context) {
		return MessageOperations.validateSignatureIsSignal(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArguments(DiagnosticChain diagnostics, Map context) {
		return MessageOperations.validateArguments(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCannotCrossBoundaries(DiagnosticChain diagnostics,
			Map context) {
		return MessageOperations.validateCannotCrossBoundaries(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccurrenceSpecifications(
			DiagnosticChain diagnostics, Map context) {
		return MessageOperations.validateOccurrenceSpecifications(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.MESSAGE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.MESSAGE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.MESSAGE__INTERACTION :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.MESSAGE__INTERACTION, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
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
				case UMLPackage.MESSAGE__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.MESSAGE__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.MESSAGE__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.MESSAGE__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.MESSAGE__INTERACTION :
					return eBasicSetContainer(null,
						UMLPackage.MESSAGE__INTERACTION, msgs);
				case UMLPackage.MESSAGE__ARGUMENT :
					return ((InternalEList) getArguments()).basicRemove(
						otherEnd, msgs);
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UMLPackage.MESSAGE__INTERACTION :
					return eContainer.eInverseRemove(this,
						UMLPackage.INTERACTION__MESSAGE, Interaction.class,
						msgs);
				default :
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
			- eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.MESSAGE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.MESSAGE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.MESSAGE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.MESSAGE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.MESSAGE__NAME :
				return getName();
			case UMLPackage.MESSAGE__VISIBILITY :
				return getVisibility();
			case UMLPackage.MESSAGE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.MESSAGE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.MESSAGE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.MESSAGE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.MESSAGE__MESSAGE_KIND :
				return getMessageKind();
			case UMLPackage.MESSAGE__MESSAGE_SORT :
				return getMessageSort();
			case UMLPackage.MESSAGE__RECEIVE_EVENT :
				if (resolve)
					return getReceiveEvent();
				return basicGetReceiveEvent();
			case UMLPackage.MESSAGE__SEND_EVENT :
				if (resolve)
					return getSendEvent();
				return basicGetSendEvent();
			case UMLPackage.MESSAGE__CONNECTOR :
				if (resolve)
					return getConnector();
				return basicGetConnector();
			case UMLPackage.MESSAGE__INTERACTION :
				return getInteraction();
			case UMLPackage.MESSAGE__ARGUMENT :
				return getArguments();
			case UMLPackage.MESSAGE__SIGNATURE :
				if (resolve)
					return getSignature();
				return basicGetSignature();
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
			case UMLPackage.MESSAGE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.MESSAGE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.MESSAGE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.MESSAGE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.MESSAGE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.MESSAGE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.MESSAGE__MESSAGE_SORT :
				setMessageSort((MessageSort) newValue);
				return;
			case UMLPackage.MESSAGE__RECEIVE_EVENT :
				setReceiveEvent((MessageEnd) newValue);
				return;
			case UMLPackage.MESSAGE__SEND_EVENT :
				setSendEvent((MessageEnd) newValue);
				return;
			case UMLPackage.MESSAGE__CONNECTOR :
				setConnector((Connector) newValue);
				return;
			case UMLPackage.MESSAGE__INTERACTION :
				setInteraction((Interaction) newValue);
				return;
			case UMLPackage.MESSAGE__ARGUMENT :
				getArguments().clear();
				getArguments().addAll((Collection) newValue);
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
			case UMLPackage.MESSAGE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.MESSAGE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.MESSAGE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.MESSAGE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.MESSAGE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.MESSAGE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.MESSAGE__MESSAGE_SORT :
				setMessageSort(MESSAGE_SORT_EDEFAULT);
				return;
			case UMLPackage.MESSAGE__RECEIVE_EVENT :
				setReceiveEvent((MessageEnd) null);
				return;
			case UMLPackage.MESSAGE__SEND_EVENT :
				setSendEvent((MessageEnd) null);
				return;
			case UMLPackage.MESSAGE__CONNECTOR :
				setConnector((Connector) null);
				return;
			case UMLPackage.MESSAGE__INTERACTION :
				setInteraction((Interaction) null);
				return;
			case UMLPackage.MESSAGE__ARGUMENT :
				getArguments().clear();
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
			case UMLPackage.MESSAGE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.MESSAGE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.MESSAGE__OWNER :
				return isSetOwner();
			case UMLPackage.MESSAGE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.MESSAGE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.MESSAGE__NAME :
				String name = eVirtualIsSet(UMLPackage.MESSAGE__NAME)
					? (String) eVirtualGet(UMLPackage.MESSAGE__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.MESSAGE__VISIBILITY :
				return eVirtualIsSet(UMLPackage.MESSAGE__VISIBILITY)
					&& eVirtualGet(UMLPackage.MESSAGE__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.MESSAGE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.MESSAGE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.MESSAGE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.MESSAGE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.MESSAGE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.MESSAGE__NAME_EXPRESSION) != null;
			case UMLPackage.MESSAGE__MESSAGE_KIND :
				return getMessageKind() != MESSAGE_KIND_EDEFAULT;
			case UMLPackage.MESSAGE__MESSAGE_SORT :
				return eVirtualIsSet(UMLPackage.MESSAGE__MESSAGE_SORT)
					&& eVirtualGet(UMLPackage.MESSAGE__MESSAGE_SORT) != MESSAGE_SORT_EDEFAULT;
			case UMLPackage.MESSAGE__RECEIVE_EVENT :
				return eVirtualGet(UMLPackage.MESSAGE__RECEIVE_EVENT) != null;
			case UMLPackage.MESSAGE__SEND_EVENT :
				return eVirtualGet(UMLPackage.MESSAGE__SEND_EVENT) != null;
			case UMLPackage.MESSAGE__CONNECTOR :
				return eVirtualGet(UMLPackage.MESSAGE__CONNECTOR) != null;
			case UMLPackage.MESSAGE__INTERACTION :
				return getInteraction() != null;
			case UMLPackage.MESSAGE__ARGUMENT :
				List argument = (List) eVirtualGet(UMLPackage.MESSAGE__ARGUMENT);
				return argument != null && !argument.isEmpty();
			case UMLPackage.MESSAGE__SIGNATURE :
				return basicGetSignature() != null;
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
		result.append(" (messageSort: "); //$NON-NLS-1$
		result.append(eVirtualIsSet(UMLPackage.MESSAGE__MESSAGE_SORT)
			? eVirtualGet(UMLPackage.MESSAGE__MESSAGE_SORT)
			: MESSAGE_SORT_EDEFAULT);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		Interaction interaction = getInteraction();
		if (interaction != null) {
			return interaction;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(UMLPackage.eINSTANCE.getMessage_Interaction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.eINSTANCE.getMessage_Argument());
	}

} //MessageImpl