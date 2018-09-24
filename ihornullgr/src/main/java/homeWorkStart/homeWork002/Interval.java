package homeWorkStart.homeWork002;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввод");
        int nextInt = scan.nextInt();

        if (nextInt >= 0 && nextInt <= 14) {
            System.out.println("0 - 14");
        } else if (nextInt >= 15 && nextInt <= 35) {
            System.out.println("15 - 35");
        } else if (nextInt >= 36 && nextInt <= 50) {
            System.out.println("36 - 50");
        }else if (nextInt >= 51 && nextInt <= 100) {
            System.out.println("51 - 100");
        } else
            System.out.print("Такого блока нет");
    }
}
