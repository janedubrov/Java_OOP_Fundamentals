package Practice;

// Subklasse - Die TelematicsBox überwacht die Geschwindigkeit

public class TelematicsBox extends GPSDevice implements Transmittable {
    private int currentSpeed;

    public TelematicsBox(String serialNumber, int currentSpeed) {
        super(serialNumber); // Aufruf des Eltern-Konstruktors
        this.currentSpeed = currentSpeed;
    }

// Getter
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    // Setter mit Validierung
    public void setCurrentSpeed(int currentSpeed) {
        if(currentSpeed > 0) {
            this.currentSpeed = currentSpeed;
        } else {
            System.out.println(" Speed can not be less than 0");
        }
    }

    @Override
    public void track() {
        System.out.println("Telematics Box transferring the info: \"Current speed of the vehicle is\" " + currentSpeed + " km/h" );
    }

    @Override
    public void sendData() {
        System.out.println("Telematics Box is sending data via 5G");
    }

}
