package abstraction.Electronics;

public class VideoCam extends Device {

    public VideoCam(String brand,String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println("The camera " + getBrand() + " is now recording");
    }
}
