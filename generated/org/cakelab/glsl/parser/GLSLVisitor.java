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
	 * Visit a parse tree produced by {@link GLSLParser#glslBlockStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslBlockStructure(GLSLParser.GlslBlockStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslIdentifierList(GLSLParser.GlslIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslFunctionPrototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslFunctionPrototype(GLSLParser.GlslFunctionPrototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslFunctionDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslFunctionDeclarator(GLSLParser.GlslFunctionDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslFunctionHeaderWithParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslFunctionHeaderWithParameters(GLSLParser.GlslFunctionHeaderWithParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslFunctionHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslFunctionHeader(GLSLParser.GlslFunctionHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslParameterDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslParameterDeclarator(GLSLParser.GlslParameterDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslParameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslParameterDeclaration(GLSLParser.GlslParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslParameterTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslParameterTypeSpecifier(GLSLParser.GlslParameterTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslInitDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslInitDeclaratorList(GLSLParser.GlslInitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslSingleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslSingleDeclaration(GLSLParser.GlslSingleDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link GLSLParser#glslInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslInitializerList(GLSLParser.GlslInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslDeclarationStatement(GLSLParser.GlslDeclarationStatementContext ctx);
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
	 * Visit a parse tree produced by {@link GLSLParser#glslStatementNoNewScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslStatementNoNewScope(GLSLParser.GlslStatementNoNewScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslStatementScoped}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslStatementScoped(GLSLParser.GlslStatementScopedContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslCompoundStatementNoNewScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslCompoundStatementNoNewScope(GLSLParser.GlslCompoundStatementNoNewScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslStatementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslStatementList(GLSLParser.GlslStatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslExpressionStatement(GLSLParser.GlslExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslSelectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslSelectionStatement(GLSLParser.GlslSelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslSelectionRestStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslSelectionRestStatement(GLSLParser.GlslSelectionRestStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslCondition(GLSLParser.GlslConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslSwitchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslSwitchStatement(GLSLParser.GlslSwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslSwitchStatementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslSwitchStatementList(GLSLParser.GlslSwitchStatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslCaseLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslCaseLabel(GLSLParser.GlslCaseLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslIterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslIterationStatement(GLSLParser.GlslIterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslForInitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslForInitStatement(GLSLParser.GlslForInitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslConditionopt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslConditionopt(GLSLParser.GlslConditionoptContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslForRestStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslForRestStatement(GLSLParser.GlslForRestStatementContext ctx);
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
	 * Visit a parse tree produced by {@link GLSLParser#glslVariableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslVariableIdentifier(GLSLParser.GlslVariableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslTypeName(GLSLParser.GlslTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslFunctionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslFunctionIdentifier(GLSLParser.GlslFunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslPrimaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslPrimaryExpression(GLSLParser.GlslPrimaryExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link GLSLParser#glslPostfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslPostfixExpression(GLSLParser.GlslPostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslFunctionCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslFunctionCallArguments(GLSLParser.GlslFunctionCallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslConstructorCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslConstructorCallArguments(GLSLParser.GlslConstructorCallArgumentsContext ctx);
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
	 * Visit a parse tree produced by {@link GLSLParser#glslFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslFunctionName(GLSLParser.GlslFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslTypeSpecifier(GLSLParser.GlslTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#glslArrayDimensionsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslArrayDimensionsList(GLSLParser.GlslArrayDimensionsListContext ctx);
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
	 * Visit a parse tree produced by {@link GLSLParser#glslStructMemberList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlslStructMemberList(GLSLParser.GlslStructMemberListContext ctx);
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