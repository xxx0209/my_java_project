package ch05_package_inheritance.mysport;

public class SportMain {
    public static void main(String[] args) {
        Football football = new Football("축구", 11, 1, 5);
        Baseball baseball = new Baseball("야구", 9, 9, 0.412);

        football.showINfo();
        System.out.println();
        baseball.showINfo();
    }
}
