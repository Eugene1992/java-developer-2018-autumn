package homeWork;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan0 = new Scanner(System.in);
        System.out.println("Введите первое значение");
        int nextInt0 = scan0.nextInt();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите операцию");
        String operation = scan1.next();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите второе значение");
        int nextInt2 = scan2.nextInt();

        int result = 0;
        char notResult = 'y';

        switch (operation) {
            case "+":
                result = nextInt0 + nextInt2;
                break;

            case "-":
                result = nextInt0 - nextInt2;
                break;

            case "*":
                result = nextInt0 * nextInt2;
                break;

            case "/":
                if (nextInt2 == 0){
                    notResult = 'k';
                } else {
                    result = nextInt0 / nextInt2;
                }
                break;
        }
        if (notResult == 'y') {
            System.out.println(">>> " + result);
        }
        if (notResult == 'k') {
            System.out.println("На ноль делить нельзя!");
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