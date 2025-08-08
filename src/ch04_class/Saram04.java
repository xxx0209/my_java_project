package ch04_class;

import java.io.InputStream;
import java.util.Scanner;

public class Saram04 {
    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    Scanner scan = null; // 이런 변수가 있다라고 선언

    //public 반환타입 이름(매개변수){...}
    public Saram04() {
//        InputStream
//        scan = new Scanner(System.in); //해당 장치를 생성자에서 초기화 시킴
    }

    public Saram04(String name, double height, double weight, String hobby, String blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.blood = blood;
    }

    public Saram04(String name, double height, double weight, String blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = "볼링";
        this.blood = blood;
    }

    public void display() {
//        System.out.print("이름 : ");
//        this.name = this.scan.next();
//        System.out.print("키 : ");
//        this.height = this.scan.nextDouble();
//        System.out.print("몸무게 : ");
//        this.weight = this.scan.nextDouble();
//        System.out.print("취미 : ");
//        this.hobby = this.scan.next();
//        System.out.print("혈액형 : ");
//        this.blood = this.scan.next();
//        System.out.print("정수 입력 : ");
//        int su = this.scan.nextInt();
//        System.out.println("입력된 정수 :" + su);
        System.out.println();
        System.out.println("이름 : " + this.name);
        System.out.println("키 : " + this.height);
        System.out.println("몸무게 : " + this.weight);
        System.out.println("취미 : " + this.hobby);
        System.out.println("혈액형 : " + this.blood);

    }

}
