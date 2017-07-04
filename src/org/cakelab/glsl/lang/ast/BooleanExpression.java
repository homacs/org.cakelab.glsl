package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;

public class BooleanExpression extends Expression {

	private Expression expr;

	public BooleanExpression(Expression expr) {
		super(expr.getInterval());
		this.expr = expr;
	}

	public BooleanExpression(Interval interval, boolean value) {
		this(new ConstantValue<Boolean>(interval, value));
	}
	
	@Override
	public Object eval() throws EvaluationException {
		return expr.eval();
	}

	@Override
	public Value value() throws EvaluationException {
		return expr.value();
	}

	
	public Boolean booleanValue() throws EvaluationException {
		// TODO this is a type cast
		Value value = value();
		if (value.type.equals(Type._bool)) {
			return (Boolean) value.value;
		} else if (value.type.equals(Type._int) || value.type.equals(Type._uint)) {
			return ((Long)value.value).longValue() != 0;
		} else {
			throw new EvaluationException(this, "not a boolean value");
		}
	}


}
