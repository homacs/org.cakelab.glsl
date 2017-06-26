package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.Scope;

public class PPIfndefScope extends PPIfScope {

	public PPIfndefScope(Scope parent) {
		super(parent);
	}

	@Override
	public void setCondition(Expression condition) throws EvaluationException {
		super.setCondition(condition);
		visible = !visible;
	}

	
	
}
