package enums;

public class Coffee_Main {
    public static void main(String[] args) {

        for(Coffee drink : Coffee.values()) {
            System.out.println(drink + ", price: " + drink.getPriceInCents() + " cents");
        }

        System.out.println("-----");

        for(Coffee drink : Coffee.values()) {
            if(drink.isMilkAdded())  {
                System.out.println(drink + " - milk is added");
            } else{
                System.out.println(drink + " - no milk added");
            }
        }
    }
}
