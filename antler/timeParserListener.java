// Generated from .\timeParser.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link timeParser}.
 */
public interface timeParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link timeParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(timeParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link timeParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(timeParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link timeParser#tw4}.
	 * @param ctx the parse tree
	 */
	void enterTw4(timeParser.Tw4Context ctx);
	/**
	 * Exit a parse tree produced by {@link timeParser#tw4}.
	 * @param ctx the parse tree
	 */
	void exitTw4(timeParser.Tw4Context ctx);
}