package Abstraction.Electronics;

public abstract class Device {
    private String brand;
    private String model;

    public Device(String brand,String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void turnOn();

    public void showDetails() {
        System.out.println("Brand " + brand + " , model " + model);
    }
}
