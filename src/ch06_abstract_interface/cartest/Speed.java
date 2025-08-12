package ch06_abstract_interface.cartest;

public interface Speed {
    public static int ALLOWED_MAX_SPEED = 50;

    public abstract void speedUp(int su); //가속기(su만큼 누적하기)
    public abstract void speedDown(int su); //감속기(su만큼 누적하기)


}
