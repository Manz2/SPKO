package aufgabe4;

import java.io.File;
import java.io.IOException;

public final class TimingComparison {
    private TimingComparison() {
    }

    private static String projectDir = System.getProperty("user.dir");
    private static final int MIN_LENGTH = 20;

    public static void main(String[] args) throws IOException {
        String filePath = projectDir + "\\Aufgabe4\\src\\main\\resources\\testdatei.txt";
        if (!new File(filePath).exists()) {
            filePath = projectDir + "\\src\\main\\resources\\testdatei.txt";
        }
        String[] testTextArray = {
                filePath
        };
        Procedural.main(testTextArray); 
        Functional.main(testTextArray);
    }
}
