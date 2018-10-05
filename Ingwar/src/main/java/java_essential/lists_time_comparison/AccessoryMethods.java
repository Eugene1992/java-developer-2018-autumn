package java_essential.lists_time_comparison;

import java.util.Scanner;

class AccessoryMethods {

    static void wirteMessage(String string) {
        System.out.println(string);
    }

    static int getIntValuefromInput(String string) {
        System.out.println(string);
        Scanner scan = new Scanner(System.in);
        int returnValue = scan.nextInt();
        return returnValue;
    }

}
