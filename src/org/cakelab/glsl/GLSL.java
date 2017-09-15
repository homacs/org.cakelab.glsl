package org.cakelab.glsl;

import java.io.IOException;
import java.util.List;

import org.cakelab.glsl.impl.FileSystemResourceManager;
import org.cakelab.glsl.impl.GLSLErrorHandlerImpl;
import org.cakelab.glsl.lang.ASTBuilder;
import org.cakelab.glsl.lang.GLSLBuiltinSymbols;
import org.cakelab.glsl.lang.ast.Scope;
import org.cakelab.glsl.lang.lexer.GLSL_ANTLR_PPOutputBuffer;
import org.cakelab.glsl.lang.lexer.PPTokenStream;
import org.cakelab.glsl.lang.lexer.tokens.GLSLTokenTable;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.PPGroupScope;

public class GLSL {
	
	private ResourceManager resourceManager;
	private GLSLErrorHandler errorHandler;

	public GLSL() {
		this(new GLSLErrorHandlerImpl());
	}
	
	public GLSL(GLSLErrorHandler errorHandler) {
		this(errorHandler, new FileSystemResourceManager());
	}
	
	public GLSL(ResourceManager resources) {
		this(new GLSLErrorHandlerImpl(), resources);
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

		// TODO consider glsl extensions in symbol table
		GLSLVersion version = buffer.getVersion();
		GLSLBuiltinSymbols builtinSymbols = GLSLBuiltinSymbols.get(version);
		
		GLSLTokenTable tokenTable = GLSLTokenTable.get(version);
		SymbolTable symbolTable = new SymbolTable(builtinSymbols.getBuiltinScope());
		
		PPTokenStream tokens = new PPTokenStream(buffer, tokenTable, symbolTable, errorHandler);
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
