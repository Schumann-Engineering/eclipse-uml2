/*
 * Copyright (c) 2005, 2018 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039
 *   Kenn Hussey - 535301
 *
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.ValueSpecificationAction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Value Specification Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ValueSpecificationAction#validateMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ValueSpecificationAction#validateCompatibleType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Compatible Type</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ValueSpecificationActionTest
		extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValueSpecificationActionTest.class);
	}

	/**
	 * Constructs a new Value Specification Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecificationActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Value Specification Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ValueSpecificationAction getFixture() {
		return (ValueSpecificationAction) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp()
			throws Exception {
		setFixture(UMLFactory.eINSTANCE.createValueSpecificationAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown()
			throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ValueSpecificationAction#validateCompatibleType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Compatible Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ValueSpecificationAction#validateCompatibleType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateCompatibleType__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ValueSpecificationAction#validateMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ValueSpecificationAction#validateMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateMultiplicity__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //ValueSpecificationActionTest
