package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main (String[] args) {
        HashMap<char, int> counts = new HashMap<>();
        String quote = "Hello test";
        char[] charactersInQuote = quote.toCharArray();

        for (char character : charactersInQuote) {
            if (counts.containsKey(character)) {
                //TODO: add 1 to key's value
                int value = counts.get(character);
                value = value + 1;
                counts.put(character, value);
            } else {
                counts.put(character, 1)
            }
        }

        System.out.println("HashMap: " + counts);

    }
}