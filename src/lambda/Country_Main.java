package lambda;

import java.util.Arrays;

public class Country_Main {
    public static void main(String[] args) {

        System.out.println("All countries:");

        Arrays.stream(Country.values()).forEach(country -> System.out.println(country));

        System.out.println("*******");
        System.out.println("Population more than 100:");

        Arrays.stream(Country.values()).filter(country -> country.getPopulation() > 100).forEach(country -> System.out.println(country));

        System.out.println("*******");
        System.out.println("European countries:");

        Arrays.stream(Country.values()).filter(country -> country.getContinent().equals("Europe")).forEach(country -> System.out.println(country));
    }
}
