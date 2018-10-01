package java_starter.homework02;

import java.util.Scanner;
/*    6. Написать программу, которая реализует следующий функционал:
        6.1 Пользователь вводит число в 10-ой системе счисления.
        6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
        1) в 2-ую
        2) в 8-ую
        3) в 16-ую
        6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
        на экран результат.*/

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        boolean trueSystem = true;
        while (trueSystem) {
            System.out.println("Choose numeral system and enter number: 1 - if Binary; 2 - if Octal; 3 - Hex");
            int numeralSystem = sc.nextInt();
            String str = "";
            switch (numeralSystem) {
                case 1:
//        System.out.println("Must be: " + Integer.toBinaryString(first2));
                    int bin;
                    while (number != 0) {
                        bin = number % 2;
                        str = bin + str;
                        number = number / 2;
                    }
                    System.out.println(str);
                    trueSystem = false;
                    break;
                case 2:
//        System.out.println("Must be: " + Integer.toOctalString(first8));
                    int oct;
                    while (number != 0) {
                        oct = number % 8;
                        str = oct + str;
                        number = number / 8;
                    }
                    System.out.println(str);
                    trueSystem = false;
                    break;
                case 3:
//        System.out.println("Must be: " + Integer.toHexString(first16));
                    int hex;
                    while (number != 0) {
                        hex = number % 16;
                        switch (hex) {
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
                            default:
                                str = hex + str;
                                break;
                        }
                        number = number / 16;
                    }
                    System.out.println(str);
                    trueSystem = false;
                    break;
                default:
                    System.out.println("Error. Try enter number of  system another one");
            }
        }
    }
}
