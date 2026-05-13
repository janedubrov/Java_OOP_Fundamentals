package inheritance;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name,double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return salary + bonus;
    }
}
