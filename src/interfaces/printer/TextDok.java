package interfaces.printer;

public class TextDok implements Printer{

    @Override
    public String getContent() {
        return "Hello, world!";
    }
}
