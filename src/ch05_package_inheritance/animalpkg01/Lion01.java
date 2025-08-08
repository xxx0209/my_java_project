package ch05_package_inheritance.animalpkg01;

public class Lion01 extends Animal01{
    private int leg;

    public Lion01(String name, int lifespan, String habitat, int speed, int leg) {
        super(name, lifespan, habitat, speed);
        this.leg = leg;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        String message =  String.format("%s 의 다리의 개수는 %d개 입니다.", super.getName(), leg);
        System.out.println(message);
    }

    public void run() {
        String message =  String.format("%s 이(가) %d의 속도로 달려 나갑니다.%n", super.getName(), super.getSpeed());
        System.out.println(message);
    }
}
