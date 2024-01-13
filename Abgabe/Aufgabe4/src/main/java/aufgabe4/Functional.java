package aufgabe4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public final class Functional {
    private Functional() { }

    private static final int MIN_LENGTH = 20;

    public static void main(String[] args) throws IOException {
        var input = Paths.get(args[0]);

        long start = System.nanoTime();
        int n = Files.lines(input)
                .filter(s -> !s.isEmpty())
                .filter(s -> s.length() >= MIN_LENGTH)
                .mapToInt(String::length)
                .sum();
        long stop = System.nanoTime();

        System.out.printf("Functional = %d (%d microsec)%n", n, (stop - start) / 1000);
    }
}
