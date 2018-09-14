package homework02;

import java.util.Scanner;

public class TaskFrom1To5 {
    public static void main(String[] args) {
//        1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
        for (int i = 1000; i < 10000; i += 3) {
            System.out.println(i);
        }

//        2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
        int operationNumber = 1;
        int fiveElement = 1;
        while (operationNumber <= 55) {
            System.out.print(operationNumber + " element: ");
            operationNumber = operationNumber + 1;
            System.out.println(fiveElement);
            fiveElement += 2;
        }

//        3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….

        int positiveNumber = 90;
        do {
            System.out.println(positiveNumber);
            positiveNumber -= 5;
        } while (positiveNumber > 0);

//        4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
        int operationNumber2 = 1;
        int mulTwo = 1;
        while (operationNumber2 <= 20) {
            System.out.print(operationNumber2 + " element: ");
            operationNumber2 = operationNumber2 + 1;
            System.out.println(mulTwo);
            mulTwo *= 2;
        }

//        5. Выведите на экран первые 20 членов последовательности Фибоначчи.
        int forFibon = 1;
        int first = 0;
        int second = 1;
        int fibonacci;
        String stringFibonnachi = "0 1";
        while (forFibon < 19) {

            fibonacci = first + second;
            first = second;
            second = fibonacci;
            stringFibonnachi = stringFibonnachi + " " + fibonacci;
            forFibon += 1;
        }
        System.out.print(stringFibonnachi);
    }
}
