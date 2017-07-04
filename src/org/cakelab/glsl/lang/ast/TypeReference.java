package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;

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

	public Object call(Value[] arguments) {
		// TODO introduce constructor call expression
		return type.newInstance(arguments);
	}


}
