public class StaplerException extends Exception {
    public StaplerException() {
        super("Es gibt ein Problem mit dem Stapler.");
    }

    public StaplerException(String message) {
        super(message);
    }
}
