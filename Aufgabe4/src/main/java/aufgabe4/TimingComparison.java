package aufgabe4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.LinkedList;

public final class TimingComparison {
    private TimingComparison() { }

    private static final int MIN_LENGTH = 20;
    private static String[] testTextArray = {
            "C:\\Users\\User\\Documents\\SPKO\\SPKO\\Aufgabe4\\src\\main\\resources\\testdatei.txt"
    };



    public static void main(String[] args) throws IOException {
        runProceduralProgram();
        runFunctionalProgram();
    }

    private static void runProceduralProgram() throws IOException {
        Procedural.main(testTextArray);
    }

    private static void runFunctionalProgram() throws IOException {

        Functional.main(testTextArray);}
}

