public abstract class Heben extends program{
    private final String richtung;

    public Heben(String value) {
        this.richtung = value;
    }

    public String getValue() {
        return this.richtung;
    }

    @Override
    public String toString() {
        return this.richtung;
    }

}