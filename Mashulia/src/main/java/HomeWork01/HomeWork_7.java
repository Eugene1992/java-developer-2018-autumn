package HomeWork01;

import java.util.Scanner;

public class HomeWork_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 number:");
        double a = scan.nextDouble();
        System.out.println("Enter 2 number:");
        double b = scan.nextDouble();

        System.out.println("Please enter some operation: ");
        String action = scan.next();

        double result = 0;
        boolean noRes = true;

        switch (action) {
            case "-":
                result = a - b;
                break;
            case "+":
                result = a + b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    noRes = false;
                    break;
                } else {
                    result = a / b;
                }
                break;
            default:
                System.out.println("Error: wrong operation");
        }
        if (noRes) {
            System.out.println(result);
        } else {
            System.out.println("Error: divide by zero");
        }
    }
}

//Задание 7
//Используя IntelliJ IDEA, создайте класс Calculator.
//Напишите программу - консольный калькулятор.
//Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
//Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
//Выведите на экран результат выполнения арифметической операции.
//В случае использования операции деления, организуйте проверку попытки деления на ноль.
//И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
//пользователя.
