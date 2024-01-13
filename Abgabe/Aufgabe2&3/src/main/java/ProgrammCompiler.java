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
            this.result.append('\n');
            this.prog.accept(this);
            this.result.append("Gcode Ende");
        }
        return this.result.toString();
    }
    @Override
    public void visitBefehl(Befehl befehl) {
        switch (befehl.getRichtung()){
            case "up":
                this.result.append("Y0 Z"+befehl.getDistanz());
                break;
            case "down":
                this.result.append("Y0 Z-"+befehl.getDistanz());
                break;
            case "forward":
                this.result.append("YG1 X"+befehl.getDistanz());
                break;
            case "backward":
                this.result.append("YG1 X-"+befehl.getDistanz());
                break;
        }
        this.result.append(";");
        this.result.append('\n');
    }
}
