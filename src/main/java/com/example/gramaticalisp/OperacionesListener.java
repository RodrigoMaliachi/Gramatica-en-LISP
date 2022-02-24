package com.example.gramaticalisp;// Generated from Operaciones.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OperacionesParser}.
 */
public interface OperacionesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OperacionesParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(OperacionesParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperacionesParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(OperacionesParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printOper}
	 * labeled alternative in {@link OperacionesParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintOper(OperacionesParser.PrintOperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printOper}
	 * labeled alternative in {@link OperacionesParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintOper(OperacionesParser.PrintOperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link OperacionesParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(OperacionesParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link OperacionesParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(OperacionesParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code op}
	 * labeled alternative in {@link OperacionesParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterOp(OperacionesParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code op}
	 * labeled alternative in {@link OperacionesParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitOp(OperacionesParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code val}
	 * labeled alternative in {@link OperacionesParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterVal(OperacionesParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code val}
	 * labeled alternative in {@link OperacionesParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitVal(OperacionesParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link OperacionesParser#value}.
	 * @param ctx the parse tree
	 */
	void enterInt(OperacionesParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link OperacionesParser#value}.
	 * @param ctx the parse tree
	 */
	void exitInt(OperacionesParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link OperacionesParser#value}.
	 * @param ctx the parse tree
	 */
	void enterFloat(OperacionesParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link OperacionesParser#value}.
	 * @param ctx the parse tree
	 */
	void exitFloat(OperacionesParser.FloatContext ctx);
}