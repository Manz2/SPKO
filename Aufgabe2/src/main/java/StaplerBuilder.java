import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public final class StaplerBuilder extends StaplerParserBaseListener{
    StringBuilder builder = new StringBuilder();
    public Befehl build(ParseTree tree) {
        new ParseTreeWalker().walk(this, tree);
        String s = builder.toString();
        if(statischeSemantik(s)){
            return new Befehl(s);
        }else {
            System.exit(1);
            return null;
        }
    }

    boolean statischeSemantik(String s){
        String[] l = s.split(" ");
        if(l[0].equals("up") || l[0].equals("down")){
            if(Integer.parseInt(l[1]) > 2500){
                return false;
            } else {
                return true;
            }
        } else {
            if(Integer.parseInt(l[3]) > 2500){
                return false;
            } else {
                return true;
            }
        }

    }

    @Override
    public void exitBefehl(StaplerParser.BefehlContext ctx){
        builder.deleteCharAt(builder.length() - 1);
    }

    public void exitDistanz(StaplerParser.DistanzContext ctx){
        builder.append(ctx.DISTANZ().getText() + " ");
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
        builder.append(s + " ");
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
        builder.append(s + " ");
    }

}
