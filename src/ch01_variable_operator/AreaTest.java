package ch01_variable_operator;

public class AreaTest {
    public static void main(String[] args) {
        double radius = 10.0; // 반지름
        double PI = 3.14; // 원주율
        double area = PI * radius * radius ; //면적

        System.out.print("반지름이 " + radius + "일 때 ");
        System.out.println("원의 면적은 " + area + "입니다.");
    }
}
