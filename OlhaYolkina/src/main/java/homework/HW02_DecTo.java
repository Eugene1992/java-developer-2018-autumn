package homework;

import java.util.Scanner;

public class HW02_DecTo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write number");
        int number = scan.nextInt();
        int dec, remainder;

        String binNumber = "";
        dec = number / 2;
        remainder = number % 2;
        binNumber = remainder + binNumber;

        do {
            remainder = dec % 2;
            dec = dec / 2;
            binNumber = remainder + binNumber;
        }
        while (dec != 0);

        System.out.println(number + " in Bin = " + binNumber.replaceAll("(.{4})", "$1 "));

        int dec16, remainder16;
        String hexNumber = "";
        dec16 = number / 16;
        remainder16 = number % 16;

        if (remainder16 > 9) {
            switch (remainder16) {
                case 10:
                    hexNumber = "A" + hexNumber;
                    break;
                case 11:
                    hexNumber = "B" + hexNumber;
                    break;
                case 12:
                    hexNumber = "C" + hexNumber;
                    break;
                case 13:
                    hexNumber = "D" + hexNumber;
                    break;
                case 14:
                    hexNumber = "E" + hexNumber;
                    break;
                case 15:
                    hexNumber = "F" + hexNumber;
                    break;
            }
        } else hexNumber = remainder16 + hexNumber;

        do {
            remainder16 = dec16 % 16;
            dec16 = dec16 / 16;
            if (remainder16 > 9) {
                switch (remainder16) {
                    case 10:
                        hexNumber = "A" + hexNumber;
                        break;
                    case 11:
                        hexNumber = "B" + hexNumber;
                        break;
                    case 12:
                        hexNumber = "C" + hexNumber;
                        break;
                    case 13:
                        hexNumber = "D" + hexNumber;
                        break;
                    case 14:
                        hexNumber = "E" + hexNumber;
                        break;
                    case 15:
                        hexNumber = "F" + hexNumber;
                        break;
                }
            } else if (dec16 != 0) hexNumber = remainder16 + hexNumber;
        }
        while (dec16 != 0);

        System.out.println(number + " in Hex = " + hexNumber);
    }
}
