package interfaces.printer;

public interface Printer {
    String getContent();

    default void print() {
        System.out.println("Printing " + getContent());
    }
}
