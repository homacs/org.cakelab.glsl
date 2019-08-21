package org.cakelab.glsl.lang.ast;

import java.util.ArrayList;
import java.util.List;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.ast.impl.ScopeImpl;

/**
 * Represents:
 * <pre>
 * '{' statement* '}'
 * </pre>
 * @author homac
 *
 */
public class CompoundStatement extends ScopeImpl implements Statement {

	private List<Statement> statements;
	private Interval interval;
	
	public CompoundStatement(IScope parent, Interval interval, List<Statement> statements) {
		super(parent);
		this.interval = interval;
		this.statements = statements;
	}

	
	public CompoundStatement(IScope parent) {
		super(parent);
		this.interval = Interval.NONE;
		this.statements = new ArrayList<Statement>();
	}
	
	public List<Statement> getStatements() {
		return statements;
	}

	@Override
	public Interval getInterval() {
		return interval;
	}

	@Override
	public Location getStart() {
		return interval.getStart();
	}

	@Override
	public Location getEnd() {
		return interval.getEnd();
	}

}
