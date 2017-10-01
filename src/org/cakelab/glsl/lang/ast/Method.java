package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.types.CompoundType;
import org.cakelab.glsl.lang.ast.types.CompoundType.Member;
import org.cakelab.glsl.lang.ast.types.Type;

/** method is a function with a this pointer as implicit first argument */
public class Method extends Function implements Member {

	private CompoundType struct;

	public Method(Interval interval, CompoundType struct, Type returnType, String name, ParameterDeclaration... parameters) {
		super(interval, returnType, name, parameters);
		this.struct = struct;
	}

	public Value call(Value _this, Value[] args) throws EvaluationException {
		// TODO [interpreter]
		throw new Error("not yet implemented");
	}
	
	@Override
	public Node getNode() {
		return this;
	}
	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public Type getType() {
		return super.getType();
	}

	@Override
	public CompoundType getCompoundType() {
		return struct;
	}
	
	
}

