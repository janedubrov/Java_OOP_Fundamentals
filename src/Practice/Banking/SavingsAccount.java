package Practice.Banking;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount (String accountNumber,double balance, double interestRate) {
        super(accountNumber,balance);
        this.interestRate = interestRate;

    }

    double getInterestRate() {
        return interestRate;
    }

    public void addInterest() {
        this.balance = balance + balance*interestRate/100;
        System.out.println("Saved good! New balance after getting % is: " + this.balance);
    }

}
