package ch01_variable_operator;

public class Increment01 {
    public static void main(String[] args) {
        int x = 5;

        x += 3;
        System.out.println("x : " + x);

        x *= 4;
        System.out.println("x : " + x);

        x %= 5;
        System.out.println("x : " + x);

        x -= 1;
        System.out.println("x : " + x);

        x += 7;
        System.out.println("x : " + x);
    }
}
