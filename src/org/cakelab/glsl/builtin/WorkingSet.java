package org.cakelab.glsl.builtin;

import java.io.PrintStream;
import java.util.HashMap;

import org.cakelab.glsl.GLSLCompilerFeatures;
import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.extensions.GLSLExtension;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionServices;
import org.cakelab.glsl.lang.lexer.tokens.ExtendableTokenTable;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.ast.Macro;

/**
 * A working set provides access to data which is valid throughout preprocessing and parse
 * of a specific glsl source file, namely:
 * <ul>
 * <li>GLSL version ({@link GLSLVersion})</li>
 * <li>selected profile ({@link GLSLVersion#Profile})</li>
 * <li>type of the shader to be processed ({@link ShaderType})</li>
 * <li>set of builtin macros (<b><code>HashMap&lt;String, Macro&gt;</code></b>)</li>
 * <li>set of feature macros (see {@link GLSLCompilerFeatures#getFeatureMacros()})</li>
 * <li>set of builtin symbols ({@link BuiltinScope})</li>
 * <li>enabled extensions ({@link GLSLExtensionSet}, via {@link BuiltinScope#extensions})</li>
 * </ul>
 * A working set is created by {@link GLSLBuiltin#createWorkingSet()}.
 * @author homac
 *
 */
public class WorkingSet {
	private BuiltinScope builtinScope;
	private HashMap<String, Macro> builtinMacros;
	private ExtendableTokenTable tokenTable;
	private GLSLVersion version;
	private ShaderType shaderType;
	
	public WorkingSet(GLSLVersion version, ShaderType shaderType, BuiltinScope builtinScope, ExtendableTokenTable tokenTable, HashMap<String, Macro> builtinMacros) {
		super();
		this.version = version;
		this.shaderType = shaderType;
		this.builtinScope = builtinScope;
		this.tokenTable = tokenTable;
		this.builtinMacros = builtinMacros;
	}

	public ExtendableTokenTable getTokenTable() {
		return this.tokenTable;
	}
	
	public ShaderType getShaderType() {
		return shaderType;
	}
	
	public GLSLVersion getGLSLVersion() {
		return version;
	}
	
	public BuiltinScope getBuiltinScope() {
		return this.builtinScope;
	}

	public HashMap<String, Macro> getBuiltinMacros() {
		return this.builtinMacros;
	}

	
	public GLSLExtensionSet getExtensions() {
		return this.builtinScope.getExtensions();
	}


	public void enableExtension(PPState ppstate, String identifier) {
		GLSLExtensionSet extensions = this.builtinScope.getExtensions();
		GLSLExtension e = extensions.getExtension(identifier);
		if (e == null) {
			GLSLExtensionServices services = ppstate.getCompiler().getExtensionServices();
			e = services.getExtension(this, identifier);
			extensions.addExtension(e);
		}
		e.enable(ppstate);
	}

	/**
	 * Note: In terms of syntax checking, disabling extensions is basically ignored (see system specification).
	 * @param ppstate
	 * @param identifier
	 */
	public void disableExtension(PPState ppstate, String identifier) {
		GLSLExtensionSet extensions = this.builtinScope.getExtensions();
		GLSLExtension e = extensions.getExtension(identifier);
		if (e != null) {
			e.disable(ppstate);
		} else {
			// has never been enabled
		}
	}

	/**
	 * Note: In terms of syntax checking, disabling extensions is basically ignored (see system specification).
	 * @param state
	 */
	public void disableExtensionsAll(PPState state) {
		GLSLExtensionSet extensions = this.builtinScope.getExtensions();
		for (GLSLExtension e : extensions) {
			e.disable(state);
		}
	}

	public void dump(PrintStream out) {
		this.builtinScope.dump(out, "");
		for (Macro m : this.builtinMacros.values()) {
			out.println("macro: " + m.toString());
		}
	}

	public boolean haveBuiltinType(String type) {
		return this.builtinScope.containsType(type) || this.getExtensions().containsType(type);
	}

	
}