package org.cakelab.glsl.test.pp.syntax;

import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.test.Test;
import org.cakelab.glsl.test.pp.TestingExprBase;

public class TestNumber extends TestingExprBase implements Test {

	public void test() {
		testInteger();
		testUnsignedInteger();
		testFloat();
		testDouble();
	}

	private void testDouble() {
		
		// DOUBLECONSTANT DECIMAL
		assertValid(expr("0.").number());
		assertValid(expr("00.").number());
		assertValid(expr("10.").number());
		assertValid(expr("90000.").number());
		assertValid(expr("9.").number());
		
		assertValid(expr("010.").number());
		assertValid(expr("09.").number());

		assertValid(expr("010.l").number());
		assertValid(expr("09.L").number());

		assertValid(expr("010.e1").number());
		assertValid(expr("09.E900").number());

		assertValid(expr("010.e+1").number());
		assertValid(expr("09.E-900").number());

		assertValid(expr("010.e1l").number());
		assertValid(expr("09.E900L").number());

		assertValid(expr("010.e+1l").number());
		assertValid(expr("09.E-900L").number());

		
		
		assertValid(expr(".0").number());
		assertValid(expr(".00").number());
		assertValid(expr(".1").number());
		assertValid(expr(".9").number());
		assertValid(expr(".00001").number());
		assertValid(expr(".00009").number());

		assertInvalid(expr(".").number());
		assertInvalid(expr("a.").number());

		assertInvalid(expr(".a").number());
		assertInvalid(expr(".00a").number());

		assertInvalid(expr("010.e").number());
		assertInvalid(expr("09.E").number());

		assertInvalid(expr("010.-e1").number());
		assertInvalid(expr("09.+E9").number());

		assertInvalid(expr("010.-ea").number());
		assertInvalid(expr("09.+Ef").number());

		assertInvalid(expr("010.el").number());
		assertInvalid(expr("09.EL").number());

		// DOUBLECONSTANT HEX
		assertValid(expr("0x0.").number());
		assertValid(expr("0X0.").number());
		assertValid(expr("0x00.").number());
		assertValid(expr("0x10.").number());
		assertValid(expr("0xf0000.").number());
		assertValid(expr("0xf.").number());
		
		assertValid(expr("0x010.").number());
		assertValid(expr("0x0F.").number());

		assertValid(expr("0x010.l").number());
		assertValid(expr("0x0f.L").number());

		assertValid(expr("0x010.p1").number());
		assertValid(expr("0x0F.P900").number());

		assertValid(expr("0x010.p+1").number());
		assertValid(expr("0x09.P-900").number());

		assertValid(expr("0x010.p1l").number());
		assertValid(expr("0x09.P900L").number());

		assertValid(expr("0x010.p+1l").number());
		assertValid(expr("0x09.P-900L").number());

		
		
		assertValid(expr("0x.0").number());
		assertValid(expr("0x.00").number());
		assertValid(expr("0x.1").number());
		assertValid(expr("0x.9").number());
		assertValid(expr("0x.00001").number());
		assertValid(expr("0x.00009").number());

		assertInvalid(expr("0x.").number());
		assertInvalid(expr("0xg.").number());

		assertInvalid(expr("0x.g").number());
		assertInvalid(expr("0x.00g").number());

		assertInvalid(expr("0x010.e+5").number());
		assertInvalid(expr("0x0F.E-1").number());

		assertInvalid(expr("0x010.p+a").number());
		assertInvalid(expr("0x0f.P-F").number());


		assertInvalid(expr("0x010.p").number());
		assertInvalid(expr("0x0f.P").number());

		assertInvalid(expr("0x010.-p1").number());
		assertInvalid(expr("0x0f.+P9").number());

		assertInvalid(expr("0x010.-pa").number());
		assertInvalid(expr("0x0f.+Pf").number());

		assertInvalid(expr("0x010.pl").number());
		assertInvalid(expr("0x0f.PL").number());
		
	}

	private void assertValid(Expression number) {
		// TODO [4] number testing more serious
		// type, qualifier and value
		assertValid(number, number.getClass());
	}

	private void testFloat() {
		// FLOATCONSTANT DECIMAL
		assertValid(expr("0.f").number());
		assertValid(expr("0.F").number());
		assertValid(expr(".0f").number());
		assertValid(expr("0.0F").number());
		assertValid(expr("1.0e1f").number());
		assertValid(expr("1.0E1f").number());
		assertValid(expr("1.0E100f").number());
		assertValid(expr("1.0E+1f").number());
		assertValid(expr("1.0E-1f").number());
		assertInvalid(expr("1.0fE-1f").number());
		assertInvalid(expr("1.0E1.00f").number());
		
		// FLOATCONSTANT HEX
		assertValid(expr("0x1.f").number());
		assertValid(expr("0x.F").number()); // --> double const
		assertValid(expr(".0f").number());
		assertValid(expr("0.0F").number());
		assertValid(expr("1.0E1f").number());
		assertValid(expr("1.0E100f").number());
		assertValid(expr("1.0E+1f").number());
		assertValid(expr("1.0E-1f").number());
	}
	private void testUnsignedInteger() {
		// INTCONSTANT DECIMAL
		
		assertValid(expr("0u").number());
		assertValid(expr("1u").number());
		assertValid(expr("1234567890u").number());
		
		assertValid(expr("1234567890Ul").number());
		
		
		
		// INTCONSTANT OCTAL
		
		assertValid(expr("01234567u").number());
		assertInvalid(expr("08u").number());
		assertInvalid(expr("09u").number());
		assertInvalid(expr("0au").number());
		

		// INTCONSTANT HEXADECIMAL
		
		assertValid(expr("0x8U").number());
		assertValid(expr("0X9U").number());
		assertValid(expr("0xaU").number());
		
		assertInvalid(expr("0x-8").number());
				
	}

	private void testInteger() {
		// INTCONSTANT DECIMAL
		
		
		assertValid(expr("0").number());
		assertValid(expr("1").number());
		assertValid(expr("1234567890").number());
		
		
		// INTCONSTANT OCTAL
		
		assertValid(expr("01234567").number());
		assertInvalid(expr("08").number());
		assertInvalid(expr("09").number());
		assertInvalid(expr("0a").number());
		

		// INTCONSTANT HEXADECIMAL
		
		assertValid(expr("0x8").number());
		assertValid(expr("0X9").number());
		assertValid(expr("0xa").number());
		
		assertInvalid(expr("0x-8").number());
		assertValid(expr("0X9abcdefABCDEFL").number());
		assertValid(expr("0xaL").number());
				
	}


}
