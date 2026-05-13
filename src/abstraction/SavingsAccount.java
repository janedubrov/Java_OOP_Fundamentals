package abstraction;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String owner, double balance) {
        super(owner,balance );
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= 100) {
            this.balance = balance - amount;
            System.out.println("Withdrew " + amount + ". Remaining balance " + this.balance);

        } else {
            System.out.println("Cannot withdraw. Savings acoount must keep at least 100");
        }

    }


}
