package ch05_package_inheritance.general;

public class Espresso03 extends Beverage03{
    private int shotsCnt; // 샷개수

    public Espresso03(String name, double price, int shotsCnt) {
        super(name, price);
        this.shotsCnt = shotsCnt;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("샷 추가 개수 : " + this.shotsCnt);
    }
}
