package org.cakelab.glsl.lang.lexer.tokens;

import java.util.HashMap;
import java.util.HashSet;



public class GLSLTokenTable {
	public static final boolean DEBUG = true;
	public static final int DEFAULT_GLSL_VERSION = 110;
	
	// TODO: combine with AST builtin type entries

	public static final GLSLPunctuators COMMON_PUNCTUATORS = new GLSLPunctuators();
	public static final HashMap<Integer, Class<? extends GLSLTokenTable>> lookup = new HashMap<Integer, Class<? extends GLSLTokenTable>>();
	
	static {
		// OpenGL ES exclusive GLSL versions: 100, 300, 310
		register(100, GLSL_ES_TokenTable_V_100.class);
		register(300, GLSL_ES_TokenTable_V_300.class);
		register(310, GLSL_ES_TokenTable_V_310.class);
		
		// Standard OpenGL GLSL versions
		register(110, GLSLTokenTable_V_110.class);
		register(120, GLSLTokenTable_V_120.class);
		register(450, GLSLTokenTable_V_450.class);
	}
	
	public static GLSLTokenTable get(int version) {
		Class<? extends GLSLTokenTable> clazz = lookup.get(version);
		try {
			GLSLTokenTable instance = clazz.newInstance();
			assert instance.getGLSLVersionNumber() == version;
			return instance;
		} catch (NullPointerException | InstantiationException | IllegalAccessException e) {
			throw new InternalError("failed to create a token lookup table for glsl version " + version + ".", e);
		}
	}
	
	
	

	private static void register(int glslVersion, Class<? extends GLSLTokenTable> clazz) {
		if (DEBUG) {
			try {
				clazz.newInstance();
			} catch(Throwable t) {
				throw new InternalError("Implementations of " + GLSLTokenTable.class.getCanonicalName() + " require a default constructor");
			}
		}
		lookup.put(glslVersion, clazz);
	}



	protected int version;
	
	
	protected HashMap<String, Integer> punctuators;
	protected HashMap<String, Integer> builtinTypes;
	protected HashSet<String> reserved;
	protected HashMap<String, Integer> language;

	protected GLSLTokenTable(int version) {
		this.version = version;
		punctuators = COMMON_PUNCTUATORS;
		builtinTypes = new HashMap<String, Integer>();
		reserved = new HashSet<String>();
		language = new HashMap<String, Integer>();
	}
	
	private int getGLSLVersionNumber() {
		return version;
	}
	
	public Integer getPunctuator(String text) {
		return punctuators.get(text);
	}
	
	public boolean isPunctuator(String text) {
		return punctuators.containsKey(text);
	}
	
	protected void addBuiltinType(GLSLParserToken parserToken) {
		assert validateAdd(parserToken, false);
		builtinTypes.put(parserToken.text, parserToken.type);
	}

	public boolean isBuiltinType(String text) {
		return builtinTypes.containsKey(text);
	}
	
	public int mapBuiltintType(String ident) {
		return builtinTypes.get(ident);
	}

	
	protected void addReservedKeyword(GLSLParserToken parserToken) {
		assert validateAdd(parserToken, true);
		reserved.add(parserToken.text);
	}

	public boolean isReservedKeyword(String text) {
		return reserved.contains(text);
	}
	
	protected void addKeyword(GLSLParserToken parserToken) {
		assert validateAdd(parserToken, false);
		language.put(parserToken.text, parserToken.type);
	}
	

	public Integer mapLanguageKeyword(String text) {
		return language.get(text);
	}

	public boolean isLanguageKeyword(String text) {
		return language.containsKey(text);
	}

	
	
	private boolean validateAdd(GLSLParserToken parserToken, boolean isReserved) {
		assert(!punctuators.containsKey(parserToken.text));
		assert(!language.containsKey(parserToken.text));
		assert(!builtinTypes.containsKey(parserToken.text));
		assert(!reserved.contains(parserToken.text));
		assert(isReserved || (parserToken.type != GLSLLanguageTokens.RESERVED_KEYWORD));
		return true;
	}




	public static GLSLTokenTable getDefault() {
		return get(DEFAULT_GLSL_VERSION);
	}





	
}
