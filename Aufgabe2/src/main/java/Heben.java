public final class Heben implements Befehl {
    private final String richtung;
    private final int distanz;

    public Heben(String richtung,int distanz) {
        this.richtung = richtung;
        this.distanz = distanz;
        if(distanz > 2500){
            System.exit(1);
            //hier fehlt noch eine Fehlermeldung
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