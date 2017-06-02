// Generated from grammar/GLSL.g4 by ANTLR 4.7
package org.cakelab.glsl.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GLSLParser}.
 */
public interface GLSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glsl}.
	 * @param ctx the parse tree
	 */
	void enterGlsl(GLSLParser.GlslContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glsl}.
	 * @param ctx the parse tree
	 */
	void exitGlsl(GLSLParser.GlslContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlslDeclaration(GLSLParser.GlslDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlslDeclaration(GLSLParser.GlslDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlslDeclarationStatement(GLSLParser.GlslDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlslDeclarationStatement(GLSLParser.GlslDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslTypePrecisionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlslTypePrecisionDeclaration(GLSLParser.GlslTypePrecisionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslTypePrecisionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlslTypePrecisionDeclaration(GLSLParser.GlslTypePrecisionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslVariableDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterGlslVariableDeclarations(GLSLParser.GlslVariableDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslVariableDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitGlslVariableDeclarations(GLSLParser.GlslVariableDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslInterfaceBlockStructure}.
	 * @param ctx the parse tree
	 */
	void enterGlslInterfaceBlockStructure(GLSLParser.GlslInterfaceBlockStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslInterfaceBlockStructure}.
	 * @param ctx the parse tree
	 */
	void exitGlslInterfaceBlockStructure(GLSLParser.GlslInterfaceBlockStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslFunctionPrototype}.
	 * @param ctx the parse tree
	 */
	void enterGlslFunctionPrototype(GLSLParser.GlslFunctionPrototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslFunctionPrototype}.
	 * @param ctx the parse tree
	 */
	void exitGlslFunctionPrototype(GLSLParser.GlslFunctionPrototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void enterGlslFunctionParameters(GLSLParser.GlslFunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void exitGlslFunctionParameters(GLSLParser.GlslFunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlslParameterDeclaration(GLSLParser.GlslParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlslParameterDeclaration(GLSLParser.GlslParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslVariableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterGlslVariableDeclarator(GLSLParser.GlslVariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslVariableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitGlslVariableDeclarator(GLSLParser.GlslVariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslFullySpecifiedType}.
	 * @param ctx the parse tree
	 */
	void enterGlslFullySpecifiedType(GLSLParser.GlslFullySpecifiedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslFullySpecifiedType}.
	 * @param ctx the parse tree
	 */
	void exitGlslFullySpecifiedType(GLSLParser.GlslFullySpecifiedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslInitializer}.
	 * @param ctx the parse tree
	 */
	void enterGlslInitializer(GLSLParser.GlslInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslInitializer}.
	 * @param ctx the parse tree
	 */
	void exitGlslInitializer(GLSLParser.GlslInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlslStatement(GLSLParser.GlslStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlslStatement(GLSLParser.GlslStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslSimpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlslSimpleStatement(GLSLParser.GlslSimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslSimpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlslSimpleStatement(GLSLParser.GlslSimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslCompoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlslCompoundStatement(GLSLParser.GlslCompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslCompoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlslCompoundStatement(GLSLParser.GlslCompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlslExpressionStatement(GLSLParser.GlslExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlslExpressionStatement(GLSLParser.GlslExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlslIfStatement(GLSLParser.GlslIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlslIfStatement(GLSLParser.GlslIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslNonIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlslNonIfStatement(GLSLParser.GlslNonIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslNonIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlslNonIfStatement(GLSLParser.GlslNonIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslSwitchStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlslSwitchStatement(GLSLParser.GlslSwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslSwitchStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlslSwitchStatement(GLSLParser.GlslSwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslSwitchSubStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlslSwitchSubStatement(GLSLParser.GlslSwitchSubStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslSwitchSubStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlslSwitchSubStatement(GLSLParser.GlslSwitchSubStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslCondition}.
	 * @param ctx the parse tree
	 */
	void enterGlslCondition(GLSLParser.GlslConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslCondition}.
	 * @param ctx the parse tree
	 */
	void exitGlslCondition(GLSLParser.GlslConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlslWhileStatement(GLSLParser.GlslWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlslWhileStatement(GLSLParser.GlslWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslDoWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlslDoWhileStatement(GLSLParser.GlslDoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslDoWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlslDoWhileStatement(GLSLParser.GlslDoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslForStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlslForStatement(GLSLParser.GlslForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslForStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlslForStatement(GLSLParser.GlslForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslForInitExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslForInitExpression(GLSLParser.GlslForInitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslForInitExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslForInitExpression(GLSLParser.GlslForInitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslJumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlslJumpStatement(GLSLParser.GlslJumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslJumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlslJumpStatement(GLSLParser.GlslJumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslTranslationUnit}.
	 * @param ctx the parse tree
	 */
	void enterGlslTranslationUnit(GLSLParser.GlslTranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslTranslationUnit}.
	 * @param ctx the parse tree
	 */
	void exitGlslTranslationUnit(GLSLParser.GlslTranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslExternalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlslExternalDeclaration(GLSLParser.GlslExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslExternalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlslExternalDeclaration(GLSLParser.GlslExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterGlslFunctionDefinition(GLSLParser.GlslFunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitGlslFunctionDefinition(GLSLParser.GlslFunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslFieldSelection}.
	 * @param ctx the parse tree
	 */
	void enterGlslFieldSelection(GLSLParser.GlslFieldSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslFieldSelection}.
	 * @param ctx the parse tree
	 */
	void exitGlslFieldSelection(GLSLParser.GlslFieldSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterGlslIdentifier(GLSLParser.GlslIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitGlslIdentifier(GLSLParser.GlslIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslTypeName}.
	 * @param ctx the parse tree
	 */
	void enterGlslTypeName(GLSLParser.GlslTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslTypeName}.
	 * @param ctx the parse tree
	 */
	void exitGlslTypeName(GLSLParser.GlslTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslVariableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterGlslVariableIdentifier(GLSLParser.GlslVariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslVariableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitGlslVariableIdentifier(GLSLParser.GlslVariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterGlslFunctionName(GLSLParser.GlslFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitGlslFunctionName(GLSLParser.GlslFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslBoolConstant}.
	 * @param ctx the parse tree
	 */
	void enterGlslBoolConstant(GLSLParser.GlslBoolConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslBoolConstant}.
	 * @param ctx the parse tree
	 */
	void exitGlslBoolConstant(GLSLParser.GlslBoolConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslIntegerConstant}.
	 * @param ctx the parse tree
	 */
	void enterGlslIntegerConstant(GLSLParser.GlslIntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslIntegerConstant}.
	 * @param ctx the parse tree
	 */
	void exitGlslIntegerConstant(GLSLParser.GlslIntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslUnsignedIntegerConstant}.
	 * @param ctx the parse tree
	 */
	void enterGlslUnsignedIntegerConstant(GLSLParser.GlslUnsignedIntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslUnsignedIntegerConstant}.
	 * @param ctx the parse tree
	 */
	void exitGlslUnsignedIntegerConstant(GLSLParser.GlslUnsignedIntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslFloatConstant}.
	 * @param ctx the parse tree
	 */
	void enterGlslFloatConstant(GLSLParser.GlslFloatConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslFloatConstant}.
	 * @param ctx the parse tree
	 */
	void exitGlslFloatConstant(GLSLParser.GlslFloatConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslDoubleConstant}.
	 * @param ctx the parse tree
	 */
	void enterGlslDoubleConstant(GLSLParser.GlslDoubleConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslDoubleConstant}.
	 * @param ctx the parse tree
	 */
	void exitGlslDoubleConstant(GLSLParser.GlslDoubleConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslPrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslPrimaryExpression(GLSLParser.GlslPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslPrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslPrimaryExpression(GLSLParser.GlslPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslPostfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslPostfixExpression(GLSLParser.GlslPostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslPostfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslPostfixExpression(GLSLParser.GlslPostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterGlslCallArguments(GLSLParser.GlslCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitGlslCallArguments(GLSLParser.GlslCallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslIntegerExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslIntegerExpression(GLSLParser.GlslIntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslIntegerExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslIntegerExpression(GLSLParser.GlslIntegerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslUnaryExpression(GLSLParser.GlslUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslUnaryExpression(GLSLParser.GlslUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterGlslUnaryOperator(GLSLParser.GlslUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitGlslUnaryOperator(GLSLParser.GlslUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslMultiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslMultiplicativeExpression(GLSLParser.GlslMultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslMultiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslMultiplicativeExpression(GLSLParser.GlslMultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslAdditiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslAdditiveExpression(GLSLParser.GlslAdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslAdditiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslAdditiveExpression(GLSLParser.GlslAdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslShiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslShiftExpression(GLSLParser.GlslShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslShiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslShiftExpression(GLSLParser.GlslShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslRelationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslRelationalExpression(GLSLParser.GlslRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslRelationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslRelationalExpression(GLSLParser.GlslRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslEqualityExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslEqualityExpression(GLSLParser.GlslEqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslEqualityExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslEqualityExpression(GLSLParser.GlslEqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslAndExpression(GLSLParser.GlslAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslAndExpression(GLSLParser.GlslAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslExclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslExclusiveOrExpression(GLSLParser.GlslExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslExclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslExclusiveOrExpression(GLSLParser.GlslExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslInclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslInclusiveOrExpression(GLSLParser.GlslInclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslInclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslInclusiveOrExpression(GLSLParser.GlslInclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslLogicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslLogicalAndExpression(GLSLParser.GlslLogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslLogicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslLogicalAndExpression(GLSLParser.GlslLogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslLogicalXorExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslLogicalXorExpression(GLSLParser.GlslLogicalXorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslLogicalXorExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslLogicalXorExpression(GLSLParser.GlslLogicalXorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslLogicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslLogicalOrExpression(GLSLParser.GlslLogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslLogicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslLogicalOrExpression(GLSLParser.GlslLogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslConditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslConditionalExpression(GLSLParser.GlslConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslConditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslConditionalExpression(GLSLParser.GlslConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslAssignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslAssignmentExpression(GLSLParser.GlslAssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslAssignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslAssignmentExpression(GLSLParser.GlslAssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslLValue}.
	 * @param ctx the parse tree
	 */
	void enterGlslLValue(GLSLParser.GlslLValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslLValue}.
	 * @param ctx the parse tree
	 */
	void exitGlslLValue(GLSLParser.GlslLValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslAssignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterGlslAssignmentOperator(GLSLParser.GlslAssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslAssignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitGlslAssignmentOperator(GLSLParser.GlslAssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslExpression(GLSLParser.GlslExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslExpression(GLSLParser.GlslExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslConstantExpression}.
	 * @param ctx the parse tree
	 */
	void enterGlslConstantExpression(GLSLParser.GlslConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslConstantExpression}.
	 * @param ctx the parse tree
	 */
	void exitGlslConstantExpression(GLSLParser.GlslConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslFunctionNameList}.
	 * @param ctx the parse tree
	 */
	void enterGlslFunctionNameList(GLSLParser.GlslFunctionNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslFunctionNameList}.
	 * @param ctx the parse tree
	 */
	void exitGlslFunctionNameList(GLSLParser.GlslFunctionNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGlslTypeSpecifier(GLSLParser.GlslTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGlslTypeSpecifier(GLSLParser.GlslTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslArrayDimension}.
	 * @param ctx the parse tree
	 */
	void enterGlslArrayDimension(GLSLParser.GlslArrayDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslArrayDimension}.
	 * @param ctx the parse tree
	 */
	void exitGlslArrayDimension(GLSLParser.GlslArrayDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslTypeSpecifierNonarray}.
	 * @param ctx the parse tree
	 */
	void enterGlslTypeSpecifierNonarray(GLSLParser.GlslTypeSpecifierNonarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslTypeSpecifierNonarray}.
	 * @param ctx the parse tree
	 */
	void exitGlslTypeSpecifierNonarray(GLSLParser.GlslTypeSpecifierNonarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslBuiltinType}.
	 * @param ctx the parse tree
	 */
	void enterGlslBuiltinType(GLSLParser.GlslBuiltinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslBuiltinType}.
	 * @param ctx the parse tree
	 */
	void exitGlslBuiltinType(GLSLParser.GlslBuiltinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslStructSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGlslStructSpecifier(GLSLParser.GlslStructSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslStructSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGlslStructSpecifier(GLSLParser.GlslStructSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslStructBody}.
	 * @param ctx the parse tree
	 */
	void enterGlslStructBody(GLSLParser.GlslStructBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslStructBody}.
	 * @param ctx the parse tree
	 */
	void exitGlslStructBody(GLSLParser.GlslStructBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslStructMemberGroup}.
	 * @param ctx the parse tree
	 */
	void enterGlslStructMemberGroup(GLSLParser.GlslStructMemberGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslStructMemberGroup}.
	 * @param ctx the parse tree
	 */
	void exitGlslStructMemberGroup(GLSLParser.GlslStructMemberGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslStructMemberDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterGlslStructMemberDeclaratorList(GLSLParser.GlslStructMemberDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslStructMemberDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitGlslStructMemberDeclaratorList(GLSLParser.GlslStructMemberDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslStructMemberDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterGlslStructMemberDeclarator(GLSLParser.GlslStructMemberDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslStructMemberDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitGlslStructMemberDeclarator(GLSLParser.GlslStructMemberDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslTypeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterGlslTypeQualifier(GLSLParser.GlslTypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslTypeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitGlslTypeQualifier(GLSLParser.GlslTypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslSingleTypeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterGlslSingleTypeQualifier(GLSLParser.GlslSingleTypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslSingleTypeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitGlslSingleTypeQualifier(GLSLParser.GlslSingleTypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslInvariantQualifier}.
	 * @param ctx the parse tree
	 */
	void enterGlslInvariantQualifier(GLSLParser.GlslInvariantQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslInvariantQualifier}.
	 * @param ctx the parse tree
	 */
	void exitGlslInvariantQualifier(GLSLParser.GlslInvariantQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslInterpolationQualifier}.
	 * @param ctx the parse tree
	 */
	void enterGlslInterpolationQualifier(GLSLParser.GlslInterpolationQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslInterpolationQualifier}.
	 * @param ctx the parse tree
	 */
	void exitGlslInterpolationQualifier(GLSLParser.GlslInterpolationQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslLayoutQualifier}.
	 * @param ctx the parse tree
	 */
	void enterGlslLayoutQualifier(GLSLParser.GlslLayoutQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslLayoutQualifier}.
	 * @param ctx the parse tree
	 */
	void exitGlslLayoutQualifier(GLSLParser.GlslLayoutQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslLayoutQualifierIdList}.
	 * @param ctx the parse tree
	 */
	void enterGlslLayoutQualifierIdList(GLSLParser.GlslLayoutQualifierIdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslLayoutQualifierIdList}.
	 * @param ctx the parse tree
	 */
	void exitGlslLayoutQualifierIdList(GLSLParser.GlslLayoutQualifierIdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslLayoutQualifierId}.
	 * @param ctx the parse tree
	 */
	void enterGlslLayoutQualifierId(GLSLParser.GlslLayoutQualifierIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslLayoutQualifierId}.
	 * @param ctx the parse tree
	 */
	void exitGlslLayoutQualifierId(GLSLParser.GlslLayoutQualifierIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslPreciseQualifier}.
	 * @param ctx the parse tree
	 */
	void enterGlslPreciseQualifier(GLSLParser.GlslPreciseQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslPreciseQualifier}.
	 * @param ctx the parse tree
	 */
	void exitGlslPreciseQualifier(GLSLParser.GlslPreciseQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslStorageQualifier}.
	 * @param ctx the parse tree
	 */
	void enterGlslStorageQualifier(GLSLParser.GlslStorageQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslStorageQualifier}.
	 * @param ctx the parse tree
	 */
	void exitGlslStorageQualifier(GLSLParser.GlslStorageQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#glslPrecisionQualifier}.
	 * @param ctx the parse tree
	 */
	void enterGlslPrecisionQualifier(GLSLParser.GlslPrecisionQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#glslPrecisionQualifier}.
	 * @param ctx the parse tree
	 */
	void exitGlslPrecisionQualifier(GLSLParser.GlslPrecisionQualifierContext ctx);
}