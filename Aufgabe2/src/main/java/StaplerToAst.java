import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
public class StaplerToAst {
    private StaplerToAst() { }

    public static void main(String[] args) throws Exception {
        StaplerLexer lexer = new StaplerLexer(CharStreams.fromString("forward up"));
        StaplerParser parser = new StaplerParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
            System.exit(1);
        }

        befehl ast = new StaplerBuilder().build(tree);
        System.out.printf("Program.toString() = \"%s\"%n", ast);
    }
}
