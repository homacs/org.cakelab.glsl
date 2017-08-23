package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.pp.MacroInterpreter;
import org.cakelab.glsl.pp.tokens.TokenList;

/** Parameter in a macro declaration.
 *  <p>
 *  A parameter receives the value of its corresponding macro 
 *  argument as plain text. The value is expanded only on demand 
 *  (if {@link #getExpandedValue()} is called by a parameter reference).
 *  </p>
 *  @see MacroParameterReference
 *  */
public class MacroParameter {
	/**
	 * Name of the macro parameter for variable arguments (used for ...)
	 */
	public static String __VA_ARGS__ = "__VA_ARGS__";
	/** parameter name */
	private String identifier;
	/** parameter value */
	private TokenList value;
	private TokenList expanded;
	private MacroInterpreter preprocessor;

	public MacroParameter(String identifier, MacroInterpreter preprocessor) {
		this.identifier = identifier;
		this.preprocessor = preprocessor;
	}
	
	public void setValue(TokenList value) {
		if (value == null) {
			throw new Error("internal error: trying to assign a null parameter");
		}
		this.expanded = null;
		this.value = value;
	}
	
	public TokenList getValue() {
		if (value == null) {
			throw new Error("internal error: parameter was not assigned");
		}
		return value;
	}

	public String getName() {
		return identifier;
	}

	public TokenList getExpandedValue() {
		if (expanded == null) {
			expanded = preprocessor.macro_expand_argument(this.value);
		}
		return expanded;
	}

	public boolean same(MacroParameter that) {
		return this.identifier.equals(that.identifier);
	}
	
}
