package Encapsulation;

public class BankCard {
    private String userName;
    private double balance = 0;
    private int pinCode;

    public BankCard(String userName, int pinCode) {
        this.userName = userName;
        this.pinCode = pinCode;
    }

    String getUserName() {
        return userName;
    }

    double getBalance() {
        return this.balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            this.balance = balance + amount;
            System.out.println("The balance after the deposit is: " + this.balance);
        }
    }

    void withdraw(double amount, int enteredPinCode) {
        if (enteredPinCode == pinCode && amount <= balance) {
            this.balance = balance - amount;
            System.out.println("You withdrew " + amount + ". The balance is: " + this.balance);

        }
        if (enteredPinCode != pinCode) {
            System.out.println("Wrong Pin Code!");

        }
        else if (amount > balance) {

            System.out.println("The balance is too small");

        }
    }

        void changePin (int oldPin,int newPin) {
            if (oldPin == pinCode) {
                this.pinCode = newPin;

            }
            System.out.println("You've changed your pin successfully");


        }

    }

