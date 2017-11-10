package org.cakelab.glsl.pp;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.cakelab.glsl.builtin.GLSLExtensionSet;
import org.cakelab.glsl.builtin.WorkingSet;
import org.cakelab.glsl.pp.ast.Macro;


public class MacroMap {

	GLSLExtensionSet extensions;
	HashMap<String, Macro> builtin = new HashMap<String, Macro>();
	HashMap<String, Macro> macros = new HashMap<String, Macro>();
	HashSet<String> undefined = new HashSet<String>();
	private HashMap<String, Macro> features;

	
	public MacroMap(HashMap<String, Macro> features, HashMap<String, Macro> defaultBuiltinMacros) {
		this.features = features;
		this.builtin = defaultBuiltinMacros;
	}

	public void define(String name, Macro macro) {
		macros.put(name, macro);
		undefined.remove(name);
	}

	public Macro get(String name) {
		if (undefined.contains(name)) return null;
		
		Macro macro = macros.get(name);
		if (macro != null) return macro;
		
		
		if (extensions != null) {
			macro = extensions.getMacro(name);
			if (macro != null) return macro;
		}
		
		if (features != null) {
			macro = features.get(name);
			if (macro != null) return macro;
		}
		
		if (builtin != null) {
			macro = builtin.get(name);
			if (macro != null) return macro;
		}
		
		return null;
	}

	public boolean contains(String name) {
		Macro m = get(name);
		return m != null;
	}

	public void undef(String name) {
		if (macros.containsKey(name)) {
			macros.remove(name);
		} else if ((extensions != null && extensions.getMacro(name) != null)) {
			undefined.add(name);
		} else if (features != null && features.containsKey(name)) {
			undefined.add(name);
		} else if (builtin != null && builtin.containsKey(name)) {
			undefined.add(name);
		}
	}


	
	
	public void setWorkingSet(WorkingSet workingSet) {
		builtin = workingSet.getBuiltinMacros();
		extensions = workingSet.getExtensions();
	}
	
	public void setDefaultBuiltinMacros(HashMap<String, Macro> builtinMacros) {
		this.builtin = builtinMacros;
	}

	

	public HashMap<String, Macro> getUserLevelMacros() {
		return macros;
	}

	public ArrayList<Macro> getAll() {
		ArrayList<Macro> all = new ArrayList<Macro>();
		if (builtin != null) {
			all.addAll(builtin.values());
		}
		if (features != null) {
			all.addAll(features.values());
		}
		all.addAll(extensions.getMacros());
		all.addAll(macros.values());
		
		return all;
	}

	public void setFeatureMacros(HashMap<String, Macro> features) {
		this.features = features;
	}


}
