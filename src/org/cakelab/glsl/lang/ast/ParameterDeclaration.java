package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.types.Type;

/** A parameter of a function or constructor. 
 * 
 * <pre>
 * 	full_type (name)*
 * </pre>
 * */
public class ParameterDeclaration extends Variable {

	public static final ParameterDeclaration[] VOID_PARAM_LIST = new ParameterDeclaration[0];

	public ParameterDeclaration(Interval interval, IScope scope, Type type, String name) {
		super(interval, scope, type, name);
	}

}
