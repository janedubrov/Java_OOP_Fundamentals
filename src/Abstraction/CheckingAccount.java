package Abstraction;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(String owner, double balance) {
        super(owner,balance );

    }

    @Override
    void withdraw(double amount) {
        this.balance = balance - amount - 1.5;
        System.out.println("Withdrew " + amount + "1.5 fee. New balance is " + this.balance);
    }

}
