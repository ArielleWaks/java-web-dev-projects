package org.example;

import java.util.HashMap;
//import java.util.ArrayList;
//import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class CountingCharacters {
    public static void main(String[] args) {

        HashMap<String, Double> counts = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String quote;

        File quoteFile = new File("quote.txt");

        System.out.println("Enter quote");
        quote =input.nextLine().toLowerCase();

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