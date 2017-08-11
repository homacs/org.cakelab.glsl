package org.cakelab.glsl.test.pp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import org.cakelab.glsl.pp.Parser;
import org.cakelab.glsl.pp.PreprocessedOutput;
import org.cakelab.glsl.pp.PreprocessedOutputBuffer;
import org.cakelab.glsl.pp.Preprocessor;

public class TestingPPBase extends TestingBase {

	public Parser p(String source, OutputStream out) {
		try {
			error = null;
			warning = null;
			if (usePPBuffer) {
				ByteArrayOutputStream outStream;
				if (out instanceof ByteArrayOutputStream) {
					outStream = (ByteArrayOutputStream) out;
				} else {
					outStream = new ByteArrayOutputStream();
				}
				parser = new Preprocessor("0", new ByteArrayInputStream(source.getBytes()), new PreprocessedOutputBuffer(outStream));
			} else {
				parser = new Preprocessor("0", new ByteArrayInputStream(source.getBytes()), output(out));
			}
			parser.setErrorHandler(errorHandler);
		} catch (Throwable e) {
			// will never happen
			throw new Error(e);
		}
		return parser;
	}


	



}
