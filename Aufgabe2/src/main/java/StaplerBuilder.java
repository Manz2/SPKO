import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Stack;

public final class StaplerBuilder extends StaplerParserBaseListener{
    private Stack<befehl> stack = new Stack<befehl>(); //befehl=Expr
    public befehl build(ParseTree tree) {
        new ParseTreeWalker().walk(this, tree);
        return this.stack.pop();
    }

    @Override
    public void exitBefehl(StaplerParser.BefehlContext ctx){
        if(ctx.getChildCount() == 3){
            befehl e1 = this.stack.pop();
            befehl e2 = this.stack.pop();
            this.stack.push(new befehl(e2.toString() + " "+ e1.toString()));
        }
    }
    @Override
    public void exitFahren(StaplerParser.FahrenContext ctx) {
        String s = "";

        switch (ctx.getStart().getType()){
            case StaplerLexer.LINKS:
                s = ctx.LINKS().getText() + s;
                break;
            case StaplerLexer.RECHTS:
                s = ctx.RECHTS().getText()+s;
                break;
            case StaplerLexer.VORWAERTS:
                s = ctx.VORWAERTS().getText()+s;
                break;
            case StaplerLexer.RUECKWAERTS:
                s = ctx.RUECKWAERTS().getText()+s;
                break;
            case StaplerLexer.HALT:
                s = ctx.HALT().getText()+s;
                break;
        }
        this.stack.push(new befehl(s));
    }
    @Override
    public void exitHeben(StaplerParser.HebenContext ctx) {
        String s = "";

        switch (ctx.getStart().getType()){
            case StaplerLexer.HOCH:
                s = ctx.HOCH().getText() + s;
                break;
            case StaplerLexer.RUNTER:
                s = ctx.RUNTER().getText()+s;
        }
        this.stack.push(new befehl(s));
    }

}
