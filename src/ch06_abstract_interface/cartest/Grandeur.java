package ch06_abstract_interface.cartest;

public class Grandeur extends Car{

    private double fuel; //연비
    private String remark; //연비에 대한 메모

    public Grandeur(String name, int price, Key key, double fuel) {
        super(name, price, key);
        this.fuel = fuel;

        if (fuel > 20) {
            remark = "연비가 무지 좋습니다.";
        } else if (fuel > 15){
            remark = "연비가 보통 입니다.";
        } else {
            remark = "연비가 무지 나쁩니다.";
        }
    }

    @Override
    public void speedUp(int speed) {
        this.speed += speed;
        this.speed = this.checkSpeed();
    }

    @Override
    public void speedDown(int speed) {
        super.speed -= speed < 0 ? -speed : speed;
    }

    @Override
    public void display() {
        double mileSpeed = super.speed / 1.6;
        System.out.println(super.getName() + "의 현재 속도 :" + mileSpeed + "mile 입니다.");
    }

    @Override
    public String toString() {

        String message = "연비 : " + fuel + "\n리마크 :" + remark;
        return super.toString() + message;
    }
}
