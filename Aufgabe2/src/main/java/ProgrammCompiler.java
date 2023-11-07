public class ProgrammCompiler implements ProgVisitor{
    private final Programm prog;
    private StringBuilder result;

    public ProgrammCompiler(Programm prog) {
        this.prog = prog;
        this.result = null;
    }

    public String compile() {
        if (this.result == null) {
            this.result = new StringBuilder();
            this.result.append("Gcode:");
            this.prog.accept(this);
            this.result.append("Gcode Ende");
        }
        return this.result.toString();
    }
    @Override
    public void visitBefehl(Programm prog) {
        String v = prog.toString();
        if (v.startsWith("-")) {
            v = v.replace('-', '_');
        } else if (v.startsWith("+")) {
            v = v.substring(1);
        }
        this.result.append(v);
        this.result.append('\n');
    }
}
