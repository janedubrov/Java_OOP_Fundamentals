package exceptions;

import java.util.Scanner;

public class Throw_Discount {

    public static void main(String[] args) {

        double price = 0;
        int discount = 0;
        double finalPrice;

        Scanner scanner = new Scanner(System.in);
        while(true) {
            try{
                System.out.print("Enter price: ");
                price = Double.parseDouble(scanner.nextLine());
            } catch(NumberFormatException e){
                System.out.println(e.getMessage());
            }

            try{
                System.out.print("Whats your discount(%) ?: ");
                discount = Integer.parseInt(scanner.nextLine());
            } catch(NumberFormatException e) {
                System.out.println(e.getMessage());
            }

            try{
                finalPrice = calculateDiscount(price, discount);
                System.out.println("Your final price after discount is: " + finalPrice + " Euro");
                break;
            } catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }

    public static double calculateDiscount(double price, int discount) throws IllegalArgumentException{
        if(price <= 0) {
            throw new IllegalArgumentException("Price can not be less than 0 Euro");
        }

        if(discount <= 0 || discount >= 100) {
            throw new IllegalArgumentException("Discount can not be less than 0% or more than 100%");
        }

        double preisWithDiscount = price - (price * discount / 100);
        return preisWithDiscount;
    }
}

