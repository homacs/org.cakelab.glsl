package org.cakelab.glsl.pp.ast;

import java.util.List;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.tokens.Token;

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
public class MacroParameterReference extends PPExpression {
	private MacroParameter param;
	private boolean expand = true;

	public MacroParameterReference(Interval interval, MacroParameter param) {
		super(interval);
		this.param = param;
	}

	@Override
	public void eval(List<Token> result) {
		if (expand) result.addAll(param.getExpandedValue());
		else result.addAll(param.getValue());
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
	public void setRequireExpansion(boolean enable) {
		this.expand = enable;
	}
	
	public boolean requiresExpansion() {
		return expand;
	}
	

	public boolean same(MacroParameterReference that) {
		return this.param.same(that.param);
	}
	
	
	
}
