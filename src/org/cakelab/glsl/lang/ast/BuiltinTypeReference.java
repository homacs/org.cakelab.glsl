package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.types.Type;

public class BuiltinTypeReference extends TypeReference {

	public BuiltinTypeReference(Interval interval, Type type) {
		super(interval, type);
	}
	
}
