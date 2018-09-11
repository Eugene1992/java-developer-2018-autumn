package homeWork;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan0 = new Scanner(System.in);
        System.out.println("Input first value");
        int nextInt0 = scan0.nextInt();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Input operation");
        String operation = scan1.next();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Input second value");
        int nextInt2 = scan2.nextInt();

        int result = 0;
        char notResult = 'n';

        switch (operation) {
            case "+":
                result = nextInt0 + nextInt2;
                System.out.println(result);
                break;

            case "-":
                result = nextInt0 - nextInt2;
                System.out.println(result);
                break;

            case "*":
                result = nextInt0 * nextInt2;
                System.out.println(result);
                break;

            case "/":
                result = nextInt0 / nextInt2;
                System.out.println(result);
                break;

        }

    }
}
/*Задание 7
Используя IntelliJ IDEA, создайте класс Calculator.
Напишите программу - консольный калькулятор.
Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
Выведите на экран результат выполнения арифметической операции.
В случае использования операции деления, организуйте проверку попытки деления на ноль.
И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
пользователя.*/