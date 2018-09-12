import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class HomeWork2 {
    public static void main(String[] args) {
        /* № 2
        Создать программу, проверяющую и сообщающую на экран, является ли введенное с
        консоли целое число, чётным либо нечётным. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Num");
        int L1 = scan.nextInt();

        if (L1 % 2 == 0) {
            System.out.println(L1 + " - even");
        }
        else {
            System.out.println(L1 + " - odd");
        }
        /*№ 3
         Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.*/
        System.out.println("Num1 Num2");
        float k = scan.nextFloat();
        float m = scan.nextFloat();

        if (abs(k - 10) == abs(m - 10)) System.out.println(k + m);
        else if (abs(k - 10) > abs(m - 10)) System.out.println(m);
        else System.out.println(k);

        /* № 4
        Задано три переменных, найти и вывести на экран переменную с максимальным значением.*/
        System.out.println("Num1 Num2 Num3");
        float x = scan.nextFloat();
        float g = scan.nextFloat();
        float f = scan.nextFloat();

        if ((x > g) & (x > f)) System.out.println(x);
        else if ((g > x) & (g > f)) System.out.println(g);
        else System.out.println(f);
        /* № 5
        Задано четыре переменных, найти и вывести на экран вторую по величине.*/
        float p = scan.nextFloat();
        float d = scan.nextFloat();
        float t = scan.nextFloat();
        float v = scan.nextFloat();

        if (((p < d) & (p > t) & (p > v))) System.out.println(p);
        else if (((p > d) & (p < t) & (p > v))) System.out.println(p);
        else if (((p > d) & (p > t) & (p < v))) System.out.println(p);
        else if (((d < p ) & (d > t) & (d > v))) System.out.println(d);
        else if (((d > p ) & (d < t) & (d > v))) System.out.println(d);
        else if (((d > p ) & (d > t) & (d < v))) System.out.println(d);
        else if (((t < p ) & (t > d) & (t > v))) System.out.println(d);
        else if (((t > p ) & (t < d) & (t > v))) System.out.println(d);
        else if (((t > p ) & (t > d) & (t < v))) System.out.println(d);
        else System.out.println(v);
<<<<<<<HEAD
        /*Задание 6
        В три переменные a, b и c записаны три вещественных(дробных) числа. Создать программу, которая
        будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
        либо сообщать, что корней нет.*/
        System.out.println("a b c");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double x1, x2;
        double D1;
        if (k == 0) System.out.println(-c / b);

        else if (((b * b) - (4 * a * c)) >= 0) {
            D1 = (b * b) - (4 * a * c);
            x1 = (-b + sqrt(D1)) / (2 * a);
            x2 = (-b - sqrt(D1)) / (2 * a);
            System.out.println(x1 + "and" + x2);
        } else System.out.println("No roots");
=======
>>>>>>>origin / master
    }

}
