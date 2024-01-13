public final class Fahren implements Befehl {
    private final String richtung;//evtl enum
    private final int distanz;

    public Fahren(String richtung,int distanz) throws StaplerException {
        this.richtung = richtung;
        this.distanz = distanz;
        if(distanz > 100000 || distanz < 0){
            throw new StaplerException("Ungültige distanz beim Fahren von: " + distanz);
        }
    }

    public String getRichtung() {
        return this.richtung;
    }
    public int getDistanz() {
        return this.distanz;
    }
    @Override
    public String toString() {
        return this.richtung + this.distanz;
    }

    @Override
    public void accept(ProgVisitor visitor) {
        visitor.visitBefehl(this);
    }
}
