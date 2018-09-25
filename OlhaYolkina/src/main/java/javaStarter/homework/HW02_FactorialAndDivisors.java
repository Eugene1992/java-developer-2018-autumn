package javaStarter.homework;

import java.util.Scanner;

public class HW02_FactorialAndDivisors {
    public static void main(String[] args) {
        /**
         * 7. Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Write number to find a factorial");
        int n = scan.nextInt();
        System.out.print(n);
        long factor = 1;

        while (n > 1) {
            factor *= n;
            n -= 1;
        }

        System.out.println("! = " + factor);

        System.out.println();

        /**
         * 8. Выведите на экран все положительные делители натурального числа, введенного пользователем.
         */
        System.out.println("Write number to find a divisors");
        int number = scan.nextInt();
        int divisor = 1;
        String result = " divisors: ";

        while (divisor < number +1) {
            if (number % divisor == 0) {
                result += divisor + " ";
            }
            divisor++;
        }

        System.out.println(number + result);
    }
}
