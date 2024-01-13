package aufgabe4;// Foo.java

import java.util.Scanner;

public final class tets {
    private tets() {
    }

    public static void main(final String[] args) {
        String[] regex = {
                ".*foo",  // greedy quantifier
                ".*?foo", // reluctant quantifier
                ".*+foo"  // possessive quantifier
        };


        String a = "fooxxxfoo foo xxx";
        for (String r : regex) {
            System.out.printf("pattern %s in %s:%n", r, a);
            Scanner input = new Scanner(a);
            String s;
            while ((s = input.findInLine(r)) != null) {
                System.out.println(s);
            }
        }

    }
}

