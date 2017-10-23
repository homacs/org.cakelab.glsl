package org.cakelab.glsl.pp;

import java.util.ArrayList;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.GLSLBuiltin;
import org.cakelab.glsl.builtin.GLSLBuiltin.WorkingSet;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.ast.PPGroupScope;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.ILexer;

public class PPState {
	
	public static interface Listener {
		void reportModifiedVersion(GLSLVersion version);

		void process(PPExtensionDirective directive);
	}
	
	@SuppressWarnings("serial")
	private class ListenerSet extends ArrayList<Listener> implements Listener {
		@Override
		public void reportModifiedVersion(GLSLVersion version) {
			for (Listener listener : this) {
				listener.reportModifiedVersion(version);
			}
		}
		@Override
		public void process(PPExtensionDirective directive) {
			for (Listener listener : this) {
				listener.process(directive);
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

	private Resource[] inputs;

	private ILexer lexer;
	
	private PPGroupScope groupScope;

	private GLSLVersion glslVersion;
	private ArrayList<PPExtensionDirective> extensions = new ArrayList<PPExtensionDirective>();
	
	
	/* ************** config *************** */
	private boolean includeEnabled = true;
	private boolean insertLineDirectives = false;

	
	private Macro currentMacroDefinition = null;
	private boolean seenCodeLineBeforeVersion = false;
	private boolean forcedVersion;
	private ShaderType shaderType;
	
	private MacroMap macros = new MacroMap(GLSLBuiltin.getDefaultBuiltinMacros());
	private WorkingSet workingSet;
	
	

	
	public PPState(Resource[] inputs, ShaderType shaderType) {
		this.inputs = inputs;
		this.shaderType = shaderType;
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

	public void addExtensionDirective(PPExtensionDirective directive) {
		extensions.add(directive);
		listeners.process(directive);
	}


	public ArrayList<PPExtensionDirective> getDirectivesExtensions() {
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

	public Resource[] getInputResources() {
		return this.inputs;
	}

	public void setInputResource(Resource[] resources) {
		this.inputs = resources;
	}

	public void setForcedVersion(boolean forced) {
		this.forcedVersion = true;
	}

	public boolean isForcedVersion() {
		return this.forcedVersion;
	}

	public ShaderType getShaderType() {
		return shaderType;
	}

	public void setWorkingSet(WorkingSet workingSet) {
		this.workingSet = workingSet;
		this.macros.setWorkingSet(workingSet);
	}

	public WorkingSet getWorkingSet() {
		return workingSet;
	}

	
	
}
