package starter;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Задание 7
        //Используя IntelliJ IDEA, создайте класс starter.Calculator.
        //Напишите программу - консольный калькулятор.
        //Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
        //Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
        //Выведите на экран результат выполнения арифметической операции.
        //В случае использования операции деления, организуйте проверку попытки деления на ноль.
        //И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
        //пользователя.
        int result = 0;
        char noResult = 'n';
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number");
        int intVar1 = scan.nextInt();
        System.out.println("Input second number");
        int intVar2 = scan.nextInt();
        System.out.println("Input operation sign");
        String charSign = scan.next();
        switch (charSign) {
            case "+":
                result = intVar1 + intVar2;
                break;
            case "-":
                result = intVar1 - intVar2;
                break;
            case "*":
                result = intVar1 * intVar2;
                break;
            case "/":
                if (intVar2 == 0) {
                    noResult = 'y';
                } else {
                    result = intVar1 / intVar2;
                }
                break;
            default:
                noResult = 'c';
        }
        if (noResult == 'n') {
            System.out.println("Result of operation: " + result);
        } else {
            if (noResult == 'y') {
                System.out.println("Error: divide by zero!");
            } else {
                System.out.println("Error: operation sign not recognized!");
            }
        }
    }
}
