package homeworks.javaEssential.homework01.battle.utils;

import java.util.Scanner;

public class UserInputScanner {

    private static Scanner scanner = new Scanner(System.in);

    public static String getUserInputString() {
        return scanner.next();
    }

    public static int getUserInputInt() {
        return scanner.nextInt();
    }
}
