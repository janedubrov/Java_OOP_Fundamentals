package composition.bank;

public class Branch {
    private String branchName;
    private Account[] accounts;
    private int capacity;
    private int index;

    public Branch(String branchName,int capacity)  {
        this.branchName = branchName;
        this.capacity = capacity;
    }

    public String getBranchName() {
        return branchName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addAccount(Account account) {
        if(this.accounts == null) {
            this.accounts = new Account[this.capacity];
        }
        if (this.index < this.accounts.length) {
            this.accounts[index] = account;
            index++;


        }
    }

    public String toString() {
        String branchString = "";
        branchString += "Branch name: ";
        branchString += branchName;
        branchString += "\nCapacity: " + capacity;
        branchString += "";

        for(int i = 0; i < index; i++) {
            branchString += this.accounts[i].toString();

        }

        return branchString;
    }
}
