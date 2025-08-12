package ch06_abstract_interface;

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shape = {
                new Triangle("yellow", "black", 15.0, 10.0),
                new Rectangle("red", "green", 20.0, 10.0),
                new Circle("pink", "blue", 5.0, 3.0, 4.0)
        };

        for (int i = 0; i < shape.length; i++) {
            shape[i].display();
            shape[i].draw();
            System.out.println();
        }

        //추상 클래스는 불완전 클래스이므로 객체 생성이 불가능합니다.
        //즉 new 키워드 오른쪽에 올수 없습니다.
        //Shape myshape = new Shape();

        //Anonymous Inner Type은 불완전 메소드를 구체화 시키는 조건으로 객체 생성을 허락해 주는방식입니다.
        Shape myshape = new Shape() {
            @Override
            public double calcArea() {
                return 0;
            }

            @Override
            public double calcPerimeter() {
                return 0;
            }

            @Override
            public void display() {
                System.out.println("호호");
            }
        };

        for (int i = 0; i < 3; i++) {
            myshape.display();
        }

        // 추상 클래스는 참조 변수로는 사용가능합니다.
        // 추상 클래스 개체 = new 구현체클래스()
        Shape sample02 = new Rectangle("red", "green", 20.0, 10.0);
        sample02.display();
        sample02.draw();

        System.out.println("========================================");
    }
}
