package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.max;

public class TransactionHistory {

    List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void printAllTransactions() {
        transactions.forEach(System.out::println);
    }

    public void sortByAmount() {
        transactions.sort(Comparator.comparing(a -> a.getAmount()));
    }

    public Transaction getLatestTransaction() {
        if(transactions.isEmpty()) {
            System.out.println("The list is empty");
            return null;
        } else {
            Transaction latestTransaction = transactions.get(transactions.size() - 1);
            System.out.println( "The latest transaction: " + latestTransaction) ;
            return latestTransaction;
        }
    }

    public int getTransactionCount() {
        int size = transactions.size();
        System.out.println("Total transactions: " + size);
        return size;
    }

    public boolean isTransactionRecorded(Transaction t) {
        boolean found = transactions.contains(t);
        if(found) {
            System.out.println("Transaction was found - " + t);
        } else {
            System.out.println("Transaction was not found");
        }
        return found;
    }

    public int getTransactionPosition(Transaction t) {
        int index = transactions.indexOf(t);
        System.out.println("Index of the transaction is: " + index);
        return index;
    }

    public Transaction getLargestTransaction(){
        Transaction largest = Collections.max(transactions, Comparator.comparing(a -> a.getAmount()));
        System.out.println("Largest transaction is: " + largest);
        return largest;
    }

    public List<Transaction> getFirstThreeTransactions() {
        int limit = Math.min(3, transactions.size());
        return transactions.subList(0, limit);
    }


    public static void main(String[] args) {

        TransactionHistory transactionHistory = new TransactionHistory();

        Transaction t1 = new Transaction(1, TransactionType.WITHDRAWAL, 500, "withdrawal", true);
        Transaction t2 = new Transaction(2, TransactionType.DEPOSIT, 200, "deposit", false);
        Transaction t3 = new Transaction(3, TransactionType.TRANSFER, 1000, "transfer to a friend", true);
        Transaction t4 = new Transaction(4, TransactionType.WITHDRAWAL, 350, "withdrawal", true);

        transactionHistory.addTransaction(t1);
        transactionHistory.addTransaction(t2);
        transactionHistory.addTransaction(t3);
        transactionHistory.addTransaction(t4);

        transactionHistory.printAllTransactions();
        System.out.println("**********");

        transactionHistory.sortByAmount();
        transactionHistory.printAllTransactions();
        System.out.println("**********");

        transactionHistory.getLatestTransaction();
        transactionHistory.printAllTransactions();
        System.out.println("**********");

        transactionHistory.getTransactionCount();
        System.out.println("**********");
        transactionHistory.isTransactionRecorded(t2);

        System.out.println("**********");
        transactionHistory.getTransactionPosition(t3);
        transactionHistory.getTransactionPosition(t1);
        System.out.println("**********");

        transactionHistory.getLargestTransaction();
        System.out.println("**********");

        List <Transaction> firstThree =  transactionHistory.getFirstThreeTransactions();
        firstThree.forEach(System.out::println);

    }
}
