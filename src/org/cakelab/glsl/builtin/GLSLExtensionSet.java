package org.cakelab.glsl.builtin;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.cakelab.glsl.lang.ast.Function;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.Qualifier;
import org.cakelab.glsl.lang.ast.Variable;
import org.cakelab.glsl.lang.ast.types.InterfaceBlock;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.pp.ast.Macro;

public class GLSLExtensionSet implements IScope {
	public GLSLExtensionSet() {
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
	public void add(IScope child) {
		throw new Error("not supported");
	}

	@Override
	public IScope getParent() {
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
	public Function getFunction(String name, Type[] parameterTypes) {
		for (GLSLExtension e : extensions) {
			Function f = e.getFunction(name, parameterTypes);
			if (f != null) return f;
		}
		return null;
	}

	@Override
	public Function getFunctionBestMatch(String name, Type[] parameterTypes) {
		for (GLSLExtension e : extensions) {
			Function f = e.getFunctionBestMatch(name, parameterTypes);
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
	public void addVariable(Variable var) {
		throw new Error("not supported");
	}

	@Override
	public void addType(Type type) {
		throw new Error("not supported");
	}

	@Override
	public ArrayList<IScope> getChildren() {
		ArrayList<IScope> children = new ArrayList<IScope>();
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
			out.print("extension " + e.getName() + " ");

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
			Collection<? extends Macro> ms = e.getMacros();
			if (ms != null) macros.addAll(ms);
		}
		return macros;
	}

	@Override
	public void addInterface(InterfaceBlock block) {
		throw new Error("not supported");
	}

	@Override
	public InterfaceBlock getInterface(Qualifier direction, String name) {
		for (GLSLExtension e : extensions) {
			InterfaceBlock ib = e.getInterface(direction, name);
			if (ib != null) return ib;
		}
		return null;
	}

	@Override
	public boolean containsInterface(Qualifier direction, String name) {
		for (GLSLExtension e : extensions) {
			if (e.containsInterface(direction, name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Collection<InterfaceBlock> getInterfaces() {
		ArrayList<InterfaceBlock> interfaces = new ArrayList<InterfaceBlock>();
		for (GLSLExtension e : extensions) {
			Collection<InterfaceBlock> is = e.getInterfaces();
			if (is != null) interfaces.addAll(is);
		}
		return interfaces;
	}

	@Override
	public boolean containsInterface(InterfaceBlock block) {
		for (GLSLExtension e : extensions) {
			if (e.containsInterface(block)) {
				return true;
			}
		}
		return false;
	}

	public boolean containsExtension(String extension) {
		for (GLSLExtension e : extensions) {
			if (e.getName().equals(extension)) {
				return true;
			}
		}
		return false;
	}

	
	
}
