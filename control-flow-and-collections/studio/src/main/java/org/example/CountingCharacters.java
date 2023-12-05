package org.example;

import java.util.HashMap;
//import java.util.ArrayList;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CountingCharacters {
    public static void main(String[] args) {

        HashMap<String, Double> counts = new HashMap<>();
        String quote = "Hello test";
        char[] charactersInQuote = quote.toCharArray();

        for (char character : charactersInQuote) {
            if (counts.containsKey(String.valueOf(character))) {
                //TODO: add 1 to key's value
                Double value = counts.get(String.valueOf(character));
                value = value + 1;
                counts.put(String.valueOf(character), value);
            } else {
                counts.put(String.valueOf(character), 1.0);
            }
        }

        System.out.println(counts);
    }
}