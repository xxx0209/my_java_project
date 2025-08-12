package ch06_abstract_interface;

public abstract class Shape {
    // 일반화 : 모든 도형에서 사용하는 면적, 둘레, 라인 색상, 채우기 색상등은 수퍼 클래스에서 사용합니다.
    protected double area; //면적
    protected double perimeter; //도형의 둘레

    private String linecolor; //선 색상
    private String fillcolor; //채우기 색상

    public Shape() {
    }

    public Shape(String linecolor, String fillcolor) {
        this.linecolor = linecolor;
        this.fillcolor = fillcolor;
    }

    protected final void draw() {
        System.out.println("라인 색상 : " + this.linecolor);
        System.out.println("라인 색상 : " + this.fillcolor);
    }

    //내용이 정의되지 않는 모델 개념으로, 불안전환 메소드입니다.
    public abstract double calcArea();
    public abstract double calcPerimeter();
    public abstract void display();

}
