package org.cakelab.glsl.lang.ast.types;

import org.cakelab.glsl.lang.ast.Function;

public class SubroutineType extends Type {

	public SubroutineType(Function f) {
		super(f.getInterval(), f.getName(), Type.KIND_SUBROUTINE, Type.Rank.NON_SCALAR, f.getType().qualifiers);
	}

}
