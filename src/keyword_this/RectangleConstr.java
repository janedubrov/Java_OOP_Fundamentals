package keyword_this;

public class RectangleConstr {
    private double length;
    private double width;

    public RectangleConstr() {
        this(10, 20);
    }
    public RectangleConstr (double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        double area = length * width;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = length * 2 + width * 2;
        return perimeter;
    }
}
