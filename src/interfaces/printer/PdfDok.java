package interfaces.printer;

public class PdfDok implements FancyPrinter{

    @Override
    public String getContent() {
        return "Report.pdf";
    }
}
