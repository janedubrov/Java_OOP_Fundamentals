package interfaces.Vehicle;

public class ElectricCar implements Vehicle{

    public ElectricCar(){}

    @Override
    public void refuel() {
        System.out.println("Charging battery: " + getFuel());
    }

    @Override
    public String getFuel() {
        return "electricity";
    }

}
