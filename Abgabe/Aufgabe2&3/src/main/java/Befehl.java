public interface Befehl{
    //IST nur eine Abstract class
    public default String getRichtung(){
        return null;
    };

    public default int getDistanz() {
        return 0;
    }

    public default void accept(ProgVisitor visitor) {
        visitor.visitBefehl(this);
    }
}
