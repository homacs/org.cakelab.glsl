package org.cakelab.glsl.pp.lexer;

import java.util.ArrayList;

import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.PPHelper;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.ast.NodeList.Filter;
import org.cakelab.glsl.pp.lexer.rules.LexerRuleSet;
import org.cakelab.glsl.pp.tokens.Token;

public class FilteringLexer extends PPHelper implements ILexer {

	@SuppressWarnings("serial")
	public class OffsetTable extends ArrayList<Integer> {
		// TODO [3] performance: replace by ring buffer based on primitive int

		public OffsetTable() {
			super(16);
		}
		
		void put(int filteredOffset, int originalOffset) {
			assert filteredOffset > 0;
			int i = filteredOffset - 1;
			assert (size() == i);
			super.add(originalOffset);
		}
		
		int getOriginalOffset(int filteredOffset) {
			assert filteredOffset > 0;
			return super.get(filteredOffset - 1);
		}
		
		public boolean existsEntry(int filteredOffset) {
			assert filteredOffset > 0;
			return size() > filteredOffset - 1;
		}
		
		
	}

	private ILexer lexer;
	private OffsetTable offsetTable = new OffsetTable();
	private Filter<Node> filter;
	private Token previous;
	
	
	public FilteringLexer(ILexer root, PPState state, Filter<Node> filter) {
		this(state, filter);
		this.lexer = root;
	}

	public FilteringLexer(PPState state, Filter<Node> filter) {
		super();
		this.filter = filter;
	}

	@Override
	public void setRules(LexerRuleSet rules) {
		lexer.setRules(rules);
	}

	@Override
	public Token lookahead(int n) {
		assert (offsetTable.size() >= (n-1));
		if (!offsetTable.existsEntry(n)) {
			int i = n-1>0 ? offsetTable.getOriginalOffset(n-1) : n-1;
			Token t;
			do {
				i++;
				t = lexer.lookahead(i);
			} while (!filter.pass(t)); 
			offsetTable.put(n, i);
			return t;
		} else {
			int i = offsetTable.getOriginalOffset(n);
			return lexer.lookahead(i);
		}
	}

	@Override
	public Token consume(int n) {
		n = offsetTable.getOriginalOffset(n);
		offsetTable.clear();
		previous = lexer.consume(n);
		return previous;
	}

	@Override
	public boolean eof() {
		return lexer.eof();
	}

	@Override
	public void dismiss() {
		lexer.dismiss();
		offsetTable.clear();
	}

	@Override
	public Token previous() {
		return previous;
	}

	@Override
	public void setVirtualLocation(String sourceIdentifier, int line) {
		lexer.setVirtualLocation(sourceIdentifier, line);
	}

	@Override
	public void setVirtualLocation(int line) {
		lexer.setVirtualLocation(line);
	}

	@Override
	public LexerRuleSet getRules() {
		return lexer.getRules();
	}

	public void setRootLexer(ILexer lexer) {
		this.lexer = lexer;
	}

}
