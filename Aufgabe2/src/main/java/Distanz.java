public final class Distanz extends Programm {
    private final String distanz;

    public Distanz(String distanz) {
        this.distanz = distanz;
    }

    public String getDistanz() {
        return this.distanz;
    }

    @Override
    public String toString() {
        return this.distanz + "m";
    }

    @Override
    public void accept(ProgVisitor visitor) {
        visitor.visitBefehl(this);
    }
}
