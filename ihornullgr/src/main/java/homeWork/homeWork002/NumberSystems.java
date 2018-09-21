package homeWork.homeWork002;

import java.util.Scanner;

public class NumberSystems {
    public static void main(String[] args) {
//6. Написать программу, которая реализует следующий функционал:
//  6.1 Пользователь вводит число в 10-ой системе счисления.
//  6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
//      1) в 2-ую
//      2) в 8-ую
//      3) в 16-ую
//  6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
//  на экран результат.

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число!");
        int number = scan.nextInt();
        System.out.println("Введите систему счисления 2, 8, 16");
        String system = scan.next();
        String str = "";

        if (system.equals("2")) {
            while (number != 0) {
                int d = number % 2;
                str = d + str;
                number = number / 2;
            }
            System.out.println("CalcBinLoop " + str);
        }
        if (system.equals("8")) {
            while (number != 0) {
                int d = number % 8;
                str = d + str;
                number = number / 8;
            }
            System.out.println("Oct " + str);
        }
        if (system.equals("16")) {
            while (number != 0) {
                int d = number % 16;
                if (d < 10) {
                    str = d + str;
                } else {
                    switch (d) {
                        case 10:
                            str = "A" + str;
                            break;
                        case 11:
                            str = "B" + str;
                            break;
                        case 12:
                            str = "C" + str;
                            break;
                        case 13:
                            str = "D" + str;
                            break;
                        case 14:
                            str = "E" + str;
                            break;
                        case 15:
                            str = "F" + str;
                            break;

                    }
                }
                number = number / 16;
            }
            System.out.println("CalcHexLoop " + str);
        }
    }
}