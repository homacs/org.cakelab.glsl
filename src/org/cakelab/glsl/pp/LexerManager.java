package org.cakelab.glsl.pp;

import java.util.Stack;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.ast.MacroInvocation;

public class LexerManager implements ILexer {

	private Stack<Lexer> lexers = new Stack<Lexer>();
	
	public LexerManager() {
	}

	@Override
	public Lexer createPreprocessedOutputLexer(Location origin, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lexer createPrependLexer(MacroInvocation expr, String prepend) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int current() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean eof() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int lookahead(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void consume(int n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int consume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Location location() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVirtualLocation(int line) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVirtualLocation(String id, int line) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean atColumnStart() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void next(LexerLocation location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Location nextLocation(Location location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location nextLocation() {
		// TODO Auto-generated method stub
		return null;
	}

}
