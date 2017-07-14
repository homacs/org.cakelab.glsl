package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.PrimaryExpression;
import org.cakelab.glsl.lang.ast.Value;

/**
 * Reference on a macro parameter in the expansion list of a macro.
 * Macro parameters will be set to value of the corresponding argument
 * which is treated as text first. If the argument is not involved in
 * # or ## expressions, than it has to be expanded. Thus, the reference
 * also holds information about whether the expanded value is needed at
 * that particular position or not.
 * 
 * @author homac
 *
 */
public class MacroParameterReference extends PrimaryExpression {
	private MacroParameter param;
	private boolean expand = true;

	public MacroParameterReference(Interval interval, MacroParameter param) {
		super(interval);
		this.param = param;
	}

	@Override
	public PrimaryExpression eval() {
		return this;
	}

	@Override
	public Value value() {
		// TODO lvalue
		String v = param.getValue();
		if (expand) v = param.getExpandedValue();
		return new StringConstant(this.interval, v);
	}

	public MacroParameter getParameter() {
		return param;
	}

	/**
	 * Enables/disables expansion of a parameter.
	 * Default: true (macro argument will be expanded)
	 * 
	 * @param enable
	 */
	public void expand(boolean enable) {
		this.expand = enable;
	}
	
	
	
}
