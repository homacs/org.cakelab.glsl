package org.cakelab.glsl.test.combined;

import java.io.IOException;

import org.cakelab.glsl.GLSLCompiler;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.impl.DelegatingResourceManager;
import org.cakelab.glsl.impl.FileSystemResourceManager;
import org.cakelab.glsl.impl.JarResourceManager;
import org.cakelab.glsl.impl.ResourceString;
import org.cakelab.glsl.test.TestErrorHandler;
import org.cakelab.glsl.test.lang.TestingTools;

public class TestingGLSLBase {
	
	protected static TestErrorHandler ERROR_HANDLER;
	protected static final DelegatingResourceManager RESOURCES = new DelegatingResourceManager(new JarResourceManager(), new FileSystemResourceManager());
	protected static GLSLCompiler COMPILER;
	protected static final String TEST_RESOURCE_PATH = "test.glsl";
	
	
	private static ResourceString source(String text) {
		return new ResourceString(TEST_RESOURCE_PATH, "0", text);
	}
	
	public static void assertValid(String text, ShaderType shaderType) {
		assertValid(source(text), shaderType);
	}
	
	public static void assertInvalid(String text, ShaderType shaderType, String expectedErrMsg) {
		assertInvalid(source(text), shaderType, expectedErrMsg);
	}
	
	
	protected static void assertValid(Resource resource) {
		ShaderType type = getShaderType(resource.getPath());
		assertValid(resource, type);
	}

	protected static void assertInvalid(Resource resource, String expectedErrMsg) {
		ShaderType type = getShaderType(resource.getPath());
		assertInvalid(resource, type, expectedErrMsg);
	}

	
	private static ShaderType getShaderType(String path) {
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

	public static void assertValid(Resource resource, ShaderType shaderType) {
		p(resource, shaderType);
		if (ERROR_HANDLER.hasError()) {
			TestingTools.error(ERROR_HANDLER.getMessage());
		}
	}
	
	public static void assertInvalid(Resource resource, ShaderType shaderType, String expectedErrMsg) {
		p(resource, shaderType);
		if (!ERROR_HANDLER.hasError()) {
			TestingTools.error("expected an error");
		} else if (!ERROR_HANDLER.getMessage().endsWith(expectedErrMsg)) {
			TestingTools.error("got error: '" + ERROR_HANDLER.getMessage() + "'\t\ninstead of '" + expectedErrMsg + "'");
		}
	}
	
	public static void p(Resource resource, ShaderType shaderType) {
		try {
			ERROR_HANDLER.reset();
			COMPILER.parse(resource, shaderType);
		} catch (IOException e) {
			// internal error
			throw new Error("internal error: ", e);
		} finally {
			RESOURCES.reset();
		}
		
	}
	
}
