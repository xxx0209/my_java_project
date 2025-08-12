package ch04_class;

public class ShapeAreaMain {
    public static void main(String[] args) {

        ShapeArea sa = new ShapeArea();
        //원의 면적
        double circle = sa.area(10);
        System.out.println(circle);
        //사각형
        double rectangle = sa.area(5, 10);
        System.out.println(rectangle);
        //사다리꼴
        double trapezoid = sa.area(5, 15, 10);
        System.out.println(trapezoid);
    }
}
