package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.tokens.TIdentifier;

public class PPIfdefScope extends PPIfScope {

	public PPIfdefScope(PPGroupScope parent) {
		super(parent);
	}

	
	public void setCondition(Node ident) {
		if (ident instanceof MacroReference) {
			setCondition(ident.getInterval(), true);
		} else if (ident instanceof TIdentifier) {
			setCondition(ident.getInterval(), false);
		} else {
			throw new Error("internal error: unexpected object type");
		}
	}

	
}
