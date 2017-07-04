package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;

public class TypeReference extends PrimaryExpression implements Identifier {

	protected Type type;

	public TypeReference(Interval interval, Type type) {
		super(interval);
		this.type = type;
	}

	@Override
	public String getName() {
		return type.getName();
	}

	public Value call(Value[] arguments) {
		// TODO introduce constructor call expression
		return type.newInstance(arguments);
	}

	@Override
	public Value value() throws EvaluationException {
		throw new EvaluationException(this, "expecting a value");
	}


}
