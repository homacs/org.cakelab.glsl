package org.cakelab.glsl.builtin;

import org.cakelab.glsl.SymbolTable;

public class GLSLExtensionSymbolTable extends SymbolTable {

	private GLSLExtension extension;

	public GLSLExtensionSymbolTable(GLSLExtension extension, BuiltinScope builtinScope) {
		super(builtinScope);
		this.extension = extension;
		
		super.toplevel = this.extension;
		super.scope = toplevel;
		this.extension.setParent(builtin);
	}

	
	

}
