package org.cakelab.glsl.lang;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.cakelab.glsl.lang.ast.Function;
import org.cakelab.glsl.lang.ast.Scope;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.ast.Variable;
import org.cakelab.glsl.pp.ast.Macro;

// TODO Scope should be an interface for exactly this purpose
public class GLSLExtensionSet extends Scope {
	public GLSLExtensionSet() {
		super(null);
	}

	private HashMap<String, GLSLExtension> extensionsLookup = new HashMap<String, GLSLExtension>();
	private ArrayList<GLSLExtension> extensions = new ArrayList<GLSLExtension>();

	
	public void enable(GLSLExtension extension) {
		assert (!extensionsLookup.containsKey(extension.getName()));
		extensions.add(extension);
		extensionsLookup.put(extension.getName(), extension);
	}

	public void disable(String extension) {
		assert (extensionsLookup.containsKey(extension));
		for (int i = 0; i < extensions.size(); i++) {
			GLSLExtension e = extensions.get(i);
			if (e.getName().equals(extension)) {
				extensions.remove(i);
				break;
			}
		}
		extensionsLookup.remove(extension);
	}

	public void disableExtensionAll() {
		extensions.clear();
		extensionsLookup.clear();
	}

	@Override
	public void reset() {
		throw new Error("not supported");
	}

	@Override
	public void add(Scope child) {
		throw new Error("not supported");
	}

	@Override
	public Scope getParent() {
		throw new Error("not supported");
	}


	
	@Override
	public boolean containsType(String name) {
		for (GLSLExtension e : extensions) {
			if (e.containsType(name)) return true;
		}
		return false;
	}

	@Override
	public boolean containsFunction(String name) {
		for (GLSLExtension e : extensions) {
			if (e.containsFunction(name)) return true;
		}
		return false;
	}

	@Override
	public boolean containsVariable(String name) {
		for (GLSLExtension e : extensions) {
			if (e.containsVariable(name)) return true;
		}
		return false;
	}

	@Override
	public Type getType(String name) {
		for (GLSLExtension e : extensions) {
			Type t = e.getType(name);
			if (t != null) return t;
		}
		return null;
	}

	@Override
	public Function getFunction(String name) {
		for (GLSLExtension e : extensions) {
			Function f = e.getFunction(name);
			if (f != null) return f;
		}
		return null;
	}

	@Override
	public Variable getVariable(String identifier) {
		for (GLSLExtension e : extensions) {
			Variable v = e.getVariable(identifier);
			if (v != null) return v;
		}
		return null;
	}


	@Override
	public void addFunction(Function func) {
		throw new Error("not supported");
	}

	@Override
	public void addFunctionDefinition(Function function) {
		throw new Error("not supported");
	}

	@Override
	public void addVariable(String name, Variable var) {
		throw new Error("not supported");
	}

	@Override
	public void addType(String name, Type type) {
		throw new Error("not supported");
	}

	@Override
	public ArrayList<Scope> getChildren() {
		ArrayList<Scope> children = new ArrayList<Scope>();
		for (GLSLExtension e : extensions) {
			children.addAll(e.getChildren());
		}
		return children;
	}

	@Override
	public Collection<Type> getTypes() {
		ArrayList<Type> types = new ArrayList<Type>();
		for (GLSLExtension e : extensions) {
			types.addAll(e.getTypes());
		}
		return types;
	}

	@Override
	public void dump(PrintStream out, String indent) {
		for (GLSLExtension e : extensions) {
			e.dump(out, indent);
		}
	}

	public Macro getMacro(String name) {
		for (GLSLExtension e : extensions) {
			Macro m = e.getMacro(name);
			if (m != null) return m;
		}
		return null;
	}

	public Collection<? extends Macro> getMacros() {
		ArrayList<Macro> macros = new ArrayList<Macro>();
		for (GLSLExtension e : extensions) {
			macros.addAll(e.getMacros());
		}
		return macros;
	}

	
	
}
