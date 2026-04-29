package Encapsulation;

public class Wallet {
    private String owner;
    private double balance;
    private String currency;

    public Wallet(String owner, double balance, String currency){
        this.owner = owner;
        this.balance = balance;
        this.currency = currency;
    }

    String getOwner(){
        return this.owner;
    }
    String getCurrency(){
        return this.currency;
    }
    double getBalance() {
        return this.balance;
    }

    void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
        } else {
            System.out.println("Error, you can't make a deposit 0 or less");
        }
    }

    void spend (double amount){
        if(amount <= balance){
            balance = balance - amount;
            System.out.println("You paid: " + amount);

        }else {
            System.out.println("Not enough money, your balance is: " + balance);
        }


    }





}
