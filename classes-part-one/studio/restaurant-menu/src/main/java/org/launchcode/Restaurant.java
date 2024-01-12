package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
	// write your code here

        MenuItem nachos = new MenuItem(
                "Nachos",
                7.50,
                "Tortilla chips with salsa and queso",
                "App"
        );

        MenuItem iceCream = new MenuItem(
                "Ice Cream",
               5.75,
               "Flavors include vanilla, chocolate, and strawberry",
               "Dessert"
        );

        Menu specials = new Menu(
                LocalDate.now(),
                new ArrayList<MenuItem>()
        );

        specials.addItem(nachos);
        specials.addItem(iceCream);

        specials.printSimpleMenu();

        System.out.println(nachos.toString());

        specials.removeItem(nachos);

        specials.printSimpleMenu();

    }
}
