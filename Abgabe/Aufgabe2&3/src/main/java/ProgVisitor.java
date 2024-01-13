public interface ProgVisitor {
    default void enterBefehl(Befehl operation) { }
    default void exitBefehl(Befehl operation) { }
    default void visitBefehl(Befehl operation) { }
}
