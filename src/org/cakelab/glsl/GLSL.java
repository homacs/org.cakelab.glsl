package org.cakelab.glsl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.cakelab.glsl.impl.StandardFileManager;
import org.cakelab.glsl.lang.ASTBuilder;
import org.cakelab.glsl.lang.ast.Scope;
import org.cakelab.glsl.pp.PreprocessedOutputBuffer;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.PPGroupScope;

public class GLSL {
	
	private ResourceManager resourceManager;
	private ParserErrorHandler errorHandler;
	private ANTLRErrorListener antlrErrorListener;

	public GLSL(ParserErrorHandler errorHandler) {
		this(errorHandler, new StandardFileManager());
	}
	
	public GLSL(ParserErrorHandler errorHandler, ResourceManager resources) {
		this.errorHandler = errorHandler;
		this.resourceManager = resources;
	}
	
	public CombinedAST parse(Resource resource) {
		PreprocessedOutputBuffer buffer = new PreprocessedOutputBuffer();
		
		Preprocessor pp = new Preprocessor(resource.getIdentifier(), resource.getData(), buffer);
		pp.setResourceManager(resourceManager);
		pp.setErrorHandler(errorHandler);
		pp.enableInclude(true);
		pp.enableLineDirectiveInsertion(false);
		
		List<PPGroupScope> ppAST = pp.process();

		ByteArrayInputStream preprocessed = new ByteArrayInputStream(buffer.getData());

		ASTBuilder astBuilder = new ASTBuilder(buffer.getLocations());

		
		CharStream input;
		try {
			input = CharStreams.fromStream(preprocessed);
		} catch (IOException e) {
			throw new Error("internal error: couldn't read from preprocessed output");
		}
		
		GLSLLexer lexer = new GLSLLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GLSLParser parser = new GLSLParser(tokens);

		parser.removeErrorListeners();
		parser.addErrorListener(antlrErrorListener);
		lexer.removeErrorListeners();
		lexer.addErrorListener(antlrErrorListener);

		parser.addParseListener(astBuilder);
		
		parser.glsl();
		
		Scope langAST = astBuilder.getToplevelScope();
		return new CombinedAST(ppAST, langAST);
	}


}