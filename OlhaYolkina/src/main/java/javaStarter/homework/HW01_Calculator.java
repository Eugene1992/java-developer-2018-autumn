package javaStarter.homework;

import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Задание 7
 * Используя IntelliJ IDEA, создайте класс Calculator.
 * Напишите программу - консольный калькулятор.
 * Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
 * Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
 * Выведите на экран результат выполнения арифметической операции.
 * В случае использования операции деления, организуйте проверку попытки деления на ноль.
 * И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
 * пользователя.
 */
public class HW01_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write first number");
        double a = scan.nextDouble();
        System.out.println("Please write second number");
        double b = scan.nextDouble();
        System.out.println("Please write operation");
        String operation = scan.next();
        char op = operation.toCharArray()[0];

        switch (op) {
            case '+':
                System.out.println(a + " " + op + " " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " " + op + " " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " " + op + " " + b + " = " + (a * b));
                break;
            case '/':
                if (b == 0) System.out.println("Error. Division by zero");
                else System.out.println(a + " " + op + " " + b + " = " + (a / b));
                break;
            case '%':
                if (b == 0) System.out.println("Error. Division by zero");
                else System.out.println(a + " " + op + " " + b + " = " + (a % b));
                break;
            case '^':
                System.out.println(a + " " + op + " " + b + " = " + (pow(a,b)));
                break;
            default:
                System.out.println("This symbol is not arithmetic operation");
        }
    }
}
