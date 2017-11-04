package org.cakelab.glsl.builtin;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;

import org.cakelab.glsl.GLSLCompiler;
import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.GLSLVersion.Profile;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.lang.lexer.tokens.ITokenTable;
import org.cakelab.glsl.lang.lexer.tokens.Vocabulary;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.scanner.StreamScanner;
import org.cakelab.glsl.util.ObjectCache;



public class GLSLTokenTable implements ITokenTable {
	
	

	public static class KeywordStreamIterator implements Iterator<String> {

		private StreamScanner scanner;
		private StringBuffer s;
		private String word;

		public KeywordStreamIterator(InputStream in) {
			scanner = new StreamScanner("-- word list --", in);
			s = new StringBuffer();
			nextToken();
		}

		private void nextToken() {
			word = null;
			do {
				// remove all whitespace
				while (isWhite(scanner.LA1())) scanner.consume();

				// read keyword
				while(!isWhite(scanner.LA1()) && scanner.LA1() != IScanner.EOF) {
					s.append((char)scanner.consume());
				}
				if (s.length() > 0) {
					word = s.toString();
					// clear buffer
					s.delete(0, s.length());
					break;
				}
			} while(scanner.LA1() != IScanner.EOF);
		}
		
		private static boolean isWhite(int la1) {
			return la1 == '\n' || la1 == '\r' || la1 == '\t' || la1 == ' ';
		}


		@Override
		public boolean hasNext() {
			return word != null;
		}

		@Override
		public String next() {
			String result = word;
			nextToken();
			return result;
		}

	}

	
	
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
	
	
	static GLSLTokenTable getTokenTable(GLSLVersion version) {
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
	protected HashMap<String, Integer> punctuators;

	protected GLSLTokenTable(GLSLVersion version) {
		this.version = version;
		GLSLBuiltinServices builtinService = GLSLCompiler.getActiveCompilerImpl().getBuiltinServices();
		BuiltinResourceManager resourceManager = builtinService.getBuiltinResourceManager();
		
		Vocabulary vocabulary = builtinService.getVocabulary();
		
		punctuators = vocabulary.punctuators();;
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
		try {
			InputStream in = resourceManager.resolve(profile, version.number, "keywords.txt").openInputStream();
		
			readKeywordList(vocabulary, in, false);
			in.close();
			
			in = resourceManager.resolve(profile, version.number, "reserved.txt").openInputStream();
			readKeywordList(vocabulary, in, true);
			in.close();
		} catch (IOException e) {
			throw new Error("internal error: while loading token table for GLSL version " + version.toString(), e);
		}

		//
		// Validate content
		//
		
		assert !keywords.isEmpty() : "keyword list for version " + version + " is empty";
		assert !reserved.isEmpty() : "reserved keyword list for version " + version + " is empty";
		assert !builtinTypes.isEmpty() : "builtin types list for version " + version + " is empty";
		assert !punctuators.isEmpty() : "punctuators list for version " + version + " is empty";
	}
	

	protected void readKeywordList(Vocabulary vocabulary, InputStream in, boolean reservedKeywords) {
		
		KeywordStreamIterator iterator = new KeywordStreamIterator(in);
		
		while(iterator.hasNext()) {
			String keyword = iterator.next();
			Integer vocable = vocabulary.keyword(keyword);
			if (vocable != null) {
				int type = vocable;
				if (reservedKeywords) {
					// reserved keywords:
					// TODO: maybe accept unknown reserved keywords as well
					reserved.put(keyword, type);
					
					// do cross checking
					assert (!builtinTypes.containsKey(keyword)) && (!keywords.containsKey(keyword));
				} else {
					keywords.put(keyword, type);
					if (Type.isBuiltinType(keyword)) builtinTypes.put(keyword, type);
				}
			} else {
				throw new Error("internal error: unrecognized keyword '" + keyword + "' for glsl version '" + version + "'");
			}
		}
	}

	
	
	
	public Integer mapPunctuator(String text) {
		return punctuators.get(text);
	}
	
	public boolean isPunctuator(String text) {
		return punctuators.containsKey(text);
	}
	
	public boolean isBuiltinType(String text) {
		return builtinTypes.containsKey(text);
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
	


	public GLSLVersion getVersion() {
		return version;
	}


	/** for testing purposes only (who would've thought!)*/
	public static GLSLTokenTable getTestTokenTable(GLSLVersion version) {
		return getTokenTable(version);
	}





	
}
