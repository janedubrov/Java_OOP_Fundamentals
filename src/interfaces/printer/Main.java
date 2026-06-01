package interfaces.printer;

public class Main {
    public static void main(String[] args) {

        TextDok text = new TextDok();
        ImageDok image = new ImageDok();
        PdfDok pdf = new PdfDok();

        text.print();
        image.print();
        pdf.print();

        System.out.println();

        pdf.printWithBorder();

    }
}
