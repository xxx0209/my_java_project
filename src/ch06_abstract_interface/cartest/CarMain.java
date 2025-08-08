package ch06_abstract_interface.cartest;

public class CarMain {
    public static void main(String[] args) {
        Car[] mycar = {
                new Abante("아반떼", 100, Key.KEY, "가장 많은 판매"),
                new Sonata("소나타", 300, Key.SMART, "Hyundai"),
                new Grandeur("그랜져", 200, Key.SMART, 9.5)
        };

        for (int i = 0; i < mycar.length; i++) {
            System.out.println("=========================================================");
            mycar[i].turnOn();
            Radio.play(Frequency.FM, 91.9);
            mycar[i].sayHello(mycar[i].getName(), 2);

            // "객체를 출력"한다는 것은 암시적으로 toString() 메소드를 호출합니다.
            System.out.println(mycar[i].toString());

            mycar[i].display();

            mycar[i].speedUp(10); // 엑셀 밟기(10 이상 30미만)
            mycar[i].display(); // 계기판 확인

            mycar[i].speedUp(60); // 엑셀 밟기(10 이상 30미만)
            mycar[i].display(); // 계기판 확인

            mycar[i].speedDown(15);
            mycar[i].display(); // 계기판 확인

            mycar[i].turnOff();

        }


    }
}
