package technology;

public class Laptop extends Computer{

    private String model;
    public Laptop(int year, String operatingSystem, int battery, String model) {
        super(year, operatingSystem, battery);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String updateSoftware() {
        return "Software up to date";
    }

}
