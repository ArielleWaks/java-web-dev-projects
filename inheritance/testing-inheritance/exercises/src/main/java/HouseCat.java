public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight); //super keyword allows the subclass to access the constructor from the base class
        name = aName;

    }

    public HouseCat(String aName) {
        name = aName; // weight will be set to 13 from no-arg Cat constructor
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}