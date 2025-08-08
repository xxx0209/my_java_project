package ch02_control_statement;

public class WhileTest1 {
    public static void main(String[] args) {
        int dan = 3;
        int i = 1;

        while (i < 10) {
            String temp = dan + " * " + i + " = " + (dan * i) ;
            System.out.println(temp);
            i++;
        }


    }
}
