package homeWork;

import java.util.Scanner;

public class HomeWork001 {
    public static void main(String[] args) {
        /*Задание 2
        Создать программу, проверяющую и сообщающую на экран, является ли введенное с
        консоли целое число, чётным либо нечётным.*/

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите цифру или число");
        int nextInt = scan2.nextInt();

        if (nextInt % 2 == 0) {
            System.out.println("Четное ");
        } else
            System.out.println("Нечетное ");
       /* if (nextInt > 9) {
            System.out.print(" число");
        } else
            System.out.print(" цифра");*/

        /*Задание 3
        Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
        введенных с консоли.
        Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.*/

        int a = 10;
        float f1 = 9.24f;
        float f2 = 15.45f;

        float f3 = f1 - a;
        float f4 = f2 - a;

        if (f3 < f4) {
            System.out.println(f1 + "ближе к 10");
        }else
            System.out.println(f2 + "ближе к 10");


        /*Задание 4
        Задано три переменных, найти и вывести на экран переменную с максимальным значением
        (значения всех переменных разные).*/



        }

    }


