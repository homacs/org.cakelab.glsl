package org.cakelab.glsl.lang.lexer.tokens;

import java.util.HashMap;

@SuppressWarnings("serial")
public class GLSLPunctuators extends HashMap<String, Integer> {
	public GLSLPunctuators() {
		add(GLSLLanguageTokens.LEFT_OP);
		add(GLSLLanguageTokens.RIGHT_OP);
		add(GLSLLanguageTokens.INC_OP);
		add(GLSLLanguageTokens.DEC_OP);
		add(GLSLLanguageTokens.LE_OP);
		add(GLSLLanguageTokens.GE_OP);
		add(GLSLLanguageTokens.EQ_OP);
		add(GLSLLanguageTokens.NE_OP);
		add(GLSLLanguageTokens.AND_OP);
		add(GLSLLanguageTokens.OR_OP);
		add(GLSLLanguageTokens.XOR_OP);
		add(GLSLLanguageTokens.MUL_ASSIGN);
		add(GLSLLanguageTokens.DIV_ASSIGN);
		add(GLSLLanguageTokens.ADD_ASSIGN);
		add(GLSLLanguageTokens.MOD_ASSIGN);
		add(GLSLLanguageTokens.LEFT_ASSIGN);
		add(GLSLLanguageTokens.RIGHT_ASSIGN);
		add(GLSLLanguageTokens.AND_ASSIGN);
		add(GLSLLanguageTokens.XOR_ASSIGN);
		add(GLSLLanguageTokens.OR_ASSIGN);
		add(GLSLLanguageTokens.SUB_ASSIGN);
		add(GLSLLanguageTokens.LEFT_PAREN);
		add(GLSLLanguageTokens.RIGHT_PAREN);
		add(GLSLLanguageTokens.LEFT_BRACKET);
		add(GLSLLanguageTokens.RIGHT_BRACKET);
		add(GLSLLanguageTokens.LEFT_BRACE);
		add(GLSLLanguageTokens.RIGHT_BRACE);
		add(GLSLLanguageTokens.DOT);
		add(GLSLLanguageTokens.COMMA);
		add(GLSLLanguageTokens.COLON);
		add(GLSLLanguageTokens.EQUAL);
		add(GLSLLanguageTokens.SEMICOLON);
		add(GLSLLanguageTokens.BANG);
		add(GLSLLanguageTokens.DASH);
		add(GLSLLanguageTokens.TILDE);
		add(GLSLLanguageTokens.PLUS);
		add(GLSLLanguageTokens.STAR);
		add(GLSLLanguageTokens.SLASH);
		add(GLSLLanguageTokens.PERCENT);
		add(GLSLLanguageTokens.LEFT_ANGLE);
		add(GLSLLanguageTokens.RIGHT_ANGLE);
		add(GLSLLanguageTokens.VERTICAL_BAR);
		add(GLSLLanguageTokens.CARET);
		add(GLSLLanguageTokens.AMPERSAND);
		add(GLSLLanguageTokens.QUESTION);
	}

	private void add(GLSLParserToken token) {
		put(token.text, token.type);
	}
}
