package workPractice;

import java.util.Scanner;

public class Algor2 {
    public static void main(String[] args) {

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
