package org.cakelab.glsl.lang.lexer.tokens;

import java.util.HashMap;
import java.util.HashSet;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.util.SimpleArrayList;
import org.cakelab.glsl.util.SimpleArrayList.Comparator;



public class GLSLTokenTable {
	// TODO: All token mappings (string: code) have to be defined as global constants
	// TODO: instantiate on demand (no constant globals)
	// TODO: combine with AST builtin type entries

	public static final GLSLPunctuators COMMON_PUNCTUATORS = new GLSLPunctuators();
	
	
	
	
	// OpenGL ES exclusive versions: 100, 300, 310
	public static final GLSLTokenTable V_100 = new GLSL_ES_TokenTable_V_100();
	public static final GLSLTokenTable V_300 = new GLSL_ES_TokenTable_V_300(V_100);

	public static final GLSLTokenTable V_110 = new GLSLTokenTable_V_110();
	public static final GLSLTokenTable V_450 = new GLSLTokenTable_V_450(V_110);
	public static final GLSLTokenTable DEFAULT = V_110;

	public static final SimpleArrayList<GLSLTokenTable> lookup = new SimpleArrayList<GLSLTokenTable>();
	private static final Comparator<Integer, GLSLTokenTable> comparator = new Comparator<Integer, GLSLTokenTable>() {

		@Override
		public int compare(Integer key, GLSLTokenTable table) {
			return key - table.version;
		}
		
	};
	
	static {
		lookup.add(V_100);
		lookup.add(V_110);
		lookup.add(V_450);
	}
	
	public static GLSLTokenTable get(GLSLVersion version) {
		int index = lookup.find(version.number, comparator);
		return lookup.get(index);
	}
	
	
	
	protected int version;
	
	
	protected HashMap<String, Integer> punctuators;
	protected HashSet<String> builtinTypes;
	protected HashSet<String> reserved;
	protected HashMap<String, Integer> language;

	@SuppressWarnings("unchecked")
	protected GLSLTokenTable(int version) {
		this.version = version;
		punctuators = (HashMap<String, Integer>) COMMON_PUNCTUATORS.clone();
		builtinTypes = new HashSet<String>();
		reserved = new HashSet<String>();
		language = new HashMap<String, Integer>();
	}
	
	@SuppressWarnings("unchecked")
	protected GLSLTokenTable(int version, GLSLTokenTable base) {
		this.version = version;
		this.punctuators = (HashMap<String, Integer>) base.punctuators.clone();
		this.builtinTypes = (HashSet<String>) base.builtinTypes.clone();
		this.language = (HashMap<String, Integer>) base.language.clone();
		this.reserved = (HashSet<String>) base.reserved.clone();
	}
	
	
	public Integer getPunctuator(String text) {
		return punctuators.get(text);
	}
	
	public boolean isPunctuator(String text) {
		return punctuators.containsKey(text);
	}
	
	public boolean isBuiltinType(String text) {
		return builtinTypes.contains(text);
	}
	
	public boolean isReservedKeyword(String text) {
		return reserved.contains(text);
	}
	
	public Integer getLanguageKeyword(String text) {
		return language.get(text);
	}

	public boolean isLanguageKeyword(String text) {
		return language.containsKey(text);
	}

	
	
	protected static void move(String token, HashMap<String, Integer> source, HashSet<String> target) {
		source.remove(token);
		target.add(token);
	}

	
}
