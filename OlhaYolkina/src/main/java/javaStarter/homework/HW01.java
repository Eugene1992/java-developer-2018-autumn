package javaStarter.homework;

import java.util.Scanner;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.sqrt;

public class HW01 {
    public static void main(String[] args) {
        /**
         * Задание 2
         * Создать программу, проверяющую и сообщающую на экран, является ли введенное с
         * консоли целое число, чётным либо нечётным.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write a number");
        int a = scan.nextInt();

        if (a % 2 == 0) System.out.println(a + " - even");
        else System.out.println(a + " - odd");


        /**
         * Задание 3
         * Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
         * Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
         */
        System.out.println("Please write two numbers");
        float b = scan.nextFloat();
        float c = scan.nextFloat();

        if (abs(b - 10) == abs(c - 10)) System.out.println(b + " and " + c + " are equally close to 10");
        else if (abs(b - 10) > abs(c - 10)) System.out.println(c + " is closer to 10 then " + b);
        else System.out.println(b + " is closer to 10 then " + c);


        /**
         * Задание 4
         * Задано три переменных, найти и вывести на экран переменную с максимальным значением
         * (значения всех переменных разные).
         */
        System.out.println("Please write three numbers");
        float d = scan.nextFloat();
        float e = scan.nextFloat();
        float f = scan.nextFloat();

        if ((d == e) & (e == f))
            System.out.println("d = " + d + ", " + "e = " + e + ", " + "f = " + f + " are equally");
        else if ((d == e) & (e > f)) System.out.println("d = " + d + " and " + "e = " + e + " are maximum");
        else if ((d == f) & (e < f)) System.out.println("d = " + d + " and " + "f = " + f + " are maximum");
        else if ((e == f) & (d < e)) System.out.println("e = " + e + " and " + "f = " + f + " are maximum");
        else if ((d > e) & (d > f)) System.out.println("d = " + d + " is maximum");
        else if ((e > d) & (e > f)) System.out.println("e = " + e + " is maximum");
        else System.out.println("f = " + f + " is maximum");


        /**
         * Задание 5
         * Задано четыре переменных, найти и вывести на экран вторую по величине.
         */
        System.out.println("Please write four numbers");
        float g = scan.nextFloat();
        float h = scan.nextFloat();
        float i = scan.nextFloat();
        float j = scan.nextFloat();

        float a1, a2 = 0;

        a1 = ((g >= h ? g : h) >= (i >= j ? i : j)) ? (g >= h ? g : h) : (i >= j ? i : j);

        if (g == a1) {
            a2 = (h >= i) ? (h >= j ? h : j) : (i >= j ? i : j);
        } else if (h == a1) {
            a2 = (g >= i) ? (g >= j ? g : j) : (i >= j ? i : j);
        } else if (i == a1) {
            a2 = (g >= h) ? (g >= j ? g : j) : (h >= j ? h : j);
        } else if (j == a1) {
            a2 = (g >= h) ? (g >= i ? g : i) : (h >= i ? h : i);
        }

        System.out.println(a2 + " - second value by size");


        /**
         *Задание 6
         * В три переменные a, b и c записаны три вещественных(дробных) числа. Создать программу, которая
         * будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
         * либо сообщать, что корней нет.
         */
        System.out.println("Please write k, l, m numbers for kx²+lx+m=0");
        double k = scan.nextDouble();
        double l = scan.nextDouble();
        double m = scan.nextDouble();

        double x1, x2;
        if (k == 0) System.out.println("x = " + (-m / l));
        else if ((l * l - 4 * k * m) >= 0) {
            x1 = (-l + sqrt(l * l - 4 * k * m)) / (2 * k);
            x2 = (-l - sqrt(l * l - 4 * k * m)) / (2 * k);
            System.out.println("x1 = " + x1 + "; x2 = " + x2);
        } else System.out.println("This quadratic equation has no real roots");
    }
}
