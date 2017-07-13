package org.cakelab.glsl.test.pp;

import java.io.ByteArrayInputStream;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.Lexer;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.ast.MacroReference;
import org.cakelab.glsl.pp.RescanLexer;


public class TestPrependingLexer {
	// TODO
	
	public static void main(String [] args) {
		test();
	}

	public static void test() {
		String sourceId = "0";
		Macro A = new Macro("A");
		MacroReference invokeA = new MacroReference(new Interval(new Location(sourceId, 4, 0, 4), new Location(sourceId, 5, 0, 5)), A);
		
		
		String original = "012349";
		Lexer mainLexer = new Lexer("0", new ByteArrayInputStream(original.getBytes()));
		Lexer lexer = mainLexer;
		
		for (int i = 0; i < 4; i++) {
			char c = (char) lexer.lookahead(1);
			assert(Character.toString(c).equals(Integer.toString(i)));
			c = (char) lexer.consume();
			assert(Character.toString(c).equals(Integer.toString(i)));
		}
		String prepend = "56";
		RescanLexer prepending = new RescanLexer(invokeA, new ByteArrayInputStream(prepend.getBytes()), lexer);
		lexer = prepending;

		Location reset = lexer.location();
		
		for (int i = 5; i < 10; i++) {
			char c = (char) lexer.lookahead(1);
			assert(Character.toString(c).equals(Integer.toString(i)));
			c = (char) lexer.consume();
			assert(Character.toString(c).equals(Integer.toString(i)));
		}

		lexer.rewind(reset);

		for (int i = 5; i < 10; i++) {
			char c = (char) lexer.consume();
			assert(Character.toString(c).equals(Integer.toString(i)));
		}

		
		
	}
}
