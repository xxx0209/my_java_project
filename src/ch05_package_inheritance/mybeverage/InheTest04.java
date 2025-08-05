package ch05_package_inheritance.mybeverage;

public class InheTest04 {
    public static void main(String[] args) {
        //클래스이름 객체이름 = new 생성자이름();

        // 승급 : 서브 클래스가 일시적으로 슈퍼 클래스의 타입으로 변환이 되는 과정
        Beverage04 beverage01 = new Americano04("아메리카노", 5000, 300);

        //슈퍼 클래스 내에 있는 메소드는 상속 개념에 의하여접근이 가능합니다.
        beverage01.showInfo();

        // 승급시 서브 클래스내의 변수와 메소드는 일시적으로 접근을 하지 못하도록 설계되어 있습니다.
        // 단, 강등을 하게 되면 서브 클래스 내의 변수와 메소드를 접근할 수 있습니다.
        Americano04 americano = (Americano04)beverage01; //강등
        americano.sipAmericano();


        Beverage04 beverage02 = new Espresso04("에스프레소", 3000, 2);
        beverage02.showInfo();

        Espresso04 espresso = (Espresso04)beverage02;
        espresso.drinkEspresso();

        Beverage04 beverage03 = new Latte04("라떼", 6000.0, "아몬드 우유");
        beverage03.showInfo();

        Latte04 latte = (Latte04)beverage03;
        latte.enjoyLatte();

        // 승급 개념과 배열을 같이 사용하기
        // 배열 초기화 기법 : 타입[] 배열이름 = {요소1, 요소2, ...}

        Beverage04[] beverage = {
                beverage01,
                new Espresso04("에스프레소", 3000, 2),
                new Latte04("라떼", 6000.0, "아몬드 우유")
        };


    }
}
