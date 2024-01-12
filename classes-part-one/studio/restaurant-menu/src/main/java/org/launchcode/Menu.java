package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;

    private LocalDate updated;

    public Menu(LocalDate aUpdated, ArrayList<MenuItem> aItems) {
        this.updated = aUpdated;
        this.items = aItems;
    }

    public String toString() {
        return "Menu\n" + "updated " + updated + "\n" + items;
    }

    public void printSimpleMenu() {
        System.out.println("Menu\n");
        for (MenuItem i : items) {
            System.out.println(i.toString());
            System.out.println("\n");
        }
        System.out.println("Last Updated " + updated);
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void addItem(MenuItem item) {
        if (items.contains(item)) {
            return;
        }
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        if (items.contains(item)) {
            items.remove(item);
            //TODO: print menu
        }
    }


    public LocalDate getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDate updated) {
        this.updated = updated;
    }
}
