package java_starter_package;

import java.util.Scanner;

public class HomeWork01_Interval {

    public static void main(String[] args) {
        /**Задание 8
         Используя IntelliJ IDEA, создайте класс Interval.
         Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
         промежуток [0 - 14] [15 - 35] [36 - 50] [51 - 100]. Если да, то укажите, в какой именно промежуток.
         Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
         выводится соответствующее сообщение. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число о 0 до 100:");
        int a = scan.nextInt();
        if (a < 0 || a > 100) {
            System.out.println("Error : Ваше число не находиться в числовом диапозоне[0 - 100]");
        } else if (a < 15) {
            System.out.println("Число находиться в диапазоне [0 - 14]");
        } else if (a < 36) {
            System.out.println("Число находиться в диапазоне [15 - 35]");
        } else if (a < 51) {
            System.out.println("Число находиться в диапазоне [36 - 50]");
        } else if (a <= 100) {
            System.out.println("Число находиться в диапазоне [51 - 100]");
        }
    }
}

