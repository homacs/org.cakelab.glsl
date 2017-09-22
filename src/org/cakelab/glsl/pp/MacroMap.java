package org.cakelab.glsl.pp;


import java.util.ArrayList;
import java.util.HashMap;

import org.cakelab.glsl.lang.GLSLExtensionSet;
import org.cakelab.glsl.pp.ast.Macro;


public class MacroMap {

	GLSLExtensionSet extensions;
	HashMap<String, Macro> builtin = new HashMap<String, Macro>();
	HashMap<String, Macro> macros = new HashMap<String, Macro>();

	
	public MacroMap(GLSLExtensionSet extensions) {
		this.extensions = extensions;
	}
	
	public GLSLExtensionSet getExtensions() {
		return extensions;
	}

	public void put(String name, Macro macro) {
		macros.put(name, macro);
	}

	public Macro get(String name) {
		Macro macro;
		
		macro = extensions.getMacro(name);
		if (macro != null) return macro;

		if (builtin != null) {
			macro = builtin.get(name);
			if (macro != null) return macro;
		}
		
		return macros.get(name);
	}

	public boolean contains(String name) {
		Macro m = get(name);
		return m != null;
	}


	
	
	public void remove(String name) {
		macros.remove(name);
	}

	public void setBuiltin(HashMap<String, Macro> macros) {
		builtin = macros;
	}

	public HashMap<String, Macro> getUserLevelMacros() {
		return macros;
	}

	public ArrayList<Macro> getAll() {
		ArrayList<Macro> all = new ArrayList<Macro>();
		if (builtin != null) {
			all.addAll(builtin.values());
		}
		all.addAll(extensions.getMacros());
		all.addAll(macros.values());
		
		return all;
	}

}
