package Practice;

public abstract class GPSDevice {
    private String serialNumber;
    protected boolean isConnected;

    public GPSDevice(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    abstract void track();

}
