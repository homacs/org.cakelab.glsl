package org.cakelab.glsl.lang.ast;

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

		LayoutQualifier(Parameter[] layoutParams) {
			super(LAYOUT);
			this.layoutParams = layoutParams;
		}
		
		public String toString() {
			StringBuffer result = new StringBuffer("layout(");
			for (int i = 0; i < layoutParams.length; i++) {
				result.append(layoutParams[i].name);
				String value = layoutParams[i].value;
				if (value != null) {
					result.append(" = ").append(value);
				}
				if (i+1 < layoutParams.length) result.append(", ");
			}
			return result.toString();
		}

	}

	public static class SubroutineQualifier extends Qualifier {
		final Function[] functions;

		SubroutineQualifier(Function ... functions) {
			super("subroutine");
			this.functions = functions;
		}
		
		public String toString() {
			StringBuffer result = new StringBuffer("subroutine(");
			for (int i = 0; i < functions.length; i++) {
				result.append(functions[i].name);
				if (i+1 < functions.length) result.append(' ');
			}
			return result.toString();
		}
	}
	

	public static class InvariantQualifier extends Qualifier {
		InvariantQualifier(String name) {
			super(name);
		}
	}
	
	public static class InterpolationQualifier extends Qualifier {
		InterpolationQualifier(String name) {
			super(name);
		}
	}


	public static class PreciseQualifier extends Qualifier {
		PreciseQualifier(String name) {
			super(name);
		}
	}
	
	public static class PrecisionQualifier extends Qualifier {
		PrecisionQualifier(String name) {
			super(name);
		}
	}

	public static class StorageQualifier extends Qualifier {
		StorageQualifier(String name) {
			super(name);
		}
	}
	
	public static class DirectionQualifier extends StorageQualifier {
		DirectionQualifier(String name) {
			super(name);
		}
	}
	

	private final String name;

	Qualifier(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}


	public String toString() {
		return this.getName();
	}
	
	
	public static InvariantQualifier _invariant = new InvariantQualifier("invariant");

	//
	// Interpolation
	//
	public static InterpolationQualifier _smooth = new InterpolationQualifier("smooth");
	public static InterpolationQualifier _flat   = new InterpolationQualifier("flat");
	public static InterpolationQualifier _noperspective = new InterpolationQualifier("noperspective");
	
	//
	// Layout qualifiers need to be instantiated for each specific layout
	//
	public static String LAYOUT = "layout";
	public static String LAYOUT_SHARED = "shared";
	
	public static LayoutQualifier _layout(LayoutQualifier.Parameter[] layoutParams) {
		return new LayoutQualifier(layoutParams);
	}
	
	
	//
	// precise
	//
	public static PreciseQualifier _precise = new PreciseQualifier("precise");
	
	//
	// Storage qualifiers
	//
	public static StorageQualifier _const = new StorageQualifier("const");
	public static StorageQualifier _attribute = new StorageQualifier("attribute");
	public static StorageQualifier _varying = new StorageQualifier("varying");
	public static DirectionQualifier _inout = new DirectionQualifier("inout");
	public static DirectionQualifier _in = new DirectionQualifier("in");
	public static DirectionQualifier _out = new DirectionQualifier("out");
	public static StorageQualifier _centroid = new StorageQualifier("centroid");
	public static StorageQualifier _patch = new StorageQualifier("patch");
	public static StorageQualifier _sample = new StorageQualifier("sample");
	public static StorageQualifier _uniform = new StorageQualifier("uniform");
	public static StorageQualifier _buffer = new StorageQualifier("buffer");
	public static StorageQualifier _shared = new StorageQualifier("shared");
	public static StorageQualifier _coherent = new StorageQualifier("coherent");
	public static StorageQualifier _volatile = new StorageQualifier("volatile");
	public static StorageQualifier _restrict = new StorageQualifier("restrict");
	public static StorageQualifier _readonly = new StorageQualifier("readonly");
	public static StorageQualifier _writeonly = new StorageQualifier("writeonly");

	public static SubroutineQualifier _subroutine(Function ...functions) {
		return new SubroutineQualifier(functions);
	}
	
	//
	// precision qualifier
	//
	public static PrecisionQualifier _highp = new PrecisionQualifier("highp");
	public static PrecisionQualifier _mediump = new PrecisionQualifier("mediump");
	public static PrecisionQualifier _lowp = new PrecisionQualifier("lowp");

	
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

	/** Selects one of _highp, _midp, _lowp */
	public static PrecisionQualifier _precision(String text) {
		Qualifier q = byname.get(text);
		if (q instanceof PrecisionQualifier) {
			return (PrecisionQualifier) q;
		} else {
			throw new Error("internal error: precision qualifier '" + text + "' does not exist");
		}
	}

}
