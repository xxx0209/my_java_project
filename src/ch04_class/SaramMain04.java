package ch04_class;

import java.io.FileReader;

public class SaramMain04 {
    public static void main(String[] args) {
        Saram04 soo = new Saram04(); //김철수
        soo.display();

        Saram04 hee = new Saram04("박영희", 162.5, 52.5, "퀼트", "AB"); //박영희
        hee.display();

        //김유신에 대하여 생성자를 오버로딩해 보세요.
        //단, 입력하지 않는 취미의 기본값은 볼링이라고 가정합니다.
        Saram04 yusin = new Saram04("김유신", 178, 72.5, "B"); //김유신
        yusin.display();


    }
}
