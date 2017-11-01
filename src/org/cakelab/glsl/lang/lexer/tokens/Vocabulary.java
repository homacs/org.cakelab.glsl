package org.cakelab.glsl.lang.lexer.tokens;

import java.util.HashMap;

public abstract class Vocabulary {
	private static Vocabulary vocabulary = new ANTLRVocabulary();

	public static void setVocabulary(Vocabulary vocabulary) {
		Vocabulary.vocabulary = vocabulary;
	}

	public static HashMap<String, Integer> getPunctuators() {
		return vocabulary.punctuators();
	}
	
	public static Integer getBuiltinType() {
		return vocabulary.builtintype();
	}
	public static Integer getKeyword(String keyword) {
		return vocabulary.keyword(keyword);
	}


	
	
	
	
	public abstract HashMap<String, Integer> punctuators();
	
	public abstract Integer keyword(String text);

	public abstract Integer builtintype();

	
	
}
