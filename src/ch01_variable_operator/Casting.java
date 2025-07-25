package ch01_variable_operator;

import java.sql.SQLOutput;

public class Casting {
    public static void main(String[] args) {
        double d = 100;
        System.out.println("d : "+ d);

        int a = (int)12.5;
        System.out.println("a : "+ a);

        System.out.println(14/5);
        System.out.println((double)14/5);
        System.out.println((double)(14/5));

        int kor = 50, eng = 60, math = 80;
        int total = kor + eng + math;
        double average = (double)total / 3;
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + average);

        char ch1 = 'c';
        char ch2 = 'a';

        boolean bool1 = ch1 > ch2;
        System.out.println(bool1);

        int result = ch1 - ch2 + 3;
        System.out.println(result);

        char ch3 = 'Z'; //(a-z)97 - 122  - (A-Z)65 - 90
        String result2 = ch3 >= 'A' && ch3 <= 'Z' ? "대문자": "소문자";
        System.out.println(result2);



    }
}
