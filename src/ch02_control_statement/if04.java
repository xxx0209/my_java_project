package ch02_control_statement;

public class if04 {
    public static void main(String[] args) {
        int score = 75;
        System.out.println("점수 : " + score);
        if (score >= 90) {
            System.out.println("A 학점");
        } else if (score >= 80) {
            System.out.println("B 학점");
        } else if (score >= 70) {
            System.out.println("C 학점");
        } else if (score >= 60) {
            System.out.println("D 학점");
        } else {
            System.out.println("F 학점");
        }

    }
}
