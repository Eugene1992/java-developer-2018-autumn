package starter;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        //Используя IntelliJ IDEA, создайте класс starter.Interval.
        //Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
        //промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
        //Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
        //выводится соответствующее сообщение.
        Scanner scan = new Scanner(System.in);
        System.out.println("Input any number from 0 to 100");
        int number = scan.nextInt();
        if (number < 0 || number > 100) {
            System.out.println("Number is out of specified interval!");
        } else {
            if (number < 14) {
                System.out.println("Number is in interval from 0 to 14");
            } else {
                if (number < 35) {
                    System.out.println("Number is in interval from 15 to 35");
                } else {
                    if (number < 50) {
                        System.out.println("Number is in interval from 36 to 50");
                    } else {
                        if (number <= 100) {
                            System.out.println("Number is in interval from 50 to 100");
                        }

                    }

                }
            }
        }
    }
}
