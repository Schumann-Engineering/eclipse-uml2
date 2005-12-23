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
 * $Id: CreateExtensionAction.java,v 1.2 2005/12/23 06:44:36 khussey Exp $
 */
package org.eclipse.uml2.uml.editor.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;

public class CreateExtensionAction
		extends UMLCommandAction {

	public CreateExtensionAction() {
		super();
	}

	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (collection.size() == 1
			&& collection.toArray()[0] instanceof Stereotype) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Stereotype stereotype = (Stereotype) collection.toArray()[0];
			EList allExtendedMetaclasses = stereotype
				.getAllExtendedMetaclasses();

			List choiceOfValues = new ArrayList();

			for (Iterator referencedMetamodels = stereotype.getProfile()
				.getReferencedMetamodels().iterator(); referencedMetamodels
				.hasNext();) {

				Model metamodel = (Model) referencedMetamodels.next();

				for (Iterator ownedTypes = metamodel.getOwnedTypes().iterator(); ownedTypes
					.hasNext();) {
					Object type = ownedTypes.next();

					if (type instanceof org.eclipse.uml2.uml.Class
						&& ((org.eclipse.uml2.uml.Class) type).isMetaclass()
						&& !allExtendedMetaclasses.contains(type)) {

						choiceOfValues.add(type);
					}
				}
			}

			for (Iterator referencedMetaclasses = stereotype.getProfile()
				.getReferencedMetaclasses().iterator(); referencedMetaclasses
				.hasNext();) {

				org.eclipse.uml2.uml.Class metaclass = (org.eclipse.uml2.uml.Class) referencedMetaclasses
					.next();

				if (!allExtendedMetaclasses.contains(metaclass)
					&& !choiceOfValues.contains(metaclass)) {

					choiceOfValues.add(metaclass);
				}
			}

			Collections.sort(choiceOfValues, new TextComparator());

			String label = UMLEditorPlugin.INSTANCE
				.getString("_UI_CreateExtensionActionCommand_label"); //$NON-NLS-1$

			final FeatureEditorDialog dialog = new FeatureEditorDialog(
				workbenchPart.getSite().getShell(), getLabelProvider(),
				stereotype, UMLPackage.Literals.STEREOTYPE,
				Collections.EMPTY_LIST, label, choiceOfValues);
			dialog.open();

			if (dialog.getReturnCode() == FeatureEditorDialog.OK) {
				editingDomain.getCommandStack().execute(
					new ChangeCommand(editingDomain, new Runnable() {

						public void run() {

							for (Iterator metaclasses = dialog.getResult()
								.iterator(); metaclasses.hasNext();) {

								stereotype.createExtension(
									(org.eclipse.uml2.uml.Class) metaclasses
										.next(), false);
							}
						}
					}, label));
			}
		}
	}

}