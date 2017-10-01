package org.cakelab.glsl;

import java.io.PrintStream;

import org.cakelab.glsl.builtin.BuiltinScope;
import org.cakelab.glsl.lang.ast.Function;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.Variable;
import org.cakelab.glsl.lang.ast.impl.ScopeImpl;
import org.cakelab.glsl.lang.ast.types.InterfaceBlock;
import org.cakelab.glsl.lang.ast.types.Type;

public class SymbolTable {
	// FIXME: variable, function and type declaration checks wrong: overriding in sub-scope allowed
	// FIXME: variable, function and type declaration checks have to at a single location (i.e. in SymbolTable)
	// FIXME: interface blocks group global variables
	// FIXME: global interface variables (in/out/inout) are separated in respect to their direction:
	//        there can exist two variables with the same name but different (non-conflicting) directions
	// FIXME: array variables can be redeclared in respect to their dimension but not their type signature
	// FIXME: qualifiers of variables may be added through redeclaration
	
	
	
	/** builtin scope contains all builtin symbols */
	protected BuiltinScope builtin;
	/** toplevel scope is the first and only child of the builtin scope */
	protected IScope toplevel;
	protected IScope scope;
	
	
	public SymbolTable(BuiltinScope builtinScope) {
		this.builtin = builtinScope;
		scope = new ScopeImpl(builtin);
		toplevel = scope;
	}
	
	public BuiltinScope getBuiltinScope() {
		return this.builtin;
	}
	
	public IScope getScope() {
		return scope;
	}

	public void enterScope(IScope child) {
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
		for (IScope s = scope; s != null; s = s.getParent()) {
			if (s.containsType(name)) return true;
		}
		return false;
	}
	public boolean containsConflictingInterface(InterfaceBlock block) {
		for (IScope s = scope; s != null; s = s.getParent()) {
			if (s.containsInterface(block)) return true;
		}
		return false;
	}

	public boolean containsFunction(String name) {
		for (IScope s = scope; s != null; s = s.getParent()) {
			if (s.containsFunction(name)) return true;
		}
		return false;
	}

	public boolean containsVariable(String name) {
		for (IScope s = scope; s != null; s = s.getParent()) {
			if (s.containsVariable(name)) return true;
		}
		return false;
	}

	public Type getType(String name) {
		for (IScope s = scope; s != null; s = s.getParent()) {
			Type t = s.getType(name);
			if (t != null) return t;
		}
		return null;
	}

	public Function getFunction(String name, Type[] parameterTypes) {
		for (IScope s = scope; s != null; s = s.getParent()) {
			Function f = s.getFunction(name, parameterTypes);
			if (f != null) return f;
		}
		return null;
	}

	public boolean containsFunctionGroup(String name) {
		for (IScope s = scope; s != null; s = s.getParent()) {
			if (s.containsFunction(name)) return true;
		}
		return false;
	}


	
	public Variable getVariable(String id) {
		for (IScope s = scope; s != null; s = s.getParent()) {
			Variable v = s.getVariable(id);
			if (v != null) return v;
		}
		return null;
	}


	public void addFunction(Function func) {
		scope.addFunction(func);
	}

	public void addVariable(Variable var) {
		scope.addVariable(var);
	}

	public void addType(Type type) {
		scope.addType(type);
	}

	public void addInterface(InterfaceBlock block) {
		scope.addInterface(block);
	}

	public IScope getTopLevelScope() {
		return toplevel;
	}


	public void dump(PrintStream out) {
		toplevel.dump(out, "");
	}



}
