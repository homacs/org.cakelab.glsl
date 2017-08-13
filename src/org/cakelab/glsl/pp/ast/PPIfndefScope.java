package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.PPUndefinedIdentifier;

public class PPIfndefScope extends PPIfScope {

	public PPIfndefScope(PPGroupScope parent) {
		super(parent);
	}

	@Override
	
	public void setCondition(Expression ident) {
		if (ident instanceof PPUndefinedIdentifier) {
			setCondition(ident.getInterval(), true);
		} else if (ident instanceof MacroReference) {
			setCondition(ident.getInterval(), false);
		}
	}

	
	
}
