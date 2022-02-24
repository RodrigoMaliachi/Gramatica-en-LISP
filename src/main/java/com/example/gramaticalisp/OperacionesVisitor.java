package com.example.gramaticalisp;// Generated from Operaciones.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OperacionesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OperacionesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(OperacionesParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printOper}
	 * labeled alternative in {@link OperacionesParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintOper(OperacionesParser.PrintOperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link OperacionesParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(OperacionesParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code op}
	 * labeled alternative in {@link OperacionesParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(OperacionesParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code val}
	 * labeled alternative in {@link OperacionesParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(OperacionesParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link OperacionesParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(OperacionesParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link OperacionesParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(OperacionesParser.FloatContext ctx);
}