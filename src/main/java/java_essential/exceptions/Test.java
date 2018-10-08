package java_essential.exceptions;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            System.exit(0);
            Scanner scanner = new Scanner(System.in);
            System.out.println(10 / scanner.nextInt());
            System.out.println("After");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
            e.printStackTrace();
        } finally {
            System.out.println("Finally!");
        }
        System.out.println("End");
    }

    public static void f() throws WrongUsernameOrPasswordException {
        throw new WrongUsernameOrPasswordException();
    }
}
