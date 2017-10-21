package org.cakelab.glsl.pp.scanner;

import java.util.List;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.tokens.Token;

/**
 * This is a wrapper for already scanned tokens. It is used when
 * a parser in the preprocessor has to rescan a sequence of <b>macro expanded</b>
 * tokens of regular text.
 * 
 * 
 * 
 * @author homac
 *
 */
public class PPTokenScanner extends IScanner {

	private List<Token> tokens;

	private int token;
	private int offset;

	private Location eofLocation;

	private int remaining;
	
	public PPTokenScanner(List<Token> tokens) {
		this.tokens = tokens;
		this.remaining = calcTotalLength(tokens);
		token = 0;
		offset = 0;
		if (tokens.isEmpty()) {
			eofLocation = new Location("--EOF--");
		} else {
			eofLocation = tokens.get(tokens.size()-1).getEnd();
			eofLocation.nextColumn();
		}
	}

	private int calcTotalLength(List<Token> tokens) {
		int total = 0;
		for (Token t : tokens) {
			total += t.getText().length();
		}
		return total;
	}

	@Override
	public int current() {
		int t = token;
		int o = offset-1;
		if (o < 0) {
			t = t-1;
			o = length(t)-1;
		}
		return atom(t,o);
	}

	@Override
	public boolean eof() {
		return token >= tokens.size();
	}

	@Override
	public int lookahead(int n) {
		if (!eof()) {
			int t = token;
			int r = remain(t, offset);
			while (t < tokens.size() && r < n) {
				 n -= r;
				 t++;
				 if (t < tokens.size()) r = length(t);
			}
			if (t < tokens.size()) {
				return atom(t,n-1 + offset);
			}
		}
		return EOF;
	}

	@Override
	public void consume(int n) {
		if (!eof()) {
			int r = remain(token, offset);
			while (token < tokens.size() && r < n) {
				 n -= r;
				 token++;
				 offset = 0;
				 r = length(token);
			}
			if (token < tokens.size()) {
				offset += n;
				if (offset == length(token)) {
					token++;
					offset = 0;
				}
			}
		}
		
		remaining -= n;
		if (remaining == 0) super.runEofHandlers();
	}

	private int atom(int token, int offset) {
		if (token >= tokens.size() || offset >= length(token)) return EOF;
		return tokens.get(token).getText().charAt(offset);
	}

	private int length(int i) {
		return tokens.get(i).getText().length();
	}

	private int remain(int tok, int off) {
		if (tok == -1) return 0;
		else return length(tok) - (off);
	}

	@Override
	public int consume() {
		consume(1);
		return current();
	}

	@Override
	public Location location() {
		Location result;
		int o = offset - 1;
		if (o >= 0) {
			result = tokens.get(token).getStart().clone();
			result.setColumn(result.getColumn()+o);
		} else {
			if (token > 0) {
				result = tokens.get(token-1).getEnd().clone();
			} else {
				if (tokens.isEmpty()) return eofLocation;
				else {
					result = tokens.get(0).getStart().clone();
					result.setColumn(result.getColumn()-1);
				}
			}
		}		
		return result;
	}

	@Override
	public Location nextLocation() {
		Location result;
		if (eof()) {
			return eofLocation;
		} else {
			result = tokens.get(token).getStart().clone();
			result.setColumn(result.getColumn()+offset);
		}
		return result;
	}


	@Override
	public void setVirtualLocation(int line) {
		// TODO: virtual location needs another solution when switching to token scanner
		throw new Error("not implemented");
	}

	@Override
	public void setVirtualLocation(String id, int line) {
		throw new Error("not implemented");
	}

	@Override
	public boolean atColumnStart() {
		return (token == 0 && offset == Location.POS_START) || current() == '\n';
	}


	@Override
	public void dismiss() {
		token = tokens.size();
	}

	@Override
	public int remaining() {
		return remaining;
	}

}
