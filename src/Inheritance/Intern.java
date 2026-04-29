package Inheritance;

public class Intern extends Employee{

    private double discount;

    public Intern(String name,double salary, double discount){
        super(name, salary);
        this.discount = discount;
    }

    @Override
    double calculateSalary() {
        return this.salary = salary - 500;

    }
}
