package ch02_control_statement;

public class test {
    public static void main(String[] args) {
       char grade = 'a';

        switch (grade){
            case 'A', 'a' -> System.out.println("우수");
            case 'B', 'b' -> System.out.println("일반");
        }
    }
}
