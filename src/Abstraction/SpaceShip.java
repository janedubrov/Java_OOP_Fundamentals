package Abstraction;

public abstract class SpaceShip {

    int fuel;

    public SpaceShip (int fuel) {
        this.fuel = fuel;
    }

    boolean canFly(int needFuel) {
        if (fuel >= needFuel) {
            fuel -= needFuel;
            return true;

        }
        else {
            System.out.println("Not enough fuel");
            return false;
        }
        }
    abstract void launch();
    }


