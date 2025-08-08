package ch04_class;

// 단계 1 : 클래스 정의(선언)
public class Saram01 {

    String nationality;
    String name;
    double height;
    double weight;
    String hobby;
    String blood;

    String showGenderInfo(int juminno) {

        String gender = "";

        if (juminno == 1 || juminno == 3){
            gender = "남자";
        } else {
            gender = "여자";
        }

        String message = name + "님은 " + gender + "이군요.";
        return message;
    }

    String showBmiInfo(){
        double newHeight = height / 100.0; //센티미터를미터로 변환
        double rate = weight / (newHeight * newHeight); //bmi 공식에 의하여 계산
        String bmi = ""; //결과를 저장할 문자열
        if (rate >= 25.00){
            bmi = "비만";
        } else if (rate >= 23.00){
            bmi = "과체중";
        } else if (rate >= 18.50){
            bmi = "정상";
        } else {
            bmi = "저체중";
        }

        String message = name + "님은 " + bmi + "입니다.";
        return message;
    }

    void display() {
        System.out.println("국적 : " + nationality);
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("취미 : " + height);
        System.out.println("혈액형 : " + height);
    }

}
