package aufgabe4;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.LinkedList;

public final class Functional {
    private Functional() { }

    private static final int MIN_LENGTH = 20;

    public static void main(String[] args) throws IOException {
        var input = Paths.get(args[0]);
        var lines = new LinkedList<String>();

        long start = System.nanoTime();

        readLines(Files.newBufferedReader(input), lines);
        lines.removeIf(String::isEmpty);
        lines.removeIf(s -> s.length() < MIN_LENGTH);
        int n = totalLineLengths(lines);

        long stop = System.nanoTime();

        System.out.printf("Functional = %d (%d microsec)%n", n, (stop - start) / 1000);
    }

    private static void readLines(BufferedReader reader, LinkedList<String> lines) throws IOException {
        lines.addAll(reader.lines().toList());
        reader.close();
    }

    private static int totalLineLengths(LinkedList<String> lines) {
        return lines.stream().mapToInt(String::length).sum();
    }
}

