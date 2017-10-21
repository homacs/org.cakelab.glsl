package org.cakelab.glsl.test.combined;

import java.io.IOException;

import org.cakelab.glsl.GLSL;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.impl.DelegatingResourceManager;
import org.cakelab.glsl.impl.FileSystemResourceManager;
import org.cakelab.glsl.impl.JarResourceManager;
import org.cakelab.glsl.impl.ResourceString;
import org.cakelab.glsl.test.lang.TestingTools;
import org.cakelab.glsl.test.lang.TestingTools.ParserErrorHandler;

public class TestingGLSLBase {
	
	protected static final ParserErrorHandler ERROR_HANDLER = TestingTools.TEST_ERROR_HANLDER;
	protected static final DelegatingResourceManager RESOURCES = new DelegatingResourceManager(new JarResourceManager(), new FileSystemResourceManager());
	protected static final GLSL _GLSL = new GLSL(ERROR_HANDLER, RESOURCES);
	protected static final String TEST_RESOURCE_PATH = "test.glsl";
	
	
	
	
	public static void assertValid(String text, ShaderType shaderType) {
		p(text, shaderType);
		if (ERROR_HANDLER.hasError()) {
			TestingTools.error(ERROR_HANDLER.message);
		}
	}
	
	public static void assertValid(Resource resource, ShaderType shaderType) {
		p(resource, shaderType);
		if (ERROR_HANDLER.hasError()) {
			TestingTools.error(ERROR_HANDLER.message);
		}
	}
	
	public static void p(String text, ShaderType shaderType) {
		Resource r = new ResourceString(TEST_RESOURCE_PATH, "0", text);
		try {
			RESOURCES.add(r);
			p(r,shaderType);
		} catch (IOException e) {
			throw new Error("internal error: ", e);
		}
	}
	public static void p(Resource resource, ShaderType shaderType) {
		try {
			_GLSL.parse(resource, shaderType);
		} catch (IOException e) {
			// internal error
			throw new Error("internal error: ", e);
		} finally {
			RESOURCES.reset();
		}
		
	}
	
}
