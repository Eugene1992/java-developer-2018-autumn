package homeWork;

import java.util.Scanner;

public class NumberSystems {
    public static void main(String[] args) {
//6. Написать программу, которая реализует следующий функционал:
//  6.1 Пользователь вводит число в 10-ой системе счисления.
//  6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
//      1) в 2-ую
//      2) в 8-ую
//      3) в 16-ую
//  6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
//  на экран результат.

        Scanner scan = new Scanner(System.in);
        System.out.println("Input value");
        int input = scan.nextInt();
        int b, c;

        while (input > 0) {
            b = input / 2;
            c = input % 2;
            System.out.print(c);
            input = input / 2;
        }

    }
}
