package Inheritance;

public class Developer extends Employee {
    private String programmingLang;

    public Developer(String name,double salary, String programmingLang) {
        super(name, salary);
        this.programmingLang = programmingLang;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Language " + programmingLang);
    }
}
