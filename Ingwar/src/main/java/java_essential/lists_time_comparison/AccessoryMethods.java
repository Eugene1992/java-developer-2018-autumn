package java_essential.lists_time_comparison;

import java.util.Scanner;

class AccessoryMethods {

    static void wirteMessage(String string) {
        System.out.println(string);
    }

    static ElementValueTypes getTypeValuefromInput() {
        Scanner scan = new Scanner(System.in);
        return ElementValueTypes.valueOf(scan.next());
    }

    static long getLongValuefromInput() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLong();
    }

    static int getIntValuefromInput() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    static String getStringValuefromInput() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    static void drawTimeMatrix(long[][] timeMatrix) {
        AccessoryMethods.wirteMessage("     start   middle  end");
        for (int indexLine = 0; indexLine < timeMatrix.length; indexLine++) {
            String operation = "";
            switch (indexLine) {
                case 0:
                    operation = "add   ";
                    break;
                case 1:
                    operation = "get   ";
                    break;
                case 2:
                    operation = "set   ";
                    break;
                case 3:
                    operation = "remove";
                    break;
                default:
            }
            AccessoryMethods.wirteMessage(" " + operation + " " + timeMatrix[indexLine][0] + "  " +
                    timeMatrix[indexLine][1] + "  " + timeMatrix[indexLine][2]);
        }
        AccessoryMethods.wirteMessage("");
    }
}