package org.cakelab.glsl.builtin.extensions;

import java.util.HashMap;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.pp.ast.Macro;

/** Extension which has no extensions to GLSL except the macro with its own name */
public class MockedExtension extends GLSLExtension {
	
	

	private static final HashMap<String, Macro> NO_MACROS = new HashMap<String, Macro>();

	public MockedExtension(String name, ShaderType shaderType, GLSLVersion version) {
		super(new Properties(name), version, shaderType, NO_MACROS, null);
	}

	public MockedExtension(String[] names, ShaderType shaderType, GLSLVersion version) {
		super(new Properties(names[0], names), version, shaderType, NO_MACROS, null);
	}


}
