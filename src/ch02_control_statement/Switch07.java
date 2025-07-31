package ch02_control_statement;

public class Switch07 {
    public static void main(String[] args) {
        int su = 3;

        switch (su){
            case 1 : case 3 : case 5 :
                System.out.println("홀수");
                break ;
            case 2 : case 4 : case 6 :
                System.out.println("짝수");
                break ;
            default :
                System.out.println("주사위 눈금이 올바르지 않습니다.");
        }

        switch (su){
            case 1, 3, 5 :
                System.out.println("홀수");
                break ;
            case 2, 4, 6 :
                System.out.println("짝수");
                break ;
            default :
                System.out.println("주사위 눈금이 올바르지 않습니다.");
        }

    }
}
