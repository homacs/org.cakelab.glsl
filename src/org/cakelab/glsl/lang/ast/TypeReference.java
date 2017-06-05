package org.cakelab.glsl.lang.ast;

public class TypeReference extends PrimaryExpression implements Identifier {

	protected Type type;

	public TypeReference(Type type) {
		this.type = type;
	}

	@Override
	public String getName() {
		return type.getName();
	}


}
