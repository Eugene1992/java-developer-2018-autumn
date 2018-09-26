package java_starter_package;

import java.util.Scanner;

public class HomeWork02_Game {
    public static void main(String[] args) {
        int limit1 = 1;
        int limit2 = 10;
        int random = limit1 + (int) (Math.random() * limit2);
        int countTry = 1;
        int userNumber = 0;
        Scanner scan = new Scanner(System.in);
        //*System.out.println(random);
        System.out.println("Задача угадать число от  " + limit1 + " до " + limit2);
        while (userNumber != random) {
            System.out.println("Ведите число (для выхода введите 0): ");
            userNumber = scan.nextInt();
            if (userNumber == 0) {
                System.out.println("Жаль что вы вышли");
                break;
            } else if (userNumber != random) {
                countTry++;
                System.out.println("Вы не угадали, попробуйте еще раз!");
            } else {
                System.out.println("Вы угадали! Количество попыток " + countTry);
            }
        }
    }
}

