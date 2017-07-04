package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;

public class ArrayElementReference extends Value implements LValue {
	/* we need to keep array object and index, to be able to set the 
	 * array element's value. */
	private int index;
	private Object array;

	public ArrayElementReference(Interval interval, Value array, int index) {
		super(interval, ((Array)array.type).getComponentType(), java.lang.reflect.Array.get(array.value, index));
		this.array = array.value;
		this.index = index;
	}

	@Override
	public Value value() {
		return this;
	}

	@Override
	public LValue lvalue() {
		// TODO lvalue handling
		return this;
	}

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public void value(Value newValue) {
		java.lang.reflect.Array.set(array, index, newValue.value);
	}
	
}
