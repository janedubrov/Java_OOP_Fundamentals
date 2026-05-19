package composition.bank;

public class Bank {
    private String name;
    private Branch[] branches;
    private int totalBranches;
    private int index;

    public Bank(String name, int totalBranches) {
        this.name = name;
        this.totalBranches = totalBranches;
    }

    public String getName() {
        return name;
    }

    public int getTotalBranches() {
        return totalBranches;
    }

    public void addBranches(Branch branch) {
        if(this.branches == null) {
            this.branches = new Branch[totalBranches];

        }if(this.index < this.branches.length) {
            this.branches[index] = branch;
            index++;

        }

    }

    public String toString(){
        String bankString = "";
        bankString += "****************\n";
        bankString += "\tBANK\n";
        bankString += "-------------\n";
        bankString += name;
        bankString += "\n-------------\n";

        for(int i = 0; i < index; i++) {
            bankString += this.branches[i].toString();

        }
        bankString += "****************";

        return bankString;
    }

}
