package org.cakelab.glsl.lang;

import org.cakelab.glsl.lang.ast.Expression;

@SuppressWarnings("serial")
public class EvaluationException extends Exception {

	private Expression origin;

	public EvaluationException(Expression origin, String message, Throwable cause) {
		super(message, cause);
		this.setOrigin(origin);
	}

	public EvaluationException(Expression origin, String message) {
		super(message);
		this.setOrigin(origin);
	}

	public EvaluationException(Expression origin, ProcessingException cause) {
		super(cause.getMessage(), cause);
		this.setOrigin(origin);
	}


	public EvaluationException(Expression origin, Throwable cause) {
		super(cause);
		this.setOrigin(origin);
	}

	public Expression getOrigin() {
		return origin;
	}

	public void setOrigin(Expression origin) {
		this.origin = origin;
	}

}
