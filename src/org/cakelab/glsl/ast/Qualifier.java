package org.cakelab.glsl.ast;

public class Qualifier {
	public static class LayoutQualifier extends Qualifier {
		final Expression[] layoutParams;

		public LayoutQualifier(Expression[] layoutParams) {
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
	
	public static Qualifier _layout(Expression[] layoutParams) {
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

}
