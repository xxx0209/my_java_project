package ch06_abstract_interface.beveragetest;

public class Latte extends Beverage {
    private String milkType; //우유종류

    public Latte(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }

    @Override
    protected void drink() {
        System.out.printf("부드럽고 크리미한 %s를 마십니다.%n", super.name);
    }

    @Override
    protected void make() {
        System.out.printf("%s 제조법%n", super.name);
        System.out.println("컵에 에소쁘레소를 넣어줍니다.");
        System.out.printf("컵에 물을 반만 넣고 그 위에 %s를 넣어줍니다.%n", this.milkType);
    }
}
