package homework01;

import java.util.Scanner;

public class SeptemberCalculator {
    public static void main(String[] args) {
/*      Задание 7
        Используя IntelliJ IDEA, создайте класс Calculator.
        Напишите программу - консольный калькулятор.
        Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
        Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
        Выведите на экран результат выполнения арифметической операции.
        В случае использования операции деления, организуйте проверку попытки деления на ноль.
        И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
        пользователя.*/
        double result = 0;
        boolean noRes = true;
        Scanner scanCalc = new Scanner(System.in);
        System.out.println("Please enter two variables: ");
        double first = scanCalc.nextDouble();
        double second = scanCalc.nextDouble();
        System.out.println("Please enter some operation: ");
        String action = scanCalc.next();
        switch (action) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second == 0) {
                    noRes = false;
                    break;
                } else {
                    result = first / second;
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
