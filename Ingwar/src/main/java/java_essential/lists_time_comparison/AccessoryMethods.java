package java_essential.lists_time_comparison;

import java.util.Scanner;

class AccessoryMethods {

    static void wirteMessage(String string) {
        System.out.println(string);
    }

    static ElementValueTypes getTypeValuefromInput() {
        Scanner scan = new Scanner(System.in);
        return ElementValueTypes.valueOf(scan.next().toUpperCase());
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
        AccessoryMethods.wirteMessage("     " + Positions.START.getName() + "   " + Positions.MIDDLE.getName() +
                "   " + Positions.END.getName());
        for (int indexLine = 0; indexLine < timeMatrix.length; indexLine++) {
            String operation = "";
            switch (indexLine) {
                case 0:
                    operation = Operations.ADD.getName() + "   ";
                    break;
                case 1:
                    operation = Operations.GET.getName() + "   ";
                    break;
                case 2:
                    operation = Operations.SET.getName() + "   ";
                    break;
                case 3:
                    operation = Operations.REMOVE.getName();
                    break;
                default:
            }
            AccessoryMethods.wirteMessage(" " + operation + " " + timeMatrix[indexLine][0] + "      " +
                    timeMatrix[indexLine][1] + "       " + timeMatrix[indexLine][2]);
        }
        AccessoryMethods.wirteMessage("");
    }
}