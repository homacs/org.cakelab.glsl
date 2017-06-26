package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;

public class ConstantExpression extends Expression {

	Expression expr;

	public ConstantExpression(Expression expr) {
		super(expr.getInterval());
		this.expr = expr;
	}

	public Object eval() throws EvaluationException {
		return expr.eval();
	}

}
