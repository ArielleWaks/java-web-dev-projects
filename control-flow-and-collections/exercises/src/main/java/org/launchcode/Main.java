package org.launchcode;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.

        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int i : integerArray) {
            System.out.println(i);
        }
        for (i = 0; i < integerArray.length; i++) {
            if(!integerArray[i] % 2) {
                System.out.println(integerArray[i]);
            }
        }
    }
}