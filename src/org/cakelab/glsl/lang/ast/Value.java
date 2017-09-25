package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;

public class Value extends PrimaryExpression {
	
	protected Type type;
	protected Object value;
	
	public Value(Interval interval, Type type, Object value) {
		super(interval);
		this.type = type;
		this.value = value;
	}
	
	@Override
	public Value value() {
		return this;
	}

	public Type getType() {
		return type;
	}
	
	public Object getNativeValue() {
		return value;
	}

	public boolean isNull() {
		return value == null;
	}

	public Value copy() {
		return new Value(interval, type, value);
	}

	@Override
	public Type evaluateType() throws EvaluationException {
		return type;
	}


}
