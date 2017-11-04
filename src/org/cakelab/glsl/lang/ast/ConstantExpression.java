package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.impl.ExpressionImpl;
import org.cakelab.glsl.lang.ast.types.Type;

public class ConstantExpression extends ExpressionImpl {

	Expression expr;

	public ConstantExpression(Expression expr) {
		super(expr.getInterval());
		this.expr = expr;
	}

	public PrimaryExpression eval() throws EvaluationException {
		return expr.eval();
	}

	@Override
	public Type evaluateType() throws EvaluationException {
		return expr.evaluateType();
	}

	@Override
	public String getText() {
		return expr.getText();
	}

}
