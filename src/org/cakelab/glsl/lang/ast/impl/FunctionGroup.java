package org.cakelab.glsl.lang.ast.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.cakelab.glsl.lang.ast.Function;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.ast.Type.Assignability;

@SuppressWarnings("serial")
public class FunctionGroup extends ArrayList<Function> {

	public FunctionGroup(Collection<? extends Function> c) {
		super(c);
	}

	public FunctionGroup() {
		super(1);
	}

	public Function getBestMatch(Type[] parameterTypes) {
		Function bestMatch = null;
		Assignability assignabilityBestMatch = Assignability.NotAssignable;
		
		//
		// search all function until we either find a function whose parameter types
		// allow direct assignment of the given parameters or assignment after 
		// implicit cast.
		//
		for (Function f : this) {
			
			Assignability assignability = f.compareParameters(parameterTypes);
			if (assignability.betterThan(assignabilityBestMatch)) {
				assignabilityBestMatch = assignability;
				bestMatch = f;
				if (assignability.equals(Assignability.Direct)) {
					break;
				}
			}
		}
		return bestMatch;
	}
	
	public Function getExactMatch(Type[] parameterTypes) {
		//
		// search all function until we either find a function whose parameter types
		// allow direct assignment of the given parameters or assignment after 
		// implicit cast.
		//
		for (Function f : this) {
			
			Assignability assignability = f.compareParameters(parameterTypes);
			if (assignability.equals(Assignability.Direct)) return f;
		}
		return null;
	}

}
