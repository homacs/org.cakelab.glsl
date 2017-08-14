package org.cakelab.glsl.pp.error;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.PrimaryExpression;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.ast.Value;


public class ExpressionError extends Value {
	private String errorMessage;

	public ExpressionError(Interval interval, String errorMessage) {
		super(interval, Type._void, null);
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		// TODO [2] think about proper error handling (this error here will be reported twice)
		throw new EvaluationException(this, errorMessage);
	}


}
