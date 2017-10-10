package org.cakelab.glsl.builtin;

import java.io.InputStream;
import java.util.HashMap;

import org.cakelab.glsl.GLSLParser;
import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.GLSLVersion.Profile;
import org.cakelab.glsl.lang.lexer.tokens.GLSLKeywords;
import org.cakelab.glsl.lang.lexer.tokens.GLSLPunctuators;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.scanner.StreamScanner;
import org.cakelab.glsl.util.ObjectCache;



public class GLSLTokenTable {
	public static final boolean DEBUG = true;
	/**
	 * In case no #version directive was given, GLSL always assumes v1.10 core.
	 */
	public static final GLSLVersion DEFAULT_GLSL_VERSION = new GLSLVersion(null, 110, GLSLVersion.Profile.core);
	
	/**
	 * A cache for instantiated (used) token tables.
	 * <p>
	 * Usually a particular parse for a given glsl file will require
	 * at least two token tables: the default 110 will be instantiated 
	 * at the start and a specific may be selected by <code>#version</code>.
	 * 
	 * When reusing an instance of a language parser for different files,
	 * we might have to switch between the same token tables multiple times, but
	 * the set of used tables will still be small in a single project.
	 */
	public static final ObjectCache<GLSLVersion, GLSLTokenTable> cache = new ObjectCache<GLSLVersion, GLSLTokenTable>(4);
	
	
	// TODO: combine with AST builtin type entries

	public static final GLSLPunctuators COMMON_PUNCTUATORS = new GLSLPunctuators();
	
	public static GLSLTokenTable get(GLSLVersion version) {
		GLSLTokenTable table = cache.get(version);
		if (table == null) {
			// cache miss -> create new
			table = new GLSLTokenTable(version);
			cache.put(version, table);
		}
		return table;
	}
	
	
	protected GLSLVersion version;
	
	
	protected HashMap<String, Integer> keywords;
	protected HashMap<String, Integer> reserved;
	protected HashMap<String, Integer> builtinTypes;
	protected HashMap<String, Integer> punctuators = COMMON_PUNCTUATORS;

	protected GLSLTokenTable(GLSLVersion version) {
		this.version = version;
		punctuators = COMMON_PUNCTUATORS;
		builtinTypes = new HashMap<String, Integer>();
		reserved = new HashMap<String, Integer>();
		keywords = new HashMap<String, Integer>();
		
		//
		// Initialise token type tables
		//
		Profile profile = version.profile;
		switch(version.profile) {
		case compatibility:
			profile = Profile.core;
			break;
		case core:
		case es:
			break;
		default:
			throw new Error("internal error: unknown profile '" + profile.name() + "'");
		
		}
		InputStream in = BuiltinLoaderHelper.getInputStream(version.number, profile, "keywords.txt");
		readKeywordList(in, false);
		
		in = BuiltinLoaderHelper.getInputStream(version.number, profile, "reserved.txt");
		readKeywordList(in, true);

		//
		// Validate content
		//
		
		assert !keywords.isEmpty() : "keyword list for version " + version + " is empty";
		assert !reserved.isEmpty() : "reserved keyword list for version " + version + " is empty";
		assert !builtinTypes.isEmpty() : "builtin types list for version " + version + " is empty";
		assert !punctuators.isEmpty() : "punctuators list for version " + version + " is empty";
	}
	

	private void readKeywordList(InputStream in, boolean reservedKeywords) {
		StreamScanner scanner = new StreamScanner("-- keyword list --", in);
		StringBuffer s = new StringBuffer();
		do {
			// remove all whitespace
			while (isWhite(scanner.LA1())) scanner.consume();

			// read keyword
			while(!isWhite(scanner.LA1()) && scanner.LA1() != IScanner.EOF) {
				s.append((char)scanner.consume());
			}
			if (s.length() > 0) {
				String keyword = s.toString();
				s.delete(0, s.length());
				
				if (GLSLKeywords.contains(keyword)) {
					int type = GLSLKeywords.getTokenType(keyword);
					if (reservedKeywords) {
						// reserved keywords:
						// TODO: maybe accept unknown reserved keywords as well
						reserved.put(keyword, type);
						
						// do cross checking
						assert (!builtinTypes.containsKey(keyword)) && (!keywords.containsKey(keyword));
					} else if (type == GLSLParser.BUILTIN_TYPE) {
						builtinTypes.put(keyword, type);
					} else {
						keywords.put(keyword, type);
					}
				} else {
					throw new Error("internal error: unrecognized keyword '" + keyword + "' for glsl version '" + version + "'");
				}
			}
		} while(scanner.LA1() != IScanner.EOF);
	}


	private static boolean isWhite(int la1) {
		return la1 == '\n' || la1 == '\r' || la1 == '\t' || la1 == ' ';
	}

	
	
	
	
	public Integer getPunctuator(String text) {
		return punctuators.get(text);
	}
	
	public boolean isPunctuator(String text) {
		return punctuators.containsKey(text);
	}
	
	public boolean isBuiltinType(String text) {
		return builtinTypes.containsKey(text);
	}
	
	public int mapBuiltintType(String ident) {
		return builtinTypes.get(ident);
	}

	
	public boolean isReservedKeyword(String text) {
		return reserved.containsKey(text);
	}
	

	public Integer mapLanguageKeyword(String text) {
		return keywords.get(text);
	}

	public boolean isLanguageKeyword(String text) {
		return keywords.containsKey(text);
	}
	



	public static GLSLTokenTable getDefault() {
		return get(DEFAULT_GLSL_VERSION);
	}


	public GLSLVersion getVersion() {
		return version;
	}





	
}
