package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * SPKO Aufgabe1 A
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aufgabe 1 Input: \n");
        String input = scanner.nextLine();

        String argumentIndex = "([1-9]\\$)*";
        String flags = "[-#\\+ 0,\\(]*"; // -,#,+, ,0,,,(
        String width = "[0-9]*";
        String conversion = "[AaBbCcdEefGghHnoSsXx%]";
        String timeConversion = "([tT][HIklMSLNpzKsQBbhAaCYyjmdeRTrDFC]?)";
        String precision = "(\\.\\d*)?";
        String fullConversion = "(" + conversion + "|" + timeConversion + ")";

        String text = "([a-zA-Z: ]+)";
        String regex = "(%" + argumentIndex + flags + width + precision + fullConversion + ")";
        String all = regex + "|" + text;
        Matcher matcher = Pattern.compile(all).matcher(input);

        StringBuilder output = new StringBuilder();

        while (matcher.find()) {
            if (matcher.group().matches(regex)) {
                output.append("FORMAT(" + matcher.group() + ")");
            } else {

                output.append("TEXT(" + matcher.group() + ")");
            }
        }
        System.out.println(output);
        scanner.close();
    }
}
