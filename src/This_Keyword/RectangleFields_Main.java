package This_Keyword;

public class RectangleFields_Main {
    public static void main(String[] args) {

        RectangleFields rectangle = new RectangleFields();

        double rectangleArea= rectangle.calculateArea();
        System.out.println("The area of a rectangle is " + rectangleArea);

        double rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println("The perimeter of the rectangle is " + rectanglePerimeter);
    }
}
