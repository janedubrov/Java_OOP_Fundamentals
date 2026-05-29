package interfaces.Vehicle;

public class Car implements Vehicle {
    private String name;

    public Car(String name) {
        this.name = name;

    }

    @Override
    public String getFuel(){
        return "Benzin";
    }

    public String getName() {
        return name;
    }
}
