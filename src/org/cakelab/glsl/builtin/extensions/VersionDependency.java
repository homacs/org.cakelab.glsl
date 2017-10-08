package org.cakelab.glsl.builtin.extensions;

import java.util.ArrayList;

/** Like Maven version specifier lists but not supporting braces, only brackets.
 * 
 * list: specifier (',' specifier)*
 * specifier: number | range
 * range: '[' number? ',' number? ']'
 * 
 */
public interface VersionDependency {
	@SuppressWarnings("serial")
	public static class List extends ArrayList<VersionDependency> implements VersionDependency {

		public List() {
			super(1);
		}
		
		@Override
		public boolean check(int number) {
			for (VersionDependency s : this) {
				if (s.check(number)) return true;
			}
			return false;
		}
	}
	
	public static class Number implements VersionDependency {
		final int num;

		public Number(int num) {
			this.num = num;
		}

		@Override
		public boolean check(int number) {
			return number == this.num;
		}
	}
	
	public static class Range implements VersionDependency {
		final int begin;
		final int end;

		public Range(int begin, int end) {
			this.begin = begin;
			this.end = end;
			
		}

		@Override
		public boolean check(int number) {
			return begin <= number && (number <= end || end == -1);
		}
	}
	
	boolean check(int number);
	
	
	public static class Parser {
		private static final int EOF = -1;
		int pos;
		String data;
		
		
		
		public VersionDependency parse(String input) throws IllegalArgumentException {
			if (input == null || input.length() == 0) error("expected a version specifier string");
			data = input;
			pos = 0;
			WHITESPACE();
			return list();
		}



		private VersionDependency list() {
			VersionDependency result = specifier();
			check(result);
			WHITESPACE();
			if (LA_equals(',')) {
				List list = new List();
				list.add(result);
				result = list;
				while (LA_equals(',')) {
					consume();
					WHITESPACE();
					VersionDependency s = specifier();
					check(s);
					list.add(s);
					WHITESPACE();
				}
			}
			return result;
		}

		private void check(VersionDependency d) {
			if (d == null) {
				if (LA_equals(EOF)) error("expected a version specifier");
				else error("unexpected token '" + (char)LA() + "'");
			}
		}



		private void WHITESPACE() {
			while(isWhite(LA())) consume();
		}



		private VersionDependency specifier() {
			VersionDependency s = number();
			if (s == null) {
				s = range();
			}
			return s;
		}



		private VersionDependency range() {
			if (LA_equals('[')) {
				consume();
				WHITESPACE();
				int begin = DIGITS();

				WHITESPACE();
				if (!LA_equals(',')) {
					error("missing ',' in version range specifier");
				}
				consume();
				
				WHITESPACE();
				int end = DIGITS();

				WHITESPACE();
				if (!LA_equals(']')) {
					error("missing ']' in version range specifier");
				}
				consume();
				return new Range(begin, end);
			}
			return null;
		}



		private VersionDependency number() {
			int num = DIGITS();
			if (num > 0) return new Number(num);
			else return null;
		}



		private int DIGITS() {
			int start = pos;
			while(isDigit(LA())) consume();
			if (start == pos) return -1;
			String digits = data.substring(start, pos);
			int num = Integer.decode(digits);
			return num;
		}



		private boolean isDigit(int la) {
			return la >= '0' && la <= '9';
		}



		private boolean isWhite(int c) {
			return c == '\n' || c == '\r' || c == '\t' || c == ' ';
		}


		private void consume() {
			pos++;
		}

		private int LA() {
			if (pos == data.length()) return EOF;
			return data.charAt(pos);
		}


		private boolean LA_equals(int c) {
			return LA() == c;
		}


		private void error(String string) {
			throw new IllegalArgumentException(string);
		}
	}
	
	
	static final Parser parser = new Parser();

	/**
	 * Uses global #parser to parse versionSpecifier (not thread safe).
	 * 
	 * @param versionSpecifier
	 * @return parse result if successful
	 * @throws IllegalArgumentException on any parse error
	 */
	static VersionDependency parse(String versionSpecifier) throws IllegalArgumentException {
		return parser.parse(versionSpecifier);
	}


}
