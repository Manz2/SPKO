// Generated from C:/Users/User/Documents/SPKO/SPKO/Aufgabe2/src/main/antlr/StaplerParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StaplerParser}.
 */
public interface StaplerParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StaplerParser#programm}.
	 * @param ctx the parse tree
	 */
	void enterProgramm(StaplerParser.ProgrammContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaplerParser#programm}.
	 * @param ctx the parse tree
	 */
	void exitProgramm(StaplerParser.ProgrammContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaplerParser#befehl}.
	 * @param ctx the parse tree
	 */
	void enterBefehl(StaplerParser.BefehlContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaplerParser#befehl}.
	 * @param ctx the parse tree
	 */
	void exitBefehl(StaplerParser.BefehlContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaplerParser#distanz}.
	 * @param ctx the parse tree
	 */
	void enterDistanz(StaplerParser.DistanzContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaplerParser#distanz}.
	 * @param ctx the parse tree
	 */
	void exitDistanz(StaplerParser.DistanzContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaplerParser#fahren}.
	 * @param ctx the parse tree
	 */
	void enterFahren(StaplerParser.FahrenContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaplerParser#fahren}.
	 * @param ctx the parse tree
	 */
	void exitFahren(StaplerParser.FahrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaplerParser#heben}.
	 * @param ctx the parse tree
	 */
	void enterHeben(StaplerParser.HebenContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaplerParser#heben}.
	 * @param ctx the parse tree
	 */
	void exitHeben(StaplerParser.HebenContext ctx);
}