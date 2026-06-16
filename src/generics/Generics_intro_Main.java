package generics;

public class Generics_intro_Main {
    public static void main(String[] args) {

        Pair<String> names = new Pair<>("Anna", "Ben");
        System.out.println("First name: " + names.getFirstItem());
        System.out.println("Second name: " + names.getSecondItem());

        System.out.println();

        names.setFirstItem("Clara");
        System.out.println("New First Name: " + names.getFirstItem());

        System.out.println();

        Pair<Integer> coords = new Pair<>(10,20);
        System.out.println("Coord 1: " + coords.getFirstItem());
        System.out.println("Coord 2: " + coords.getSecondItem());

    }
}
