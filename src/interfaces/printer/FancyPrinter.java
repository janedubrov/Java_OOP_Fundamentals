package interfaces.printer;

public interface FancyPrinter extends Printer{

    default void printWithBorder() {
        System.out.println("*********\n");
        print();
        System.out.println("\n*********\n");
    }
}


