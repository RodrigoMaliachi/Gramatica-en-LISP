// Generated from /home/calcifer/IdeaProjects/GramaticaLISP/src/main/java/com/example/gramaticalisp/Operaciones.g4 by ANTLR 4.9.2
package com.example.gramaticalisp;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OperacionesParser}.
 */
public interface OperacionesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OperacionesParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(OperacionesParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperacionesParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(OperacionesParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperacionesParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(OperacionesParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperacionesParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(OperacionesParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperacionesParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(OperacionesParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperacionesParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(OperacionesParser.NumberContext ctx);
}