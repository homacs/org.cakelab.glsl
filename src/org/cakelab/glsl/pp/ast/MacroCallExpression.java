package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.impl.NodeImpl;
import org.cakelab.glsl.pp.tokens.TokenList;

public class MacroCallExpression extends NodeImpl implements MacroInvocation {

	private MacroReference operand;
	private TokenList[] arguments;

	public MacroCallExpression(MacroReference operand, TokenList[] arguments, Location end) {
		super(new Interval(operand.getStart(), end));
		this.operand = operand;
		this.arguments = arguments;
		
	}

	@Override
	public Macro getMacro() {
		return operand.getMacro();
	}

	public TokenList eval() throws EvaluationException {
		return operand.getMacro().call(this, arguments);
	}

	
	
	
}
