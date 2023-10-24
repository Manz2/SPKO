import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Stack;

public final class StaplerBuilder extends StaplerParserBaseListener{
    private Stack<befehl> stack = new Stack<befehl>();
    public program build(ParseTree tree) {
        new ParseTreeWalker().walk(this, tree);
        return this.stack.pop();
    }

    @Override
    public void exitBefehl(StaplerParser.BefehlContext ctx){
        System.out.println(ctx);
    }
    @Override
    public void exitFahren(StaplerParser.FahrenContext ctx) {
        System.out.println(ctx);
    }
    @Override
    public void exitHeben(StaplerParser.HebenContext ctx) {
        System.out.println(ctx);
    }
    @Override
    public void exitKippen(StaplerParser.KippenContext ctx) {
        System.out.println(ctx);
    }

}
