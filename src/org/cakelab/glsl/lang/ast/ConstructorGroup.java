package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.ast.impl.FunctionGroup;

@SuppressWarnings("serial")
public class ConstructorGroup extends FunctionGroup {
	
	public ConstructorGroup() {
		super();
	}
	
	public ConstructorGroup(ConstructorGroup that) {
		super(that);
	}

	public ConstructorGroup clone() {
		return new ConstructorGroup(this);
	}

}
