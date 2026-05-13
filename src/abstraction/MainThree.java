package abstraction;

public class MainThree {
    public static void main(String[] args) {

        BankAccount[] bank = new BankAccount[2];
        bank[0] = new SavingsAccount("Ivan", 150);
        bank[1] = new CheckingAccount("Anna", 50);

        for (BankAccount i : bank) {
            i.showBalance();
            i.withdraw(60);


    }



    }
}
