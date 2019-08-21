package org.cakelab.glsl.builtin;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.cakelab.glsl.GLSLCompiler;
import org.cakelab.glsl.GLSLCompilerFeatures;
import org.cakelab.glsl.GLSLErrorHandler;
import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.builtin.GLSLBuiltin.Key;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.lang.lexer.tokens.ExtendableTokenTable;
import org.cakelab.glsl.lang.lexer.tokens.ITokenTable;
import org.cakelab.glsl.lang.lexer.tokens.Vocabulary;
import org.cakelab.glsl.pp.PPOutputSink;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.ast.NodeList;
import org.cakelab.glsl.pp.error.SyntaxError;
import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.util.ObjectCache;

/**
 * This class provides access to and manages built-in symbols and macros 
 * of different GLSL version/extensions in use.
 * 
 * @author homac
 * @see GLSLBuiltin
 */
public abstract class GLSLBuiltinServices {


	/**
	 * This error handler throws an internal error on any error or 
	 * warning report.
	 * <p>
	 * This error handler is used only for internal purposes, such as
	 * parsing of preamble files (with builtin declarations). Any error
	 * in those files has to be considered as internal error (not user level error).
	 * </p>
	 * @author homac
	 *
	 */
	public static class InternalErrorHandler implements GLSLErrorHandler {

		private ResourceManager resources;

		@Override
		public void error(Node node, String message) throws SyntaxError {
			throw new Error("internal error: " + toString(node.getStart(), message));
		}

		@Override
		public void error(Location start, String message) throws SyntaxError {
			throw new Error("internal error: " + toString(start, message));
			
		}

		@Override
		public void warning(Location location, String message) throws SyntaxError {
			throw new Error("internal error: " + toString(location, message));
			
		}

		@Override
		public void warning(Interval interval, String message) throws SyntaxError {
			throw new Error("internal error: " + toString(interval.getStart(), message));
			
		}

		private String toString(Location start, String message) {
			String errLoc = "unknown location: ";
			if (start != null) {
				Resource resource = resources.getResourceById(start.getSourceIdentifier());
				String source;
				if (resource != null) {
					source = resource.getPath();
				} else {
					source = start.getSourceIdentifier();
				}
				errLoc = source + ":" + start.getLine() + ":" + start.getColumn() + ": ";
			}

			return errLoc + ": " + message;
		}

		
		@Override
		public void setResourceManager(ResourceManager resources) {
			this.resources = resources;
		}
		
	}
	
	protected static final InternalErrorHandler INTERNAL_ERROR_HANDLER;
	protected static final InternalResourceManager INTERNAL_RESOURCE_MANAGER;
	static {
		INTERNAL_ERROR_HANDLER = new InternalErrorHandler();
		String directory = GLSLBuiltinServices.class.getPackage().getName().replace('.', '/');
		INTERNAL_RESOURCE_MANAGER = new InternalResourceManager(directory);
		INTERNAL_ERROR_HANDLER.setResourceManager(INTERNAL_RESOURCE_MANAGER);
	}
	
	/** 
	 * <p>
	 * The EMPTY_FEATURESET is always used during parsing of preambles.
	 * </p>
	 * <p>
	 * Generally, preambles have to be independent of the current feature set of 
	 * the compiler. Thus, feature macros are not available (and not needed) when 
	 * loading preambles. A preamble of a profile or extension will be loaded only, 
	 * if the feature is supported. Preambles can, however, safely "redefine" a feature
	 * macro e.g. to signal, that a preamble was recently parsed. Those redefined macros
	 * will be available to subsequently parsed preambles but not to the user level code. 
	 * On user level, those "redefined macros" will be hidden by the feature macros with 
	 * the same name.
	 * </p>
	 */
	private static final GLSLCompilerFeatures EMPTY_FEATURESET = new GLSLCompilerFeatures(GLSLVersion.Profile.values());

	
	/** cache for parsed token tables. */
	private final ObjectCache<GLSLVersion, GLSLTokenTable> TOKEN_TABLE_CACHE = new ObjectCache<GLSLVersion, GLSLTokenTable>(4);

	/** cache for parsed preambles */
	private final Map<Key, GLSLBuiltin> BUILTIN_SYMBOLS_CACHE = new HashMap<Key, GLSLBuiltin>(4);

	/** associated compiler */
	private GLSLCompiler compiler;

	
	
	public GLSLBuiltinServices(GLSLCompiler compiler) {
		this.compiler = compiler;
	}
	
	
	public abstract PPOutputSink createPreprocessorSink();


	public abstract HashMap<String, Macro> preprocessBuiltinPreamble(Resource resource, GLSLVersion version, ShaderType shaderType,
			PPOutputSink buffer) ;


