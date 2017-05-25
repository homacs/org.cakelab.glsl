// Generated from grammar/GLSLPP.g4 by ANTLR 4.7
package org.cakelab.glsl.pp;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GLSLPPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GLSLPPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslpp(GLSLPPParser.GlslppContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppPreprocessingFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppPreprocessingFile(GLSLPPParser.GlslppPreprocessingFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppGroup(GLSLPPParser.GlslppGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppGroupPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppGroupPart(GLSLPPParser.GlslppGroupPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppIfSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppIfSection(GLSLPPParser.GlslppIfSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppIfGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppIfGroup(GLSLPPParser.GlslppIfGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppElifGroups}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppElifGroups(GLSLPPParser.GlslppElifGroupsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppElifGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppElifGroup(GLSLPPParser.GlslppElifGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppElseGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppElseGroup(GLSLPPParser.GlslppElseGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppEndifLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppEndifLine(GLSLPPParser.GlslppEndifLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppControlLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppControlLine(GLSLPPParser.GlslppControlLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppMacro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppMacro(GLSLPPParser.GlslppMacroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppMacroArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppMacroArguments(GLSLPPParser.GlslppMacroArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppExtensionBehaviour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppExtensionBehaviour(GLSLPPParser.GlslppExtensionBehaviourContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppProfile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppProfile(GLSLPPParser.GlslppProfileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppIdentifierList(GLSLPPParser.GlslppIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppTextLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppTextLine(GLSLPPParser.GlslppTextLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppNonDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppNonDirective(GLSLPPParser.GlslppNonDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppReplacementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppReplacementList(GLSLPPParser.GlslppReplacementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppTokens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppTokens(GLSLPPParser.GlslppTokensContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppPreprocessingToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppPreprocessingToken(GLSLPPParser.GlslppPreprocessingTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppCharacterConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppCharacterConstant(GLSLPPParser.GlslppCharacterConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppStringLiteral(GLSLPPParser.GlslppStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppHeaderName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppHeaderName(GLSLPPParser.GlslppHeaderNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppIdentifier(GLSLPPParser.GlslppIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppNumber(GLSLPPParser.GlslppNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppSign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppSign(GLSLPPParser.GlslppSignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppPunctuator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppPunctuator(GLSLPPParser.GlslppPunctuatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslppUnspecifiedToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslppUnspecifiedToken(GLSLPPParser.GlslppUnspecifiedTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslFieldSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslFieldSelection(GLSLPPParser.GlslFieldSelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslVariableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslVariableIdentifier(GLSLPPParser.GlslVariableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslTypeName(GLSLPPParser.GlslTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslPrimaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslPrimaryExpression(GLSLPPParser.GlslPrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslIntegerConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslIntegerConstant(GLSLPPParser.GlslIntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslUnsignedIntegerConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslUnsignedIntegerConstant(GLSLPPParser.GlslUnsignedIntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslFloatConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslFloatConstant(GLSLPPParser.GlslFloatConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslDoubleConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslDoubleConstant(GLSLPPParser.GlslDoubleConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslPostfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslPostfixExpression(GLSLPPParser.GlslPostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslFunctionCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslFunctionCallArguments(GLSLPPParser.GlslFunctionCallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslConstructorCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslConstructorCallArguments(GLSLPPParser.GlslConstructorCallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslCallArguments(GLSLPPParser.GlslCallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslIntegerExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslIntegerExpression(GLSLPPParser.GlslIntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslUnaryExpression(GLSLPPParser.GlslUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslUnaryOperator(GLSLPPParser.GlslUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslMultiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslMultiplicativeExpression(GLSLPPParser.GlslMultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslAdditiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslAdditiveExpression(GLSLPPParser.GlslAdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslShiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslShiftExpression(GLSLPPParser.GlslShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslRelationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslRelationalExpression(GLSLPPParser.GlslRelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslEqualityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslEqualityExpression(GLSLPPParser.GlslEqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslAndExpression(GLSLPPParser.GlslAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslExclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslExclusiveOrExpression(GLSLPPParser.GlslExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslInclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslInclusiveOrExpression(GLSLPPParser.GlslInclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslLogicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslLogicalAndExpression(GLSLPPParser.GlslLogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslLogicalXorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslLogicalXorExpression(GLSLPPParser.GlslLogicalXorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslLogicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslLogicalOrExpression(GLSLPPParser.GlslLogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslConditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslConditionalExpression(GLSLPPParser.GlslConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslAssignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslAssignmentExpression(GLSLPPParser.GlslAssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslAssignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslAssignmentOperator(GLSLPPParser.GlslAssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslExpression(GLSLPPParser.GlslExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslConstantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslConstantExpression(GLSLPPParser.GlslConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslTypeNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslTypeNameList(GLSLPPParser.GlslTypeNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslTypeSpecifier(GLSLPPParser.GlslTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslArraySpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslArraySpecifier(GLSLPPParser.GlslArraySpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslTypeSpecifierNonarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslTypeSpecifierNonarray(GLSLPPParser.GlslTypeSpecifierNonarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslBuiltinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslBuiltinType(GLSLPPParser.GlslBuiltinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslStructSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslStructSpecifier(GLSLPPParser.GlslStructSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslStructDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslStructDeclarationList(GLSLPPParser.GlslStructDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslStructDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslStructDeclaration(GLSLPPParser.GlslStructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslStructDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslStructDeclaratorList(GLSLPPParser.GlslStructDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslStructDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslStructDeclarator(GLSLPPParser.GlslStructDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslInvariantQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslInvariantQualifier(GLSLPPParser.GlslInvariantQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslInterpolationQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslInterpolationQualifier(GLSLPPParser.GlslInterpolationQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslLayoutQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslLayoutQualifier(GLSLPPParser.GlslLayoutQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslLayoutQualifierIdList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslLayoutQualifierIdList(GLSLPPParser.GlslLayoutQualifierIdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslLayoutQualifierId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslLayoutQualifierId(GLSLPPParser.GlslLayoutQualifierIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslPreciseQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslPreciseQualifier(GLSLPPParser.GlslPreciseQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslTypeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslTypeQualifier(GLSLPPParser.GlslTypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslSingleTypeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslSingleTypeQualifier(GLSLPPParser.GlslSingleTypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslStorageQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslStorageQualifier(GLSLPPParser.GlslStorageQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLPPParser#glslPrecisionQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslPrecisionQualifier(GLSLPPParser.GlslPrecisionQualifierContext ctx);
}