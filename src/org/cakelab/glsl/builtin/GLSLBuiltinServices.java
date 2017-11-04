package org.cakelab.glsl.builtin;

import java.util.HashMap;

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
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.lang.lexer.tokens.ITokenTable;
import org.cakelab.glsl.lang.lexer.tokens.Vocabulary;
import org.cakelab.glsl.pp.PPOutputSink;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.ast.NodeList;
import org.cakelab.glsl.pp.error.SyntaxError;
import org.cakelab.glsl.pp.tokens.Token;

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
	public static final BuiltinResourceManager BUILTIN_RESOURCE_MANAGER;
	static {
		INTERNAL_ERROR_HANDLER = new InternalErrorHandler();
		String directory = GLSLBuiltinServices.class.getPackage().getName().replace('.', '/');
		BUILTIN_RESOURCE_MANAGER = new BuiltinResourceManager(directory);
		INTERNAL_ERROR_HANDLER.setResourceManager(BUILTIN_RESOURCE_MANAGER);
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
	private GLSLCompiler compiler;

	
	
	public GLSLBuiltinServices(GLSLCompiler compiler) {
		this.compiler = compiler;
	}
	
	
	public abstract PPOutputSink createPreprocessorSink(ResourceManager resourceManager);


	public abstract HashMap<String, Macro> preprocessBuiltinPreamble(Resource resource, GLSLVersion version, ShaderType shaderType,
			PPOutputSink buffer) ;


	public abstract void parseBuiltinPreamble(PPOutputSink buffer, ITokenTable tokenTable, SymbolTable builtinSymbols);

	
	public Preprocessor setupPreprocessing(Resource resource, ShaderType shaderType,
			PPOutputSink buffer) {
		Preprocessor pp = new Preprocessor(compiler, EMPTY_FEATURESET, new Resource[]{resource}, shaderType, buffer);
		
		pp.addDefine(shaderType.name());
		
		pp.setResourceManager(BUILTIN_RESOURCE_MANAGER);
		pp.setErrorHandler(INTERNAL_ERROR_HANDLER);
		pp.enableInclude(true);
		pp.enableLineDirectiveInsertion(false);
		return pp;
	}


	public abstract Vocabulary getVocabulary();

	public GLSLBuiltin getBuiltins(GLSLVersion version, ShaderType type) {
		return GLSLBuiltin.getBuiltins(version, type);
	}



	public BuiltinResourceManager getBuiltinResourceManager() {
		return BUILTIN_RESOURCE_MANAGER;
	}

	public static Macro createMacro(String name, Token v) {
		Macro macro = new Macro(name, Interval.NONE);
		NodeList<Node> nodes = new NodeList<Node>();
		nodes.add(v);
		macro.setReplacementList(nodes);
		return macro;
	}


	
}
