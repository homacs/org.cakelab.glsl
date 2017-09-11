package org.cakelab.glsl.lang.lexer.tokens;

import java.util.HashMap;

import org.cakelab.glsl.GLSLParser;

@SuppressWarnings("serial")
public class GLSLPunctuators extends HashMap<String, Integer> {
	public GLSLPunctuators() {
		put("<<", GLSLParser.LEFT_OP);
		put(">>", GLSLParser.RIGHT_OP);
		put("++", GLSLParser.INC_OP);
		put("--", GLSLParser.DEC_OP);
		put("<=", GLSLParser.LE_OP);
		put(">=", GLSLParser.GE_OP);
		put("==", GLSLParser.EQ_OP);
		put("!=", GLSLParser.NE_OP);
		put("&&", GLSLParser.AND_OP);
		put("||", GLSLParser.OR_OP);
		put("^^", GLSLParser.XOR_OP);
		put("*=", GLSLParser.MUL_ASSIGN);
		put("/=", GLSLParser.DIV_ASSIGN);
		put("+=", GLSLParser.ADD_ASSIGN);
		put("%=", GLSLParser.MOD_ASSIGN);
		put("<<=", GLSLParser.LEFT_ASSIGN);
		put(">>=", GLSLParser.RIGHT_ASSIGN);
		put("&=", GLSLParser.AND_ASSIGN);
		put("^=", GLSLParser.XOR_ASSIGN);
		put("|=", GLSLParser.OR_ASSIGN);
		put("-=", GLSLParser.SUB_ASSIGN);
		put("(", GLSLParser.LEFT_PAREN);
		put(")", GLSLParser.RIGHT_PAREN);
		put("[", GLSLParser.LEFT_BRACKET);
		put("]", GLSLParser.RIGHT_BRACKET);
		put("{", GLSLParser.LEFT_BRACE);
		put("}", GLSLParser.RIGHT_BRACE);
		put(".", GLSLParser.DOT);
		put(",", GLSLParser.COMMA);
		put(":", GLSLParser.COLON);
		put("=", GLSLParser.EQUAL);
		put(";", GLSLParser.SEMICOLON);
		put("!", GLSLParser.BANG);
		put("-", GLSLParser.DASH);
		put("~", GLSLParser.TILDE);
		put("+", GLSLParser.PLUS);
		put("*", GLSLParser.STAR);
		put("/", GLSLParser.SLASH);
		put("%", GLSLParser.PERCENT);
		put("<", GLSLParser.LEFT_ANGLE);
		put(">", GLSLParser.RIGHT_ANGLE);
		put("|", GLSLParser.VERTICAL_BAR);
		put("^", GLSLParser.CARET);
		put("&", GLSLParser.AMPERSAND);
		put("?", GLSLParser.QUESTION);
	}
}
