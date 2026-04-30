package This_Keyword;

public class RectangleConstr_Main {
    public static void main(String[] args) {

        RectangleConstr smallRectangle = new RectangleConstr(5,20);
        RectangleConstr largeRectangle = new RectangleConstr();

        double smallRectangleArea = smallRectangle.calculateArea();
        System.out.println("Small rectangle area is: " + smallRectangleArea);
        double smallRectanglePerimeter = smallRectangle.calculatePerimeter();
        System.out.println("Small rectangle perimeter is: " + smallRectanglePerimeter);
        System.out.println("");

        double largeRectangleArea = largeRectangle.calculateArea();
        System.out.println("Large rectangle area is: " + largeRectangleArea);
        double largeRectanglePerimeter = largeRectangle.calculatePerimeter();
        System.out.println("Large rectangle perimeter is " + largeRectanglePerimeter);
    }
}
