package org.cakelab.glsl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.cakelab.glsl.builtin.GLSLBuiltin.WorkingSet;
import org.cakelab.glsl.builtin.extensions.KnownExtensions;
import org.cakelab.glsl.impl.FileSystemResourceManager;
import org.cakelab.glsl.impl.GLSLErrorHandlerImpl;
import org.cakelab.glsl.lang.ASTBuilder;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.lexer.GLSL_ANTLR_PPOutputBuffer;
import org.cakelab.glsl.lang.lexer.PPTokenStream;
import org.cakelab.glsl.lang.lexer.tokens.ExtendedTokenTable;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.PPGroupScope;

public class GLSL {
	
	private static GLSLCompilerFeatures DEFAULT_COMPILER_FEATURES;
	private ResourceManager resourceManager;
	private GLSLErrorHandler errorHandler;
	private GLSLCompilerFeatures features;
	
	
	static {
		ArrayList<String[]> extensionNames = new ArrayList<String[]>();
		extensionNames.addAll(KnownExtensions.getAllArb());
		extensionNames.addAll(KnownExtensions.getAllGL());
		extensionNames.addAll(KnownExtensions.getAllEs());
		DEFAULT_COMPILER_FEATURES = new GLSLCompilerFeatures(GLSLVersion.Profile.values(), extensionNames);

	}
	

	public GLSL() {
		this(getDefaultCompilerFeatures(), new GLSLErrorHandlerImpl());
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

	public GLSL(GLSLCompilerFeatures features, GLSLErrorHandler errorHandler) {
		this(features, errorHandler, new FileSystemResourceManager());
	}
	
	public GLSL(GLSLCompilerFeatures features, ResourceManager resources) {
		this(features, new GLSLErrorHandlerImpl(), resources);
	}
	
	public GLSL(GLSLCompilerFeatures features, GLSLErrorHandler errorHandler, ResourceManager resources) {
		this.features = features;
		this.errorHandler = errorHandler;
		this.resourceManager = resources;
		this.errorHandler.setResourceManager(resources);
	}

	public void setCompilerFeatures(GLSLCompilerFeatures features) {
		this.features = features;
	}
	
	public CombinedAST parse(Resource resource, ShaderType shaderType) throws IOException {
		return parse(new Resource[]{resource}, shaderType);
	}
	
	public CombinedAST parse(Resource[] resource, ShaderType shaderType) throws IOException {
		GLSL_ANTLR_PPOutputBuffer buffer = new GLSL_ANTLR_PPOutputBuffer(resourceManager);
		Preprocessor pp = new Preprocessor(features, resource, shaderType, buffer);
		
		pp.setResourceManager(resourceManager);
		pp.setErrorHandler(errorHandler);
		pp.enableInclude(true);
		pp.enableLineDirectiveInsertion(false);
		
		
		
		List<PPGroupScope> ppAST = pp.process(true);

		WorkingSet workingSet = pp.getState().getWorkingSet();
		
		ExtendedTokenTable tokenTable = workingSet.getTokenTable();
		
		SymbolTable symbolTable = new SymbolTable(workingSet.getBuiltinScope());
		
		PPTokenStream tokens = new PPTokenStream(buffer, tokenTable, symbolTable, errorHandler);
		errorHandler.setLocations(tokens);
		ASTBuilder astBuilder = new ASTBuilder(symbolTable, errorHandler);
		
		GLSLParser parser = new GLSLParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(errorHandler);
		parser.addParseListener(astBuilder);
		
		parser.glsl();
		
		IScope langAST = astBuilder.getToplevelScope();
		return new CombinedAST(ppAST, langAST);
	}


}
