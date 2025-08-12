package ch02_control_statement;

public class While02 {
    public static void main(String[] args) {
        int i = 0;
        int odd = 0;
        int even = 0;

        while(i <= 10) {
            if (i%2 == 0) {
                even += i;
            } else {
                odd += i;
            }
            i++;
        }

        System.out.println(odd);
        System.out.println(even);
    }
}
