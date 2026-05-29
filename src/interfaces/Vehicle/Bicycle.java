package interfaces.Vehicle;

public class Bicycle implements Vehicle{

    public Bicycle(){}

    @Override
    public String getFuel() {
        return "No gas needed";
    }


}
