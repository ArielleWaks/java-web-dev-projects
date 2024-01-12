package org.launchcode;

public interface OpticalDisc {

    //store data
    //write data
    //read data

    //once loaded, they report: (hashmap?)
    //(retrieve data method?)
    //name
    //capacity
    //contents
    //disc type

    void spinSpeedRange();

    //method spinDisc()
    default void spinDisc() {
        System.out.println("A CD/DVD spins at a rate of rpm.");
    }


}
