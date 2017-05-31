package org.cakelab.glsl.ast;

import java.util.HashMap;

public class Qualifier {
	public static class LayoutQualifier extends Qualifier {
		public static class Parameter {
			String name;
			String value;
			
			public Parameter(String name, String value) {
				this.name = name;
				this.value = value;
				
			}

			public Parameter(String name) {
				this.name = name;
			}

			public static Parameter SHARED = new Parameter("shared");
		}
		final Parameter[] layoutParams;

		public LayoutQualifier(Parameter[] layoutParams) {
			super(LAYOUT);
			this.layoutParams = layoutParams;
		}
	}

	public static class SubroutineQualifier extends Qualifier {
		final Function[] functions;

		public SubroutineQualifier(Function ... functions) {
			super("subroutine");
			this.functions = functions;
		}
	}
	
	
	final String name;

	Qualifier(String name) {
		this.name = name;
	}
	
	public static Qualifier _invariant = new Qualifier("invariant");

	//
	// Interpolation
	//
	public static Qualifier _smooth = new Qualifier("smooth");
	public static Qualifier _flat   = new Qualifier("flat");
	public static Qualifier _noperspective = new Qualifier("noperspective");
	
	//
	// Layout qualifiers need to be instantiated for each specific layout
	//
	public static String LAYOUT = "layout";
	public static String LAYOUT_SHARED = "shared";
	
	public static Qualifier _layout(LayoutQualifier.Parameter[] layoutParams) {
		return new LayoutQualifier(layoutParams);
	}
	
	
	//
	// precise
	//
	public static Qualifier _precise = new Qualifier("precise");
	
	//
	// Storage qualifiers
	//
	public static Qualifier _const = new Qualifier("const");
	public static Qualifier _attribute = new Qualifier("attribute");
	public static Qualifier _varying = new Qualifier("varying");
	public static Qualifier _inout = new Qualifier("inout");
	public static Qualifier _in = new Qualifier("in");
	public static Qualifier _out = new Qualifier("out");
	public static Qualifier _centroid = new Qualifier("centroid");
	public static Qualifier _patch = new Qualifier("patch");
	public static Qualifier _sample = new Qualifier("sample");
	public static Qualifier _uniform = new Qualifier("uniform");
	public static Qualifier _buffer = new Qualifier("buffer");
	public static Qualifier _shared = new Qualifier("shared");
	public static Qualifier _coherent = new Qualifier("coherent");
	public static Qualifier _volatile = new Qualifier("volatile");
	public static Qualifier _restrict = new Qualifier("restrict");
	public static Qualifier _readonly = new Qualifier("readonly");
	public static Qualifier _writeonly = new Qualifier("writeonly");
	public static Qualifier _subroutine(Function ...functions) {
		return new SubroutineQualifier(functions);
	}
	
	//
	// precision qualifier
	//
	public static Qualifier _highp = new Qualifier("highp");
	public static Qualifier _mediump = new Qualifier("mediump");
	public static Qualifier _lowp = new Qualifier("lowp");

	
	static HashMap<String, Qualifier> byname = new HashMap<String, Qualifier>();
	static {

		byname.put("invariant", _invariant);

		//
		// Interpolation
		//
		byname.put("smooth", _smooth);
		byname.put("flat", _flat);
		byname.put("noperspective", _noperspective);
		
		
		
		//
		// precise
		//
		byname.put("precise", _precise);
		
		//
		// Storage qualifiers
		//
		byname.put("const", _const);
		byname.put("attribute", _attribute);
		byname.put("varying", _varying);
		byname.put("inout", _inout);
		byname.put("in", _in);
		byname.put("out", _out);
		byname.put("centroid", _centroid);
		byname.put("patch", _patch);
		byname.put("sample", _sample);
		byname.put("uniform", _uniform);
		byname.put("buffer", _buffer);
		byname.put("shared", _shared);
		byname.put("coherent", _coherent);
		byname.put("volatile", _volatile);
		byname.put("restrict", _restrict);
		byname.put("readonly", _readonly);
		byname.put("writeonly", _writeonly);
		
		//
		// precision qualifier
		//
		byname.put("highp", _highp);
		byname.put("mediump", _mediump);
		byname.put("lowp", _lowp);

	}
	
	public static Qualifier get(String name) {
		return byname.get(name);
	}

}
