package enums;

public class Planet_Main {
    public static void main(String[] args) {

        System.out.println("All planets:");

        for(Planet planet : Planet.values()) {
            System.out.println(planet + " - " + planet.getDistance() );
        }

        System.out.println("*****");
        System.out.println("Planets fürther than 100:");

        for(Planet planet : Planet.values()) {
            if(planet.getDistance() >= 100) {
                System.out.println(planet + " " + planet.getDistance());
            }
        }

    }
}
