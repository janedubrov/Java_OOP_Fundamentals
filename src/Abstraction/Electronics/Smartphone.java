package Abstraction.Electronics;

public class Smartphone extends Device{

    public Smartphone(String brand,String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Please press the button, now the device " + getBrand() + " is on");
    }
}
