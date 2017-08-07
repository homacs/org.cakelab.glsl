package org.cakelab.glsl.test.pp;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;

import org.cakelab.glsl.pp.Parser;
import org.cakelab.glsl.pp.Preprocessor;

public class TestingPPBase extends TestingParserBase {

	public Parser p(String source, OutputStream out) {
		try {
			error = null;
			warning = null;
			parser = new Preprocessor("0", new ByteArrayInputStream(source.getBytes()), output(out));
			parser.setErrorHandler(errorHandler);
		} catch (Throwable e) {
			// will never happen
			throw new Error(e);
		}
		return parser;
	}


	



}
