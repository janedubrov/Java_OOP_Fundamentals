package Encapsulation;

public class Cons_DigitalWallet {
    public static void main(String[] args) {
        Wallet wallet = new Wallet("Jane" , 100.0, "USD");

        wallet.deposit(50);

        System.out.println(wallet.getBalance());

        wallet.spend(200);
        wallet.spend(80);
        System.out.println(wallet.getOwner() + ", Your balance is: " + wallet.getBalance() + " " + wallet.getCurrency());

    }
}
