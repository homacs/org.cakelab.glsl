package org.cakelab.glsl.test.pp.scan;

import java.io.ByteArrayInputStream;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.scanner.StreamScanner;
import org.cakelab.glsl.pp.scanner.ScannerManager;

public class TestScannerManager {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		String text = "hello";
		ScannerManager manager = new ScannerManager(createScanner(0, text));

		testLookahead(manager, text);
		testConsume(manager, text);

		text = "World!";
		manager.push(createScanner(0,text));
		String prepend = "Hello";
		manager.push(createScanner(1, prepend));

		testLookahead(manager, prepend + text);
		testConsume(manager, prepend + text);

		
		text = "World!";
		manager.push(createScanner(0,text));
		prepend = "Hello";
		manager.push(createScanner(1, prepend));

		testLookahead(manager, prepend + text);
		testConsumeN(manager, prepend + text);

	}

	
	
	
	
	private static void testConsumeN(ScannerManager manager, String string) {
		assert manager.remaining() == string.length();
		manager.consume(string.length());
		
		assert manager.remaining() == 0;
		manager.consume();
		assert manager.eof();
	}

	private static void testConsume(ScannerManager manager, String text) {
		for (int i = 0; i < text.length(); i++) {
			int remain = manager.remaining();
			assert (remain == text.length()-i);
			int c = manager.consume();
			assert (c == text.charAt(i));
		}
		assert(manager.remaining() == 0);
		manager.consume();
		assert(manager.eof());
	}

	private static void testLookahead(ScannerManager manager, String text) {
		for (int i = 0; i < text.length(); i++) {
			int c = manager.lookahead(i+1);
			assert (c == text.charAt(i));
		}
	}


	private static IScanner createScanner(int i, String text) {
		Location origin = new Location(Integer.toString(i));
		return new StreamScanner(origin, new ByteArrayInputStream(text.getBytes()));
	}
	
}
