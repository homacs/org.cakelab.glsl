package org.cakelab.glsl.builtin.extensions;

import java.util.HashMap;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Interval;
import org.cakelab.glsl.builtin.GLSLBuiltin.ShaderType;
import org.cakelab.glsl.builtin.GLSLExtension;
import org.cakelab.glsl.lang.ast.ConstantValue;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.ast.NodeList;

/** Extension which has no extensions to GLSL except the macro with its own name */
public class MockedExtension extends GLSLExtension {
	
	

	public MockedExtension(String name, GLSLVersion version) {
		super(new Properties(name), version, ShaderType.GENERIC_SHADER, createMacros(name));
	}

	private static HashMap<String, Macro> createMacros(String extensionName) {
		HashMap<String, Macro> macros = new HashMap<String, Macro>(1);
		Macro macro = new Macro(extensionName, Interval.NONE);
		NodeList<Node> nodes = new NodeList<Node>();
		nodes.add(ConstantValue.ONE);
		macro.setReplacementList(nodes);
		macros.put(macro.getName(), macro);
		return macros;
	}

}
