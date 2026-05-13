package interfaces;

public class DebitAccount extends Account implements Freezable{

    public DebitAccount(String owner,double balance) {
        super(owner, balance);
    }

    @Override
    void processEndOfMonth(){
        System.out.println("Monthly statement sent to: " + owner);
    }

    public void freeze() {
        System.out.println("Warning. Your account was frozen!");
    }

}
