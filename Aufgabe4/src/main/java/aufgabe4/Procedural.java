package aufgabe4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class Procedural {
    public Procedural() { }

    private static final int MIN_LENGTH = 20;

    public static void main(String[] args) throws IOException {
        var input = Paths.get(args[0]);
        var lines = new LinkedList<String>();

        long start = System.nanoTime();

        readLines(Files.newBufferedReader(input), lines);
        removeEmptyLines(lines);
        removeShortLines(lines);
        int n = totalLineLengths(lines);

        long stop = System.nanoTime();

        System.out.printf("Procedural = %d (%d microsec)%n", n, (stop - start) / 1000);
    }

    private static void readLines(BufferedReader reader, LinkedList<String> lines) throws IOException {
        String line; //impertaiv auf die Liste wird zugegriffen und sie wird bearbeitet änderungen findnen statt
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();
    }

    private static void removeEmptyLines(LinkedList<String> lines) {
        List<String> linesToRemove = new ArrayList<>();

        for (String line : lines) {
            if (line.isEmpty()) {
                linesToRemove.add(line);
            }
        }

        lines.removeAll(linesToRemove);
    }


    private static void removeShortLines(LinkedList<String> lines) {
        List<String> linesToRemove = new ArrayList<>();

        for (String line : lines) {
            if (line.length() < MIN_LENGTH) {
                linesToRemove.add(line);
            }
        }

        lines.removeAll(linesToRemove);
    }

    private static int totalLineLengths(LinkedList<String> lines) {
        int totalLength = 0;
        for (String line : lines) {
            totalLength += line.length();
        }
        return totalLength;
    }
}
