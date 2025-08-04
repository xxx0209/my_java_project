package ch05_package_inheritance.general;

public class Beverage03 {
    private String name; //음료 이름
    private double price; //단가

    //접근지정자 반환타입 생성자 이름(매개변수){...}
    public Beverage03(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    protected void showInfo() {
        System.out.println("음료 이름 : " + this.name);
        System.out.println("단가 : " + this.price);
    }
}
