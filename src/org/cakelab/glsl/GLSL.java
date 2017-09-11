package org.cakelab.glsl;

import java.io.IOException;
import java.util.List;

import org.cakelab.glsl.impl.StandardFileManager;
import org.cakelab.glsl.lang.ASTBuilder;
import org.cakelab.glsl.lang.ast.Scope;
import org.cakelab.glsl.lang.lexer.PPOutputTokenSink_GLSL_ANTLR;
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
		PPOutputTokenSink_GLSL_ANTLR buffer = new PPOutputTokenSink_GLSL_ANTLR(resourceManager);
		Preprocessor pp = new Preprocessor(resource, buffer);
		
		pp.setResourceManager(resourceManager);
		pp.setErrorHandler(errorHandler);
		pp.enableInclude(true);
		pp.enableLineDirectiveInsertion(false);
		
		List<PPGroupScope> ppAST = pp.process();

		PPTokenStream tokens = new PPTokenStream(buffer);
		GLSLParser parser = new GLSLParser(tokens);

		errorHandler.setLocations(tokens, buffer.getLocations());

		parser.removeErrorListeners();
		parser.addErrorListener(errorHandler);

		ASTBuilder astBuilder = new ASTBuilder(tokens, buffer.getLocations(), errorHandler);
		parser.addParseListener(astBuilder);
		
		parser.glsl();
		
		Scope langAST = astBuilder.getToplevelScope();
		return new CombinedAST(ppAST, langAST);
	}


}
