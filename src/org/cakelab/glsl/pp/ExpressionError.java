package org.cakelab.glsl.pp;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.PrimaryExpression;
import org.cakelab.glsl.pp.ast.Text;

public class ExpressionError extends Text {
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
		// TODO think about proper error handling (this error here will be reported twice)
		throw new EvaluationException(this, errorMessage);
	}

}
