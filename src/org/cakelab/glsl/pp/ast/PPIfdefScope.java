package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.Scope;
import org.cakelab.glsl.lang.ast.PPUndefinedIdentifier;

public class PPIfdefScope extends PPIfScope {

	public PPIfdefScope(Scope parent) {
		super(parent);
	}

	
	public void setCondition(Expression ident) {
		if (ident instanceof PPUndefinedIdentifier) {
			setCondition(ident.getInterval(), false);
		} else if (ident instanceof MacroReference) {
			setCondition(ident.getInterval(), true);
		}
	}

	
}
