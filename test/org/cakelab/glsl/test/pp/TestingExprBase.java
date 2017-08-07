package org.cakelab.glsl.test.pp;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;

import org.cakelab.glsl.pp.ExpressionParser;
import org.cakelab.glsl.pp.Scanner;
import org.cakelab.glsl.pp.Parser;

public class TestingExprBase extends TestingParserBase {

	public Parser p(String source) {
		try {
			error = null;
			warning = null;
			parser = new ExpressionParser(new Scanner("0", new ByteArrayInputStream(source.getBytes())), errorHandler);
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
