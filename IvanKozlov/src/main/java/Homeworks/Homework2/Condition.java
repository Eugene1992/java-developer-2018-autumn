package Homeworks.Homework2;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

//        Задание 2
//        Создать программу, проверяющую и сообщающую на экран, является ли введенное с
//        консоли целое число, чётным либо нечётным.

        Scanner scan = new Scanner(System.in);

        String numberIsMessage = "The number is ";
        String enterAnyNumberMessage = "Enter any number";

        System.out.println(enterAnyNumberMessage);
        int inputNumber = scan.nextInt();

        System.out.println(numberIsMessage + checkNumber(inputNumber));

//        Задание 3
//        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
//        Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.

        String isCloserToTenMessage = " is closer to 10";

        System.out.println(enterAnyNumberMessage);
        double firstNumber = scan.nextDouble();

        System.out.println(enterAnyNumberMessage);
        double secondNumber = scan.nextDouble();

        if (Math.abs(10 - firstNumber) < Math.abs(10 - secondNumber)) {
            System.out.println(firstNumber + isCloserToTenMessage);
        } else {
            System.out.println(secondNumber + isCloserToTenMessage);
        }

//        Задание 4
//        Задано три переменных, найти и вывести на экран переменную с максимальным значением
//        (значения всех переменных разные).

        System.out.println(enterAnyNumberMessage);
        double firstInputNumber = scan.nextDouble();

        System.out.println(enterAnyNumberMessage);
        double secondInputNumber = scan.nextDouble();

        System.out.println(enterAnyNumberMessage);
        double thirdInputNumber = scan.nextDouble();

        if (firstInputNumber > secondInputNumber) {
            if (firstInputNumber > thirdInputNumber) {
                System.out.println(firstInputNumber);
            } else {
                System.out.println(thirdInputNumber);
            }
        } else {
            if (secondInputNumber > thirdInputNumber) {
                System.out.println(secondInputNumber);
            } else {
                System.out.println(thirdInputNumber);
            }
        }

//        Задание 5
//        Задано четыре переменных, найти и вывести на экран вторую по величине.

        System.out.println(enterAnyNumberMessage);
        double inputNumberOne = scan.nextDouble();

        System.out.println(enterAnyNumberMessage);
        double inputNumberTwo = scan.nextDouble();

        System.out.println(enterAnyNumberMessage);
        double inputNumberThree = scan.nextDouble();

        System.out.println(enterAnyNumberMessage);
        double inputNumberFour = scan.nextDouble();

        double secondLargeNumber;

        double largerNumber0 = inputNumberOne;
        double largerNumber1 = inputNumberThree;
        double smallerNumber0 = inputNumberTwo;
        double smallerNumber1 = inputNumberFour;

        if (inputNumberOne < inputNumberTwo) {
            largerNumber0 = inputNumberTwo;
            smallerNumber0 = inputNumberOne;
        }

        if (inputNumberThree < inputNumberFour) {
            largerNumber1 = inputNumberFour;
            smallerNumber1 = inputNumberThree;
        }

        if (largerNumber0 > largerNumber1) {
            if(smallerNumber0 > largerNumber1) {
                secondLargeNumber = smallerNumber0;
            } else {
                secondLargeNumber = largerNumber1;
            }
        } else {
            if(smallerNumber1 > largerNumber0) {
                secondLargeNumber = smallerNumber1;
            } else {
                secondLargeNumber = largerNumber0;
            }
        }

        System.out.println(secondLargeNumber);

//        Задание 6
//        В три переменные a, b и c записаны три вещественных(дробных) числа. Создать программу, которая
//        будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
//                либо сообщать, что корней нет.

        System.out.println(enterAnyNumberMessage);
        double a = scan.nextDouble();

        System.out.println(enterAnyNumberMessage);
        double b = scan.nextDouble();

        System.out.println(enterAnyNumberMessage);
        double c = scan.nextDouble();

        double square = Math.sqrt(b*b - 4 * a * c);

        double x1 = (-b + square) / 2 * a;
        double x2 = (-b - square) / 2 * a;

//        Задание 7
//        Используя IntelliJ IDEA, создайте класс Calculator.
//        Напишите программу - консольный калькулятор.
//                Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
//        Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
//        Выведите на экран результат выполнения арифметической операции.
//                В случае использования операции деления, организуйте проверку попытки деления на ноль.
//                И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
//        пользователя.

        String theResultIsMessage = "The result is ";

        System.out.println(enterAnyNumberMessage);
        double firstOperand = scan.nextDouble();

        System.out.println("Fill any math operator");
        String operator = scan.next();

        System.out.println(enterAnyNumberMessage);
        double secondOperand = scan.nextDouble();

        switch (operator) {
            case "+" :
                System.out.println(theResultIsMessage + (firstOperand + secondOperand));
                break;
            case "-" :
                System.out.println(theResultIsMessage + (firstOperand - secondOperand));
                break;
            case "*" :
                System.out.println(theResultIsMessage + (firstOperand * secondOperand));
                break;
            case "/" :
                System.out.println(theResultIsMessage + (firstOperand / secondOperand));
                break;
            default :
                System.out.println("The entered symbol is not math operand.");
        }

//                Задание 8
//        Используя IntelliJ IDEA, создайте класс Interval.
//        Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
//        промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
//                Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
//        выводится соответствующее сообщение.

        String theNumberIsInRangeMessage = "The number is in range ";
        String rangeFrom0To14 = "[0 - 14]";
        String rangeFrom15To35 = "[15 - 35]";
        String rangeFrom36To50 = "[36 - 50]";
        String rangeFrom51To100 = "[51 - 100]";

        System.out.println(enterAnyNumberMessage);
        double number = scan.nextDouble();

        if (number >= 0 && number <= 100) {
            if (number >= 0 && number <= 14) {
                System.out.println(theNumberIsInRangeMessage + rangeFrom0To14);
            } else if (number >= 15 && number <= 35) {
                System.out.println(theNumberIsInRangeMessage + rangeFrom15To35);
            } else if (number >= 36 && number <= 50) {
                System.out.println(theNumberIsInRangeMessage + rangeFrom36To50);
            } else {
                System.out.println(theNumberIsInRangeMessage + rangeFrom51To100);
            }
        } else {
            System.out.println("Your number is out of ranges between 0 and 100.");
        }
    }

    static String checkNumber(int number) {
        if (number % 2 == 0) {
            return "odd";
        }
        return "even";
    }


}
