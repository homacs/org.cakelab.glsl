package org.cakelab.glsl.lang.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Scope {
	static class Builtin extends Scope {
		Builtin() {
			super(null);
			for (Type t : Type.BUILTIN_TYPES) {
				types.put(t.signature, t);
			}
			for (Function f : Function.BUILTIN_FUNCTIONS) {
				super.addFunction(f.name, f);
			}
		}
	}

	public static final Scope BUILTIN_SCOPE = new Builtin();
	
	protected Scope parent;
	ArrayList<Scope> children = new ArrayList<Scope>();
	
	HashMap<String, ArrayList<Function>> functions = new HashMap<String, ArrayList<Function>>();
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

	public Type getType(String name) {
		Type type = types.get(name);
		if (type == null && parent != null) {
			type = parent.getType(name);
		}
		return type;
	}


	public Function getFunction(String name) {
		// TODO consider function signature somehow? or associate with the group of functions?
		ArrayList<Function> group = functions.get(name);
		if (group != null) {
			return group.get(0);
		}
		else if (parent != null) return getFunction(name);
		else return null;
	}
	
	public void add(Scope child) {
		children.add(child);
	}

	public Scope getParent() {
		return parent;
	}

	public void addFunction(String name, Function func) {
		ArrayList<Function> functionGroup = functions.get(name);
		if (functionGroup == null) {
			functionGroup = new ArrayList<Function>(1);
			functions.put(name, functionGroup);
		}
		
		int i = Collections.binarySearch(functionGroup, func);
		if (i >= 0) {
			// exists
		} else {
			i = (-(i) - 1);
			functionGroup.add(i, func);
		}
	}

	public void addVariable(String name, Variable var) {
		variables.put(name, var);
	}

	public void addType(String name, Type type) {
		types.put(name, type);
	}

	public Variable getVariable(String identifier) {
		Variable var = variables.get(identifier);
		if (var == null && parent != null) {
			var = parent.getVariable(identifier);
		}
		return var;
	}

	
	public ArrayList<Scope> getChildren() {
		return children;
	}

	public Object get(String identifier) {
		Object result = types.get(identifier);
		if (result != null) return result;
		
		result = functions.get(identifier);
		if (result != null) return result;
		
		result = variables.get(identifier);
		if (result != null) return result;
		
		return null;
	}


}