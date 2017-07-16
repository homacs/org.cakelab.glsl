package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;

public class ConstantValue<T> extends Value {

	public static final Value ONE = new ConstantValue<Long>(Interval.NONE, Long.valueOf(1L), true);
	public static final Value ZERO = new ConstantValue<Long>(Interval.NONE, Long.valueOf(0L), true);
	public static final Expression TRUE = new ConstantValue<Boolean>(Interval.NONE, Boolean.TRUE);
	public static final Expression FALSE = new ConstantValue<Boolean>(Interval.NONE, Boolean.FALSE);

	
	public ConstantValue(Interval interval, Character value) {
		super(interval, Type._qualified(Type._char, Qualifier._const), value);
	}
	
	public ConstantValue(Interval interval, Float value) {
		super(interval, Type._qualified(Type._float, Qualifier._const), value);
	}
	
	public ConstantValue(Interval interval, Double value) {
		super(interval, Type._qualified(Type._double, Qualifier._const), value);
	}
	
	public ConstantValue(Interval interval, Boolean value) {
		super(interval, Type._qualified(Type._bool, Qualifier._const), value);
	}
	
	public ConstantValue(Interval interval, Long value, boolean signed) {
		super(interval, Type._qualified(signed?Type._int:Type._uint, Qualifier._const), value);
	}

	public ConstantValue(Interval interval, Type type, Object value) {
		super(interval, Type._qualified(type, Qualifier._const), value);
	}

	
	@SuppressWarnings("unchecked")
	public T getValue() {
		return (T) value;
	}
	
}
