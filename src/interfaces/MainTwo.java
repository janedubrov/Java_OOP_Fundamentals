package interfaces;

public class MainTwo {
    public static void main(String[] args) {

        Account[] accounts = new Account[2];
        accounts[0] = new DebitAccount("Anna" , 350);
        accounts[1] = new CreditAccount("Bob", -5);

        for(Account i : accounts) {
            i.processEndOfMonth();

            if(i instanceof Freezable) {
                ((Freezable) i).freeze();
            }


        }




    }
}
