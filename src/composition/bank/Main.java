package composition.bank;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("JP Morgan", 2);

        Branch branchSouth = new Branch("JP Morgan South", 100);
        Branch branchNorth = new Branch("JP Morgan North", 50);

        Account acc001 = new Account(001, "Hanna Burg", 125.01);
        Account acc002 = new Account(002, "Bob Melon", 1000);

        branchSouth.addAccount(acc001);
        branchNorth.addAccount(acc002);

        bank.addBranches(branchSouth);
        bank.addBranches(branchNorth);

        System.out.println(bank);

    }
}
