package org.eclipse.epsilon.emc.xtext;

import org.eclipse.epsilon.emc.emf.dt.EmfModelConfigurationDialog;

public class XtextGrammarConfigurationDialog extends EmfModelConfigurationDialog {
	
	@Override
	protected String getModelName() {
		return "Xtext Grammar";
	}
	
	@Override
	protected String getModelType() {
		return "Xtext";
	}
	
}
