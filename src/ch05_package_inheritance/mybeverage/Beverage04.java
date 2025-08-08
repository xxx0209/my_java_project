package ch05_package_inheritance.mybeverage;

public class Beverage04{
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

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // 메소드 은닉화 : 오버라이딩시 본의 아니게, 수퍼 클래스의 메소드가 숨겨 지는 현상을 일컫는 말입니다.
    //@으로 시작하는 항목들을 어노테이션(Annotation)이라고 부릅니다.
    @Override //이 메소드는 오버라이딩 되었습니다.
    public String toString() {
        String message = String.format("음료 이름 : %s%n단가 : %.1f%n", name, price);
        return message;
    }
}
