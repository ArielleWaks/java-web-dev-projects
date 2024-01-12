package org.example;

import java.util.HashMap;
//import java.util.ArrayList;
//import java.util.Map;
//import java.util.Scanner;
//import java.io.File;

public class BonusMission {

    public static void main(String[] args) {
        HashMap<String, Double> counts = new HashMap<>();
        String quote;

        quote = "/Users/ariellewaks/Projects/LaunchCode/java-web-dev-projects/control-flow-and-collections/studio/src/main/java/org/example/quote.txt";

        char[] charactersInQuote = quote.toCharArray();

        for (char character : charactersInQuote) {
            if (counts.containsKey(String.valueOf(character))) {
                Double value = counts.get(String.valueOf(character));
                value = value + 1;
                counts.put(String.valueOf(character), value);
            } else {
                counts.put(String.valueOf(character), 1.0);
            }
        }

        System.out.println("HashMap: " + counts);
    }

}
