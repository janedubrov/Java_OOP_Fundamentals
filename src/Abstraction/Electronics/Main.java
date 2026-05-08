package Abstraction.Electronics;

public class Main {
    public static void main(String[] args) {

        Device[] devices = new Device[3];
        devices[0] = new Smartphone("Iphone", "17 Pro MAX");
        devices[1] = new VideoCam("LG", "005");
        devices[2] = new SmartLamp("Philips", "C+");

        for(Device i : devices) {
            i.turnOn();
            i.showDetails();
            System.out.println();
        }

    }
}

