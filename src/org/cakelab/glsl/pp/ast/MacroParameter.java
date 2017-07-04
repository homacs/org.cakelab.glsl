package org.cakelab.glsl.pp.ast;

/** parameter in a macro declaration */
public class MacroParameter {
	/** parameter name */
	private String identifier;
	/** parameter value */
	private String value;

	public MacroParameter(String identifier) {
		this.identifier = identifier;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

	public String getName() {
		return identifier;
	}
	
}
