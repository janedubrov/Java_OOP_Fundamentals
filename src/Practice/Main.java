package Practice;

public class Main {
    public static void main(String[] args) {

        GPSDevice[] device = new GPSDevice[2];

        device[0] = new TelematicsBox("0152498", 117);
        device[1] = new Tachograph("2569841", 10);

        for(GPSDevice i : device) {
            i.track();
            i.getSerialNumber();
            System.out.println("Serial number of the device is " + i.getSerialNumber() );
            System.out.println();

        }

//        ((Tachograph) device[1]).checkOvertime();

    }
}
