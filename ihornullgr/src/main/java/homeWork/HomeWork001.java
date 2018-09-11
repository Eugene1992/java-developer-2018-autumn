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

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Введите цифру или число 3");
        int nextInt2 = scan3.nextInt();


    }

}


