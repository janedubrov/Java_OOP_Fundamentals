package abstraction.Electronics;

public class SmartLamp extends Device{

    public SmartLamp(String brand,String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Lamp from  " + getBrand() + " is turned ON");
    }
}
