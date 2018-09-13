package homework;

import java.util.Scanner;

/**
 * 6. Написать программу, которая реализует следующий функционал:
 *   6.1 Пользователь вводит число в 10-ой системе счисления.
 *   6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
 *       1) в 2-ую
 *       2) в 8-ую
 *       3) в 16-ую
 *   6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
 *   на экран результат.
 */

public class HW02_DecTo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write number");
        int number = scan.nextInt();
        String system;

        do {
            System.out.println("Please write system: 2, 8, 16");
            system = scan.next();

            if (system.equals("2")) {
                int dec = number, remainder;

                String binNumber = "";

                do {
                    remainder = dec % 2;
                    dec = dec / 2;
                    binNumber = remainder + binNumber;
                }
                while (dec != 0);

                System.out.println(number + " in Bin = " + binNumber.replaceAll("(.{4})", "$1 "));
            } else if (system.equals("8")) {
                int dec8 = number, remainder8;

                String octNumber = "";

                do {
                    remainder8 = dec8 % 8;
                    dec8 = dec8 / 8;
                    octNumber = remainder8 + octNumber;
                }
                while (dec8 != 0);

                System.out.println(number + " in Oct = " + octNumber.replaceAll("(.{4})", "$1 "));
            } else if (system.equals("16")) {
                int dec16 = number, remainder16;
                String hexNumber = "";

                while (dec16 > 0) {
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
                    } else hexNumber = remainder16 + hexNumber;
                }

                System.out.println(number + " in Hex = " + hexNumber);
            } else {
                System.out.println("You wrote incorrect symbol. Please, try again");
            }
        }
        while (!system.equals("2") && !system.equals("8") && !system.equals("16"));
    }
}
