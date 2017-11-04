package org.cakelab.glsl.builtin;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import org.cakelab.glsl.builtin.extensions.GLSLExtension;
import org.cakelab.glsl.lang.ast.Function;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.Qualifier;
import org.cakelab.glsl.lang.ast.Variable;
import org.cakelab.glsl.lang.ast.impl.FunctionGroup;
import org.cakelab.glsl.lang.ast.types.InterfaceBlock;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.lang.lexer.tokens.ITokenTable;
import org.cakelab.glsl.pp.ast.Macro;

public class GLSLExtensionSet implements IScope, ITokenTable, Iterable<GLSLExtension> {
	// TODO one extension can override symbols of another extension -> resolve order has to be reversed
	public GLSLExtensionSet() {
	}

	private HashMap<String, GLSLExtension> extensionsLookup = new HashMap<String, GLSLExtension>();
	private ArrayList<GLSLExtension> extensions = new ArrayList<GLSLExtension>();

	
	public void addExtension(GLSLExtension extension) {
		extensions.add(extension);
		extensionsLookup.put(extension.getName(), extension);
	}

	public void removeExtension(GLSLExtension extension) {
		extensions.remove(extension);
		extensionsLookup.remove(extension.getName());
	}

	public void removeExtension(String extension) {
		removeExtension(getExtension(extension));
	}


	public GLSLExtension getExtension(String identifier) {
		return extensionsLookup.get(identifier);
	}
	
	public void removeExtensionAll() {
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
	public boolean hasFunctionGroup(String ident) {
		for (GLSLExtension e : extensions) {
			if (e.hasFunctionGroup(ident)) return true;
		}
		return false;
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
			} else if (e.getProperties().getAlternativeNames() != null) {
				for (String name : e.getProperties().getAlternativeNames()) {
					if (name.equals(extension)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public Integer mapPunctuator(String text) {
		Integer result = null;
		for (GLSLExtension e : extensions) {
			ITokenTable tokenTable = e.getKeywordTable();
			if (tokenTable != null) {
				result = tokenTable.mapPunctuator(text);
				if (result != null) break;
			}
		}
		return result;
	}

	@Override
	public boolean isPunctuator(String text) {
		boolean result = false;
		for (GLSLExtension e : extensions) {
			ITokenTable tokenTable = e.getKeywordTable();
			if (tokenTable != null) {
				result = tokenTable.isPunctuator(text);
				if (result) break;
			}
		}
		return result;
	}

	@Override
	public boolean isLanguageKeyword(String text) {
		boolean result = false;
		for (GLSLExtension e : extensions) {
			ITokenTable tokenTable = e.getKeywordTable();
			if (tokenTable != null) {
				result = tokenTable.isLanguageKeyword(text);
				if (result) break;
			}
		}
		return result;
	}

	@Override
	public boolean isReservedKeyword(String text) {
		boolean result = false;
		for (GLSLExtension e : extensions) {
			ITokenTable tokenTable = e.getKeywordTable();
			if (tokenTable != null) {
				result = tokenTable.isReservedKeyword(text);
				if (result) break;
			}
		}
		return result;
	}

	@Override
	public boolean isBuiltinType(String text) {
		boolean result = false;
		for (GLSLExtension e : extensions) {
			ITokenTable tokenTable = e.getKeywordTable();
			if (tokenTable != null) {
				result = tokenTable.isBuiltinType(text);
				if (result) break;
			}
		}
		return result;
	}

	@Override
	public Integer mapLanguageKeyword(String text) {
		Integer result = null;
		for (GLSLExtension e : extensions) {
			ITokenTable tokenTable = e.getKeywordTable();
			if (tokenTable != null) {
				result = tokenTable.mapLanguageKeyword(text);
				if (result != null) break;
			}
		}
		return result;
	}

	@Override
	public Iterator<GLSLExtension> iterator() {
		return extensions.iterator();
	}

	@Override
	public void setParent(IScope builtin) {
		throw new Error("not permitted");
		
	}

	@Override
	public FunctionGroup getFunctionGroup(String ident) {
		// TODO Auto-generated method stub
		throw new Error("TODO");
	}

	
	
}
