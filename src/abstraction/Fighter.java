package abstraction;

public class Fighter extends SpaceShip{

        public Fighter (int fuel){
        super(fuel);
    }

    @Override
    public void launch() {
        if (canFly(20)) {
            System.out.println("Fighter is launching");
        }
    }


}
