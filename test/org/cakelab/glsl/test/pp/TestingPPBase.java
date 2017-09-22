package org.cakelab.glsl.test.pp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import org.cakelab.glsl.Resource;
import org.cakelab.glsl.builtin.GLSLBuiltin.ShaderType;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.output.PreprocessedOutputBuffer;
import org.cakelab.glsl.pp.parser.Parser;

public class TestingPPBase extends TestingBase {

	public Parser p(String source, OutputStream out) {
		try {
			error = null;
			warning = null;
			Resource resource = new Resource("0", "-- testing --", new ByteArrayInputStream(source.getBytes()));
			if (usePPBuffer) {
				ByteArrayOutputStream outStream;
				if (out instanceof ByteArrayOutputStream) {
					outStream = (ByteArrayOutputStream) out;
				} else {
					outStream = new ByteArrayOutputStream();
				}
				parser = new Preprocessor(resource, ShaderType.GENERIC_SHADER, new PreprocessedOutputBuffer(outStream));
			} else {
				parser = new Preprocessor(resource, ShaderType.GENERIC_SHADER, output(out));
			}
			parser.setErrorHandler(errorHandler);
		} catch (Throwable e) {
			// will never happen
			throw new Error(e);
		}
		return parser;
	}


	



}
