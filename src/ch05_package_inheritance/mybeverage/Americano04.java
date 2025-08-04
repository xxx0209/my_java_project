package ch05_package_inheritance.mybeverage;

public class Americano04 extends Beverage04{
    private double waterAmount;

    public Americano04(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }

    public void sipAmericano(){
        String message = "%n아메리카노를 훌짝 훌짝 마십니다.%n";
        System.out.printf(message);
    }


}
