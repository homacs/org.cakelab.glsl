package org.cakelab.glsl.builtin;

import org.cakelab.glsl.SymbolTable;

public class GLSLExtensionSymbolTable extends SymbolTable {

	private GLSLExtension extension;

	public GLSLExtensionSymbolTable(GLSLExtension extension, BuiltinScope builtinScope) {
		super(builtinScope);
		this.extension = extension;
		super.toplevel = extension;
		reset();
	}

	@Override
	public void reset() {
		if (extension != null) {
			extension.setParent(builtin);
			extension.reset();
			toplevel = extension;
			scope = toplevel;
		}
	}
	
	

}
