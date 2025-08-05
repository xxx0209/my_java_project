package ch05_package_inheritance.mybeverage;

public class Espresso04 extends Beverage04{
    private int shotCount;

    public Espresso04(String name, double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }
}
