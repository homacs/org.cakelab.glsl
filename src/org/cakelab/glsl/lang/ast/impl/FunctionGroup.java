package org.cakelab.glsl.lang.ast.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.cakelab.glsl.lang.ast.Function;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.lang.ast.types.Type.AssignabilityVerdict;

@SuppressWarnings("serial")
public class FunctionGroup extends ArrayList<Function> {

	public FunctionGroup(Collection<? extends Function> c) {
		super(c);
	}

	public FunctionGroup() {
		super(1);
	}

	public boolean add(Function f) {
		int i = Collections.binarySearch(this, f);
		if (i >= 0) {
			// exists
			super.set(i, f);
		} else {
			i = (-(i) - 1);
			super.add(i, f);
		}
		return true;
	}
	
	
	public Function getBestMatch(Type[] parameterTypes) {
		Function bestMatch = null;
		AssignabilityVerdict assignabilityBestMatch = AssignabilityVerdict.NotAssignable;
		
		//
		// search all function until we either find a function whose parameter types
		// allow direct assignment of the given parameters or assignment after 
		// implicit cast.
		//
		for (Function f : this) {
			
			AssignabilityVerdict assignability = f.compareParameters(parameterTypes);
			if (assignability.betterThan(assignabilityBestMatch)) {
				assignabilityBestMatch = assignability;
				bestMatch = f;
				if (assignability.equals(AssignabilityVerdict.Direct)) {
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
			
			AssignabilityVerdict assignability = f.compareParameters(parameterTypes);
			if (assignability.equals(AssignabilityVerdict.Direct)) return f;
		}
		return null;
	}

}
