package lambda;

import java.util.Arrays;

public class Car_Main {
    public static void main(String[] args) {

        Arrays.stream(Car.values()).forEach(Car -> System.out.println("Car: " + Car + ", price: " + Car.getPrice() + "k." ));

        System.out.println("------");

        Arrays.stream(Car.values()).filter(Car -> Car.getPrice() < 70).forEach(Car -> System.out.println("Car cheaper than 70k: " + Car));

        System.out.println("------");

        Arrays.stream(Car.values()).filter(Car -> Car.isElectric()).forEach(Car -> System.out.println("Electric cars: " + Car));

    }
}
