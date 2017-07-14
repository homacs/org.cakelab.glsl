package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.ast.CallExpression;
import org.cakelab.glsl.lang.ast.Expression;

public class MacroCallExpression extends CallExpression implements MacroInvocation {

	public MacroCallExpression(MacroReference operand, Expression[] arguments, Location end) {
		super(operand, arguments, end);
	}

	@Override
	public Macro getMacro() {
		return ((MacroReference)super.operand).getMacro();
	}

	
	
	
}
