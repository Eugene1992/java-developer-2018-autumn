package java_starter.homework01;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
/*      Задание 2
        Создать программу, проверяющую и сообщающую на экран, является ли введенное с
        консоли целое число, чётным либо нечётным. enteringElement */
        int yourNumber;
        int module;
        Scanner scanTest1 = new Scanner(System.in);
        System.out.println("Enter your number: ");
        yourNumber = scanTest1.nextInt();
        module = yourNumber % 2;
        if (module == 0) {
            System.out.println("Number " + yourNumber + " is even");
        } else {
            System.out.println("Number " + yourNumber + " is odd");
        }
/*      Задание 3
        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
        Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.*/
        float first;
        float second;
        float compar1;
        float compar2;
        Scanner scanTest2 = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        first = scanTest2.nextFloat();
        System.out.println("Enter your second number: ");
        second = scanTest2.nextFloat();
        compar1 = 10 - first;
        compar2 = 10 - second;
        if (compar1 < 0) {
            compar1 = -compar1;
        }
        //or compar1 = Math.abs(10 - first);
        //or compar2 = Math.abs(10 - second);
        if (compar2 < 0) {
            compar2 = -compar2;
        }
        if (compar1 > compar2) {
            System.out.print(second + "is closer to 10 than " + first);
        } else if (compar1 < compar2) {
            System.out.print(first + "is closer to 10 than " + second);
        } else {
            System.out.print("Both number are equally close to 10");
        }
/*        Задание 4
        Задано три переменных, найти и вывести на экран переменную с максимальным значением
        (значения всех переменных разные).*/
        int compare1 = 5;
        int compare2 = 9;
        int compare3 = 155;
        int max;
        if (compare1 > compare2) {
            if (compare1 > compare3) {
                System.out.println("Max variable is: " + compare1);
            } else {
                System.out.println("Max variable is: " + compare3);
            }
        } else {
            if (compare2 > compare3) {
                System.out.println("Max variable is: " + compare2);
            } else {
                System.out.println("Max variable is: " + compare3);
            }
        }
/*      Задание 5
        Задано четыре переменных, найти и вывести на экран вторую по величине.*/
        int var1 = 1;
        int var2 = 2;
        int var3 = 3;
        int var4 = 4;
        int firstMax = var1;
        int secondMax = var1;

        if (var1 > var2) {
            secondMax = var2;
        } else {
            secondMax = var1;
            firstMax = var2;
        }
        if (var3 > firstMax) {
            secondMax = firstMax;
            firstMax = var3;
        } else {
            if (var3 > secondMax) {
                secondMax = var3;
            }
        }
        if (var4 > firstMax) {
            secondMax = firstMax;
            firstMax = var4;
        } else {
            if (var4 > secondMax) {
                secondMax = var4;
            }
        }
        System.out.println("Second max. element is: " + secondMax);
/*      Задание 6
        В три переменные a, b и c записаны три вещественных(дробных) числа. Создать программу, которая
        будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
        либо сообщать, что корней нет.*/
        double x1;
        double x2;
        Scanner scanTest6 = new Scanner(System.in);
        System.out.println("Enter a, b, c");
        double a = scanTest6.nextDouble();
        double b = scanTest6.nextDouble();
        double c = scanTest6.nextDouble();
        double dis = b * b - 4 * a * c;//возведение в степень - Math.pow(b, 2)
        if (dis == 0) {
            x1 = x2 = -(b / 2 * a);
            System.out.print("x = " + x1);
        }
        if (dis < 0) {
            System.out.println("This quadratic equations have no roots");
        } else {
            x1 = ((-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a);
            x2 = ((-b + Math.sqrt(b * b + 4 * a * c)) / 2 * a);
            System.out.println("x1 = " + x1 + "; x2 = " + x2);
        }
    }
}