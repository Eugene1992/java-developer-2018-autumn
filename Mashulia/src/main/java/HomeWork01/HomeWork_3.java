package HomeWork01;

import java.util.Scanner;

public class HomeWork_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        double nextDob = scan.nextDouble();
        System.out.println("Entered number: " + nextDob );
        double nextDobl = scan.nextDouble();
        System.out.println("Entered number" + nextDobl);

        if ((nextDob - 10) * (nextDob - 10) < (nextDobl - 10) * (nextDobl - 10)) {
            System.out.println("Ближайшее к десяти число " + nextDob);
        } else
            System.out.println("Ближайшее к десяти число " + nextDobl);
    }
}

//Задание 3
//Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
//Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.