package workPractice;

import java.util.Scanner;

public class CalcBinLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input value");
        int input = scan.nextInt();
        int c;

        while (input > 0) {
            c = input % 2;
            System.out.print(c);
            input = input / 2;
        }
    }
}
