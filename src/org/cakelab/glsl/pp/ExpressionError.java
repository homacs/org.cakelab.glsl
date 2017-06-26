package org.cakelab.glsl.pp;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.pp.ast.StringConstant;

public class ExpressionError extends StringConstant {

	private String errorMessage;

	public ExpressionError(Interval interval, String errorTokens, String errorMessage) {
		super(interval, errorTokens);
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	@Override
	public Object eval() throws EvaluationException {
		throw new EvaluationException(this, errorMessage);
	}
	
	

}
