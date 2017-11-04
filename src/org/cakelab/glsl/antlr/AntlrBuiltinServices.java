package org.cakelab.glsl.antlr;

import java.util.HashMap;

import org.cakelab.glsl.GLSLCompiler;
import org.cakelab.glsl.GLSLParser;
import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.antlr.lexer.PPTokenStream;
import org.cakelab.glsl.builtin.GLSLBuiltinServices;
import org.cakelab.glsl.lang.ASTBuilder;
import org.cakelab.glsl.lang.lexer.tokens.ITokenTable;
import org.cakelab.glsl.lang.lexer.tokens.Vocabulary;
import org.cakelab.glsl.pp.MacroMap;
import org.cakelab.glsl.pp.PPOutputSink;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.Macro;

public class AntlrBuiltinServices extends GLSLBuiltinServices {
	

	//static final AntlrBuiltinServices INSTANCE = new AntlrBuiltinServices();
	static final AntlrErrorHandler ANTLR_ERROR_HANDLER = new AntlrErrorHandler(INTERNAL_ERROR_HANDLER);
	
	public AntlrBuiltinServices(GLSLCompiler compiler) {
		super(compiler);
	}

	@Override
	public PPOutputSink createPreprocessorSink(ResourceManager resourceManager) {
		return new PPOutputBuffer(resourceManager);
	}

	@Override
	public HashMap<String, Macro> preprocessBuiltinPreamble(Resource resource, GLSLVersion version, ShaderType shaderType,
			PPOutputSink buffer) {
			
			Preprocessor pp = setupPreprocessing(resource, shaderType, buffer);
			
			pp.setForceVersion(version);
			
			pp.process(true);
			
			MacroMap macroMap = pp.getState().getMacros();
			macroMap.undef(shaderType.name());

			return macroMap.getUserLevelMacros();
	}

	/**
	 * @param buffer
	 * @param tokenTable
	 * @param symbolTable
	 */
	@Override
	public void parseBuiltinPreamble(PPOutputSink buffer, ITokenTable tokenTable, SymbolTable symbolTable) {
		
		PPTokenStream tokens = new PPTokenStream((PPOutputBuffer) buffer, tokenTable, symbolTable, INTERNAL_ERROR_HANDLER);
		ANTLR_ERROR_HANDLER.setLocations(tokens);
		ASTBuilder astBuilder = new ASTBuilder(symbolTable, ANTLR_ERROR_HANDLER);
		
		GLSLParser parser = new GLSLParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(ANTLR_ERROR_HANDLER);
		parser.addParseListener(astBuilder);
		
		parser.glsl();
	}

	@Override
	public Vocabulary getVocabulary() {
		return AntlrVocabulary.INSTANCE;
	}



}
