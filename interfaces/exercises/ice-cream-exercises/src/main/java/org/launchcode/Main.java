package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // Use a Comparator class to sort the 'flavors' array by number of allergens in the 'allergens' array.
        flavors.sort(new FlavorComparator());

        // Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        cones.sort(new ConeComparator());

        // Use a Comparator class to sort the 'toppings' array by 'name' field.
        toppings.sort(new ToppingComparator());

        // Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("Flavor Options: " + flavors);
        System.out.println("Cone Options: " + cones);
        System.out.println("Topping Options: " + toppings);

    }
}