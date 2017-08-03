package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.pp.Preprocessor;

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
	private Text value;
	private String expanded;
	private Preprocessor preprocessor;

	public MacroParameter(String identifier, Preprocessor preprocessor) {
		this.identifier = identifier;
		this.preprocessor = preprocessor;
	}
	
	public void setValue(Text value) {
		if (value == null) {
			throw new Error("internal error: trying to assign a null parameter");
		}
		this.expanded = null;
		this.value = value;
	}
	
	public String getValue() {
		if (value == null) {
			throw new Error("internal error: parameter was not assigned");
		}
		return value.getValue().toString();
	}

	public String getName() {
		return identifier;
	}

	public String getExpandedValue() {
		if (expanded == null) {
			expanded = preprocessor.macro_expand_argument(value.getStart(), this.value.getValue().toString());
		}
		return expanded;
	}

	public boolean same(MacroParameter that) {
		return this.identifier.equals(that.identifier);
	}
	
}
