package inheritance;

public class Inheritance_two {
    public static void main(String[] args) {
        Manager manager = new Manager("Jacob", 150000, 20000);
        Developer dev = new Developer("Jane", 120000, "Java");
        Intern intern = new Intern("Bob", 50000, 500);

        Employee[] allEmployees = {manager,dev,intern };

      for(Employee e : allEmployees){
          e.displayInfo();

      }

    }
}
