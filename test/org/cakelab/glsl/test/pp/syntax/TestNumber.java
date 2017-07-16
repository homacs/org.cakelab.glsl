package org.cakelab.glsl.test.pp.syntax;

import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.test.pp.TestingPPBase;

public class TestNumber extends TestingPPBase {

	public static void test() {
		testInteger();
		testUnsignedInteger();
		testFloat();
		testDouble();
	}

	private static void testDouble() {
		
		// DOUBLECONSTANT DECIMAL
		assertValid(p("0.").number());
		assertValid(p("00.").number());
		assertValid(p("10.").number());
		assertValid(p("90000.").number());
		assertValid(p("9.").number());
		
		assertValid(p("010.").number());
		assertValid(p("09.").number());

		assertValid(p("010.l").number());
		assertValid(p("09.L").number());

		assertValid(p("010.e1").number());
		assertValid(p("09.E900").number());

		assertValid(p("010.e+1").number());
		assertValid(p("09.E-900").number());

		assertValid(p("010.e1l").number());
		assertValid(p("09.E900L").number());

		assertValid(p("010.e+1l").number());
		assertValid(p("09.E-900L").number());

		
		
		assertValid(p(".0").number());
		assertValid(p(".00").number());
		assertValid(p(".1").number());
		assertValid(p(".9").number());
		assertValid(p(".00001").number());
		assertValid(p(".00009").number());

		assertInvalid(p(".").number());
		assertInvalid(p("a.").number());

		assertInvalid(p(".a").number());
		assertInvalid(p(".00a").number());

		assertInvalid(p("010.e").number());
		assertInvalid(p("09.E").number());

		assertInvalid(p("010.-e1").number());
		assertInvalid(p("09.+E9").number());

		assertInvalid(p("010.-ea").number());
		assertInvalid(p("09.+Ef").number());

		assertInvalid(p("010.el").number());
		assertInvalid(p("09.EL").number());

		// DOUBLECONSTANT HEX
		assertValid(p("0x0.").number());
		assertValid(p("0X0.").number());
		assertValid(p("0x00.").number());
		assertValid(p("0x10.").number());
		assertValid(p("0xf0000.").number());
		assertValid(p("0xf.").number());
		
		assertValid(p("0x010.").number());
		assertValid(p("0x0F.").number());

		assertValid(p("0x010.l").number());
		assertValid(p("0x0f.L").number());

		assertValid(p("0x010.p1").number());
		assertValid(p("0x0F.P900").number());

		assertValid(p("0x010.p+1").number());
		assertValid(p("0x09.P-900").number());

		assertValid(p("0x010.p1l").number());
		assertValid(p("0x09.P900L").number());

		assertValid(p("0x010.p+1l").number());
		assertValid(p("0x09.P-900L").number());

		
		
		assertValid(p("0x.0").number());
		assertValid(p("0x.00").number());
		assertValid(p("0x.1").number());
		assertValid(p("0x.9").number());
		assertValid(p("0x.00001").number());
		assertValid(p("0x.00009").number());

		assertInvalid(p("0x.").number());
		assertInvalid(p("0xg.").number());

		assertInvalid(p("0x.g").number());
		assertInvalid(p("0x.00g").number());

		assertInvalid(p("0x010.e+5").number());
		assertInvalid(p("0x0F.E-1").number());

		assertInvalid(p("0x010.p+a").number());
		assertInvalid(p("0x0f.P-F").number());


		assertInvalid(p("0x010.p").number());
		assertInvalid(p("0x0f.P").number());

		assertInvalid(p("0x010.-p1").number());
		assertInvalid(p("0x0f.+P9").number());

		assertInvalid(p("0x010.-pa").number());
		assertInvalid(p("0x0f.+Pf").number());

		assertInvalid(p("0x010.pl").number());
		assertInvalid(p("0x0f.PL").number());
		
	}

	private static void assertValid(Expression number) {
		// TODO number testing more serious
		assertValid(number, number.getClass());
	}

	private static void testFloat() {
		// FLOATCONSTANT DECIMAL
		assertValid(p("0.f").number());
		assertValid(p("0.F").number());
		assertValid(p(".0f").number());
		assertValid(p("0.0F").number());
		assertValid(p("1.0e1f").number());
		assertValid(p("1.0E1f").number());
		assertValid(p("1.0E100f").number());
		assertValid(p("1.0E+1f").number());
		assertValid(p("1.0E-1f").number());
		assertInvalid(p("1.0fE-1f").number());
		assertInvalid(p("1.0E1.00f").number());
		
		// FLOATCONSTANT HEX
		assertValid(p("0x1.f").number());
		assertValid(p("0x.F").number()); // --> double const
		assertValid(p(".0f").number());
		assertValid(p("0.0F").number());
		assertValid(p("1.0E1f").number());
		assertValid(p("1.0E100f").number());
		assertValid(p("1.0E+1f").number());
		assertValid(p("1.0E-1f").number());
	}
	private static void testUnsignedInteger() {
		// INTCONSTANT DECIMAL
		
		assertValid(p("0u").number());
		assertValid(p("1u").number());
		assertValid(p("1234567890u").number());
		
		assertValid(p("1234567890Ul").number());
		
		
		
		// INTCONSTANT OCTAL
		
		assertValid(p("01234567u").number());
		assertInvalid(p("08u").number());
		assertInvalid(p("09u").number());
		assertInvalid(p("0au").number());
		

		// INTCONSTANT HEXADECIMAL
		
		assertValid(p("0x8U").number());
		assertValid(p("0X9U").number());
		assertValid(p("0xaU").number());
		
		assertInvalid(p("0x-8").number());
				
	}

	private static void testInteger() {
		// INTCONSTANT DECIMAL
		
		
		assertValid(p("0").number());
		assertValid(p("1").number());
		assertValid(p("1234567890").number());
		
		
		// INTCONSTANT OCTAL
		
		assertValid(p("01234567").number());
		assertInvalid(p("08").number());
		assertInvalid(p("09").number());
		assertInvalid(p("0a").number());
		

		// INTCONSTANT HEXADECIMAL
		
		assertValid(p("0x8").number());
		assertValid(p("0X9").number());
		assertValid(p("0xa").number());
		
		assertInvalid(p("0x-8").number());
		assertValid(p("0X9abcdefABCDEFL").number());
		assertValid(p("0xaL").number());
				
	}


}
