package org.cakelab.glsl.test.combined;

import java.io.IOException;

import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.impl.DelegatingResourceManager;
import org.cakelab.glsl.impl.ResourceString;
import org.cakelab.glsl.test.TestErrorHandler;
import org.cakelab.glsl.test.TestProvider;
import org.cakelab.glsl.test.lang.TestingTools;

public class TestingGLSLBase extends TestingTools {
	
	protected final DelegatingResourceManager resources;
	protected final TestErrorHandler errorHandler;
	protected static final String TEST_RESOURCE_PATH = "test.glsl";
	
	
	public TestingGLSLBase(TestProvider provider) {
		super(provider);
		resources = provider.getDelegatingResourceManager();
		errorHandler = provider.getErrorHandler();
	}
	
	
	
	
	private ResourceString source(String text) {
		return new ResourceString(TEST_RESOURCE_PATH, "0", text);
	}
	
	public void assertValid(String text, ShaderType shaderType) {
		assertValid(source(text), shaderType);
	}
	
	public void assertInvalid(String text, ShaderType shaderType, String expectedErrMsg) {
		assertInvalid(source(text), shaderType, expectedErrMsg);
	}
	
	
	protected void assertValid(Resource resource) {
		ShaderType type = getShaderType(resource.getPath());
		assertValid(resource, type);
	}

	protected void assertInvalid(Resource resource, String expectedErrMsg) {
		ShaderType type = getShaderType(resource.getPath());
		assertInvalid(resource, type, expectedErrMsg);
	}

	
	private ShaderType getShaderType(String path) {
		ShaderType type;
		if (path.endsWith(".vert.glsl")) {
			type = ShaderType.VERTEX_SHADER;
		} else if (path.endsWith(".tsct.glsl")) {
			type = ShaderType.TESS_CONTROL_SHADER;
		} else if (path.endsWith(".tsev.glsl")) {
			type = ShaderType.TESS_EVALUATION_SHADER;
		} else if (path.endsWith(".geom.glsl")) {
			type = ShaderType.GEOMETRY_SHADER;
		} else if (path.endsWith(".frag.glsl")) {
			type = ShaderType.FRAGMENT_SHADER;
		} else if (path.endsWith(".comp.glsl")) {
			type = ShaderType.COMPUTE_SHADER;
		} else if (path.endsWith(".glsl")) {
			type = ShaderType.GENERIC_SHADER;
		} else {
			throw new Error("unknown file extension in shader resource '" + path + "'");
		}
		return type;
	}

	public void assertValid(Resource resource, ShaderType shaderType) {
		p(resource, shaderType);
		if (errorHandler.hasError()) {
			TestingTools.error(errorHandler.getMessage());
		}
	}
	
	public void assertInvalid(Resource resource, ShaderType shaderType, String expectedErrMsg) {
		p(resource, shaderType);
		if (!errorHandler.hasError()) {
			TestingTools.error("expected an error");
		} else if (!errorHandler.getMessage().endsWith(expectedErrMsg)) {
			TestingTools.error("got error: '" + errorHandler.getMessage() + "'\t\ninstead of '" + expectedErrMsg + "'");
		}
	}
	
	public void p(Resource resource, ShaderType shaderType) {
		try {
			errorHandler.reset();
			compiler.parse(resource, shaderType);
		} catch (IOException e) {
			// internal error
			throw new Error("internal error: ", e);
		} finally {
			resources.reset();
		}
		
	}
	
}
