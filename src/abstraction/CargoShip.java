package abstraction;

public class CargoShip extends SpaceShip {

    public CargoShip(int fuel){
        super(fuel);

    }
    @Override
    public void launch() {
        if (canFly(50)) {
            System.out.println("Cargo ship taking off");
        }
    }
}
