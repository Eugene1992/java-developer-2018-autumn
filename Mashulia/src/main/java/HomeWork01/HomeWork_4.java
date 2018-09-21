package HomeWork01;

import java.util.Scanner;

public class HomeWork_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 number:");
        float a = scan.nextFloat();
        System.out.println("Enter 2 number:");
        float b = scan.nextFloat();
        System.out.println("Enter 3 number:");
        float c = scan.nextFloat();
        System.out.println("Entered numbers: " + a + " " + b + " " + c );

        if ((a*a)-(b*b)-(c*c)>0){
            System.out.println("The biggest number is " + a);
        } else if ((b*b)-(a*a)-(c*c)>0){
            System.out.println("The biggest number is " + b);
        } else if ((c*c)-(a*a)-(b*b) >0){
            System.out.println("The biggest number is " + c);
        }
    }
}

//Задание 4
//Задано три переменных, найти и вывести на экран переменную с максимальным значением
//(значения всех переменных разные).
