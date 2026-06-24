package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Firma {
    public static void main(String[] args) {

        List<Mitarbeiter> mitarbeiter = Arrays.asList(
                new Mitarbeiter("Hanna", "IT", 4500),
                new Mitarbeiter("Ben", "Verkauf", 2000),
                new Mitarbeiter("Hose", "Management", 7500),
                new Mitarbeiter("Jane", "IT", 4000),
                new Mitarbeiter("Jacob", "Verkauf", 4000),
                new Mitarbeiter("Lisa", "Management", 9000),
                new Mitarbeiter("Mary", "IT", 4300),
                new Mitarbeiter("Bob", "Management", 4540) );

        System.out.println(" *** List von allen Mitarbeitern: ***");
        mitarbeiter.forEach(System.out::println);
        System.out.println("-------");
        System.out.println("*** IT Mitarbeiter: ***");
        mitarbeiter.stream().filter(m -> m.getAbteilung().equals("IT")).forEach(System.out::println);
        System.out.println("-------");
        System.out.println("*** List von Mitarbeitern mit gehalt mehr als 4000 Euro: ***");
        mitarbeiter.stream().filter(m -> m.getGehalt() > 4000).map(Mitarbeiter::getName).forEach(System.out::println);
        System.out.println("-------");
        System.out.println("*** Gehalt absteigend sortiert: ***");
        mitarbeiter.stream().sorted(Comparator.comparingDouble(Mitarbeiter:: getGehalt).reversed()).forEach(System.out::println);
    }
}
