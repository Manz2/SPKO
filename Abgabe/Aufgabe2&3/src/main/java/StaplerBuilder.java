import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;

public final class StaplerBuilder extends StaplerParserBaseListener{
    List<Befehl> list = new ArrayList<>();
    String richtung;
    private List<Exception> errors = new ArrayList<>();
    boolean fahren;
    public Programm build(ParseTree tree) {
        new ParseTreeWalker().walk(this, tree);
        Programm returnProgramm = new Programm(list);
        if(errors.isEmpty()){
            return returnProgramm;
        }else {
            System.out.println(errors);
            return null;
        }
    }

    @Override
    public void exitBefehl(StaplerParser.BefehlContext ctx){

    }

    @Override
    public void exitDistanz(StaplerParser.DistanzContext ctx){
        try {
            if(fahren){
                list.add(new Fahren(richtung,Integer.parseInt(ctx.getStart().getText())));
            } else {
                list.add(new Heben(richtung,Integer.parseInt(ctx.getStart().getText())));
            }
        } catch (StaplerException e) {
            errors.add(e);
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

    public int getNumberOfSemanticErrors(){
        return errors.size();
    }

}
