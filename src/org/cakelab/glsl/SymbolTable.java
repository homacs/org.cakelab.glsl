package org.cakelab.glsl;

import java.io.PrintStream;

import org.cakelab.glsl.builtin.BuiltinScope;
import org.cakelab.glsl.lang.ast.Function;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.InterfaceBlock;
import org.cakelab.glsl.lang.ast.Qualifier;
import org.cakelab.glsl.lang.ast.Qualifier.DirectionQualifier;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.ast.Variable;
import org.cakelab.glsl.lang.ast.impl.ScopeImpl;

public class SymbolTable {

	/** builtin scope contains all builtin symbols */
	protected BuiltinScope builtin;
	/** toplevel scope is the first and only child of the builtin scope */
	protected IScope toplevel;
	protected IScope scope;
	
	
	public SymbolTable(BuiltinScope builtinScope) {
		this.builtin = builtinScope;
		reset();
	}
	
	public BuiltinScope getBuiltinScope() {
		return this.builtin;
	}
	
	public IScope getScope() {
		return scope;
	}

	public void reset() {
		scope = new ScopeImpl(builtin);
		toplevel = scope;
	}

	public void enterScope(ScopeImpl child) {
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

	public boolean containsConflictingInterface(DirectionQualifier direction, String name) {
		if (direction == Qualifier._in) {
			for (IScope s = scope; s != null; s = s.getParent()) {
				if (s.containsInterface(Qualifier._in, name)) return true;
				if (s.containsInterface(Qualifier._inout, name)) return true;
			}
		} else if (direction == Qualifier._inout) {
			for (IScope s = scope; s != null; s = s.getParent()) {
				if (s.containsInterface(Qualifier._in, name)) return true;
				if (s.containsInterface(Qualifier._inout, name)) return true;
				if (s.containsInterface(Qualifier._out, name)) return true;
			}
		} else if (direction == Qualifier._out) {
			for (IScope s = scope; s != null; s = s.getParent()) {
				if (s.containsInterface(Qualifier._inout, name)) return true;
				if (s.containsInterface(Qualifier._out, name)) return true;
			}
		} else {
			throw new Error("internal error: unhandled or null direction qualifier");
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
