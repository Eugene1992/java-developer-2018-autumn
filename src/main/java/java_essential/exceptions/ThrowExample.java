package java_essential.exceptions;

import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();

        if (a < 0) {
            throw new IllegalArgumentException("Negative input number");
        }
    }
}
