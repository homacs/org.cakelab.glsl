package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.types.Type;

public class Variable extends Value implements LValue {
	String name;
	private IScope scope;
	
	public Variable(IScope scope, Type type, String name, Qualifiers qualifiers) {
		this(scope, Type._qualified(type, qualifiers), name);
	}

	public Variable(IScope scope, Type type, String name) {
		this(scope, type);
		this.name = name;
	}

	protected Variable(IScope scope, Type type) {
		super(Interval.NONE, type, null);
		this.scope = scope;
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
		return type.toString() + " " + name;
	}

	public String getName() {
		return name;
	}

	public IScope getScope() {
		return scope;
	}

	public void setScope(IScope scope) {
		this.scope = scope;
		
	}

}
