package HomeWork01;

import java.util.Scanner;

public class HomeWork_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number from 0 to 100:");
        int a = scan.nextInt();

        if (a < 0 || a > 100){
            System.out.println("Eror");
        } else if (a < 15){
            System.out.println("The number is in the range [0 - 14]");
        } else if ( a < 36){
            System.out.println("The number is in the range [15 - 35]");
        } else if (a < 51){
            System.out.println("The number is in the range [36 - 50]");
        } else if (a <= 100){
            System.out.println("The number is in the range [51- 100]");
        }
    }
}

//Задание 8
//Используя IntelliJ IDEA, создайте класс homework01.IntervalError.
//Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
//промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
//Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
//выводится соответствующее сообщение.
