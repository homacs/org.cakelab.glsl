package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.types.Type;

public class Constructor extends Function {

	public Constructor(Interval interval, Type type, ParameterDeclaration ... parameterDeclaration) {
		super(interval, type, type.getSignature(), parameterDeclaration);
	}

	
	protected Constructor(Constructor that) {
		super(that);
	}


	/**
	 * This method is called, when a copy of a type gets created.
	 * Standard constructors are usually singletons and therefore the standard
	 * implementation of the method will return the same constructor object 
	 * (not a copy).
	 * 
	 * 
	 * Derived class may override it to create an actual copy.
	 */
	public Constructor clone() {
		return this;
	}
	
	public String toString() {
		String signature = this.getName() + "(";
		for (int i = 0; i < parameters.length; i++) {
			ParameterDeclaration p = parameters[i]; 
			signature += p.toString();
			if (i+1 < parameters.length) {
				signature += ", ";
			}
		}
		signature += ")";
		return signature;
	}
	
}
