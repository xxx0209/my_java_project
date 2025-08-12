package ch04_class;

public class ShapeArea {

    static final double PI = 3.14;

    double area(double radius) {
        return radius * radius * PI;
    }

    double area(double width, double height) {
        return width * height;
    }

    double area(double top, double bottom, double width) {
        return (top + bottom) * width / 2.0;
    }
}
