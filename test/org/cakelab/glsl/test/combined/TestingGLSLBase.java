package org.cakelab.glsl.test.combined;

import java.io.IOException;

import org.cakelab.glsl.GLSL;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.impl.ResourceString;
import org.cakelab.glsl.impl.SimpleResourceManager;
import org.cakelab.glsl.test.lang.TestingTools;
import org.cakelab.glsl.test.lang.TestingTools.ParserErrorHandler;

public class TestingGLSLBase {
	
	private static final ParserErrorHandler ERROR_HANDLER = TestingTools.TEST_ERROR_HANLDER;
	private static final ResourceManager RESOURCES = new SimpleResourceManager();
	private static final GLSL _GLSL = new GLSL(ERROR_HANDLER, RESOURCES);
	private static final String TEST_RESOURCE_PATH = "test.glsl";
	
	
	
	
	public static void assertValid(String text, ShaderType shaderType) {
		p(text, shaderType);
		if (ERROR_HANDLER.hasError()) {
			TestingTools.error(ERROR_HANDLER.message);
		}
		
	}
	
	public static void p(String text, ShaderType shaderType) {
		Resource r = new ResourceString(TEST_RESOURCE_PATH, "0", text);
		try {
			RESOURCES.add(r);
			_GLSL.parse(r, ShaderType.FRAGMENT_SHADER);
			
		} catch (IOException e) {
			// internal error
			throw new Error("internal error: ", e);
		} finally {
			RESOURCES.reset();
		}
		
	}
	
}
