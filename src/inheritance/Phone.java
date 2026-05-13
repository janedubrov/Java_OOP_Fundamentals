package inheritance;

public class Phone {

    protected String brand;
    protected String model;

    public Phone(String brand, String model){
        this.brand = brand;
        this.model = model;

    }
    void makeCall(String number){
        System.out.println("The phone " + brand + " " + model + " is dialing number: " + number);
    }
}
