package ch02_control_statement;

public class if03 {
    public static void main(String[] args) {

        int su = 3;

        if (su%3 == 0) {
            System.out.println(su + "는(은) 3의 배수 입니다.");
            System.out.println(su * su);
        }else{
            System.out.println(su + "는(은) 3의 배수가 아닙니다.");
            System.out.println(su + 5);
        }
    }

}
