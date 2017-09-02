package org.cakelab.glsl.test.pp;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;

import org.cakelab.glsl.pp.ExpressionParser;
import org.cakelab.glsl.pp.Parser;
import org.cakelab.glsl.pp.lexer.PPLexer;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.scanner.StreamScanner;

public class TestingExprBase extends TestingBase {

	public Parser p(String source) {
		try {
			IScanner scanner = new StreamScanner("0", new ByteArrayInputStream(source.getBytes()));
			PPLexer pplexer = new PPLexer(scanner);
			error = null;
			warning = null;
			parser = new ExpressionParser(pplexer);
			parser.setErrorHandler(errorHandler);
		} catch (Throwable e) {
			// will never happen
			throw new Error(e);
		}
		return parser;
	}

	public ExpressionParser expr(String source) {
		return (ExpressionParser)p(source);
	}

	@Override
	public Parser p(String source, OutputStream out) {
		return p(source);
	}



}
