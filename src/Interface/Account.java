package Interface;

public abstract class Account {

    String owner;
    double balance;

    public Account(String owner,double balance ) {
        this.owner = owner;
        this.balance = balance;
    }

    abstract void processEndOfMonth();

}
