package org.cakelab.glsl.ast;

import java.util.ArrayList;
import java.util.HashMap;

public class Scope {
	static class Builtin extends Scope {
		Builtin() {
			super(null);
			for (Type t : Type.BUILTIN_TYPES) {
				types.put(t.name, t);
			}
			for (Function f : Function.BUILTIN_FUNCTIONS) {
				functions.put(f.name, f);
			}
		}
	}

	public static final Scope BUILTIN_SCOPE = new Builtin();
	
	
	
	Scope parent;
	ArrayList<Scope> children = new ArrayList<Scope>();
	
	HashMap<String, Function> functions = new HashMap<String, Function>();
	HashMap<String, Variable> variables = new HashMap<String, Variable>();
	HashMap<String, Type> types = new HashMap<String, Type>();
	
	public Scope(Scope parent) {
		this.parent = parent;
	}

	public Scope global() {
		Scope global = this;
		while (global.parent != null) global = global.parent;
		return global;
	}
	
	public void reset() {
		functions.clear();
		variables.clear();
		types.clear();
	}
	
	public boolean containsType(String name) {
		if (types.containsKey(name)) return true;
		else if (parent != null) return parent.containsType(name);
		return false;
	}
	
	public boolean containsFunction(String name) {
		if (functions.containsKey(name)) return true;
		else if (parent != null) return parent.containsFunction(name);
		return false;
	}

	public boolean containsVariable(String name) {
		if (variables.containsKey(name)) return true;
		else if (parent != null) return parent.containsVariable(name);
		return false;
	}

	public void add(Scope child) {
		children.add(child);
	}

	public Scope getParent() {
		return parent;
	}

	public void addFunction(String name, Function func) {
		functions.put(name, func);
	}

	public void addVariable(String name, Variable var) {
		variables.put(name, var);
	}

	public void addType(String name, Type type) {
		types.put(name, type);
	}

	public ArrayList<Scope> getChildren() {
		return children;
	}
	

}
