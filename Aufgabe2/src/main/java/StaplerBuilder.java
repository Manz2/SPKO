import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;

public final class StaplerBuilder extends StaplerParserBaseListener{
    List<Befehl> list = new ArrayList<>();
    String richtung;
    boolean fahren;
    public Programm build(ParseTree tree) {
        new ParseTreeWalker().walk(this, tree);
        return new Programm(list);
    }

    @Override
    public void exitBefehl(StaplerParser.BefehlContext ctx){
        //builder.deleteCharAt(builder.length() - 1);
    }

    @Override
    public void exitDistanz(StaplerParser.DistanzContext ctx){
        if(fahren){
            list.add(new Fahren(richtung,Integer.parseInt(ctx.getStart().getText())));
        } else {
            list.add(new Heben(richtung,Integer.parseInt(ctx.getStart().getText())));
        }
    }


    @Override
    public void exitFahren(StaplerParser.FahrenContext ctx) {
        fahren = true;
        switch (ctx.getStart().getType()){
            case StaplerLexer.LINKS:
                richtung = ctx.LINKS().getText();
            break;
            case StaplerLexer.RECHTS:
                richtung = ctx.RECHTS().getText();
                break;
            case StaplerLexer.VORWAERTS:
                richtung = ctx.VORWAERTS().getText();
                break;
            case StaplerLexer.RUECKWAERTS:
                richtung = ctx.RUECKWAERTS().getText();
                break;
            case StaplerLexer.HALT:
                richtung = ctx.HALT().getText();
                break;
        }
    }
    @Override
    public void exitHeben(StaplerParser.HebenContext ctx) {
        fahren  = false;
        switch (ctx.getStart().getType()){
            case StaplerLexer.HOCH:
                richtung = ctx.HOCH().getText();
                break;
            case StaplerLexer.RUNTER:
                richtung = ctx.RUNTER().getText();
        }
    }

}
