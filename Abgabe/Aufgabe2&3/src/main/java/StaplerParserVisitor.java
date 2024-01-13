// Generated from C:/Users/User/Documents/SPKO/SPKO/Aufgabe2/src/main/antlr/StaplerParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StaplerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StaplerParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StaplerParser#programm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramm(StaplerParser.ProgrammContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaplerParser#befehl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBefehl(StaplerParser.BefehlContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaplerParser#distanz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistanz(StaplerParser.DistanzContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaplerParser#fahren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFahren(StaplerParser.FahrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaplerParser#heben}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeben(StaplerParser.HebenContext ctx);
}