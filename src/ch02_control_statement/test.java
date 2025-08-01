package ch02_control_statement;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        OutputStream os = System.out;

        int a = 64;

        try {
            os.write(a);
            os.flush();

            //os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
