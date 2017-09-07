package org.cakelab.glsl.pp;

import java.util.ArrayList;

import org.cakelab.glsl.GLSLExtension;
import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.ast.PPGroupScope;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.ILexer;

public class PPState {
	private ResourceManager resourceManager;
	
	private ErrorHandler errorHandler;

	
	/* ************* results *************** */
	
	/** this is where valid and invalid/hidden preprocessed output goes. 
	 * It will refer to DEV_NULL when an error occurred (i.e. invalid output). */
	private PreprocessedOutputSink output;

	private ILexer lexer;
	
	private MacroMap macros = new MacroMap();
	private PPGroupScope groupScope;

	private GLSLVersion glslVersion;
	private ArrayList<GLSLExtension> extensions = new ArrayList<GLSLExtension>();

	
	
	/* ************** config *************** */
	private boolean includeEnabled = true;
	private boolean insertLineDirectives = false;

	
	/* ************** Context specific data *************** */
	private Macro currentMacroDefinition = null;
	private boolean seenCodeLineBeforeVersion = false;

	
	public PPState(ErrorHandler errorHandler) {
		super();
		this.errorHandler = errorHandler;
	}
	
	public PPState() {
	}

	public ErrorHandler getErrorHandler() {
		return errorHandler;
	}
	public void setErrorHandler(ErrorHandler errorHandler) {
		this.errorHandler = errorHandler;
	}

	public ResourceManager getResourceManager() {
		return resourceManager;
	}

	public void setResourceManager(ResourceManager resourceManager) {
		this.resourceManager = resourceManager;
	}

	public PreprocessedOutputSink getOutput() {
		return output;
	}

	public void setOutput(PreprocessedOutputSink output) {
		this.output = output;
	}

	public MacroMap getMacros() {
		return macros;
	}

	public void setMacros(MacroMap macros) {
		this.macros = macros;
	}

	public PPGroupScope getGroupScope() {
		return groupScope;
	}

	public void setGroupScope(PPGroupScope groupScope) {
		this.groupScope = groupScope;
	}

	public Macro getCurrentMacroDefinition() {
		return currentMacroDefinition;
	}

	public void setCurrentMacroDefinition(Macro currentMacroDefinition) {
		this.currentMacroDefinition = currentMacroDefinition;
	}

	public boolean isInsertLineDirectives() {
		return insertLineDirectives;
	}

	public void setInsertLineDirectives(boolean insertLineDirectives) {
		this.insertLineDirectives = insertLineDirectives;
	}

	public boolean isSeenCodeLineBeforeVersion() {
		return seenCodeLineBeforeVersion;
	}

	public void setSeenCodeLineBeforeVersion(boolean seenCodeLineBeforeVersion) {
		this.seenCodeLineBeforeVersion = seenCodeLineBeforeVersion;
	}

	public GLSLVersion getGlslVersion() {
		return glslVersion;
	}

	public void setGlslVersion(GLSLVersion glslVersion) {
		this.glslVersion = glslVersion;
	}

	public ArrayList<GLSLExtension> getExtensions() {
		return extensions;
	}

	public ILexer getLexer() {
		return lexer;
	}

	public void setLexer(ILexer lexer) {
		this.lexer = lexer;
	}

	public boolean isIncludeEnabled() {
		return includeEnabled;
	}

	public void setIncludeEnabled(boolean enable) {
		this.includeEnabled = enable;
	}

	
	
}
