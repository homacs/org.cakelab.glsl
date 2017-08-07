package org.cakelab.glsl.test.pp;

import java.io.ByteArrayInputStream;
import org.cakelab.glsl.pp.ExpressionParser;
import org.cakelab.glsl.pp.Lexer;
import org.cakelab.glsl.pp.Parser;

public class TestingExprBase extends TestingParserBase {

	public Parser p(String source) {
		try {
			error = null;
			warning = null;
			parser = new ExpressionParser(new Lexer("0", new ByteArrayInputStream(source.getBytes())), errorHandler);
		} catch (Throwable e) {
			// will never happen
			throw new Error(e);
		}
		return parser;
	}

	public ExpressionParser expr(String source) {
		return (ExpressionParser)p(source);
	}



}
