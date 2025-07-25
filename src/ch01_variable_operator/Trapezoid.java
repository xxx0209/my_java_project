package ch01_variable_operator;

public class Trapezoid {
    public static void main(String[] args) {
        double bottom = 20.0;
        double top = 10.0;
        double height = 15.0;
        double area = (bottom + top) * height / 2;

        String result = "밑변 : " + bottom;

        result = result + "\n윗변 : " + top ;
        result = result + "\n높이 : " + height;
        result = result + "\n면적 : " + area ;
        System.out.println(result);
    }
}
