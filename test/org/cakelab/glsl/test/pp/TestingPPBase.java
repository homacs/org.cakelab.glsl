package org.cakelab.glsl.test.pp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import org.cakelab.glsl.pp.Parser;
import org.cakelab.glsl.pp.PreprocessedOutputBuffer;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.lexer.PPLexer;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.scanner.StreamScanner;

public class TestingPPBase extends TestingBase {

	public Parser p(String source, OutputStream out) {
		try {
			error = null;
			warning = null;
			IScanner scanner = new StreamScanner("0", new ByteArrayInputStream(source.getBytes()));
			PPLexer pplexer = new PPLexer(scanner);
			if (usePPBuffer) {
				ByteArrayOutputStream outStream;
				if (out instanceof ByteArrayOutputStream) {
					outStream = (ByteArrayOutputStream) out;
				} else {
					outStream = new ByteArrayOutputStream();
				}
				parser = new Preprocessor(pplexer, new PreprocessedOutputBuffer(outStream));
			} else {
				parser = new Preprocessor(pplexer, output(out));
			}
			parser.setErrorHandler(errorHandler);
		} catch (Throwable e) {
			// will never happen
			throw new Error(e);
		}
		return parser;
	}


	



}
