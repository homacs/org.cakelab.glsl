package org.cakelab.glsl.test.pp;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.GLSLBuiltin;
import org.cakelab.glsl.builtin.WorkingSet;
import org.cakelab.glsl.impl.ResourceString;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.output.PreprocessedOutputBuffer;
import org.cakelab.glsl.pp.parser.Parser;
import org.cakelab.glsl.test.TestProvider;

public class TestingPPBase extends TestingBase {
	
	public TestingPPBase(TestProvider tester) {
		super(tester);
	}

	public Parser p(String source, OutputStream out) {
		try {
			error = null;
			warning = null;
			Resource resource = new ResourceString("0", "-- testing --", source);
			Preprocessor pp;
			
			if (usePPBuffer) {
				ByteArrayOutputStream outStream;
				if (out instanceof ByteArrayOutputStream) {
					outStream = (ByteArrayOutputStream) out;
				} else {
					outStream = new ByteArrayOutputStream();
				}
				pp = new Preprocessor(compiler, new Resource[]{resource}, ShaderType.GENERIC_SHADER, new PreprocessedOutputBuffer(outStream));
			} else {
				pp = new Preprocessor(compiler, new Resource[]{resource}, ShaderType.GENERIC_SHADER, output(out));
			}
			pp.setErrorHandler(errorHandler);
			
			GLSLVersion version = new GLSLVersion(Interval.NONE, 450, GLSLVersion.Profile.core);
			GLSLBuiltin builtins = compiler.getBuiltinServices().getTestBuiltins(version);
			WorkingSet workingSet = compiler.getBuiltinServices().createWorkingSet(builtins);
			pp.setForceVersion(version);
			pp.getState().setWorkingSet(workingSet);
			
			
			
			parser = pp;
		} catch (Throwable e) {
			// will never happen
			throw new Error(e);
		}
		return parser;
	}


	



}
