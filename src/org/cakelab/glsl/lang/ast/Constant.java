package org.cakelab.glsl.lang.ast;

public class Constant<T> extends Value {

	public Constant(Float value) {
		super(Type._float, value);
	}
	
	public Constant(Double value) {
		super(Type._double, value);
	}
	
	public Constant(Boolean value) {
		super(Type._bool, value);
	}
	
	public Constant(Long value, boolean signed) {
		super(signed?Type._int:Type._uint, value);
	}
	
	@SuppressWarnings("unchecked")
	public T getValue() {
		return (T) value;
	}
	
	public Value evaluate() {
		return this;
	}
	
}
