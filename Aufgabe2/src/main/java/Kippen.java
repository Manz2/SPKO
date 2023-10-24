public abstract class Kippen extends program{
    private final String richtung;
    private final int winkel;



    public Kippen(String value, int winkel) {
        this.richtung = value;
        this.winkel = winkel;
    }

    public String getValue() {
        return this.richtung;
    }

    public int getWinkel() {
        return winkel;
    }
    @Override
    public String toString() {
        return this.richtung + this.winkel;
    }

}
