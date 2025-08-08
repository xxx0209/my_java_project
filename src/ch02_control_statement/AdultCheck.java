package ch02_control_statement;

public class AdultCheck {
    public static void main(String[] args) {
        String name = "홍길동"; //이름
        int age = 12; //나이
        int _gender = 3; //주민 번호 뒷자리 성별

        String adult; //성인
        if(age > 19) {
            adult = "성인";
        } else {
            adult = "미성년자";
        }

        String gender;
        if (_gender == 1 || _gender == 3) {
            gender = "남자";
        } else {
            gender = "여자";
        }

        String message = "이름 : %s님, 나이 : %d세, 성인 체크 : %s, 성별 : %s" ;
        System.out.printf(message, name, age, adult, gender) ;
        System.out.println();
    }
}




















