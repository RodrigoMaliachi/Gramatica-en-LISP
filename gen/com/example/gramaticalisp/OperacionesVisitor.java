// Generated from /home/calcifer/IdeaProjects/GramaticaLISP/src/main/java/com/example/gramaticalisp/Operaciones.g4 by ANTLR 4.9.2
package com.example.gramaticalisp;
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
	 * Visit a parse tree produced by {@link OperacionesParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(OperacionesParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(OperacionesParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(OperacionesParser.NumberContext ctx);
}