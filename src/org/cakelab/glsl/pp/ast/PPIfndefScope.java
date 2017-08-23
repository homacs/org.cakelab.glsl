package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.tokens.TIdentifier;

public class PPIfndefScope extends PPIfScope {

	public PPIfndefScope(PPGroupScope parent) {
		super(parent);
	}

	@Override
	
	public void setCondition(Node ident) {
		if (ident instanceof MacroReference) {
			setCondition(ident.getInterval(), false);
		} else if (ident instanceof TIdentifier) {
			setCondition(ident.getInterval(), true);
		} else {
			throw new Error("internal error: unexpected object type");
		}
	}

	
	
}
