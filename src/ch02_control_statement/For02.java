package ch02_control_statement;

public class For02 {
    public static void main(String[] args) {
        int odd = 0, even = 0;

        for (int i = 1; i < 11; i++) {
            if(i%2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }

        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);

        odd = 0;
        even = 0;

        for (int i = 1; i < 11; i++) {
            int su = i % 2;
            switch (su){
                case 0 : even +=i; break;
                case 1 : odd +=i; break;
            }
        }
        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);
    }
}
