package java_starter;//Задание №8//

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write a number");
        double a = scan.nextDouble();
        if ((a < 0) | (a > 100)) System.out.println(a + " Не входит в заданый интервал [0; 100]");
        else if (a < 15) System.out.println(a + " Число на интервале [0; 14]");
        else if (a < 36) System.out.println(a + " Число на интервале [15; 35]");
        else if (a < 51) System.out.println(a + "  Число на интервале [35; 50]");
        else System.out.println(a + " Число на интервале [51; 100]");
    }
}
