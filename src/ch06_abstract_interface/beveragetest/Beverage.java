package ch06_abstract_interface.beveragetest;

public abstract class Beverage {
    protected String name;
    protected double price;

    public Beverage() {

    }

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }

    protected final void showData(){
        System.out.printf("음료 %s의 단가는 %6.1f 입니다.%n", name, price);
    }

    protected abstract void drink();
    protected abstract void make();

}
