package org.cakelab.glsl.test.pp;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;

import org.cakelab.glsl.Resource;
import org.cakelab.glsl.lang.GLSLBuiltin.ShaderType;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.lexer.PPLexer;
import org.cakelab.glsl.pp.parser.ExpressionParser;
import org.cakelab.glsl.pp.parser.Parser;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.scanner.StreamScanner;

public class TestingExprBase extends TestingBase {

	public Parser p(String source) {
		try {
			Resource resource = new Resource("0", "-- testing --", new ByteArrayInputStream(source.getBytes()));
			PPState state = new PPState(resource, ShaderType.GENERIC_SHADER);
			state.setErrorHandler(errorHandler);
			
			IScanner scanner = new StreamScanner(resource);
			PPLexer pplexer = new PPLexer(scanner, state);
			error = null;
			warning = null;
			parser = new ExpressionParser(pplexer);
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
