package Interface;

public class CreditAccount extends Account{

    public CreditAccount (String owner,double balance) {
        super(owner, balance);
    }

    @Override
    public void processEndOfMonth() {
        if(balance < 0) {
            this.balance -= 10;
            System.out.println("Fee applied. New balance: " + this.balance);

        }
    }


}
