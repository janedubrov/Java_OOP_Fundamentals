package exceptions;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        try {

            int zahl1 = 0;
            int zahl2 = 0;
            double result;

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Geben Sie erste Zahl ein: ");
                try {
                    zahl1 = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Nur ganze Zahl ist gültig!");
                }

            }

            while (true) {
                System.out.print("Geben Sie zweite Zahl ein: ");
                try {
                    zahl2 = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Nur ganze Zahl ist gültig!");
                }
            }

            if (zahl2 == 0) {
                System.out.println("Division durch null ist nicht erlaubt!");
            } else {
                result = (double) zahl1 / zahl2;
                System.out.printf("Das Ergebnis: %.2f", result);
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println("Unbekannter Fehler!");
        }

    }
}
