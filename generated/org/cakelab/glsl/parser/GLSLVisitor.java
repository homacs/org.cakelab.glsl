// Generated from grammar/GLSL.g4 by ANTLR 4.7
package org.cakelab.glsl.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GLSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GLSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glsl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlsl(GLSLParser.GlslContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslDeclaration(GLSLParser.GlslDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslDeclarationStatement(GLSLParser.GlslDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslTypePrecisionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslTypePrecisionDeclaration(GLSLParser.GlslTypePrecisionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslVariableDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslVariableDeclarations(GLSLParser.GlslVariableDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslInterfaceBlockStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslInterfaceBlockStructure(GLSLParser.GlslInterfaceBlockStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslFunctionPrototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslFunctionPrototype(GLSLParser.GlslFunctionPrototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslFunctionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslFunctionParameters(GLSLParser.GlslFunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslParameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslParameterDeclaration(GLSLParser.GlslParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslVariableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslVariableDeclarator(GLSLParser.GlslVariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslFullySpecifiedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslFullySpecifiedType(GLSLParser.GlslFullySpecifiedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslInitializer(GLSLParser.GlslInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslStatement(GLSLParser.GlslStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslSimpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslSimpleStatement(GLSLParser.GlslSimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslCompoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslCompoundStatement(GLSLParser.GlslCompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslExpressionStatement(GLSLParser.GlslExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslIfStatement(GLSLParser.GlslIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslNonIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslNonIfStatement(GLSLParser.GlslNonIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslSwitchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslSwitchStatement(GLSLParser.GlslSwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslSwitchSubStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslSwitchSubStatement(GLSLParser.GlslSwitchSubStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslCondition(GLSLParser.GlslConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslWhileStatement(GLSLParser.GlslWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslDoWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslDoWhileStatement(GLSLParser.GlslDoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslForStatement(GLSLParser.GlslForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslForInitExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslForInitExpression(GLSLParser.GlslForInitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslJumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslJumpStatement(GLSLParser.GlslJumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslTranslationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslTranslationUnit(GLSLParser.GlslTranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslExternalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslExternalDeclaration(GLSLParser.GlslExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslFunctionDefinition(GLSLParser.GlslFunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslFieldSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslFieldSelection(GLSLParser.GlslFieldSelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslIdentifier(GLSLParser.GlslIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslTypeName(GLSLParser.GlslTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslVariableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslVariableIdentifier(GLSLParser.GlslVariableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslFunctionName(GLSLParser.GlslFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslBoolConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslBoolConstant(GLSLParser.GlslBoolConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslIntegerConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslIntegerConstant(GLSLParser.GlslIntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslUnsignedIntegerConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslUnsignedIntegerConstant(GLSLParser.GlslUnsignedIntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslFloatConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslFloatConstant(GLSLParser.GlslFloatConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslDoubleConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslDoubleConstant(GLSLParser.GlslDoubleConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslPrimaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslPrimaryExpression(GLSLParser.GlslPrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslPostfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslPostfixExpression(GLSLParser.GlslPostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslCallArguments(GLSLParser.GlslCallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslIntegerExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslIntegerExpression(GLSLParser.GlslIntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslUnaryExpression(GLSLParser.GlslUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslUnaryOperator(GLSLParser.GlslUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslMultiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslMultiplicativeExpression(GLSLParser.GlslMultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslAdditiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslAdditiveExpression(GLSLParser.GlslAdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslShiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslShiftExpression(GLSLParser.GlslShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslRelationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslRelationalExpression(GLSLParser.GlslRelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslEqualityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslEqualityExpression(GLSLParser.GlslEqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslAndExpression(GLSLParser.GlslAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslExclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslExclusiveOrExpression(GLSLParser.GlslExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslInclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslInclusiveOrExpression(GLSLParser.GlslInclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslLogicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslLogicalAndExpression(GLSLParser.GlslLogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslLogicalXorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslLogicalXorExpression(GLSLParser.GlslLogicalXorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslLogicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslLogicalOrExpression(GLSLParser.GlslLogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslConditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslConditionalExpression(GLSLParser.GlslConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslAssignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslAssignmentExpression(GLSLParser.GlslAssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslLValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslLValue(GLSLParser.GlslLValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslAssignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslAssignmentOperator(GLSLParser.GlslAssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslExpression(GLSLParser.GlslExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslConstantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslConstantExpression(GLSLParser.GlslConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslFunctionNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslFunctionNameList(GLSLParser.GlslFunctionNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslTypeSpecifier(GLSLParser.GlslTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslArrayDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslArrayDimension(GLSLParser.GlslArrayDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslTypeSpecifierNonarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslTypeSpecifierNonarray(GLSLParser.GlslTypeSpecifierNonarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslBuiltinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslBuiltinType(GLSLParser.GlslBuiltinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslStructSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslStructSpecifier(GLSLParser.GlslStructSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslStructBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslStructBody(GLSLParser.GlslStructBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslStructMemberGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslStructMemberGroup(GLSLParser.GlslStructMemberGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslStructMemberDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslStructMemberDeclaratorList(GLSLParser.GlslStructMemberDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslStructMemberDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslStructMemberDeclarator(GLSLParser.GlslStructMemberDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslTypeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslTypeQualifier(GLSLParser.GlslTypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslSingleTypeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslSingleTypeQualifier(GLSLParser.GlslSingleTypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslInvariantQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslInvariantQualifier(GLSLParser.GlslInvariantQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslInterpolationQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslInterpolationQualifier(GLSLParser.GlslInterpolationQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslLayoutQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslLayoutQualifier(GLSLParser.GlslLayoutQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslLayoutQualifierIdList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslLayoutQualifierIdList(GLSLParser.GlslLayoutQualifierIdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslLayoutQualifierId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslLayoutQualifierId(GLSLParser.GlslLayoutQualifierIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslPreciseQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslPreciseQualifier(GLSLParser.GlslPreciseQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslStorageQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslStorageQualifier(GLSLParser.GlslStorageQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslPrecisionQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslPrecisionQualifier(GLSLParser.GlslPrecisionQualifierContext ctx);
}