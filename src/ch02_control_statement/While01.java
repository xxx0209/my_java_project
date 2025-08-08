package ch02_control_statement;

public class While01 {
    public static void main(String[] args) {
        int total = 0 ;
        int i = 1 ;
        while(i < 11){
            total += i ;
            i++ ;
            //System.out.println("합 : " + total);
        }

        System.out.println("총합01 : " + total);

        total = 0;
        i = 1;
        while (i <= 100) {
            total += i;
            i = i+ 3;
        }

        System.out.println("총합02: "+ total);

        total = 0;
        i = 97;
        while (i >= 2) {
            total += i;
            i = i - 5;
        }

        System.out.println("총합03: "+ total);

        total = 0;
        i = 1;
        while (i <= 96) {
            total += i * i;
            i = i + 5;
        }

        System.out.println("총합04: "+ total);

        total = 0;
        i = 1;
        while (i <= 5) {
            total += i * (i + 1);
            i++;
        }

        System.out.println("총합05: "+ total);
    }
}
