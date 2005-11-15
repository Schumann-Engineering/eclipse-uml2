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
 * $Id: ClassifierOperations.java,v 1.1 2005/11/14 22:25:53 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.NamedElement;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Classifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateNoCyclesInGeneralization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Cycles In Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateSpecializeType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specialize Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateGeneralizationHierarchies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Generalization Hierarchies</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateSpecialize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specialize</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateMapsToGeneralizationSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maps To Generalization Set</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#maySpecializeType(org.eclipse.uml2.uml.Classifier) <em>May Specialize Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getGenerals() <em>Get Generals</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getInheritedMembers() <em>Get Inherited Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allFeatures() <em>All Features</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#parents() <em>Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#inheritableMembers(org.eclipse.uml2.uml.Classifier) <em>Inheritable Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#hasVisibilityOf(org.eclipse.uml2.uml.NamedElement) <em>Has Visibility Of</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#conformsTo(org.eclipse.uml2.uml.Classifier) <em>Conforms To</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#inherit(java.util.List) <em>Inherit</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#maySpecializeType() <em>May Specialize Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allParents() <em>All Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#isTemplate() <em>Is Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class ClassifierOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ClassifierOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generalization hierarchies must be directed and acyclical. A classifier can not be both a transitively general and transitively specific classifier of the same classifier.
	 * not self.allParents()->includes(self)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoCyclesInGeneralization(
			Classifier classifier, DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.CLASSIFIER__NO_CYCLES_IN_GENERALIZATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoCyclesInGeneralization", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(classifier, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{classifier}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classifier may only specialize classifiers of a valid type.
	 * self.parents()->forAll(c | self.maySpecializeType(c))
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSpecializeType(Classifier classifier,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.CLASSIFIER__SPECIALIZE_TYPE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSpecializeType", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(classifier, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{classifier}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generalization hierarchies must be directed and acyclical. A classifier can not be both a transitively general and transitively specific classifier of the same classifier.
	 * not self.allParents()->includes(self)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGeneralizationHierarchies(
			Classifier classifier, DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.CLASSIFIER__GENERALIZATION_HIERARCHIES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateGeneralizationHierarchies", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(classifier, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{classifier}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classifier may only specialize classifiers of a valid type.
	 * self.parents()->forAll(c | self.maySpecializeType(c))
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSpecialize(Classifier classifier,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.CLASSIFIER__SPECIALIZE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSpecialize", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(classifier, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{classifier}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifier that maps to a GeneralizationSet may neither be a specific nor a general Classifier in any of the Generalization relationships defined for that GeneralizationSet. In other words, a power type may not be an instance of itself nor may its instances also be its subclasses.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMapsToGeneralizationSet(
			Classifier classifier, DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.CLASSIFIER__MAPS_TO_GENERALIZATION_SET,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMapsToGeneralizationSet", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(classifier, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{classifier}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query maySpecializeType() determines whether this classifier may have a generalization relationship to classifiers of the specified type. By default a classifier may specialize classifiers of the same or a more general type. It is intended to be redefined by classifiers that have different specialization constraints.
	 * result = self.oclIsKindOf(c.oclType)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean maySpecializeType(Classifier classifier, Classifier c) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The general classifiers are the classifiers referenced by the generalization relationships.
	 * result = self.parents()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static List getGenerals(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inheritedMember association is derived by inheriting the inheritable members of the parents.
	 * result = self.inherit(self.parents()->collect(p | p.inheritableMembers(self))
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static List getInheritedMembers(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allFeatures() gives all of the features in the namespace of the classifier. In general, through mechanisms such as inheritance, this will be a larger set than feature.
	 * result = member->select(oclIsKindOf(Feature))
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static List allFeatures(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query parents() gives all of the immediate ancestors of a generalized Classifier.
	 * result = generalization.general
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static List parents(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query inheritableMembers() gives all of the members of a classifier that may be inherited in one of its descendants, subject to whatever visibility restrictions apply.
	 * c.allParents()->includes(self)
	 * result = member->select(m | c.hasVisibilityOf(m))
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static List inheritableMembers(Classifier classifier, Classifier c) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query hasVisibilityOf() determines whether a named element is visible in the classifier. By default all are visible. It is only called when the argument is something owned by a parent.
	 * self.allParents()->collect(c | c.member)->includes(n)
	 * result = if (self.inheritedMember->includes(n)) then (n.visibility <> #private) else true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean hasVisibilityOf(Classifier classifier, NamedElement n) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query conformsTo() gives true for a classifier that defines a type that conforms to another. This is used, for example, in the specification of signature conformance for operations.
	 * result = (self=other) or (self.allParents()->includes(other))
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean conformsTo(Classifier classifier, Classifier other) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inherit operation is overridden to exclude redefined properties.
	 * The query inherit() defines how to inherit a set of elements. Here the operation is defined to inherit them all. It is intended to be redefined in circumstances where inheritance is affected by redefinition.
	 * result = inhs
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static List inherit(Classifier classifier, List inhs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query maySpecializeType() determines whether this classifier may have a generalization relationship to classifiers of the specified type. By default a classifier may specialize classifiers of the same or a more general type. It is intended to be redefined by classifiers that have different specialization constraints.
	 * result = self.oclIsKindOf(c.oclType)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean maySpecializeType(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allParents() gives all of the direct and indirect ancestors of a generalized Classifier.
	 * result = self.parents()->union(self.parents()->collect(p | p.allParents())
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static List allParents(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isTemplate() returns whether this templateable element is actually a template.
	 * result = oclAsType(TemplatableElement).isTemplate() or general->exists(g | g.isTemplate())
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isTemplate(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // ClassifierOperations