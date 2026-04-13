package Abstraction;

public class Testtwo {
    public static void main(String[] args) {

        SpaceShip figher = new Fighter(30);
        SpaceShip cargo = new CargoShip(40);

        figher.launch();
        cargo.launch();

    }
}
