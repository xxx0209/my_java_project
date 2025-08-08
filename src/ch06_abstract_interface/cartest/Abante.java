package ch06_abstract_interface.cartest;

public class Abante extends Car{

    private String comment;

    public Abante(String name, int price, Key key, String comment) {
        super(name, price, key);
        this.comment = comment;
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
        String message = "코멘트 :" + comment;
        return super.toString() + message;
    }
}
