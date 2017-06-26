package org.cakelab.glsl.pp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.cakelab.glsl.GLSLBaseListener;
import org.cakelab.glsl.GLSLLexer;
import org.cakelab.glsl.GLSLParser;
import org.cakelab.glsl.GLSLParser.*;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.Validator;
import org.cakelab.glsl.lang.ast.ASTFactory;
import org.cakelab.glsl.lang.ast.ConstantExpression;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.Function;
import org.cakelab.glsl.lang.ast.Scope;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.ast.UndefinedIdentifier;
import org.cakelab.glsl.lang.ast.Variable;

public class GLSLPreprocessor extends GLSLBaseListener implements SymbolTable {

	private GLSLParser parser;
	private CommonTokenStream tokens;
	private PrintStream out;
	private ASTFactory factory;
	private Scope scope;


	public GLSLPreprocessor() {
	}
	
	public static void main(String[] args) throws IOException {
		File f = new File("test_files/100.frag");
		GLSLPreprocessor pp = new GLSLPreprocessor();
		pp.process(new FileInputStream(f), new FileOutputStream("/tmp/output.glsl"));
	}
	
	public void process(InputStream in, OutputStream out) throws IOException {
		CharStream input = CharStreams.fromStream(in, Charset.forName("UTF-8"));
		GLSLLexer lexer = new GLSLLexer(input);
		lexer.preprocessing(true);
		tokens = new CommonTokenStream(lexer);
		this.out = new PrintStream(out);
		parser.addParseListener(this);
		parser = new GLSLParser(tokens);
		parser.glslpp();
	}
	


	@Override
	public Scope scope() {
		return scope;
	}

	@Override
	public void enter(Scope newScope) {
		scope = newScope;
	}

	@Override
	public Scope leave(Scope currentScope) {
		assert (scope == currentScope);
		scope = scope.getParent();
		return scope;
	}

	@Override
	public void declare(Type type) {
		scope.addType(type.getName(), type);
	}

	@Override
	public Object resolve(String identifier) {
		return scope.get(identifier);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T resolve(Class<T> symbolType, String identifier) {
		if (Type.class.isAssignableFrom(symbolType)) {
			return (T) scope.getType(identifier);
		} else if (Function.class.isAssignableFrom(symbolType)) {
			return (T) scope.getFunction(identifier);
		} else if (Variable.class.isAssignableFrom(symbolType)) {
			return (T) scope.getVariable(identifier);
		} else if (Macro.class.isAssignableFrom(symbolType)) {
			return (T) scope.getMacro(identifier);
		} else {
			throw new Error("internal error: unhandled symbol type");
		}
	}

	/** checks all if clauses whether the current if or else group 
	 * is supposed to forward text lines or not.
	 * @return
	 */
	private boolean visiblePPGroup(Scope scope) {
		Scope parent = scope.getParent();
		boolean visible = true;
		if (parent != null) visible = visiblePPGroup(parent);
		if (scope instanceof PPGroupScope) {
			PPGroupScope ppscope = (PPGroupScope)scope;
			visible = visible && ppscope.visible();
		} else {
			/* non-pp scopes are always visible 
			 * unless parent is not visible */
		}
		return visible;
	}
	
	
	
	@Override
	public void exitGlslppIfLine(GlslppIfLineContext ctx) {
		PPIfScope ifscope = new PPIfScope(this.scope);
		int t = ctx.getStart().getType();
		Macro macro;
		switch (t) {
		case GLSLParser.PPIF:
			ConstantExpression condition = factory.create(ctx.glslConstantExpression());
			try {
				ifscope.setCondition(condition);
			} catch (EvaluationException e) {
				ifscope.setCondition(factory.createInterval(ctx), false);
			}
			break;
		case GLSLParser.PPIFDEF:
			macro = resolve(Macro.class, ctx.glslppIdentifier().getText());
			ifscope.setCondition(factory.createInterval(ctx.glslppIdentifier()), macro != null);
			break;
		case GLSLParser.PPIFNDEF:
			macro = resolve(Macro.class, ctx.glslppIdentifier().getText());
			ifscope.setCondition(factory.createInterval(ctx.glslppIdentifier()), macro == null);
			break;
		default: 
			throw new Error("internal error: unhandled case in rule IfGroup");
		}
		enter(ifscope);
		
		out.println();
	}

	@Override
	public void exitGlslppTextLine(GlslppTextLineContext ctx) {
		/*
		if (!visiblePPGroup(scope)) return;
		
		int start = ctx.getStart().getTokenIndex();
		int stop = ctx.getStop().getTokenIndex();
		
		List<GlslppMacroExpressionContext> macroCalls = ctx.glslppMacroExpression();

		int macroCall = macroCalls.isEmpty()?-1:0;
		int macroStart = macroCall<0?-1:macroCalls.get(0).start.getTokenIndex();

		List<Token> hidden = tokens.getHiddenTokensToLeft(start);
		for (Token t : hidden) {
			out.print(t.getText());
		}
		for (int i = start; i < stop; i++) {
			if (i == macroStart) {
				i = expand(macroCalls.get(macroCall));
				macroCall++;
				if (macroCall >= macroCalls.size()) {
					macroStart = -1;
				} else {
					macroStart = macroCalls.get(macroCall).start.getTokenIndex();
				}
			} else {
				Token t = tokens.get(i);
				out.print(t.getText());
			}
		}
		*/
		
	}

//	private int expand(GlslppMacroExpressionContext ctx) {
//		
//		Expression expr = factory.create(ctx);
//		
//		if (expr instanceof UndefinedIdentifier) {
//			// not a macro or undefined
//			// let outer loop output as text
//			return ctx.start.getTokenIndex();
//		} else {
//			out.print(expr.value().getText());
//			return ctx.stop.getTokenIndex()+1;
//		}
//	}
//
	
	
	
}
