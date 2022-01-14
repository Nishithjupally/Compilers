// Generated from CupParser.g4 by ANTLR 4.8
package Cup;

    import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CupParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CupParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CupParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CupParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(CupParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#functionOrDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionOrDeclaration(CupParser.FunctionOrDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(CupParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CupParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#templateDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDeclaration(CupParser.TemplateDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#templateDeclaration1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDeclaration1(CupParser.TemplateDeclaration1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#dsArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsArgs(CupParser.DsArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#dataStructureName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStructureName(CupParser.DataStructureNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(CupParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(CupParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(CupParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(CupParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifierList(CupParser.TypeQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(CupParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(CupParser.DirectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#array_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_params(CupParser.Array_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(CupParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(CupParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(CupParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(CupParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(CupParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CupParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(CupParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(CupParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CupParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(CupParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(CupParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(CupParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(CupParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(CupParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(CupParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(CupParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(CupParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(CupParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(CupParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(CupParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(CupParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(CupParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(CupParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(CupParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeList(CupParser.ParameterTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#functionParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameterList(CupParser.FunctionParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(CupParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(CupParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CupParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(CupParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CupParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(CupParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(CupParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(CupParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(CupParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(CupParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(CupParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(CupParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(CupParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(CupParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(CupParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(CupParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(CupParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#functionReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturn(CupParser.FunctionReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier(CupParser.DeclarationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(CupParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(CupParser.DeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CupParser#structDefintion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefintion(CupParser.StructDefintionContext ctx);
}