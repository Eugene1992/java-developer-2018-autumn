package HomeWork01;

import java.util.Scanner;

public class HomeWork_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 number:");
        double a = scan.nextDouble();
        System.out.println("Enter 2 number:");
        double b = scan.nextDouble();
        System.out.println("Enter 3 number:");
        double c = scan.nextDouble();

        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("No roots!");
        } else {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            if (d == 0) {
                System.out.println("One root - " + root1);
            } else {
                System.out.println("Two roots");
                System.out.println("First root - " + root1);
                double root2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Second root - " + root2);
            }
        }
    }
}

//Задание 6
//В три переменные a, b и c записаны три вещественных(дробных) числа. Создать программу, которая
//будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
//либо сообщать, что корней нет.