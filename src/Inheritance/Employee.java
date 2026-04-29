package Inheritance;

public class Employee {
    protected String name;
    protected double salary;

    Employee(String name,double salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }
    void displayInfo() {
        System.out.println("Encapsulation.Employee: " + name + "," + "salary: " + calculateSalary());
    }

}
