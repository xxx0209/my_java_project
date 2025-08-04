package ch05_package_inheritance.mybeverage;

public class Beverage04 {
    private String name;
    private double price;

    public Beverage04() {}

    public Beverage04(String name, double price) {
        this.name = name;
        this.price = price;
    }

    protected void showInfo(){
        System.out.printf("음료 이름 : %s%n", this.name);
        System.out.printf("단가 : %.1f%n", this.price);
    };
}
