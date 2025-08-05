package ch05_package_inheritance.mybeverage;

public class Latte04 extends Beverage04{
    private String milkType;

    public Latte04(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }


    public void enjoyLatte() {
        String message = "%s를 훌짝 훌짝 마십니다.%n";
        System.out.printf(message, super.getName());
    }
}
