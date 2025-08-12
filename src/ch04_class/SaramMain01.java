package ch04_class;

public class SaramMain01 {
    public static void main(String[] args) {

        // 단계 2 : 객체 생성
        // 클래스 이름 객체이름 = new 생성자이름();
        Saram01 yusin = new Saram01();

        Saram01 soon = new Saram01();

        // 단계3 : 객체의 멤버 변수에 쓰기 작업
        // 점(.)을 멤버 참조 연산자라고 부릅니다.
        yusin.nationality = "대한민국";
        yusin.name = "김유신";
        yusin.height = 176;
        yusin.weight = 68.5;
        yusin.hobby = "당구";
        yusin.blood = "AB";

        // 단계4 : 객체의 멤버 변수의 값을 출력
        System.out.println("국적 : " + yusin.nationality);
        System.out.println("이름 : " + yusin.name);
        System.out.println("키 : " + yusin.height);
        System.out.println("취미 : " + yusin.height);
        System.out.println("혈액형 : " + yusin.height);

        soon.nationality = "대한민국";
        soon.name = "유관순";
        soon.height = 168.5;
        soon.weight = 50.0;
        soon.hobby = "축구";
        soon.blood = "B";

        // 단계4 : 객체의 멤버 변수의 값을 출력
        System.out.println("국적 : " + soon.nationality);
        System.out.println("이름 : " + soon.name);
        System.out.println("키 : " + soon.height);
        System.out.println("취미 : " + soon.height);
        System.out.println("혈액형 : " + soon.height);

        String message = yusin.showGenderInfo(1);
        System.out.println(message);

        message = yusin.showBmiInfo();
        System.out.println(message);

        yusin.display();
        soon.display();

    }
}
