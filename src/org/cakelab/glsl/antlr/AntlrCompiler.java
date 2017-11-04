package org.cakelab.glsl.antlr;

import java.io.IOException;
import java.util.List;

import org.cakelab.glsl.CombinedAST;
import org.cakelab.glsl.GLSLCompiler;
import org.cakelab.glsl.GLSLCompilerFeatures;
import org.cakelab.glsl.GLSLErrorHandler;
import org.cakelab.glsl.GLSLParser;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.antlr.lexer.PPTokenStream;
import org.cakelab.glsl.builtin.GLSLBuiltin.WorkingSet;
import org.cakelab.glsl.builtin.GLSLBuiltinServices;
import org.cakelab.glsl.impl.FileSystemResourceManager;
import org.cakelab.glsl.lang.ASTBuilder;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.lexer.tokens.ExtendedTokenTable;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.StandardErrorHandler;
import org.cakelab.glsl.pp.ast.PPGroupScope;

public class AntlrCompiler extends GLSLCompiler {
	

	private AntlrErrorHandler antlrErrorHandler;
	private GLSLBuiltinServices builtinServices;
	
	
	public AntlrCompiler() {
		this(getDefaultCompilerFeatures(), new AntlrErrorHandler(new StandardErrorHandler()));
		builtinServices = new AntlrBuiltinServices(this);
	}

	public AntlrCompiler(GLSLCompilerFeatures features, GLSLErrorHandler errorHandler) {
		this(features, errorHandler, new FileSystemResourceManager());
	}
	
	public AntlrCompiler(GLSLCompilerFeatures features, ResourceManager resources) {
		this(features, new AntlrErrorHandler(new StandardErrorHandler()), resources);
	}
	
	public AntlrCompiler(GLSLCompilerFeatures features, GLSLErrorHandler errorHandler, ResourceManager resources) {
		super(features, errorHandler, resources);
		this.antlrErrorHandler = new AntlrErrorHandler(errorHandler);
		this.antlrErrorHandler.setResourceManager(resources);
	}

	public CombinedAST parse(Resource[] resource, ShaderType shaderType) throws IOException {
		
		PPOutputBuffer buffer = new PPOutputBuffer(resourceManager);
		Preprocessor pp = new Preprocessor(this, resource, shaderType, buffer);
		
		pp.setResourceManager(resourceManager);
		pp.setErrorHandler(errorHandler);
		pp.enableInclude(enableInclude);
		pp.enableLineDirectiveInsertion(false);
		
		
		
		List<PPGroupScope> ppAST = pp.process(true);

		WorkingSet workingSet = pp.getState().getWorkingSet();
		
		ExtendedTokenTable tokenTable = workingSet.getTokenTable();
		
		SymbolTable symbolTable = new SymbolTable(workingSet.getBuiltinScope());
		
		PPTokenStream tokens = new PPTokenStream(buffer, tokenTable, symbolTable, errorHandler);
		antlrErrorHandler.setLocations(tokens);
		ASTBuilder astBuilder = new ASTBuilder(symbolTable, antlrErrorHandler);
		
		GLSLParser parser = new GLSLParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(antlrErrorHandler);
		parser.addParseListener(astBuilder);
		
		parser.glsl();
		
		IScope langAST = astBuilder.getToplevelScope();
		return new CombinedAST(ppAST, langAST);
	}

	@Override
	public GLSLBuiltinServices getBuiltinServices() {
		return builtinServices;
	}


}
