package ch02_control_statement;

public class MultiIf02 {
    public static void main(String[] args) {
        int age = 10 ;
        double ticket = 1000.0 ;
        double discount ; // 할인율

        String msg;

        if (age < 8) {
            msg = "유아(무료 입장)";
            discount = 100;
        } else if(age < 14) {
            msg = "어린이(50% 할인)";
            discount = 50;
        } else if(age < 20) {
            msg = "청소년(30% 할인)";
            discount = 30;
        } else if(age >= 65) {
            msg = "노인(40% 할인)";
            discount = 40;
        } else {
            msg = "성인(정가)";
            discount = 0;
        }

        double price = ticket * (1 - discount / 100);

        System.out.println(age + "살 :" + msg);
        System.out.println("가격은 "+ price + "입니다.");
    }

}
