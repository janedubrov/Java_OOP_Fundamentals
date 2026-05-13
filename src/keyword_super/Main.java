package keyword_super;

public class Main {
    public static void main(String[] args) {

        Animal doggie = new Dog("Jessie", 5, "french bulldog");
        doggie.info();
        System.out.println();
        doggie.speak();

        System.out.println("-----");

        Animal guideDog = new GuideDog("Ben", 2, "labrador", "Max");
        guideDog.info();
        System.out.println();
        guideDog.speak();

        System.out.println("-----");

        PoliceDog rex = new PoliceDog("Rex", 6, "Shepherd", 359);
        rex.info();
        System.out.println();
        rex.speak();
        System.out.println();
        rex.showCommands();
        rex.train("Attack");
        rex.showCommands();


    }
}
