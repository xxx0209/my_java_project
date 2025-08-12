package ch05_package_inheritance.mybeverage;

public class Espresso04 extends Beverage04{
    private int shotCount;

    public Espresso04(String name, double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }
    public void drinkEspresso() {
        String message = "맛이 진하고 강렬한 %s을(를) 마십니다.%n";
        System.out.printf(message, super.getName());
    }

    @Override
    public String toString() {
        String message = super.toString() + "샷 추가 : " + this.shotCount + "\n";
        return message;
    }
}
