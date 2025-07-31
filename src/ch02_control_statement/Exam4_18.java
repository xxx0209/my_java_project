package ch02_control_statement;

public class Exam4_18 {
    public static void main(String[] args) {
        String message = null;
        int su = 7;

        for (int i = 1; i <= su ; i++) {
            message = i + "의 제곱은 " + (i*i) + "입니다." ;
            System.out.println(message);
        }

        int su01 = 3;
        int su02 = 7;
        int result = 0;
        for (int i = su01; i <= su02 ; i++) {
            result += i;

        }

        System.out.println(result);

    }
}
