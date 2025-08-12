package ch04_class;

import java.util.ArrayList;
import java.util.List;

public class OverloadMain {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 7;
        double x = 1.1, y = 2.2;

        OverAdd oa = new OverAdd();
        int result = oa.Add(a, b, c);
        System.out.println(result);
        double result2 = oa.Add(x, y);
        System.out.println(result2);
        double result3 = oa.Add(a, y);
        System.out.println(result3);

    }
}
