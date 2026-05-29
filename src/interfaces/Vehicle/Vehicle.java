package interfaces.Vehicle;

public interface Vehicle {

    String getFuel();

    default void refuel() {
        System.out.println("Tanking: " + getFuel());
    }

    default void refuelTwice() {
        refuel();
        refuel();
    }
}
