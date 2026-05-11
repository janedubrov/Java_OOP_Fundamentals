package Practice;

// Subklasse - Der Tachograph überwacht die Lenk- und Ruhezeiten des Fahrers

public class Tachograph extends GPSDevice {
    protected int workingHours;
    private static final int MAX_DRIVING_HOURS = 9;

    public Tachograph(String serialNumber, int workingHours) {
        super(serialNumber);
        this.workingHours = workingHours;
    }

    @Override
    public void track() {
        System.out.println("Tacho INFO: The device is tracking the driving time");
    }

// Prüft, ob die gesetzliche maximale Lenkzeit überschritten wurde
    public void checkOvertime() {
        if (this.workingHours >= MAX_DRIVING_HOURS) {
            System.out.println("Tacho INFO: Please have a rest, driving  time more than 9 hours is against the law.");

        } else {
            System.out.println("Tacho INFO: Driving is still allowed");
        }
    }
}
