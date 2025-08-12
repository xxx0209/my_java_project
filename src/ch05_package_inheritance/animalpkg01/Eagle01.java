package ch05_package_inheritance.animalpkg01;

public class Eagle01 extends Animal01{
    private int wing;

    public Eagle01(String name, int lifespan, String habitat, int speed, int wing) {
        super(name, lifespan, habitat, speed);
        this.wing = wing;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        String message =  String.format("%s 의 날개의 개수는 %d개 입니다.", super.getName(), wing);
        System.out.println(message);
    }

    public void fly() {
        String message =  String.format("%s 이(가) %d의 속도로 날아 다닙니다.%n", super.getName(), super.getSpeed());
        System.out.println(message);
    }
}
