package java_starter;

import java.util.Scanner;

public class ThirdHomework {
    public static void main(String[] args) {
        // Задание №1//
        int firstNumber = 1000;
        System.out.println(" Первое число " + firstNumber);
        while (firstNumber < 10000) {
            System.out.println(+firstNumber);
            firstNumber += 3;
        }
        // Задание №2//
        int secondNumber = 1000;
        System.out.println(" Первое число " + secondNumber);
        while (secondNumber < (1000 + 2 * (56 - 1))) {
            System.out.println(+secondNumber);
            secondNumber += 2;
        }
        // Задание №3//
        int thirdNumber = 90;
        System.out.println(" Первое число " + thirdNumber);
        while (thirdNumber >= 0) {
            System.out.println(+thirdNumber);
            thirdNumber -= 5;
        }
        // Задание №4//
        int fourthNumber = 2;
        int b = 2;
        int stepenOne = 20;
        System.out.println(" Первое число " + fourthNumber);
        while (fourthNumber < (2 * (Math.pow(b, stepenOne)))) {
            System.out.println(+fourthNumber);
            fourthNumber *= 2;
        }
        // Задание №5//
        int fifthNumber = 0;
        int sixNumber;
        int sevensNumber = 1;
        System.out.println(fifthNumber);
        System.out.println(sevensNumber);
        for (int count = 1; count < 19; count++) {
            sixNumber = sevensNumber;
            sevensNumber = fifthNumber + sixNumber;
            fifthNumber = sixNumber;
            System.out.println(sevensNumber);
        }

        // Задание №7//
        int eigthNumber = 15;
        int ninthNumber = 1;
        System.out.println(" Число " + eigthNumber);
        for (int count = 1; count <= eigthNumber; count++) {
            ninthNumber = ninthNumber * count;
        }
        System.out.println(eigthNumber + "! = " + ninthNumber);

        // Задание №8//
        int tenthNumber = 57;
        System.out.println(" Число " + tenthNumber);
        if (tenthNumber <= 0) {
            System.out.println("Необходимо число > 0");
        } else {
            System.out.println(" Делители числа 57 : ");
            for (int count = 1; count <= tenthNumber; count++) {
                if (tenthNumber % count == 0) {
                    System.out.println(count);
                }
            }
        }


    }
}
