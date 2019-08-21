package org.cakelab.glsl.test.lang.syntax;

import org.cakelab.glsl.test.TestProvider;

public class TestNumber extends TestingSyntaxBase {

	public TestNumber(TestProvider tester) {
		super(tester);
	}

	public void test() {
		testInteger();
		testUnsignedInteger();
		testFloat();
		testDouble();
	}

	private void testDouble() {
		
		// FLOATCONSTANT DECIMAL
		assertValid("0.");
		assertValid("00.");
		assertValid("10.");
		assertValid("90000.");
		assertValid("9.");
		
		assertValid("010.");
		assertValid("09.");

		assertValid("010.l");
		assertValid("09.L");

		assertValid("010.e1");
		assertValid("09.E900");

		assertValid("010.e+1");
		assertValid("09.E-900");

		assertValid("010.e1l");
		assertValid("09.E900L");

		assertValid("010.e+1l");
		assertValid("09.E-900L");

		
		
		assertValid(".0");
		assertValid(".00");
		assertValid(".1");
		assertValid(".9");
		assertValid(".00001");
		assertValid(".00009");

		assertInvalid(".");
		assertInvalid("-.");
		assertInvalid("a.");

		assertInvalid(".a");
		assertInvalid(".00a");

		assertInvalid("+010.e");
		assertInvalid("-09.E");

		assertInvalid("+010.-e1");
		assertInvalid("-09.+E9");

		assertInvalid("+010.-ea");
		assertInvalid("-09.+Ef");

		assertInvalid("+010.el");
		assertInvalid("-09.EL");

		// FLOATCONSTANT HEX
		assertValid("0x0.");
		assertValid("0X0.");
		assertValid("0x00.");
		assertValid("0x10.");
		assertValid("0xf0000.");
		assertValid("0xf.");
		
		assertValid("0x010.");
		assertValid("0x0F.");

		assertValid("0x010.l");
		assertValid("0x0f.L");

		assertValid("0x010.p1");
		assertValid("0x0F.P900");

		assertValid("0x010.p+1");
		assertValid("0x09.P-900");

		assertValid("0x010.p1l");
		assertValid("0x09.P900L");

		assertValid("0x010.p+1l");
		assertValid("0x09.P-900L");

		
		
		assertValid("0x.0");
		assertValid("0x.00");
		assertValid("0x.1");
		assertValid("0x.9");
		assertValid("0x.00001");
		assertValid("0x.00009");

		assertInvalid("0x.");
		assertInvalid("-0x.");
		assertInvalid("0xg.");

		assertInvalid("0x.g");
		assertInvalid("0x.00g");

		assertInvalid("+0x010.e+5");
		assertInvalid("-0x0F.E-1");

		assertInvalid("+0x010.p+a");
		assertInvalid("-0x0f.P-F");


		assertInvalid("+0x010.p");
		assertInvalid("-0x0f.P");

		assertInvalid("+0x010.-p1");
		assertInvalid("-0x0f.+P9");

		assertInvalid("+0x010.-pa");
		assertInvalid("-0x0f.+Pf");

		assertInvalid("+0x010.pl");
		assertInvalid("-0x0f.PL");
		
	}

	private void testFloat() {
		// FLOATCONSTANT DECIMAL
		assertValid("0.f");
		assertValid("0.F");
		assertValid(".0f");
		assertValid("0.0F");
		assertValid("1.0e1f");
		assertValid("1.0E1f");
		assertValid("1.0E100f");
		assertValid("1.0E+1f");
		assertValid("1.0E-1f");
		assertInvalid("1.0fE-1f");
		assertInvalid("1.0E1.00f");
		// FLOATCONSTANT HEX
		assertValid("0x1.f");
		assertValid("0x.F");
		assertValid(".0f");
		assertValid("0.0F");
		assertInvalid("1.0e1");
		assertValid("1.0E1f");
		assertValid("1.0E100f");
		assertValid("1.0E+1f");
		assertValid("1.0E-1f");
	}
	private void testUnsignedInteger() {
		// INTCONSTANT DECIMAL
		
		assertValid("0u");
		assertValid("1u");
		assertValid("1234567890u");
		
		assertInvalid("1");
		assertValid("0u");
		assertInvalid("1");
		assertValid("1234567890Ul");
		
		
		
		// INTCONSTANT OCTAL
		
		assertValid("01234567u");
		assertInvalid("08u");
		assertInvalid("09u");
		assertInvalid("0au");
		

		// INTCONSTANT HEXADECIMAL
		
		assertValid("0x8U");
		assertValid("0X9U");
		assertValid("0xaU");
		
		assertInvalid("0x-8");
		assertInvalid("0X9abcdefABCDEFL");
		assertInvalid("0xa");
				
	}

	private void testInteger() {
		// INTCONSTANT DECIMAL
		
		
		assertValid("0");
		assertValid("1");
		assertValid("1234567890");
		
		assertInvalid("1u");
		assertInvalid("1234567890Ul");
		
		
		
		// INTCONSTANT OCTAL
		
		assertValid("01234567");
		assertInvalid("08");
		assertInvalid("09");
		assertInvalid("0a");
		

		// INTCONSTANT HEXADECIMAL
		
		assertValid("0x8");
		assertValid("0X9");
		assertValid("0xa");
		
		assertInvalid("0x-8");
		assertValid("0X9abcdefABCDEFL");
		assertValid("0xaL");
				
	}


}
