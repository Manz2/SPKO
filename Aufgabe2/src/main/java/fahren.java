public abstract class fahren extends program{
    private final String richtung;

    public fahren(String value) {
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
