package workPracticeStart;

import java.util.Random;
import java.util.Scanner;

public class GameInClassRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int compNum = rand.nextInt(10); //указываем переменной на 10
        System.out.println(compNum); //показать число компьютера
        int counter = 0;
        while (true) {
            System.out.println("Введите число от 1 до 10 (для выхода нажмите 0)");
            int yourNum = scan.nextInt();
            if (yourNum == 0) {
                System.out.println("Зря ты выходишь засранец!");
                break;
            }
            counter++;
            if (yourNum == compNum) {
                System.out.println("Поздравляю Вы угадали число!");
                break;
            } else {
                System.out.println("Попробуйте еще раз!");
            }
        }
    }
}
