package org.cakelab.glsl.builtin.extensions;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;

import org.cakelab.glsl.builtin.GLSLTokenTable;
import org.cakelab.glsl.lang.lexer.tokens.GLSLKeywords;
import org.cakelab.glsl.lang.lexer.tokens.ITokenTable;

public class KeywordTable implements ITokenTable {

	HashMap<String, Integer> keywords = new HashMap<String, Integer>();

	public KeywordTable() {
	}
	
	@Override
	public Integer mapPunctuator(String text) {
		return null;
	}

	@Override
	public boolean isPunctuator(String text) {
		return false;
	}

	@Override
	public boolean isLanguageKeyword(String text) {
		return keywords.containsKey(text);
	}

	@Override
	public boolean isReservedKeyword(String text) {
		return false;
	}

	@Override
	public boolean isBuiltinType(String text) {
		return isLanguageKeyword(text);
	}

	@Override
	public Integer mapLanguageKeyword(String text) {
		return keywords.get(text);
	}

	/**
	 * @param keyword
	 * @param tokenTypeCode see {@link GLSLKeywords}
	 */
	public void put(String keyword, int tokenTypeCode) {
		keywords.put(keyword, tokenTypeCode);
	}
	
	/**
	 * Creates a keyword table which maps the given keywords to the given tokenTypeCode.
	 * @param tokenTypeCode see {@link GLSLKeywords}
	 * @param keywords list of keywords
	 * @return new keyword table
	 */
	public static KeywordTable create(Integer tokenTypeCode, String ... keywords) {
		assert tokenTypeCode != null : "token type code cannot be null";
		KeywordTable table = new KeywordTable();
		for (String k : keywords) {
			table.keywords.put(k, tokenTypeCode);
		}
		return table;
	}
	

	public static KeywordTable create(String ... keywords) {
		KeywordTable table = new KeywordTable();
		for (String keyword : keywords) {
			Integer code = GLSLKeywords.getTokenType(keyword);
			assert (code != null) : "unknown keyword '" + keyword + "'";
			table.keywords.put(keyword, code);
		}
		return table;
	}
	
	public static KeywordTable create(InputStream keywordStream) {
		KeywordTable table = new KeywordTable();
		
		Iterator<String> iterator = new GLSLTokenTable.KeywordStreamIterator(keywordStream);
		
		while(iterator.hasNext()) {
			String keyword = iterator.next();
			Integer code = GLSLKeywords.getTokenType(keyword);
			assert (code != null) : "unknown keyword '" + keyword + "'";
			table.keywords.put(keyword, code);
		}

		return table;

	}



}
