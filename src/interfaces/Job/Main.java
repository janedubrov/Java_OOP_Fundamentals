package interfaces.Job;

public class Main {
    public static void main(String[] args) {

        Employee dev = new Developer();
        Employee manager = new Manager();
        Employee intern = new Intern();

        dev.introduce();
        manager.introduce();
        intern.introduce();
        System.out.println("");

        dev.introduceFormally();
        System.out.println("");
        manager.introduceFormally();
        System.out.println("");
        intern.introduceFormally();



    }
}
