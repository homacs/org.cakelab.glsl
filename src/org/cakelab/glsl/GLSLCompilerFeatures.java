package org.cakelab.glsl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.cakelab.glsl.GLSLVersion.Profile;
import org.cakelab.glsl.builtin.BuiltinLoaderHelper;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.tokens.TNumber;

/**
 * An instance of this class is used to define which features 
 * (profiles and extensions) are supported by the compiler.
 * <p>
 * The default feature set (available through GLSL#getDefaultCompilerFeatures())
 * supports all extensions and profiles. This class allows to limit the feature 
 * set to mimic a specific compiler implementation.
 * </p>
 * 
 * @see GLSL#getDefaultCompilerFeatures()
 * 
 * @author homac
 *
 */
public class GLSLCompilerFeatures {
	private static final TNumber ONE = new TNumber("1");
	private final GLSLVersion.Profile[] profiles;
	private final Collection<String[]> extensions;
	private final HashMap<String, Macro> featureMacros;
	
	public GLSLCompilerFeatures(Profile[] profiles, Collection<String[]> extensions) {
		super();
		assert (profiles != null && profiles.length > 0) : "must support at least one profile";
		assert (extensions != null) : "use empty list instead";
		this.profiles = profiles;
		this.extensions = extensions;
		this.featureMacros = new HashMap<String, Macro>();
		
		addSupportedExtensionMacros(this.featureMacros, extensions);
		addSupportedProfileMacros(this.featureMacros, profiles);
	}

	public GLSLCompilerFeatures(Profile[] values) {
		this(values, new ArrayList<String[]>());
	}

	public GLSLVersion.Profile[] getProfiles() {
		return profiles;
	}

	public Collection<String[]> getExtensions() {
		return extensions;
	}
	

	public HashMap<String, Macro> getFeatureMacros() {
		return featureMacros;
	}
	
	private static void addSupportedProfileMacros(HashMap<String, Macro> macros, Profile[] profiles) {
		for (Profile p : profiles) {
			Macro m = BuiltinLoaderHelper.createMacro(p.getMacroName(), ONE);
			macros.put(p.name(), m);
		}
	}

	private static void addSupportedExtensionMacros(HashMap<String, Macro> macros, Collection<String[]> extensionNames) {
		for (String[] alternativeNames : extensionNames) {
			for (String name : alternativeNames) {
				Macro m = BuiltinLoaderHelper.createMacro(name, ONE);
				macros.put(name, m);
			}
		}
	}


}
