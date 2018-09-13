package homeWork;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

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
        } else
            System.out.println(f2 + "ближе к 10");


        /*Задание 4
        Задано три переменных, найти и вывести на экран переменную с максимальным значением
        (значения всех переменных разные).*/
        int max0 = 555;
        int max1 = 666;
        int max2 = 777;

        if (max0 > max1) {
            System.out.println(max0 + " переменная больше всех");
        } else if (max1 > max2) {
            System.out.println(max1 + " переменная больше всех");
        } else if (max2 > max0) {
            System.out.println(max2 + " переменная больше всех");
        }

        /*Задание 5
        Задано четыре переменных, найти и вывести на экран вторую по величине.*/
        int h0 = 44;
        int h1 = 22;
        int h2 = 11;
        int h3 = 6;

        int firstVariable = h0;
        int secondVAriable = h0;

        if (h0 > h1) {
            secondVAriable = h1;
        } else {
            firstVariable = h1;
        }
        if (h2 > firstVariable) {
            secondVAriable = firstVariable;
            firstVariable = h2;
        } else {
            if (h2 > secondVAriable) {
                secondVAriable = h2;
            }
            if (h3 > firstVariable) {
                secondVAriable = firstVariable;
                firstVariable = h3;
            } else {
                if (h3 > secondVAriable){
                    secondVAriable = h3;
                }
                System.out.println(secondVAriable + " вторая по величине");
            }
        }

        /*Задание 6
        В три переменные a, b и c записаны три вещественных(дробных) числа. Создать программу, которая
        будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
                либо сообщать, что корней нет.*/
// TODO: 12.09.2018 >> разобрать дискриминант 
        double doubleVarA = 34.5;
        double doubleVarB = 23.14;
        double doubleVarC = 2;

        double discriminant = doubleVarB*doubleVarB - 4*doubleVarA*doubleVarC;
        if (discriminant<0){
            System.out.println("No roots");
        } else {
            double root1 = (-doubleVarB+Math.sqrt(discriminant))/(2*doubleVarA);
            if (discriminant == 0) {
                System.out.println("One root");
                System.out.println("Root: "+root1);
            } else {
                System.out.println("Two roots");
                System.out.println("First root: "+root1);
                double root2 = (-doubleVarB-Math.sqrt(discriminant))/(2*doubleVarA);
                System.out.println("Second root: "+root2);
            }
        }


    }

}


