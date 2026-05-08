package Inheritance.Banking;

public class Main {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("147258369", 5500, 10);
        savings.addInterest();

        CheckingAccount checking = new CheckingAccount("963852741" , 8811);
        checking.withdraw(550);
        checking.deposit(900);


    }
}
