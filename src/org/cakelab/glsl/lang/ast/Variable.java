package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;

public class Variable extends Value implements LValue {
	String name;
	
	public Variable(Type type, String name, Qualifiers qualifiers) {
		this(Type._qualified(type, qualifiers), name);
	}

	public Variable(Type type, String name) {
		this(type);
		this.name = name;
	}

	protected Variable(Type type) {
		super(Interval.NONE, type, null);
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void value(Value newValue) {
		setValue(newValue.value);
	}

	@Override
	public void setValue(Object value) {
		super.value = value;
	}

	@Override
	public LValue lvalue() throws EvaluationException {
		if (type.hasQualifier(Qualifier._const)) throw new EvaluationException(this, "trying to assign a value to constant variable");
		return this;
	}

	public String toString() {
		return type.signature + " " + name;
	}

	public String getName() {
		return name;
	}

}
