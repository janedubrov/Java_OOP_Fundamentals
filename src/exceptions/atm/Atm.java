package exceptions.atm;

public class Atm {
    public static void main(String[] args) {

        int balance = 1000;
        int[] amounts = {150, 250, 1500, 1000};

        for(int a : amounts) {
            try{
                withdraw(balance, a);

            } catch(InsufficientFundsException e ) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void withdraw(int balance, int amount) throws InsufficientFundsException{
        if(amount > balance) {
            throw new InsufficientFundsException("You can't withdraw "  + amount + " Euro - ! Insufficient funds.");
        } else {
            int newBalance = balance - amount;
            System.out.println("You withdrew " + amount + " Your new balance is: " + newBalance + " Euro");
        }
    }
}
