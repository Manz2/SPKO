public class befehl extends program{
    private final String befehl;

    public befehl(String value) {
        this.befehl = value;
    }

    public String getValue() {
        return this.befehl;
    }

    @Override
    public String toString() {
        return this.befehl;
    }
}
