package org.cakelab.glsl;

import java.io.IOException;
import java.util.ArrayList;

import org.cakelab.glsl.builtin.GLSLBuiltinServices;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionServices;
import org.cakelab.glsl.builtin.extensions.KnownExtensions;
import org.cakelab.glsl.impl.FileSystemResourceManager;
import org.cakelab.glsl.pp.StandardErrorHandler;

public abstract class GLSLCompiler {

	protected static GLSLCompilerFeatures DEFAULT_COMPILER_FEATURES;

	protected boolean enableInclude = true;
	protected ResourceManager resourceManager;
	protected GLSLErrorHandler errorHandler;
	protected GLSLCompilerFeatures features;
	
	
	static {
		ArrayList<String[]> extensionNames = new ArrayList<String[]>();
		extensionNames.addAll(KnownExtensions.getAllArb());
		extensionNames.addAll(KnownExtensions.getAllGL());
		extensionNames.addAll(KnownExtensions.getAllEs());
		DEFAULT_COMPILER_FEATURES = new GLSLCompilerFeatures(GLSLVersion.Profile.values(), extensionNames);

	}
	
	
	
	public void enableInclude(boolean enable) {
		this.enableInclude = enable;
	}
	
	/**
	 * Creates a compiler feature set which supports all extensions and profiles
	 * known to this implementation.
	 * 
	 * @return
	 */
	public static GLSLCompilerFeatures getDefaultCompilerFeatures() {
		return DEFAULT_COMPILER_FEATURES;
	}
	
	public void setCompilerFeatures(GLSLCompilerFeatures features) {
		this.features = features;
	}

	
	public GLSLCompiler() {
		this(getDefaultCompilerFeatures(), new StandardErrorHandler());
	}

	public GLSLCompiler(GLSLCompilerFeatures features, GLSLErrorHandler errorHandler) {
		this(features, errorHandler, new FileSystemResourceManager());
	}
	
	public GLSLCompiler(GLSLCompilerFeatures features, ResourceManager resources) {
		this(features, new StandardErrorHandler(), resources);
	}
	
	public GLSLCompiler(GLSLCompilerFeatures features, GLSLErrorHandler errorHandler, ResourceManager resources) {
		this.features = features;
		this.errorHandler = errorHandler;
		this.resourceManager = resources;
		this.errorHandler.setResourceManager(resources);
	}

	
	
	public CombinedAST parse(Resource resource, ShaderType shaderType) throws IOException {
		return parse(new Resource[]{resource}, shaderType);
	}

	public abstract CombinedAST parse(Resource[] resources, ShaderType shaderType)  throws IOException;

	
	public abstract GLSLBuiltinServices getBuiltinServices();
	public abstract GLSLExtensionServices getExtensionServices();


	public GLSLCompilerFeatures getFeatures() {
		return features;
	}



}
