package homeWork;

import java.util.Scanner;

public class HomeWork001 {
    public static void main(String[] args) {
        /*Задание 2
        Создать программу, проверяющую и сообщающую на экран, является ли введенное с
        консоли целое число, чётным либо нечётным.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int nextInt = scan.nextInt();

        if (nextInt % 2 == 0) {
            System.out.println("Четное");
        } else
            System.out.println("Нечетное");
        if (nextInt > 9) {
            System.out.print("число");
        } else
            System.out.print("цифра");
    }
}

