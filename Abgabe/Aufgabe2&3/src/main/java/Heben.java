public final class Heben implements Befehl {
    private final String richtung;
    private final int distanz;

    public Heben(String richtung,int distanz) throws StaplerException {
        this.richtung = richtung;
        this.distanz = distanz;
        if(distanz > 2500 || distanz < 0){
            throw new StaplerException("Ungültige distanz beim Heben von: " + distanz);
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