package org.cakelab.glsl.pp;

public class MacroParameter {
	// TODO: isn't macro parameter a value type?
	
	private String identifier;
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
