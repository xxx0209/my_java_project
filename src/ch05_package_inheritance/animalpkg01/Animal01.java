package ch05_package_inheritance.animalpkg01;

public class Animal01 {

    private String name; //이름
    private int lifespan; //평균수명
    private String habitat;//서식지
    private int speed;//속도

    public Animal01() {
    }

    public Animal01(String name, int lifespan, String habitat, int speed) {
        this.name = name;
        this.lifespan = lifespan;
        this.habitat = habitat;
        this.speed = speed;
    }

    public void showInfo() {
        //return String.format("평균 수명이 %d인 %s인 서식지는 %s입니다.", name, lifespan, habitat);
        System.out.printf("평균 수명이 %d인 %s인 서식지는 %s입니다.%n", lifespan, name, habitat);
    }


    @Override
    public String toString() {
        return String.format("평균 수명이 %d인 %s인 서식지는 %s입니다.", name, lifespan, habitat);
    }

    public String getName() {
        return name;
    }

    public int getLifespan() {
        return lifespan;
    }

    public String getHabitat() {
        return habitat;
    }

    public int getSpeed() {
        return speed;
    }
}
