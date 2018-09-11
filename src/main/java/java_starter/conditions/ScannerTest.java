package java_starter.conditions;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some string value:");
        String next = scan.next();
        System.out.println("Entered string value: " + next);
        System.out.println("Enter some int value:");
        int nextInt = scan.nextInt();
        System.out.println("Entered int value: " + nextInt);
    }
}
