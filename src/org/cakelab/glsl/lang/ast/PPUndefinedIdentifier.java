package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;

public class PPUndefinedIdentifier extends PrimaryExpression implements Identifier {

	protected String text;

	public PPUndefinedIdentifier(Interval interval, String text) {
		super(interval);
		this.text = text;
	}

	@Override
	public String getName() {
		return text;
	}
	
	public PrimaryExpression eval() {
		return ConstantValue.ZERO;
	}

	@Override
	public Value value() throws EvaluationException {
		return eval().value();
	}

}
