package Homeworks.Homework3;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//    1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….

        for (int i = 1000; i < 10000; i++) {
            System.out.println(i);
        }

//    2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….

        for (int i = 1, j = 1; i <= 55; i++, j+=2) {
            System.out.println(j);
        }

//    3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….

        for (int i = 90; i >= 0; i-=5) {
            System.out.println(i);
        }

//    4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

        for (int i = 1, j = 2; i <= 20; i++, j*=2) {
            System.out.println(j);
        }

//    5. Выведите на экран первые 20 членов последовательности Фибоначчи.

        for (int i = 0, j = 0, k = 1; i < 20; i++, j+=k, k+=j ) {
            System.out.print(j + "," + k + ",");
        }

//-------------------------------------------------- Системы счисления ---------------------------------------------------
//    6. Написать программу, которая реализует следующий функционал:
//    6.1 Пользователь вводит число в 10-ой системе счисления.
//    6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
//      1) в 2-ую
//      2) в 8-ую
//      3) в 16-ую
//    6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
//    на экран результат.
//TODO
        String enterAnyNumberMessage = "Enter any number";
        String chooseConvertationMessage = "Enter number to choose the convertation";
        String toConvertMessage = " - to convert into ";
        String system = "system";
        String binary = "binary";
        String octal = "octal";
        String hexadecimal = "hexadecimal";
        String binaryConvertationMessage = "1" + toConvertMessage + binary + system;
        String octalConvertationMessage = "2" + toConvertMessage + octal + system;
        String hexadecimalConvertationMessage = "3" + toConvertMessage + hexadecimal + system;

        System.out.println(enterAnyNumberMessage);

        int enteredNumberToConvert = scan.nextInt();

        System.out.println(chooseConvertationMessage);
        System.out.println(binaryConvertationMessage);
        System.out.println(octalConvertationMessage);
        System.out.println(hexadecimalConvertationMessage);

        int chosenConvertationSystem = scan.nextInt();

        switch (chosenConvertationSystem) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            default:
                System.out.println("You've entered char not in range from 1 to 3");
        }

//
//-------------------------------------------- Факториал и делители числа ------------------------------------------------
//    7. Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.

        System.out.println(enterAnyNumberMessage);

        int enteredNumber = scan.nextInt();

        int factorial = 1;

        for (int i = enteredNumber; i > 0; i--) {
            factorial *= i;
        }

        System.out.println(factorial);

//    8. Выведите на экран все положительные делители натурального числа, введенного пользователем.

        System.out.println(enterAnyNumberMessage);

        int enteredNumberToGetDivisors = scan.nextInt();

        for (int i = enteredNumberToGetDivisors; i > 0; i--) {
            if (enteredNumberToGetDivisors % i == 0) {
                System.out.println(i);
            }
        }
    }
}
