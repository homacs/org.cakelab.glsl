package org.cakelab.glsl.lang.ast;

public class MacroReference extends PrimaryExpression implements Identifier {

	Macro macro;

	public MacroReference(Macro macro) {
		this.macro = macro;
	}

	@Override
	public String getName() {
		return macro.name;
	}

}
