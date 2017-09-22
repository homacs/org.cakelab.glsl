package org.cakelab.glsl;

import java.io.PrintStream;

import org.cakelab.glsl.lang.ast.Function;
import org.cakelab.glsl.lang.ast.Scope;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.ast.Variable;

public class SymbolTable {

	/** builtin scope contains all builtin symbols */
	private Scope builtin;
	/** toplevel scope is the first and only child of the builtin scope */
	protected Scope toplevel;
	protected Scope scope;
	
	
	public SymbolTable(Scope builtinScope) {
		this.builtin = builtinScope;
		reset();
	}
	
	
	public Scope getScope() {
		return scope;
	}

	public void reset() {
		scope = new Scope(builtin);
		toplevel = scope;
	}

	public void enterScope(Scope child) {
		scope.add(child);
		scope = child;
	}
	
	public void leaveScope() {
		assert (scope != toplevel) : "internal error: attempt to leave top level scope";
		scope = scope.getParent();
	}

	
	///////////////////////////////////////////////////////////////////////
	//
	//          D E L E G A T E     M E T H O D S
	//
	///////////////////////////////////////////////////////////////////////
	
	public boolean containsType(String name) {
		for (Scope s = scope; s != null; s = s.getParent()) {
			if (s.containsType(name)) return true;
		}
		return false;
	}

	public boolean containsFunction(String name) {
		for (Scope s = scope; s != null; s = s.getParent()) {
			if (s.containsFunction(name)) return true;
		}
		return false;
	}

	public boolean containsVariable(String name) {
		for (Scope s = scope; s != null; s = s.getParent()) {
			if (s.containsVariable(name)) return true;
		}
		return false;
	}

	public Type getType(String name) {
		for (Scope s = scope; s != null; s = s.getParent()) {
			Type t = s.getType(name);
			if (t != null) return t;
		}
		return null;
	}

	public Function getFunction(String name) {
		for (Scope s = scope; s != null; s = s.getParent()) {
			Function f = s.getFunction(name);
			if (f != null) return f;
		}
		return null;
	}

	public Variable getVariable(String id) {
		for (Scope s = scope; s != null; s = s.getParent()) {
			Variable v = s.getVariable(id);
			if (v != null) return v;
		}
		return null;
	}


	public void addFunction(Function func) {
		scope.addFunction(func);
	}
	
	public void addFunctionDefinition(Function function) {
		scope.addFunctionDefinition(function);
	}



	public void addVariable(String name, Variable var) {
		scope.addVariable(name, var);
	}

	public void addType(String name, Type type) {
		scope.addType(name, type);
	}

	public Scope getTopLevelScope() {
		return toplevel;
	}


	public void dump(PrintStream out) {
		toplevel.dump(out, "");
	}


}
