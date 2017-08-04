package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.CallExpression;
import org.cakelab.glsl.lang.ast.PrimaryExpression;

public class MacroCallExpression extends CallExpression implements MacroInvocation {

	public MacroCallExpression(MacroReference operand, Text[] arguments, Location end) {
		super(operand, arguments, end);
	}

	@Override
	public Macro getMacro() {
		return ((MacroReference)super.operand).getMacro();
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		// we know, we don't need to evaluate the arguments or operand so 
		// directly invoke the macro
		return ((MacroReference)operand).getMacro().call((Text[])arguments);
	}

	
	
	
}
