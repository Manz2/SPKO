package aufgabe4;

import java.io.IOException;

public final class TimingComparison {
    private TimingComparison() { }

    private static String projectDir = System.getProperty("user.dir");
    private static final int MIN_LENGTH = 20;
    private static String[] testTextArray = {
            projectDir + "\\src\\main\\resources\\testdatei.txt"
    };

    public static void main(String[] args) throws IOException {
        Procedural.main(testTextArray);
        Functional.main(testTextArray);
    }
}
