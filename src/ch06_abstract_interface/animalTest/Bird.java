package ch06_abstract_interface.animalTest;

public abstract interface Bird {
    public static final int speed = 300;

    public abstract void fly();

    public default void flutter(){
        System.out.println("날개를 펄럭입니다.");
    };

    static void test() {
        System.out.println("static void");
    }
}
