package Encapsulation;

public class Scooter {
    private String model;
    private double batteryLevel;
    private boolean isRented = false;
    private double pricePerHour;

    // Constructor:
    public Scooter(String model, double pricePerHour) {
        this.model = model;
        if(pricePerHour < 0) {
            this.pricePerHour = 0.5;
        } else {
            this.pricePerHour = pricePerHour;
        }
        this.batteryLevel = 100;

    }
    // Getters:
    String getModel() {
        return this.model;
    }

    double getBatteryLevel() {
        return this.batteryLevel;
    }

    boolean getIsRented () {
        return this.isRented;
    }

    double getPricePerHour() {
        return this.pricePerHour;
    }

    void takeRental() {
        if(!isRented && batteryLevel >= 10){
            this.isRented = true;
            System.out.println("Encapsulation.Scooter " + model + " is yours!");

        }

    }
    void returnScooter() {
        this.isRented = false;
        System.out.println("Scotter is returned");
    }

    void chargeBattery(double amount) {
        batteryLevel = batteryLevel + amount;
        if(this.batteryLevel > 100){
            this.batteryLevel = 100;
            System.out.println("Battery level is: " + batteryLevel);
        }

    }

}
