package ch06_abstract_interface.beveragetest;

public class Espresso extends Beverage{
    private int shot; //샷

    public Espresso(String name, double price, int shot) {
        super(name, price);
        this.shot = shot;
    }

    @Override
    protected void drink() {
        System.out.printf("맛이 찐하고 강렬한 %s를 마십니다.%n", super.name);
    }

    @Override
    protected void make() {
        System.out.printf("%s 제조법%n", super.name);
        System.out.printf("에소쁘레소 %d샷을 추출합니다.%n", this.shot);
        System.out.println("컵에 에소프레소를 넣고 뜨거운 물을 부어줍니다.");

    }
}
