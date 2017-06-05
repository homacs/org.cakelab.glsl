package org.cakelab.glsl.test.pp.syntax;


public class TestNumber extends TestBaseGLSLPP {

	public static void test() {
		testInteger();
		testUnsignedInteger();
		testFloat();
		testDouble();
	}

	private static void testDouble() {
		
		// DOUBLECONSTANT DECIMAL
		assertValid(p("0.").glslppNumber());
		assertValid(p("00.").glslppNumber());
		assertValid(p("10.").glslppNumber());
		assertValid(p("90000.").glslppNumber());
		assertValid(p("9.").glslppNumber());
		
		assertValid(p("010.").glslppNumber());
		assertValid(p("09.").glslppNumber());

		assertValid(p("010.l").glslppNumber());
		assertValid(p("09.L").glslppNumber());

		assertValid(p("010.e1").glslppNumber());
		assertValid(p("09.E900").glslppNumber());

		assertValid(p("010.e+1").glslppNumber());
		assertValid(p("09.E-900").glslppNumber());

		assertValid(p("010.e1l").glslppNumber());
		assertValid(p("09.E900L").glslppNumber());

		assertValid(p("010.e+1l").glslppNumber());
		assertValid(p("09.E-900L").glslppNumber());

		
		
		assertValid(p(".0").glslppNumber());
		assertValid(p(".00").glslppNumber());
		assertValid(p(".1").glslppNumber());
		assertValid(p(".9").glslppNumber());
		assertValid(p(".00001").glslppNumber());
		assertValid(p(".00009").glslppNumber());

		assertInvalid(p(".").glslppNumber());
		assertInvalid(p("a.").glslppNumber());

		assertInvalid(p(".a").glslppNumber());
		assertInvalid(p(".00a").glslppNumber());

		assertInvalid(p("010.e").glslppNumber());
		assertInvalid(p("09.E").glslppNumber());

		assertInvalid(p("010.-e1").glslppNumber());
		assertInvalid(p("09.+E9").glslppNumber());

		assertInvalid(p("010.-ea").glslppNumber());
		assertInvalid(p("09.+Ef").glslppNumber());

		assertInvalid(p("010.el").glslppNumber());
		assertInvalid(p("09.EL").glslppNumber());

		// DOUBLECONSTANT HEX
		assertValid(p("0x0.").glslppNumber());
		assertValid(p("0X0.").glslppNumber());
		assertValid(p("0x00.").glslppNumber());
		assertValid(p("0x10.").glslppNumber());
		assertValid(p("0xf0000.").glslppNumber());
		assertValid(p("0xf.").glslppNumber());
		
		assertValid(p("0x010.").glslppNumber());
		assertValid(p("0x0F.").glslppNumber());

		assertValid(p("0x010.l").glslppNumber());
		assertValid(p("0x0f.L").glslppNumber());

		assertValid(p("0x010.p1").glslppNumber());
		assertValid(p("0x0F.P900").glslppNumber());

		assertValid(p("0x010.p+1").glslppNumber());
		assertValid(p("0x09.P-900").glslppNumber());

		assertValid(p("0x010.p1l").glslppNumber());
		assertValid(p("0x09.P900L").glslppNumber());

		assertValid(p("0x010.p+1l").glslppNumber());
		assertValid(p("0x09.P-900L").glslppNumber());

		
		
		assertValid(p("0x.0").glslppNumber());
		assertValid(p("0x.00").glslppNumber());
		assertValid(p("0x.1").glslppNumber());
		assertValid(p("0x.9").glslppNumber());
		assertValid(p("0x.00001").glslppNumber());
		assertValid(p("0x.00009").glslppNumber());

		assertInvalid(p("0x.").glslppNumber());
		assertInvalid(p("0xg.").glslppNumber());

		assertInvalid(p("0x.g").glslppNumber());
		assertInvalid(p("0x.00g").glslppNumber());

		assertInvalid(p("0x010.e+5").glslppNumber());
		assertInvalid(p("0x0F.E-1").glslppNumber());

		assertInvalid(p("0x010.p+a").glslppNumber());
		assertInvalid(p("0x0f.P-F").glslppNumber());


		assertInvalid(p("0x010.p").glslppNumber());
		assertInvalid(p("0x0f.P").glslppNumber());

		assertInvalid(p("0x010.-p1").glslppNumber());
		assertInvalid(p("0x0f.+P9").glslppNumber());

		assertInvalid(p("0x010.-pa").glslppNumber());
		assertInvalid(p("0x0f.+Pf").glslppNumber());

		assertInvalid(p("0x010.pl").glslppNumber());
		assertInvalid(p("0x0f.PL").glslppNumber());
		
	}

	private static void testFloat() {
		// FLOATCONSTANT DECIMAL
		assertValid(p("0.f").glslppNumber());
		assertValid(p("0.F").glslppNumber());
		assertValid(p(".0f").glslppNumber());
		assertValid(p("0.0F").glslppNumber());
		assertValid(p("1.0e1f").glslppNumber());
		assertValid(p("1.0E1f").glslppNumber());
		assertValid(p("1.0E100f").glslppNumber());
		assertValid(p("1.0E+1f").glslppNumber());
		assertValid(p("1.0E-1f").glslppNumber());
		assertInvalid(p("1.0fE-1f").glslppNumber());
		assertInvalid(p("1.0E1.00f").glslppNumber());
		
		// FLOATCONSTANT HEX
		assertValid(p("0x1.f").glslppNumber());
		assertValid(p("0x.F").glslppNumber()); // --> double const
		assertValid(p(".0f").glslppNumber());
		assertValid(p("0.0F").glslppNumber());
		assertValid(p("1.0E1f").glslppNumber());
		assertValid(p("1.0E100f").glslppNumber());
		assertValid(p("1.0E+1f").glslppNumber());
		assertValid(p("1.0E-1f").glslppNumber());
	}
	private static void testUnsignedInteger() {
		// INTCONSTANT DECIMAL
		
		assertValid(p("0u").glslppNumber());
		assertValid(p("1u").glslppNumber());
		assertValid(p("1234567890u").glslppNumber());
		
		assertValid(p("1234567890Ul").glslppNumber());
		
		
		
		// INTCONSTANT OCTAL
		
		assertValid(p("01234567u").glslppNumber());
		assertInvalid(p("08u").glslppNumber());
		assertInvalid(p("09u").glslppNumber());
		assertInvalid(p("0au").glslppNumber());
		

		// INTCONSTANT HEXADECIMAL
		
		assertValid(p("0x8U").glslppNumber());
		assertValid(p("0X9U").glslppNumber());
		assertValid(p("0xaU").glslppNumber());
		
		assertInvalid(p("0x-8").glslppNumber());
				
	}

	private static void testInteger() {
		// INTCONSTANT DECIMAL
		
		
		assertValid(p("0").glslppNumber());
		assertValid(p("1").glslppNumber());
		assertValid(p("1234567890").glslppNumber());
		
		
		// INTCONSTANT OCTAL
		
		assertValid(p("01234567").glslppNumber());
		assertInvalid(p("08").glslppNumber());
		assertInvalid(p("09").glslppNumber());
		assertInvalid(p("0a").glslppNumber());
		

		// INTCONSTANT HEXADECIMAL
		
		assertValid(p("0x8").glslppNumber());
		assertValid(p("0X9").glslppNumber());
		assertValid(p("0xa").glslppNumber());
		
		assertInvalid(p("0x-8").glslppNumber());
		assertValid(p("0X9abcdefABCDEFL").glslppNumber());
		assertValid(p("0xaL").glslppNumber());
				
	}


}
