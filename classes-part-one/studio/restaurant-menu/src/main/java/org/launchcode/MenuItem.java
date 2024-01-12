package org.launchcode;

//import java.time.LocalDate;
import java.util.Date;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;

   // private final Date created;

    //private LocalDate date;
    //private boolean isNew;

    public MenuItem(String aName, double aPrice, String aDescription, String aCategory) {
        this.name = aName;
        this.price = aPrice;
        this.description = aDescription;
        this.category = aCategory;
        //this.created = aCreated;
        //this.isNew = aIsNew;
        //this.name = name;
        //this.date = LocalDate.now();
    }

    //public String getName() { return name; }

    public String toString() {
        return name + " $" + price + "\n" + description;
    }


    public double getPrice() { return price; }

    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public String getDescription() { return description; }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public String getCategory()  { return category; }

    public void setCategory(String aCategory) {
        aCategory = this.category;
    }


//    public boolean isNew(Date today) {
//        public int compareTo;
//        return;
//    }

//    public LocalDate getDate() {
//        return date;
//    }

//    public Date() {
//
//    }


}
