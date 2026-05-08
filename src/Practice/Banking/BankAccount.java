package Practice.Banking;

public class BankAccount {
    private String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber,double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    public void deposit (double amount) {
        if (amount > 0) {
            this.balance = balance + amount;
            System.out.println("Balance after deposit is: " + this.balance);
        } else {
            System.out.println("Error, amount can't be less than 0");
        }
    }

    public void withdraw (double amount) {
        if(balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdraw successful. Remaining balance" + this.balance);
        } else {
            System.out.println("Insufficient funds");
        }

    }
}
