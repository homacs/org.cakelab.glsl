package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.Scope;
import org.cakelab.glsl.lang.ast.UndefinedIdentifier;

public class PPIfndefScope extends PPIfScope {

	public PPIfndefScope(Scope parent) {
		super(parent);
	}

	@Override
	
	public void setCondition(Expression ident) {
		if (ident instanceof UndefinedIdentifier) {
			setCondition(ident.getInterval(), true);
		} else if (ident instanceof MacroReference) {
			setCondition(ident.getInterval(), false);
		}
	}

	
	
}
