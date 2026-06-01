package interfaces.printer;

public class ImageDok implements Printer {

    @Override
    public String getContent() {
        return "Photo.jpg";
    }

    @Override
    public void print() {
        System.out.println("Showing image: " + getContent());
    }
}
