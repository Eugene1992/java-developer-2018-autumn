package HomeWork01;

import java.util.Scanner;

public class HomeWork_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int nextInt = scan.nextInt();
        System.out.println("Entered number: " + nextInt + " is ");

        if ((nextInt % 2) == 0){
            System.out.println("Even");
        } else {
            if (nextInt % 1== 0){
                System.out.println("Odd");
            }
        }
    }
}

//Задание 2
//Создать программу, проверяющую и сообщающую на экран, является ли введенное с
//консоли целое число, чётным либо нечётным.