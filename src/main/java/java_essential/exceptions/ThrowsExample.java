package java_essential.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            f();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void f() throws ArithmeticException, FileNotFoundException {
        InputStream is = new FileInputStream("");
    }
}
