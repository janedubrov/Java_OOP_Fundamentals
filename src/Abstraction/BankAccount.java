package Abstraction;

public abstract class BankAccount {
    String owner;
    double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;

    }
    abstract void withdraw(double amount);

    void showBalance() {
        System.out.println("Account holder is : " + owner + ", current balance is: " + balance);
    }

}
