package org.cakelab.glsl.pp.ast;

/** parameter in a macro declaration */
public class MacroParameter {
	/**
	 * Name of the macro parameter for variable arguments (used for ...)
	 */
	public static String __VA_ARGS__ = "__VA_ARGS__";
	/** parameter name */
	private String identifier;
	/** parameter value */
	private String value;

	public MacroParameter(String identifier) {
		this.identifier = identifier;
	}
	
	public void setValue(String value) {
		if (value == null) {
			throw new Error("internal error: trying to assign a null parameter");
		}

		this.value = value;
	}
	
	public String getValue() {
		if (value == null) {
			throw new Error("internal error: parameter was not assigned");
		}
		return value;
	}

	public String getName() {
		return identifier;
	}
	
}
