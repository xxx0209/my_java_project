package ch01_variable_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 3, b = 5;
        int result = 0;

        result = a >= b ? a-b : b-a;

        System.out.println("절대 값: " + result);

        int x = 10;
        result = x%2 == 0 ? x + 3 : x * x ;
        System.out.println(result);

        x = 8;
        int y = 40;

        result = x >= y ? x : y;

        System.out.println("큰수 : " + result);

        result = x < y ? x : y;

        System.out.println("작은수 : " + result);

        x = 5;
        y = 10;
        System.out.println("-->" + y%x);
        String result2 = y%x == 0 ? "YES":"N0";
        System.out.println(result2);

        int su = 7; // 숫자 7은 홀수입니다.

        result2 = su%2 != 0 ? "숫자 "+su+"은(는) 홀수입니다.":"숫자"+su+"은(는) 짝수 입니다.";
        System.out.println(result2);

        int score = 85; //85점이므로 합격입니다.

        result2 = score >= 60 ? score+"점이므로 합격입니다.":score+"점이므로 불합격입니다.";
        System.out.println(result2);

    }
}
