package ch04_class;

public class SaramMain03 {
    public static void main(String[] args) {

        Saram03 yusin = new Saram03();

        yusin.setName("김유신");
        yusin.setHeight(172.3);
        yusin.setWeight(72.5);
        yusin.setHobby("축구");
        yusin.setBlood("B");

        System.out.println(yusin.getName());
        System.out.println(yusin.getHeight());
        System.out.println(yusin.getWeight());
        System.out.println(yusin.getHobby());
        System.out.println(yusin.getBlood());

        Saram03 soon = new Saram03();

        soon.setName("유관순");
        soon.setHeight(165.5);
        soon.setWeight(55);
        soon.setHobby("농구");
        soon.setBlood("B");

        System.out.println(soon.getName());
        System.out.println(soon.getHeight());
        System.out.println(soon.getWeight());
        System.out.println(soon.getHobby());
        System.out.println(soon.getBlood());

    }
}
