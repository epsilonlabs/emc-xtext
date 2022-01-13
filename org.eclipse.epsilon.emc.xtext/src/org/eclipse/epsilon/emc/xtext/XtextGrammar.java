package org.eclipse.epsilon.emc.xtext;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.xtext.resource.XtextResourceSet;

public class XtextGrammar extends EmfModel {
	
	@Override
	protected ResourceSet createResourceSet() {
		return new XtextResourceSet();
	}
	
}
