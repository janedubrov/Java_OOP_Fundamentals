package Inheritance.Banking;

public class CheckingAccount extends BankAccount {
    private static final double FEE = 1.5;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount + FEE) {
            this.balance = balance - (amount + FEE);
            System.out.println("Withdraw successful. Remaining balance: " + this.balance);
        } else {
            System.out.println("Unsufficient funds");
        }


    }
}
