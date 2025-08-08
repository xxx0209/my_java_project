package ch02_control_statement;

public class Multilf01 {
    public static void main(String[] args) {
        int temperature = 24;
        String msg;

        if(temperature >= 35) {
            msg = "폭염 경부";
        } else if(temperature >= 30) {
            msg = "무더운 날씨";
        } else if(temperature >= 20) {
            msg = "쾌적한 날씨";
        } else if(temperature >= 10) {
            msg = "쌀쌀한 날씨";
        } else {
            msg = "추운 날씨";
        }

        System.out.println(temperature + "도는 " + msg + " 입니다.");
    }
}
