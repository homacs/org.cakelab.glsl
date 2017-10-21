package org.cakelab.glsl.builtin;

import java.io.InputStream;
import java.util.BitSet;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.cakelab.glsl.GLSLErrorHandler;
import org.cakelab.glsl.GLSLParser;
import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionLoading;
import org.cakelab.glsl.lang.ASTBuilder;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.lang.lexer.GLSL_ANTLR_PPOutputBuffer;
import org.cakelab.glsl.lang.lexer.PPTokenStream;
import org.cakelab.glsl.lang.lexer.tokens.ITokenTable;
import org.cakelab.glsl.lang.lexer.tokens.PPOutputToken;
import org.cakelab.glsl.pp.LocationMap;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.error.SyntaxError;



public class BuiltinLoaderHelper {
	
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
	private static class InternalErrorHandler implements GLSLErrorHandler {

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
		public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
				String msg, RecognitionException e) {
			PPOutputToken token = (PPOutputToken) offendingSymbol;
			throw new Error("internal error: " + toString(token.getPPToken().getStart(), msg));
		}

		@Override
		public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact,
				BitSet ambigAlts, ATNConfigSet configs) {
			throw new Error("internal error: reported ambiguity");
			
		}

		@Override
		public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
				BitSet conflictingAlts, ATNConfigSet configs) {
			throw new Error("internal error: reported attempt of full context");
		}

		@Override
		public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction,
				ATNConfigSet configs) {
			throw new Error("internal error: reported context sensitivity");
		}

		@Override
		public void setResourceManager(ResourceManager resources) {
			this.resources = resources;
		}

		@Override
		public void setLocations(TokenStream tokens, LocationMap locations) {
			// not required
		}

		@Override
		public void error(ParseTree node, String message) {
			throw new Error("internal error: " + toString(getLocation(node), message));
		}

		private Location getLocation(ParseTree node) {
			if (node instanceof TerminalNode) {
				PPOutputToken token = ((PPOutputToken)(((TerminalNode)node).getSymbol()));
				return token.getPPToken().getStart();
			} else if (node.getChildCount() > 0) {
				return getLocation(node.getChild(0));
			} else {
				return null;
			}
		}
		
	}
	
	static final String DIRECTORY;
	static final ClassLoader CLASSLOADER;

	static final InternalErrorHandler INTERNAL_ERROR_HANDLER;
	public static final BuiltinResourceManager BUILTIN_RESOURCE_MANAGER;

	
	static {
		DIRECTORY = BuiltinLoaderHelper.class.getPackage().getName().replace('.', '/');
		CLASSLOADER = BuiltinLoaderHelper.class.getClassLoader();
		INTERNAL_ERROR_HANDLER = new InternalErrorHandler();
		BUILTIN_RESOURCE_MANAGER = new BuiltinResourceManager(BuiltinLoaderHelper.getBaseDirectory());
		INTERNAL_ERROR_HANDLER.setResourceManager(BUILTIN_RESOURCE_MANAGER);
	}
	
	
	
	

	public static InputStream getInputStream(GLSLVersion version, String filename) {
		return getInputStream(version.number, version.profile, filename);
	}

	public static InputStream getInputStream(int version, GLSLVersion.Profile profile, String filename) {
		String url = getResourceDirectory(version, profile) + "/" + filename;
		InputStream in = CLASSLOADER.getResourceAsStream(url);
		if (in == null) throw new Error("internal error: missing version specific file '" + url + "'. Preprocessor is supposed to prevent this from happening.");
		return in;
	}

	public static String getResourceDirectory(int version, GLSLVersion.Profile profile) {
		return DIRECTORY + "/" + profile.name() + "/V" + version;
	}

	public static String getResourceDirectory(GLSLVersion version) {
		return getResourceDirectory(version.number, version.profile);
	}

	public static String getBaseDirectory() {
		return DIRECTORY;
	}

	public static String getExtensionDirectory(String extension) {
		return DIRECTORY + "/extensions/" + extension;
	}




	public static Preprocessor setupPreprocessing(Resource resource, ShaderType shaderType,
			GLSL_ANTLR_PPOutputBuffer buffer) {
		Preprocessor pp = new Preprocessor(resource, shaderType, buffer);
		
		pp.addDefine(shaderType.name());
		
		pp.setResourceManager(BUILTIN_RESOURCE_MANAGER);
		pp.setErrorHandler(INTERNAL_ERROR_HANDLER);
		pp.enableInclude(true);
		pp.enableLineDirectiveInsertion(false);
		return pp;
	}

	/**
	 * Not intended to be used by customised extension loaders. Please use {@link GLSLExtensionLoading#parseExtensionPreamble} instead
	 * @param buffer
	 * @param tokenTable
	 * @param symbolTable
	 */
	public static void parsePreamble(GLSL_ANTLR_PPOutputBuffer buffer, ITokenTable tokenTable,
			SymbolTable symbolTable) {
		
		
		PPTokenStream tokens = new PPTokenStream(buffer, tokenTable, symbolTable, INTERNAL_ERROR_HANDLER);
		INTERNAL_ERROR_HANDLER.setLocations(tokens, buffer.getLocations());
		ASTBuilder astBuilder = new ASTBuilder(tokens, buffer.getLocations(), symbolTable, INTERNAL_ERROR_HANDLER);
		
		GLSLParser parser = new GLSLParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(INTERNAL_ERROR_HANDLER);
		parser.addParseListener(astBuilder);
		
		parser.glsl();
	}


}
