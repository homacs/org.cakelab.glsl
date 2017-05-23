package org.cakelab.glsl.parser;


public class TestNumber extends TestBaseGLSL {

	public static void test() {
		testInteger();
		testUnsignedInteger();
		testFloat();
		testDouble();
	}

	private static void testDouble() {
		
		// FLOATCONSTANT DECIMAL
		assertValid(p("0.").glslDoubleConstant());
		assertValid(p("00.").glslDoubleConstant());
		assertValid(p("10.").glslDoubleConstant());
		assertValid(p("90000.").glslDoubleConstant());
		assertValid(p("9.").glslDoubleConstant());
		
		assertValid(p("+010.").glslDoubleConstant());
		assertValid(p("-09.").glslDoubleConstant());

		assertValid(p("+010.l").glslDoubleConstant());
		assertValid(p("-09.L").glslDoubleConstant());

		assertValid(p("+010.e1").glslDoubleConstant());
		assertValid(p("-09.E900").glslDoubleConstant());

		assertValid(p("+010.e+1").glslDoubleConstant());
		assertValid(p("-09.E-900").glslDoubleConstant());

		assertValid(p("+010.e1l").glslDoubleConstant());
		assertValid(p("-09.E900L").glslDoubleConstant());

		assertValid(p("+010.e+1l").glslDoubleConstant());
		assertValid(p("-09.E-900L").glslDoubleConstant());

		
		
		assertValid(p(".0").glslDoubleConstant());
		assertValid(p(".00").glslDoubleConstant());
		assertValid(p(".1").glslDoubleConstant());
		assertValid(p(".9").glslDoubleConstant());
		assertValid(p(".00001").glslDoubleConstant());
		assertValid(p(".00009").glslDoubleConstant());

		assertInvalid(p(".").glslDoubleConstant());
		assertInvalid(p("-.").glslDoubleConstant());
		assertInvalid(p("a.").glslDoubleConstant());

		assertInvalid(p(".a").glslDoubleConstant());
		assertInvalid(p(".00a").glslDoubleConstant());

		assertInvalid(p("+010.e").glslDoubleConstant());
		assertInvalid(p("-09.E").glslDoubleConstant());

		assertInvalid(p("+010.-e1").glslDoubleConstant());
		assertInvalid(p("-09.+E9").glslDoubleConstant());

		assertInvalid(p("+010.-ea").glslDoubleConstant());
		assertInvalid(p("-09.+Ef").glslDoubleConstant());

		assertInvalid(p("+010.el").glslDoubleConstant());
		assertInvalid(p("-09.EL").glslDoubleConstant());

		// FLOATCONSTANT HEX
		assertValid(p("0x0.").glslDoubleConstant());
		assertValid(p("0X0.").glslDoubleConstant());
		assertValid(p("0x00.").glslDoubleConstant());
		assertValid(p("0x10.").glslDoubleConstant());
		assertValid(p("0xf0000.").glslDoubleConstant());
		assertValid(p("0xf.").glslDoubleConstant());
		
		assertValid(p("+0x010.").glslDoubleConstant());
		assertValid(p("-0x0F.").glslDoubleConstant());

		assertValid(p("+0x010.l").glslDoubleConstant());
		assertValid(p("-0x0f.L").glslDoubleConstant());

		assertValid(p("+0x010.p1").glslDoubleConstant());
		assertValid(p("-0x0F.P900").glslDoubleConstant());

		assertValid(p("+0x010.p+1").glslDoubleConstant());
		assertValid(p("-0x09.P-900").glslDoubleConstant());

		assertValid(p("+0x010.p1l").glslDoubleConstant());
		assertValid(p("-0x09.P900L").glslDoubleConstant());

		assertValid(p("+0x010.p+1l").glslDoubleConstant());
		assertValid(p("-0x09.P-900L").glslDoubleConstant());

		
		
		assertValid(p("0x.0").glslDoubleConstant());
		assertValid(p("0x.00").glslDoubleConstant());
		assertValid(p("0x.1").glslDoubleConstant());
		assertValid(p("0x.9").glslDoubleConstant());
		assertValid(p("0x.00001").glslDoubleConstant());
		assertValid(p("0x.00009").glslDoubleConstant());

		assertInvalid(p("0x.").glslDoubleConstant());
		assertInvalid(p("-0x.").glslDoubleConstant());
		assertInvalid(p("0xg.").glslDoubleConstant());

		assertInvalid(p("0x.g").glslDoubleConstant());
		assertInvalid(p("0x.00g").glslDoubleConstant());

		assertInvalid(p("+0x010.e+5").glslDoubleConstant());
		assertInvalid(p("-0x0F.E-1").glslDoubleConstant());

		assertInvalid(p("+0x010.p+a").glslDoubleConstant());
		assertInvalid(p("-0x0f.P-F").glslDoubleConstant());


		assertInvalid(p("+0x010.p").glslDoubleConstant());
		assertInvalid(p("-0x0f.P").glslDoubleConstant());

		assertInvalid(p("+0x010.-p1").glslDoubleConstant());
		assertInvalid(p("-0x0f.+P9").glslDoubleConstant());

		assertInvalid(p("+0x010.-pa").glslDoubleConstant());
		assertInvalid(p("-0x0f.+Pf").glslDoubleConstant());

		assertInvalid(p("+0x010.pl").glslDoubleConstant());
		assertInvalid(p("-0x0f.PL").glslDoubleConstant());
		
	}

