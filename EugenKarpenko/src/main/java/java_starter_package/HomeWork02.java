package java_starter_package;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        /*1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….*/
        int aEx1 = 1000;
        while (aEx1 < 10000) {
            System.out.println(aEx1);
            aEx1 += 3;
        }

        /*2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….*/

        for (int i = 0, aEx2 = 1; i <= 55; aEx2 = aEx2 + 2, i++) {
            System.out.println(aEx2 + " ");
        }
        /*3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….*/
        for (int aEx3 = 90; aEx3 >= 0; aEx3 -= 5) {
            System.out.println(aEx3);
        }
        /*4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….*/
        for (int i = 1, aEx4 = 2; i <= 20; aEx4 = aEx4 * 2, i++) {
            System.out.println(aEx4);
        }
        /*5. Выведите на экран первые 20 членов последовательности Фибоначчи.*/
        int aEx5 = 0, bEx5 = 1, cEx5;
        System.out.println(aEx5 + bEx5);
        for (int i = 2; i <= 20; i++) {
            cEx5 = aEx5 + bEx5;
            aEx5 = bEx5;
            bEx5 = cEx5;
            System.out.println(cEx5);
        }
        /*7. Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.*/
        System.out.println("Write number:");
        Scanner scan = new Scanner(System.in);
        int userNumber = scan.nextInt();
        int aEx7 = 1;
        for (int i = 1; i <= userNumber; i++) {
            aEx7 = aEx7 * i;
        }
        System.out.println(userNumber + "!=" + aEx7);
    }
}





