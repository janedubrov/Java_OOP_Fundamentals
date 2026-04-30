package This_Keyword;

public class RectangleFields {
    private double length;
    private double width;

    public RectangleFields () {
        length = 10;
        width = 15;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return length * 2 + width * 2;

    }
}
