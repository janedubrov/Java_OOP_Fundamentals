package inheritance.Gps;

//Abstrakte Superklasse für alle GPS-Geräte im LKW

public abstract class GPSDevice {
    private String serialNumber;
    protected boolean isConnected;

    public GPSDevice(String serialNumber) {
        this.serialNumber = serialNumber;
        this.isConnected = false;
    }

    // serialNumber Getter
    public String getSerialNumber() {
        return serialNumber;
    }

//Abstrakte Methode zur Verfolgung spezifischer Daten von jedem Gerät
    abstract void track();

}
