package Encapsulation;

public class Constr_BankCard {
    public static void main(String[] args) {

        BankCard card = new BankCard("Jane123", 9999);

        card.deposit(1000);
        card.withdraw(500, 2241);

    }
}
