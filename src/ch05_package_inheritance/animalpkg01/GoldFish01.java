package ch05_package_inheritance.animalpkg01;

public class GoldFish01 extends Animal01 {

    private int gill;

    public GoldFish01(String name, int lifespan, String habitat, int speed, int gill) {
        super(name, lifespan, habitat, speed);
        this.gill = gill;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        String message =  String.format("%s 의 아가미 개수는 %d개 입니다.", super.getName(), gill);
        System.out.println(message);
    }

    public void swim(){
        String message =  String.format("%s 이(가) %d의 속도로 헤엄칩니다.%n", super.getName(), super.getSpeed());
        System.out.println(message);
    }
}
