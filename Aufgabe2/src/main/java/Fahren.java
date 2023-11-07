public final class Fahren extends Programm {
    private final String richtung;

    public Fahren(String value) {
        this.richtung = value;
    }

    public String getValue() {
        return this.richtung;
    }

    @Override
    public String toString() {
        return this.richtung;
    }

    @Override
    public void accept(ProgVisitor visitor) {
        visitor.visitBefehl(this);
    }
}
