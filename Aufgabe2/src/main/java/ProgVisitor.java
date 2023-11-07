public interface ProgVisitor {
    default void enterBefehl(Programm operation) { }
    default void exitBefehl(Programm operation) { }
    default void visitBefehl(Programm operation) { }
}
