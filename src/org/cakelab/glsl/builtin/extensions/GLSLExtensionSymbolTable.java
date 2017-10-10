package org.cakelab.glsl.builtin.extensions;

import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.builtin.BuiltinScope;

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
