package ch06_abstract_interface.beveragetest;

public class Americano extends Beverage {
    private double ml; //물의 양

    public Americano(String name, double price, double ml) {
        super(name, price);
        this.ml = ml;
    }

    @Override
    protected void drink() {
        System.out.printf("%s를(을) 홀짝 홀짝 마십니다.%n", super.name);
    }

    @Override
    protected void make() {
        System.out.println("아메리카노 제조법");
        System.out.println("원두를 미세하게 갈아서, 탬퍼로 평평하게 눌러줍니다.");
        System.out.printf("포터필터를 머신에 장착하고, 25-30초 동안 %5.1fml의 에스프레소를 추출합니다.%n", this.ml);
    }
}
