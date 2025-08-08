package ch01_variable_operator;

import java.text.NumberFormat;
import java.util.Locale;

public class CarTest {
    public static void main(String[] args) {
        String maker = "르노";
        String carName = "SM5";
        int price = 30000000;
        int cc = 2000;
        double ver = 1.5;

        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.KOREA);

        System.out.println("제조사 :" + maker);
        System.out.println("차량명 :" + carName);
        System.out.println("가격 :" + formatter.format(price));
        System.out.println("CC :" + cc + "cc");
        System.out.println("버전 :" + ver);
    }
}
