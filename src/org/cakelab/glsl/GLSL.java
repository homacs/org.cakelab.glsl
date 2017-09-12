package org.cakelab.glsl;

import java.io.IOException;
import java.util.List;

import org.cakelab.glsl.impl.StandardFileManager;
import org.cakelab.glsl.lang.ASTBuilder;
import org.cakelab.glsl.lang.ast.Scope;
import org.cakelab.glsl.lang.lexer.GLSL_ANTLR_PPOutputBuffer;
import org.cakelab.glsl.lang.lexer.PPTokenStream;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.PPGroupScope;

public class GLSL {
	
	private ResourceManager resourceManager;
	private GLSLErrorHandler errorHandler;

	public GLSL() {
		this(new GLSLErrorHandler());
	}
	
	public GLSL(GLSLErrorHandler errorHandler) {
		this(errorHandler, new StandardFileManager());
	}
	
	public GLSL(ResourceManager resources) {
		this(new GLSLErrorHandler(), resources);
	}
	
	public GLSL(GLSLErrorHandler errorHandler, ResourceManager resources) {
		this.errorHandler = errorHandler;
		this.resourceManager = resources;
		this.errorHandler.setResourceManager(resources);
	}
	

	
	public CombinedAST parse(Resource resource) throws IOException {
		GLSL_ANTLR_PPOutputBuffer buffer = new GLSL_ANTLR_PPOutputBuffer(resourceManager);
		Preprocessor pp = new Preprocessor(resource, buffer);
		
		pp.setResourceManager(resourceManager);
		pp.setErrorHandler(errorHandler);
		pp.enableInclude(true);
		pp.enableLineDirectiveInsertion(false);
		
		List<PPGroupScope> ppAST = pp.process();

		// TODO consider glsl version, profile and extensions in symbol table
		SymbolTable symbolTable = new SymbolTable();
		
		PPTokenStream tokens = new PPTokenStream(buffer, symbolTable, errorHandler);
		errorHandler.setLocations(tokens, buffer.getLocations());
		ASTBuilder astBuilder = new ASTBuilder(tokens, buffer.getLocations(), symbolTable, errorHandler);
		
		GLSLParser parser = new GLSLParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(errorHandler);
		parser.addParseListener(astBuilder);
		
		parser.glsl();
		
		Scope langAST = astBuilder.getToplevelScope();
		return new CombinedAST(ppAST, langAST);
	}


}
