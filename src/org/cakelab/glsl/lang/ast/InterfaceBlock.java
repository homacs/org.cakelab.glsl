package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;

public class InterfaceBlock extends Struct {

	public InterfaceBlock(Interval interval, IScope parent, String name, Qualifiers qualifiers) {
		super(interval, parent, name, qualifiers);
	}

	public InterfaceBlock(InterfaceBlock block) {
		super(block);
	}

	public InterfaceBlock clone() {
		return new InterfaceBlock(this);
	}

}
