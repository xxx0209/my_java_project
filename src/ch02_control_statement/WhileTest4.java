package ch02_control_statement;

import java.util.Scanner;

public class WhileTest4 {

    public static void main(String[] args) {
        int total = 0; //총점
        int count = 0; //시험 본 횟수
        double average = 0.0; //평점평균

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("점수 입력 : ");
            int grade = scan.nextInt();

            if (grade < -10) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (grade < 0) {
                grade = grade * -1;
            }
            total += grade;
            count++;
        }

        scan.close();

        average = (double)total/count;
        System.out.println("총 시험 빈도(회수) : "+ count);
        System.out.println("총점 : "+ total);
        System.out.printf("평균 :%.2f ", average);
        System.out.println();

    }
}
