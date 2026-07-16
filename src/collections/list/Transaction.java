package collections.list;

public class Transaction {
    private int id;
    private TransactionType type;
    private double amount;
    private String description;
    private boolean isFlagged;

    public Transaction(int id, TransactionType type,double amount, String description, boolean isFlagged ) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.isFlagged = isFlagged;
    }

    public String toString() {
        return "[Transaction ID:" + id + ". Description - " + description + ". Amount EUR " + amount + ". Type - " + type + ". Is flagged - " + isFlagged + "]";
    }

    public int getId() {
        return id;
    }
    public TransactionType getType() {
        return type;
    }
    public double getAmount() {
        return amount;
    }
    public String getDescription() {
        return description;
    }
    public boolean isFlagged() {
        return isFlagged;
    }
}
