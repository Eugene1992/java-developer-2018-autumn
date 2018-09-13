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

        Scanner scan0 = new Scanner(System.in);
        System.out.println("Input value");
        int inpu0 = scan0.nextInt();
        int b, c;
        while (inpu0 != 0) {
            b = inpu0 / 2;
            c = inpu0 % 2;
            System.out.print(c);
            inpu0 = inpu0 / 2;
        }


        Scanner scan3 = new Scanner(System.in);
        System.out.println("8 value");
        int num1 = scan3.nextInt();
        String st1 = "";
        while (num1 != 0) {
            int d1 = num1 % 8;
            st1 = d1 + st1;
            num1 = num1 / 8;

        }System.out.println(st1);


        Scanner scan2 = new Scanner(System.in);
        System.out.println("Input value 2");
        int num = scan2.nextInt();
        String st = "";

        while (num != 0) {
            int d = num % 16;
            if (d < 10) {
                st = d + st;
            } else {
                switch (d) {
                    case 10:
                        st = "A" + st;
                        break;
                    case 11:
                        st = "B" + st;
                        break;
                    case 12:
                        st = "C" + st;
                        break;
                    case 13:
                        st = "D" + st;
                        break;
                    case 14:
                        st = "E" + st;
                        break;
                    case 15:
                        st = "F" + st;
                        break;

                }
            }
            num = num / 16;
        }
        System.out.println("Hex " + st);

    }
}
