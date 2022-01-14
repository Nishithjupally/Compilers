// Generated from CupParser.g4 by ANTLR 4.8
package Cup;

    import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CupParser}.
 */
public interface CupParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CupParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CupParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CupParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(CupParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(CupParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#functionOrDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionOrDeclaration(CupParser.FunctionOrDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#functionOrDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionOrDeclaration(CupParser.FunctionOrDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#globalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDeclaration(CupParser.GlobalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#globalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDeclaration(CupParser.GlobalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(CupParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(CupParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CupParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CupParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDeclaration(CupParser.SimpleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDeclaration(CupParser.SimpleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDeclaration(CupParser.TemplateDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDeclaration(CupParser.TemplateDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#dsDec}.
	 * @param ctx the parse tree
	 */
	void enterDsDec(CupParser.DsDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#dsDec}.
	 * @param ctx the parse tree
	 */
	void exitDsDec(CupParser.DsDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#dsArgs}.
	 * @param ctx the parse tree
	 */
	void enterDsArgs(CupParser.DsArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#dsArgs}.
	 * @param ctx the parse tree
	 */
	void exitDsArgs(CupParser.DsArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#dataStructureName}.
	 * @param ctx the parse tree
	 */
	void enterDataStructureName(CupParser.DataStructureNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#dataStructureName}.
	 * @param ctx the parse tree
	 */
	void exitDataStructureName(CupParser.DataStructureNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(CupParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(CupParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(CupParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(CupParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(CupParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(CupParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(CupParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(CupParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(CupParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(CupParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#array_params}.
	 * @param ctx the parse tree
	 */
	void enterArray_params(CupParser.Array_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#array_params}.
	 * @param ctx the parse tree
	 */
	void exitArray_params(CupParser.Array_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(CupParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(CupParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(CupParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(CupParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(CupParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(CupParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CupParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CupParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CupParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CupParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(CupParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(CupParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(CupParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(CupParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CupParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CupParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(CupParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(CupParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(CupParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(CupParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(CupParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(CupParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(CupParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(CupParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(CupParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(CupParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(CupParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(CupParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(CupParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(CupParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CupParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CupParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(CupParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(CupParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CupParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CupParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(CupParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(CupParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CupParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CupParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CupParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CupParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(CupParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(CupParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(CupParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(CupParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(CupParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(CupParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#functionParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameterList(CupParser.FunctionParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#functionParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameterList(CupParser.FunctionParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(CupParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(CupParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(CupParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(CupParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(CupParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(CupParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CupParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CupParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CupParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CupParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(CupParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(CupParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CupParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CupParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CupParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CupParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CupParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CupParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(CupParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(CupParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(CupParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(CupParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(CupParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(CupParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturn(CupParser.FunctionReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturn(CupParser.FunctionReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(CupParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(CupParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(CupParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(CupParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(CupParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(CupParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#nameList}.
	 * @param ctx the parse tree
	 */
	void enterNameList(CupParser.NameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#nameList}.
	 * @param ctx the parse tree
	 */
	void exitNameList(CupParser.NameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CupParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(CupParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CupParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(CupParser.StructDefinitionContext ctx);
}