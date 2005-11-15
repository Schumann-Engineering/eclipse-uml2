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
 * $Id: ConstraintImpl.java,v 1.1 2005/11/14 22:26:04 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ConstraintOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConstraintImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConstraintImpl#getConstrainedElements <em>Constrained Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConstraintImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConstraintImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl
		extends PackageableElementImpl
		implements Constraint {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.CONSTRAINT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.CONSTRAINT__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.CONSTRAINT__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE.getNamedElement_NameExpression(),
						UMLPackage.eINSTANCE.getConstraint_Specification()}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getConstrainedElements() {
		List constrainedElement = (List) eVirtualGet(UMLPackage.CONSTRAINT__CONSTRAINED_ELEMENT);
		if (constrainedElement == null) {
			eVirtualSet(UMLPackage.CONSTRAINT__CONSTRAINED_ELEMENT,
				constrainedElement = new EObjectResolvingEList(Element.class,
					this, UMLPackage.CONSTRAINT__CONSTRAINED_ELEMENT));
		}
		return constrainedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getSpecification() {
		ValueSpecification specification = (ValueSpecification) eVirtualGet(UMLPackage.CONSTRAINT__SPECIFICATION);
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(
			ValueSpecification newSpecification, NotificationChain msgs) {
		Object oldSpecification = eVirtualSet(
			UMLPackage.CONSTRAINT__SPECIFICATION, newSpecification);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.CONSTRAINT__SPECIFICATION,
				oldSpecification == EVIRTUAL_NO_VALUE
					? null
					: oldSpecification, newSpecification);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(ValueSpecification newSpecification) {
		ValueSpecification specification = (ValueSpecification) eVirtualGet(UMLPackage.CONSTRAINT__SPECIFICATION);
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject) specification).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.CONSTRAINT__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject) newSpecification).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.CONSTRAINT__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONSTRAINT__SPECIFICATION, newSpecification,
				newSpecification));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createSpecification(EClass eClass) {
		ValueSpecification newSpecification = (ValueSpecification) eClass
			.getEPackage().getEFactoryInstance().create(eClass);
		setSpecification(newSpecification);
		return newSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getContext() {
		if (eContainerFeatureID != UMLPackage.CONSTRAINT__CONTEXT)
			return null;
		return (Namespace) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Namespace newContext) {
		if (newContext != eContainer
			|| (eContainerFeatureID != UMLPackage.CONSTRAINT__CONTEXT && newContext != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newContext))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContext != null)
				msgs = ((InternalEObject) newContext).eInverseAdd(this,
					UMLPackage.NAMESPACE__OWNED_RULE, Namespace.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newContext,
				UMLPackage.CONSTRAINT__CONTEXT, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONSTRAINT__CONTEXT, newContext, newContext));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotApplyToSelf(DiagnosticChain diagnostics,
			Map context) {
		return ConstraintOperations.validateNotApplyToSelf(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationBoolean(
			DiagnosticChain diagnostics, Map context) {
		return ConstraintOperations.validateValueSpecificationBoolean(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanValue(DiagnosticChain diagnostics, Map context) {
		return ConstraintOperations.validateBooleanValue(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoSideEffects(DiagnosticChain diagnostics,
			Map context) {
		return ConstraintOperations.validateNoSideEffects(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotAppliedToSelf(DiagnosticChain diagnostics,
			Map context) {
		return ConstraintOperations.validateNotAppliedToSelf(this, diagnostics,
			context);
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
				case UMLPackage.CONSTRAINT__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.CONSTRAINT__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.CONSTRAINT__TEMPLATE_PARAMETER :
					TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.CONSTRAINT__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject) templateParameter)
							.eInverseRemove(
								this,
								UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
								TemplateParameter.class, msgs);
					return basicSetTemplateParameter(
						(TemplateParameter) otherEnd, msgs);
				case UMLPackage.CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.CONSTRAINT__OWNING_TEMPLATE_PARAMETER, msgs);
				case UMLPackage.CONSTRAINT__CONTEXT :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.CONSTRAINT__CONTEXT, msgs);
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
				case UMLPackage.CONSTRAINT__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CONSTRAINT__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.CONSTRAINT__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.CONSTRAINT__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.CONSTRAINT__TEMPLATE_PARAMETER :
					return basicSetTemplateParameter(null, msgs);
				case UMLPackage.CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
					return eBasicSetContainer(null,
						UMLPackage.CONSTRAINT__OWNING_TEMPLATE_PARAMETER, msgs);
				case UMLPackage.CONSTRAINT__SPECIFICATION :
					return basicSetSpecification(null, msgs);
				case UMLPackage.CONSTRAINT__CONTEXT :
					return eBasicSetContainer(null,
						UMLPackage.CONSTRAINT__CONTEXT, msgs);
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
				case UMLPackage.CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
					return eContainer
						.eInverseRemove(
							this,
							UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				case UMLPackage.CONSTRAINT__CONTEXT :
					return eContainer
						.eInverseRemove(this, UMLPackage.NAMESPACE__OWNED_RULE,
							Namespace.class, msgs);
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
			case UMLPackage.CONSTRAINT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CONSTRAINT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CONSTRAINT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CONSTRAINT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CONSTRAINT__NAME :
				return getName();
			case UMLPackage.CONSTRAINT__VISIBILITY :
				return getVisibility();
			case UMLPackage.CONSTRAINT__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CONSTRAINT__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CONSTRAINT__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CONSTRAINT__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.CONSTRAINT__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter();
			case UMLPackage.CONSTRAINT__CONSTRAINED_ELEMENT :
				return getConstrainedElements();
			case UMLPackage.CONSTRAINT__SPECIFICATION :
				return getSpecification();
			case UMLPackage.CONSTRAINT__CONTEXT :
				return getContext();
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
			case UMLPackage.CONSTRAINT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.CONSTRAINT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.CONSTRAINT__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CONSTRAINT__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CONSTRAINT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.CONSTRAINT__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CONSTRAINT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.CONSTRAINT__CONSTRAINED_ELEMENT :
				getConstrainedElements().clear();
				getConstrainedElements().addAll((Collection) newValue);
				return;
			case UMLPackage.CONSTRAINT__SPECIFICATION :
				setSpecification((ValueSpecification) newValue);
				return;
			case UMLPackage.CONSTRAINT__CONTEXT :
				setContext((Namespace) newValue);
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
			case UMLPackage.CONSTRAINT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CONSTRAINT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CONSTRAINT__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.CONSTRAINT__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.CONSTRAINT__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.CONSTRAINT__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CONSTRAINT__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.CONSTRAINT__CONSTRAINED_ELEMENT :
				getConstrainedElements().clear();
				return;
			case UMLPackage.CONSTRAINT__SPECIFICATION :
				setSpecification((ValueSpecification) null);
				return;
			case UMLPackage.CONSTRAINT__CONTEXT :
				setContext((Namespace) null);
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
			case UMLPackage.CONSTRAINT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CONSTRAINT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CONSTRAINT__OWNER :
				return isSetOwner();
			case UMLPackage.CONSTRAINT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.CONSTRAINT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.CONSTRAINT__NAME :
				String name = eVirtualIsSet(UMLPackage.CONSTRAINT__NAME)
					? (String) eVirtualGet(UMLPackage.CONSTRAINT__NAME)
					: NAME_EDEFAULT;
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.CONSTRAINT__VISIBILITY :
				return eVirtualIsSet(UMLPackage.CONSTRAINT__VISIBILITY)
					&& eVirtualGet(UMLPackage.CONSTRAINT__VISIBILITY) != VISIBILITY_EDEFAULT;
			case UMLPackage.CONSTRAINT__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CONSTRAINT__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.CONSTRAINT__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.CONSTRAINT__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CONSTRAINT__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.CONSTRAINT__NAME_EXPRESSION) != null;
			case UMLPackage.CONSTRAINT__TEMPLATE_PARAMETER :
				return eVirtualGet(UMLPackage.CONSTRAINT__TEMPLATE_PARAMETER) != null;
			case UMLPackage.CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				return getOwningTemplateParameter() != null;
			case UMLPackage.CONSTRAINT__CONSTRAINED_ELEMENT :
				List constrainedElement = (List) eVirtualGet(UMLPackage.CONSTRAINT__CONSTRAINED_ELEMENT);
				return constrainedElement != null
					&& !constrainedElement.isEmpty();
			case UMLPackage.CONSTRAINT__SPECIFICATION :
				return eVirtualGet(UMLPackage.CONSTRAINT__SPECIFICATION) != null;
			case UMLPackage.CONSTRAINT__CONTEXT :
				return getContext() != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.eINSTANCE.getConstraint_Specification());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		Namespace context = getContext();
		if (context != null) {
			return context;
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
			|| eIsSet(UMLPackage.eINSTANCE.getConstraint_Context());
	}

} //ConstraintImpl