package java_starter_package;

public class HomeWork01 {
    public static void main(String[] args) {

        /**Задание 2
         Создать программу, проверяющую и сообщающую на экран, является ли введенное с
         консоли целое число, чётным либо нечётным.*/

    /*System.out.println("Задание №2 Проверка чётности");
    System.out.print("Введите любое целое число: ");
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    int change = number % 2;
    if (change == 0) {
        System.out.print("Вы ввели число " + number + " - это четное число!");
    }else {
        System.out.print("Вы ввели число " + number + " - это нечётное число!");
    }*/

        /**Задание 3
         Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
         Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45*/

        /*System.out.println("Задание №3 Ближайшее к 10");
        System.out.println("Введите первое число число: ");
        Scanner scan1 = new Scanner(System.in);
        float number1 = scan1.nextFloat();

        System.out.println("Введите второе число число: ");
        Scanner scan2 = new Scanner(System.in);
        float number2 = scan1.nextFloat();

        float a = number1 - 10;
        float b = number2 - 10;

        if (a > b) {
            System.out.print("Ближайшее к 10 число : " + number2);
        }
        if (a < b) {
            System.out.print("Ближайшее к 10 число : " + number1);
        }
        if (a == b) {
            System.out.println("Вы ввели два одинаковых числа!");
        }
*/
        /**Задание 4
         Задано три переменных, найти и вывести на экран переменную с максимальным значением
         (значения всех переменных разные).*/

      /*
        System.out.println("Задание №4 Максимальное значение 3х переменных");
        int a1 = 150;
        int b1 = 124;
        int c1 = 30;

        if (a1 > b1 && a1 > c1) {

            System.out.println("Максимальное значение у переменной а1 = " + a1);
        } else if (b1 > a1 && b1 > c1) {
            System.out.println("Максимальное значение у переменной b1 = " + b1);
        } else {
            System.out.println("Максимальное значение у переменной c1 = " + c1);
        }
        */

        /**Задание 5
         Задано четыре переменных, найти и вывести на экран вторую по величине.*/

        /*
        System.out.println("Задание №5 Вторая по величине");
        int h0 = 100;
        int h1 = 75;
        int h2 = 50;
        int h3 = 25;

        int firstVariable = h0;
        int secondVariable = h0;

        if (h0 > h1) {
            secondVariable = h1;
        } else {
            firstVariable = h1;
        }
        if (h2 > firstVariable) {
            secondVariable = firstVariable;
            firstVariable = h2;
        } else {
            if (h2 > secondVariable) {
                secondVariable = h2;
            }
            if (h3 > firstVariable) {
                secondVariable = firstVariable;
                firstVariable = h3;
            } else {
                if (h3 > secondVariable) {
                    secondVariable = h3;
                }
                System.out.println(secondVariable + " вторая по величине ");
            }
        }
*/
        /**Задание 6
         В три переменные a, b и c записаны три вещественных(дробных) числа. Создать программу, которая
         будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
         либо сообщать, что корней нет.*/
       /*  System.out.println("Задание №6 Корни квадратного уровнения");
     double a = 2.3;
        double b = 66.3;
        double c = 44.4;

        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("вещественных корней нет!");
        } else {
            double root1 = (-b / (2 * a));
            if (d == 0) {
                System.out.println("Один корень - " + root1);
            } else {
                System.out.println("Два корня");
                System.out.println("Первый корень - " + root1);
                double root2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Второй корень - " + root2);
            }
        }
    }

*/
    }
}