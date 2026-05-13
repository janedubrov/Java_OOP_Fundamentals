package encapsulation;

public class Constr_Scooter {
    public static void main(String[] args) {
        Scooter scooter = new Scooter("Ninebot", 10.0);
        scooter.takeRental();
        System.out.println(scooter.getIsRented());
        scooter.returnScooter();


    }
}
