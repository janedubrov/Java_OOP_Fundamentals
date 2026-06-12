package exceptions;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {

        double weight = 0;
        double height = 0;
        double bmIndex;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            try{
                System.out.print("Please enter your weight(kg) : ");
                weight = Double.parseDouble(scanner.nextLine());
            } catch(NumberFormatException e) {
                System.out.println(e.getMessage());
            }

            try{
                System.out.print("Please enter your height in m (for example, 1.50): ");
                height = Double.parseDouble(scanner.nextLine());
            } catch(NumberFormatException e) {
                System.out.println(e.getMessage());
            }

            try{
                bmIndex = calculateWeight(weight, height);
                System.out.printf("Your BMI is: %.2f" , bmIndex);
                break;
            } catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }

    public static double calculateWeight(double weight, double height) throws IllegalArgumentException {

        if(weight <= 0) {
            throw new IllegalArgumentException("Weight can not be equal or less than 0");
        }

        if(height <= 0 || height > 3) {
            throw new IllegalArgumentException("Height can not be equal or less than 0 and more than 3m");
        }

        double bmIndex = weight / (height * height);
        return bmIndex;
    }
}
