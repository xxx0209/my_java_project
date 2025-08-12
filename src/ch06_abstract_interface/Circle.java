package ch06_abstract_interface;

public class Circle extends Shape {
    private double radius; //반지름
    private double xpos; //x 좌표
    private double ypos; //y 좌표

    public Circle(String linecolor, String fillcolor, double radius, double xpos, double ypos) {
        super(linecolor, fillcolor);
        this.radius = radius;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    @Override
    public double calcArea() {
        return 3.14 * this.radius * this.radius;
    }

    @Override // 둘레 = 2.0 * 파이 * 반지름
    public double calcPerimeter() {
        return 2.0 * 3.14 * this.radius;
    }

    @Override
    public void display() {
        super.area = this.calcArea();
        super.perimeter = this.calcPerimeter();
        System.out.println("원의 정보");
        System.out.println("면적 : " + super.area);
        System.out.println("둘레 : " + super.perimeter);
        System.out.println("원 중심 : (" + this.xpos + ", " + this.ypos + ")");
    }
}
