public abstract class Distanz extends program{
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

}
