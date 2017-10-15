package org.cakelab.glsl.builtin.extensions;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;

import org.cakelab.glsl.builtin.GLSLTokenTable;
import org.cakelab.glsl.lang.lexer.tokens.GLSLKeywords;
import org.cakelab.glsl.lang.lexer.tokens.ITokenTable;

public class KeywordTable implements ITokenTable {

	HashMap<String, Integer> keywords = new HashMap<String, Integer>();
	
	public KeywordTable(InputStream keywordStream) {
		
		Iterator<String> iterator = new GLSLTokenTable.KeywordStreamIterator(keywordStream);
		
		while(iterator.hasNext()) {
			String keyword = iterator.next();
			keywords.put(keyword, GLSLKeywords.getTokenType(keyword));
		}


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

}
