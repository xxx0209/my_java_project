package ch04_class;

public class SaramMain02 {
    public static void main(String[] args) {
        System.out.println(Saram02.nationality);

        Saram02 yusin = new Saram02();
        yusin.nationality = "한국";
        yusin.name = "김유신";
        yusin.height = 176;
        yusin.weight = 68.5;
        yusin.hobby = "당구";
        yusin.blood = "AB";

        Saram02 soon = new Saram02();
        soon.name = "유관순";
        soon.height = 168.5;
        soon.weight = 50.0;
        soon.hobby = "축구";
        soon.blood = "B";

        System.out.println(Saram02.nationality);
        System.out.println(soon.nationality);

        yusin.display();
        soon.display();
    }
}
