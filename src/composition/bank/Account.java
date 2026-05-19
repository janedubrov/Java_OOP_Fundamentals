package composition.bank;

public class Account {
    private int id;
    private String ownerName;
    private double balance;

    public Account(int id, String ownerName,double balance) {
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        String accountString = " ";
        accountString += "\n----------\n";
        accountString += "Account\n";
        accountString += "----------";
        accountString += "\nOwner: " + ownerName;
        accountString += "\nID: " + id;
        accountString += "\nBalance: " + balance;
        accountString += "\n----------------\n";

        return accountString;
    }

}