	public abstract void parseBuiltinPreamble(PPOutputSink buffer, ITokenTable tokenTable, SymbolTable builtinSymbols);

	public abstract Vocabulary getVocabulary();


	public InternalResourceManager getBuiltinResourceManager() {
		return INTERNAL_RESOURCE_MANAGER;
	}


	public Preprocessor setupPreprocessing(Resource resource, ShaderType shaderType,
			PPOutputSink buffer) {
		Preprocessor pp = new Preprocessor(compiler, EMPTY_FEATURESET, new Resource[]{resource}, shaderType, buffer);
		
		pp.addDefine(shaderType.name());
		
		pp.setResourceManager(INTERNAL_RESOURCE_MANAGER);
		pp.setErrorHandler(INTERNAL_ERROR_HANDLER);
		pp.enableInclude(true);
		pp.enableLineDirectiveInsertion(false);
		return pp;
	}


	public GLSLTokenTable getTokenTable(GLSLVersion version) {
		GLSLTokenTable table = TOKEN_TABLE_CACHE.get(version);
		if (table == null) {
			// cache miss -> create new
			table = new GLSLTokenTable(version, this);
			TOKEN_TABLE_CACHE.put(version, table);
		}
		return table;
	}

	/** for testing purposes only (who would've thought!)*/
	public GLSLTokenTable getTestTokenTable(GLSLVersion version) {
		return getTokenTable(version);
	}


	public WorkingSet createWorkingSet(GLSLBuiltin builtin) {
		BuiltinScope builtinSymbols = builtin.getBuiltinScope();
		GLSLTokenTable builtinTokens = builtin.getTokenTable();
		ExtendableTokenTable tokenTable = new ExtendableTokenTable(builtinTokens, builtinSymbols.getExtensions());
		return new WorkingSet(builtin.getVersion(), builtin.getShaderType(), builtinSymbols, tokenTable, builtin.getBuiltinMacros());
	}

	public GLSLBuiltin getBuiltins(GLSLVersion version, ShaderType type) {
		GLSLBuiltin.Key key = new GLSLBuiltin.Key(version, type);
		GLSLBuiltin result = BUILTIN_SYMBOLS_CACHE.get(key);
		if (result == null) {
			result = loadBuiltins(key);
			BUILTIN_SYMBOLS_CACHE.put(key, result);
		}
		return result;
	}


	protected GLSLBuiltin loadBuiltins(Key key) {
		InternalResourceManager resourceManager = getBuiltinResourceManager();
		Resource resource;
		try {
			resource = resourceManager.resolve(key.version.profile, key.version.number, "preamble.glsl");
		} catch (IOException e) {
			throw new Error("internal error: cant parse preamble. GLSLVersion parser should have avoided this case.", e);
		}
		
		PPOutputSink buffer = createPreprocessorSink();

		HashMap<String, Macro> builtinMacros = preprocessBuiltinPreamble(resource, key.version, key.shaderType, buffer);
		addCommonBuiltinMacros(builtinMacros);

		GLSLTokenTable tokenTable = getTokenTable(key.version);
		SymbolTable builtinSymbols = createMinimumBuiltinSymbols(tokenTable);

		parseBuiltinPreamble(buffer, tokenTable, builtinSymbols);

		GLSLBuiltin builtin = new GLSLBuiltin(key, builtinMacros, builtinSymbols.getTopLevelScope(), tokenTable);
		return builtin;
	}
	
	public HashMap<String, Macro> getDefaultBuiltinMacros() {
		HashMap<String, Macro> builtinMacros = new HashMap<String, Macro>();
		addCommonBuiltinMacros(builtinMacros);
		return builtinMacros;
	}

	
	/** 
	 * This is for testing purposes only! 
	 * It circumvents parsing of the builtin preambles, 
	 * and registers builtin types only.
	 */
	public GLSLBuiltin getTestBuiltins(GLSLVersion version) {
		GLSLTokenTable tokens = getTokenTable(version);
		Key key = new Key(tokens.getVersion(), ShaderType.GENERIC_SHADER);
		SymbolTable builtinSymbols = createMinimumBuiltinSymbols(tokens);
		GLSLBuiltin builtin = new GLSLBuiltin(key, getDefaultBuiltinMacros(), builtinSymbols.getTopLevelScope(), tokens);
		return builtin;
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

	

	public static Macro createMacro(String name, Token v) {
		Macro macro = new Macro(name, Interval.NONE);
		NodeList<Node> nodes = new NodeList<Node>();
		nodes.add(v);
		macro.setReplacementList(nodes);
		return macro;
	}


	
}
