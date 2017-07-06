package org.cakelab.glsl.pp;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.PrimaryExpression;
import org.cakelab.glsl.pp.ast.StringConstant;

public class ExpressionError extends StringConstant {
	// TODO not a string constant (rather exception)
	private String errorMessage;

	public ExpressionError(Interval interval, String errorTokens, String errorMessage) {
		super(interval, errorTokens);
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		throw new EvaluationException(this, errorMessage);
	}

}
