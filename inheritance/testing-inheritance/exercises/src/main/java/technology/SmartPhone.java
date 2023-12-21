package technology;

public class SmartPhone extends Computer{
    private String deviceName;

    public SmartPhone(int year, String operatingSystem, int battery, String deviceName) {
        super(year, operatingSystem, battery);
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String syncToCloud() {
        return "Your device " + deviceName + " has successfully synced to the cloud";
    }
}
