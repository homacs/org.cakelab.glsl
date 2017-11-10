package org.cakelab.glsl.builtin;

import java.io.PrintStream;
import java.util.HashMap;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.pp.ast.Macro;


/**
 * The class GLSLBuiltin provides access to builtin symbols and macros.
 * <p>
 * There exists a specific set of builtin symbols for each combination of:
 * </p>
 * <ul>
 * <li>GLSL version</li>
 * <li>profile</li>
 * <li>shader type</li>
 * </ul>
 * <p>
 * A specific set of builtin symbols and macros is represented by one instance of GLSLBuiltin
 * available via {@link GLSLBuiltin#getBuiltins(GLSLVersion, ShaderType)}. Those instances are cached
 * globally and reused if the application parses multiple glsl source files. 
 * </p>
 * <p>
 * During preprocessing phase, the preprocessor will determine version and profile and retrieve
 * associated builtins in-flight.
 * </p>
 * <p>
 * The set of builtin symbols and macros actually changes during preprocessing when extensions
 * get loaded. Thus, preprocessor and the language parser use a shared {@link WorkingSet} which 
 * contains builtins and extensions.
 * </p>
 * 
 * @author homac
 *
 */
public class GLSLBuiltin {
	
	static class Key {

		GLSLVersion version;
		ShaderType shaderType;

		public Key(GLSLVersion version, ShaderType type) {
			this.version = version;
			this.shaderType = type;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((shaderType == null) ? 0 : shaderType.hashCode());
			result = prime * result + ((version == null) ? 0 : version.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Key other = (Key) obj;
			if (shaderType != other.shaderType)
				return false;
			if (version == null) {
				if (other.version != null)
					return false;
			} else if (!version.equals(other.version))
				return false;
			return true;
		}

	}

	
	
	private Key key;
	private HashMap<String, Macro> builtinMacros;
	private IScope builtinScope;
	private GLSLTokenTable tokenTable;


	GLSLBuiltin(Key key, HashMap<String, Macro> macros, IScope builtinScope, GLSLTokenTable tokenTable) {
		this.key = key;
		this.builtinMacros = macros;
		this.builtinScope = builtinScope;
		this.tokenTable = tokenTable;

	}
	
	public GLSLVersion getVersion() {
		return key.version;
	}
	
	public ShaderType getShaderType() {
		return key.shaderType;
	}
	public HashMap<String, Macro> getBuiltinMacros() {
		return this.builtinMacros;
	}


	
	public BuiltinScope getBuiltinScope() {
		return new BuiltinScope(this.builtinScope);
	}
	
	public void dump(PrintStream out) {
		this.builtinScope.dump(out, "");
		for (Macro e : this.builtinMacros.values()) {
			out.println("macro: '" + e.getName() + "'");
		}
	}

	public GLSLTokenTable getTokenTable() {
		return tokenTable;
	}


	
}