	private static void testFloat() {
		// FLOATCONSTANT DECIMAL
		assertValid(p("0.f").glslFloatConstant());
		assertValid(p("0.F").glslFloatConstant());
		assertValid(p(".0f").glslFloatConstant());
		assertValid(p("0.0F").glslFloatConstant());
		assertValid(p("+0.0f").glslFloatConstant());
		assertValid(p("-0.0F").glslFloatConstant());
		assertValid(p("1.0e1f").glslFloatConstant());
		assertValid(p("1.0E1f").glslFloatConstant());
		assertValid(p("1.0E100f").glslFloatConstant());
		assertValid(p("1.0E+1f").glslFloatConstant());
		assertValid(p("1.0E-1f").glslFloatConstant());
		assertInvalid(p("1.0fE-1f").glslFloatConstant());
		assertInvalid(p("1.0E1.00f").glslFloatConstant());
		// FLOATCONSTANT HEX
		assertValid(p("0x1.f").glslFloatConstant());
		assertInvalid(p("0x.F").glslFloatConstant());
		assertValid(p(".0f").glslFloatConstant());
		assertValid(p("0.0F").glslFloatConstant());
		assertValid(p("+0.0f").glslFloatConstant());
		assertValid(p("-0.0F").glslFloatConstant());
		assertInvalid(p("1.0e1").glslFloatConstant());
		assertValid(p("1.0E1f").glslFloatConstant());
		assertValid(p("1.0E100f").glslFloatConstant());
		assertValid(p("1.0E+1f").glslFloatConstant());
		assertValid(p("1.0E-1f").glslFloatConstant());
	}
	private static void testUnsignedInteger() {
		// INTCONSTANT DECIMAL
		
		assertValid(p("0u").glslUnsignedIntegerConstant());
		assertValid(p("1u").glslUnsignedIntegerConstant());
		assertValid(p("1234567890u").glslUnsignedIntegerConstant());
		
		assertInvalid(p("-0u").glslUnsignedIntegerConstant());
		assertInvalid(p("-1").glslUnsignedIntegerConstant());
		assertValid(p("+0u").glslUnsignedIntegerConstant());
		assertInvalid(p("1").glslUnsignedIntegerConstant());
		assertValid(p("1234567890Ul").glslUnsignedIntegerConstant());
		
		
		
		// INTCONSTANT OCTAL
		
		assertValid(p("01234567u").glslUnsignedIntegerConstant());
		assertInvalid(p("08u").glslUnsignedIntegerConstant());
		assertInvalid(p("09u").glslUnsignedIntegerConstant());
		assertInvalid(p("0au").glslUnsignedIntegerConstant());
		

		// INTCONSTANT HEXADECIMAL
		
		assertValid(p("0x8U").glslUnsignedIntegerConstant());
		assertValid(p("0X9U").glslUnsignedIntegerConstant());
		assertValid(p("0xaU").glslUnsignedIntegerConstant());
		
		assertInvalid(p("0x-8").glslUnsignedIntegerConstant());
		assertInvalid(p("-0X9abcdefABCDEFL").glslUnsignedIntegerConstant());
		assertInvalid(p("0xa").glslUnsignedIntegerConstant());
				
	}

	private static void testInteger() {
		// INTCONSTANT DECIMAL
		
		
		assertValid(p("0").glslIntegerConstant());
		assertValid(p("1").glslIntegerConstant());
		assertValid(p("1234567890").glslIntegerConstant());
		
		assertValid(p("-0").glslIntegerConstant());
		assertValid(p("+0").glslIntegerConstant());
		assertInvalid(p("1u").glslIntegerConstant());
		assertInvalid(p("1234567890Ul").glslIntegerConstant());
		
		
		
		// INTCONSTANT OCTAL
		
		assertValid(p("01234567").glslIntegerConstant());
		assertInvalid(p("08").glslIntegerConstant());
		assertInvalid(p("09").glslIntegerConstant());
		assertInvalid(p("0a").glslIntegerConstant());
		

		// INTCONSTANT HEXADECIMAL
		
		assertValid(p("0x8").glslIntegerConstant());
		assertValid(p("0X9").glslIntegerConstant());
		assertValid(p("0xa").glslIntegerConstant());
		
		assertInvalid(p("0x-8").glslIntegerConstant());
		assertValid(p("-0X9abcdefABCDEFL").glslIntegerConstant());
		assertValid(p("0xaL").glslIntegerConstant());
				
	}


}
