package javaStarter.homework;

import java.util.Scanner;

/**
 * Задание 8
 * Используя IntelliJ IDEA, создайте класс Interval.
 * Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
 * промежуток [0 - 14] [15 - 35] [36 - 50] [51 - 100]. Если да, то укажите, в какой именно промежуток.
 * Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
 * выводится соответствующее сообщение.
 */
public class HW01_Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write a number");
        double a = scan.nextDouble();

        if ((a < 0) | (a > 100)) System.out.println(a + " is not in [0; 100]");
        else if (a < 15) System.out.println(a + " is in [0; 14]");
        else if (a < 36) System.out.println(a + " is in [15; 35]");
        else if (a < 51) System.out.println(a + " is in [35; 50]");
        else System.out.println(a + " is in [51; 100]");
    }
}
