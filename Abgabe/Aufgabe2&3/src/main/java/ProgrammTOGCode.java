import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public final class ProgrammTOGCode {
    private ProgrammTOGCode() {}

    public static void main(String[] args) {
        StaplerLexer lexer = new StaplerLexer(CharStreams.fromString("forward 12 up 14 down 20"));
        StaplerParser parser = new StaplerParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.programm();
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
            System.exit(1);
        }
        StaplerBuilder builder = new StaplerBuilder();
        Programm ast = builder.build(tree);
        if (builder.getNumberOfSemanticErrors() > 0){
            System.err.printf(
                    "%d error(s) detected%n", builder.getNumberOfSemanticErrors());
            System.exit(1);
        }
        System.out.print(new ProgrammCompiler(ast).compile());
    }
}
