package technology;

public class Computer {
    private int year;

    private String operatingSystem;

    private int battery;

    public Computer(int year, String operatingSystem, int battery) {
        this.year = year;
        this.operatingSystem = operatingSystem;
        setBattery(battery);
    }

    public Computer() {
        battery = 100;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isCharged() {
        return battery >= 50;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        if(battery <= 0) {
            this.battery = 0;
        } else if (battery >= 100) {
            this.battery = 100;
        } else {
            this.battery = battery;
        }
    }

    public void plugIn() {
        if (battery>50) {
            setBattery(100);
        } else {
            battery += 50;
        }
    }

}
