package org.cakelab.glsl.lang.ast.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.cakelab.glsl.lang.ast.Function;
import org.cakelab.glsl.lang.ast.Type;

@SuppressWarnings("serial")
public class FunctionGroup extends ArrayList<Function> {

	public FunctionGroup(Collection<? extends Function> c) {
		super(c);
	}

	public FunctionGroup() {
		super(1);
	}

	public Function get(Type[] parameterTypes) {
		for (Function f : this) {
			if (f.compareParameters(parameterTypes)) {
				
			}
		}
		return null;
	}

}
