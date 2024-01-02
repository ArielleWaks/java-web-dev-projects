public class Main {
    public static void main(String[] args) {

        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat(); // HouseCat inherits the method eat() from Cat
        System.out.println(garfield.isTired());   // prints true

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight()); // prints 13

        Cat plainCat = new HouseCat("Plain Jane", 8.8); //casting
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        System.out.println(plainCat.noise()); // prints "Meeeeeeooooowww!"
        System.out.println(cheshireCat.noise()); // prints "Hello, my name is Cheshire!"

        Cat suki = new HouseCat("Suki", 8); // Casting housecat as cat

        Cat spikeJr = spike; // up-casting

        //Check before down-casting
        if (suki instanceof HouseCat) {
            ((HouseCat) suki).isSatisfied();
        }


    }

}
