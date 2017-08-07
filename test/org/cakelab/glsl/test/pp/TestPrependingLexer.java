package org.cakelab.glsl.test.pp;

import java.io.ByteArrayInputStream;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.Scanner;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.ast.MacroReference;


public class TestPrependingLexer {
	// TODO [2] finish tests for prepending lexer
	
	public static void main(String [] args) {
		test();
	}

	public static void test() {
		char c;
		
		String sourceId = "0";
		Macro A = new Macro("A");
		MacroReference invokeA = new MacroReference(new Interval(new Location(sourceId, 4, Location.FIRST_LINE, 4), new Location(sourceId, 4, Location.FIRST_LINE, 4)), A);
		
		
		String original = "012349";
		Scanner mainLexer = new Scanner("0", new ByteArrayInputStream(original.getBytes()));
		Scanner lexer = mainLexer;

		for (int i = 0; i < 5; i++) {
			c = (char) lexer.lookahead(i+1);
			assert(Character.toString(c).equals(Integer.toString(i)));
		}
		
		
		for (int i = 0; i < 5; i++) {
			c = (char) lexer.lookahead(1);
			assert(Character.toString(c).equals(Integer.toString(i)));
			c = (char) lexer.consume();
			assert(Character.toString(c).equals(Integer.toString(i)));
		}
		String prepend = "56";
		Scanner prepending = lexer.createPrependScanner(invokeA, prepend);
		lexer = prepending;

		for (int i = 5; i < 7; i++) {
			c = (char) lexer.lookahead(i-4);
			assert(Character.toString(c).equals(Integer.toString(i)));
		}
		
		for (int i = 5; i < 7; i++) {
			c = (char) lexer.lookahead(1);
			assert(Character.toString(c).equals(Integer.toString(i)));
			c = (char) lexer.consume();
			assert(Character.toString(c).equals(Integer.toString(i)));
		}
		lexer = lexer.commit();
	}
}
