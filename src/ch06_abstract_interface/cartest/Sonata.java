package ch06_abstract_interface.cartest;

public class Sonata extends Car{

    private String maker;

    public Sonata(String name, int price, Key key, String maker) {
        super(name, price, key);
        this.maker = maker;
    }

//    @Override
//    public void display() {
//
//    }
//
//    @Override
//    public void speedUp(int su) {
//
//    }
//
//    @Override
//    public void speedDown(int su) {
//
//    }

    @Override
    public String toString() {
        String message = "제조사 :" + maker;
        return super.toString() + message;
    }
}
