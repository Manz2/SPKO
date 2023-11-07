public class Befehl extends Programm {
    private final String befehl;

    public Befehl(String value) {
        this.befehl = value;
    }

    public String getValue() {
        return this.befehl;
    }

    @Override
    public String toString() {
        return this.befehl;
    }

    @Override
    public void accept(ProgVisitor visitor) {
        visitor.visitBefehl(this);
    }
}
