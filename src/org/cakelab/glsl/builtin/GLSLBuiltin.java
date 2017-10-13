package org.cakelab.glsl.builtin;

import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.builtin.extensions.GLSLExtension;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.lang.lexer.GLSL_ANTLR_PPOutputBuffer;
import org.cakelab.glsl.lang.lexer.tokens.ExtendedTokenTable;
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
 * available via {@link GLSLBuiltin#get(GLSLVersion, ShaderType)}. Those instances are cached
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
public class GLSLBuiltin  extends BuiltinLoaderHelper {
	
	private static class Key {

		private GLSLVersion version;
		private ShaderType shaderType;

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


	/**
	 * A working set provides access to data which is valid throughout preprocessing and parse
	 * of a specific glsl source file, namely:
	 * <ul>
	 * <li>GLSL version ({@link GLSLVersion})</li>
	 * <li>selected profile ({@link GLSLVersion#Profile})</li>
	 * <li>type of the shader to be processed ({@link ShaderType})</li>
	 * <li>set of builtin symbols ({@link BuiltinScope})</li>
	 * <li>set of builtin macros (<b><code>HashMap&lt;String, Macro&gt;</code></b>)</li>
	 * <li>enabled extensions ({@link GLSLExtensionSet}, via {@link BuiltinScope#extensions})</li>
	 * </ul>
	 * A working set is created by {@link GLSLBuiltin#createWorkingSet()}.
	 * @author homac
	 *
	 */
	public static class WorkingSet {
		private Key key;
		private BuiltinScope builtinScope;
		private HashMap<String, Macro> builtinMacros;
		private ExtendedTokenTable tokenTable;
		
		private WorkingSet(Key key, BuiltinScope builtinScope, ExtendedTokenTable tokenTable, HashMap<String, Macro> builtinMacros) {
			super();
			this.key = key;
			this.builtinScope = builtinScope;
			this.tokenTable = tokenTable;
			this.builtinMacros = builtinMacros;
		}

		public ExtendedTokenTable getTokenTable() {
			return tokenTable;
		}
		
		public ShaderType getShaderType() {
			return key.shaderType;
		}
		
		public GLSLVersion getGLSLVersion() {
			return key.version;
		}
		
		public BuiltinScope getBuiltinScope() {
			return builtinScope;
		}

		public HashMap<String, Macro> getBuiltinMacros() {
			return builtinMacros;
		}

		public void enableExtension(String identifier) {
			GLSLExtension e = GLSLExtension.get(this, identifier);
			builtinScope.getExtensions().enable(e);
		}

		public void disableExtension(String identifier) {
			builtinScope.getExtensions().disable(identifier);
		}

		public GLSLExtensionSet getExtensions() {
			return builtinScope.getExtensions();
		}

		public void dump(PrintStream out) {
			builtinScope.dump(out, "");
			for (Macro m : builtinMacros.values()) {
				out.println("macro: " + m.getName());
			}
		}
		
	}
	
	
	/** cache for recently parsed preambles */
	static final Map<Key, GLSLBuiltin> BUILTIN_SYMBOLS_CACHE = new HashMap<Key, GLSLBuiltin>(4);
	
	
	private Key key;
	private HashMap<String, Macro> macros;
	private IScope builtinScopeSymbols;


	GLSLBuiltin(Key key, HashMap<String, Macro> macros, GLSLTokenTable tokenTable) {
		this.key = key;
		this.macros = macros;

	}
	
	public static GLSLBuiltin get(GLSLVersion version, ShaderType type) {
		Key key = new Key(version, type);
		GLSLBuiltin result = BUILTIN_SYMBOLS_CACHE.get(key);
		if (result == null) {
			result = loadBuiltins(key);
			BUILTIN_SYMBOLS_CACHE.put(key, result);
		}
		return result;
	}

	private static void addCommonBuiltinMacros(HashMap<String, Macro> builtinMacros) {
		//
		// add context specific builtin macros
		//
		Macro __LINE__ = new BuiltinMacro__LINE__();
		builtinMacros.put(__LINE__.getName(), __LINE__);
		Macro __FILE__ = new BuiltinMacro__FILE__();
		builtinMacros.put(__FILE__.getName(), __FILE__);

	}
	
	public GLSLVersion getVersion() {
		return key.version;
	}
	
	public ShaderType getShaderType() {
		return key.shaderType;
	}

	public WorkingSet createWorkingSet() {
		BuiltinScope builtinSymbols = new BuiltinScope(builtinScopeSymbols);
		GLSLTokenTable builtinTokens = GLSLTokenTable.get(key.version);
		ExtendedTokenTable tokenTable = new ExtendedTokenTable(builtinTokens, builtinSymbols.getExtensions());
		return new WorkingSet(key, builtinSymbols, tokenTable, macros);
	}
	
	public void dump(PrintStream out) {
		builtinScopeSymbols.dump(out, "");
		for (Macro e : macros.values()) {
			out.println("macro: '" + e.getName() + "'");
		}
	}

	public HashMap<String, Macro> getBuiltinMacros() {
		return macros;
	}

	
	public static HashMap<String, Macro> getDefaultBuiltinMacros() {
		HashMap<String, Macro> builtinMacros = new HashMap<String, Macro>();
		addCommonBuiltinMacros(builtinMacros);
		return builtinMacros;
	}
	
	/** 
	 * This is for testing purposes only! 
	 * It circumvents parsing of the builtin preambles, 
	 * and registers builtin types only.
	 */
	public static GLSLBuiltin getTestBuiltins(GLSLVersion version) {
		GLSLTokenTable tokens = GLSLTokenTable.get(version);
		Key key = new Key(tokens.getVersion(), ShaderType.GENERIC_SHADER);
		SymbolTable builtinSymbols = createMinimumBuiltinSymbols(tokens);
		GLSLBuiltin builtin = new GLSLBuiltin(key, getDefaultBuiltinMacros(), tokens);
		builtin.builtinScopeSymbols = builtinSymbols.getTopLevelScope();
		return builtin;
	}

	private static GLSLBuiltin loadBuiltins(Key key) {
		Resource resource;
		try {
			resource = BUILTIN_RESOURCE_MANAGER.resolve(BuiltinLoaderHelper.getResourceDirectory(key.version) + "/preamble.glsl");
		} catch (IOException e) {
			throw new Error("internal error: cant parse preamble. GLSLVersion parser should have avoided this case.", e);
		}
		
		
		
		
		GLSL_ANTLR_PPOutputBuffer buffer = new GLSL_ANTLR_PPOutputBuffer(BUILTIN_RESOURCE_MANAGER);

		HashMap<String, Macro> builtinMacros = preprocess(resource, key.version, key.shaderType, buffer);
		addCommonBuiltinMacros(builtinMacros);

		GLSLTokenTable tokenTable = GLSLTokenTable.get(key.version);
		GLSLBuiltin builtin = new GLSLBuiltin(key, builtinMacros, tokenTable);
		SymbolTable builtinSymbols = createMinimumBuiltinSymbols(tokenTable);

		parse(buffer, tokenTable, builtinSymbols);

		builtin.builtinScopeSymbols = builtinSymbols.getTopLevelScope();
		
		return builtin;
	}
	
	private static SymbolTable createMinimumBuiltinSymbols(GLSLTokenTable tokenTable) {
		SymbolTable builtinSymbols = new SymbolTable(null);
		for (Type t : Type.BUILTIN_TYPES) {
			// add those builtin types only, which are known in this version.
			if (tokenTable.isBuiltinType(t.getName()) || t.equals(Type._void)) {
				builtinSymbols.addType(t);
			}
		}
		return builtinSymbols;
	}

	

	
}
