package interfaces.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car("Audi");
        Vehicle elcar = new ElectricCar();
        Vehicle bike = new Bicycle();


        car.refuel();
        elcar.refuel();
        bike.refuel();

        car.refuelTwice();
        elcar.refuelTwice();
        bike.refuelTwice();

    }
}
