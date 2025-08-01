package ch04_class;

import java.nio.ByteBuffer;

public class Saram05Main {
    public static void main(String[] args) {
        int[] arr = new int[3];

        Saram05[] saram = new Saram05[2];
        saram[0] = new Saram05("이순신", 180.5,75.5, "농구", "AB");
        saram[1] = new Saram05("박영희", 158.5,50.5, "B");

        for (int i = 0; i < saram.length; i++) {
            saram[i].display();
        }

        Saram05[] mylist = {
                new Saram05("이순신", 180.5,75.5, "농구", "AB"),
                new Saram05("박영희", 158.5,50.5, "B")

        };

        for (Saram05 test : mylist) {
            test.display();
        }



    }
}
