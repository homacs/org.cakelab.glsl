package org.cakelab.glsl.pp;

import java.util.ArrayList;

import org.cakelab.glsl.GLSLExtension;
import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.ast.PPGroupScope;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.ILexer;

public class PPState {
	
	public static interface Listener {
		void reportModifiedVersion(GLSLVersion version);
	}
	
	@SuppressWarnings("serial")
	private class ListenerSet extends ArrayList<Listener> implements Listener {
		@Override
		public void reportModifiedVersion(GLSLVersion version) {
			for (Listener listener : this) {
				listener.reportModifiedVersion(version);
			}
		}
	}
	
	private ResourceManager resourceManager;
	private ErrorHandler errorHandler;
	private ListenerSet listeners;
	
	/* ************* results *************** */
	
	/** this is where valid and invalid/hidden preprocessed output goes. 
	 * It will refer to DEV_NULL when an error occurred (i.e. invalid output). */
	private PPOutputSink output;

	private Resource input;

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
	private boolean forcedVersion;
	
	

	
	public PPState(Resource input, ErrorHandler errorHandler) {
		this(input);
		this.errorHandler = errorHandler;
	}
	
	public PPState(Resource input) {
		listeners = new ListenerSet();
	}

	public void addListener(Listener listener) {
		listeners.add(listener);
	}
	
	public void removeListener(Listener listener) {
		listeners.remove(listener);
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

	public PPOutputSink getOutput() {
		return output;
	}

	public void setOutput(PPOutputSink output) {
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

	public boolean isSeenCodeLine() {
		return seenCodeLineBeforeVersion;
	}

	public void setSeenCodeLine(boolean seenCodeLineBeforeVersion) {
		this.seenCodeLineBeforeVersion = seenCodeLineBeforeVersion;
	}

	public GLSLVersion getGlslVersion() {
		return glslVersion;
	}

	public void setGlslVersion(GLSLVersion glslVersion) {
		this.glslVersion = glslVersion;
		listeners.reportModifiedVersion(glslVersion);
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

	public Resource getInputResource() {
		return this.input;
	}

	public void setInputResource(Resource resource) {
		this.input = resource;
	}

	public void setForcedVersion(boolean forced) {
		this.forcedVersion = true;
	}

	public boolean isForcedVersion() {
		return this.forcedVersion;
	}

	
	
}
