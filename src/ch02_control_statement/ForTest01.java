package ch02_control_statement;

public class ForTest01 {
    public static void main(String[] args) {

        int dan = 3;
        int mul = 0;
        for (int i = 1; i < 10; i++) {
            mul = dan * i;
            System.out.println(dan +" * "+i+" = "+ mul);
        }
    }
}
