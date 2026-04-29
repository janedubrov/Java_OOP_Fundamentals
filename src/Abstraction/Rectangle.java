package Abstraction;

public class Rectangle extends Shape {

    double height;
    double length;

    public Rectangle(double height,double length ) {
        this.height = height;
        this.length = length;
    }
    @Override
    double area() {
        return height * length;

    }
}
