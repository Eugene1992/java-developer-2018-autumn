import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class secondHomework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Задание №2 //
        System.out.println("Введите число");
        float Number = scan.nextInt();
        if ((Number % 2) == 0) {
            System.out.println("Число четное");
        } else System.out.println("Число не четное");
        // Задание №3 //
        System.out.println("Введите число №1");
        float firstNumber = scan.nextInt();
        System.out.println("Введите число №2");
        int secondNumber = scan.nextInt();
        if ((firstNumber - 10) * (firstNumber - 10) < (secondNumber - 10) * (secondNumber - 10)) {
            System.out.println("Ближайшее к десяти число " + firstNumber);
        } else
            System.out.println("Ближайшее к десяти число " + secondNumber);
        // Задание №4 //
        System.out.println("Введите число 1");
        float q = scan.nextInt();
        System.out.println("Введите число 2");
        float w = scan.nextInt();
        System.out.println("Введите число 3");
        float e = scan.nextInt();
        if ((q * q) - (w * w) - (e * e) > 0) {
            System.out.println(" Наибольшее число " + q);
        }
        if ((w * w) - (q * q) - (e * e) > 0) {
            System.out.println(" Наибольшее число " + w);
        }
        if ((e * e) - (q * q) - (w * w) > 0) {
            System.out.println(" Наибольшее число " + e);
        }
        // Задание №5 //
        System.out.println("Введите число 1");
        float u = scan.nextFloat();
        System.out.println("Введите число 2");
        float o = scan.nextFloat();
        System.out.println("Введите число 3");
        float i = scan.nextFloat();
        System.out.println("Введите число 4");
        float p = scan.nextFloat();

        float j, k = 0;

        j = ((u >= o ? u : o) >= (i >= p ? i : p)) ? (u >= o ? u : o) : (i >= p ? i : p);

        if (u == j) {
            k = (o >= i) ? (o >= p ? o : p) : (i >= p ? i : p);
        } else if (o == j) {
            k = (u >= i) ? (u >= p ? u : p) : (i >= p ? i : p);
        } else if (i == j) {
            k = (u >= o
            ) ? (u >= p ? u : p) : (o >= p ? o : p);
        } else if (p == j) {
            k = (u >= o) ? (u >= i ? u : i) : (o >= i ? o : i);
        }
        System.out.println(" Второе по размеру число " + j);
        // Задание №6 //
        System.out.println("Введите первый коефициент");
        double k1 = scan.nextDouble();
        System.out.println("Введите второй коефициент");
        double l = scan.nextDouble();
        System.out.println("Введите третий коефициент");
        double m = scan.nextDouble();
        double m1, m2;
        if (k1 == 0) System.out.println("x = " + (-m / l));
        else if ((l * l - 4 * k1 * m) >= 0) {
            m1 = (-l + sqrt(l * l - 4 * k1 * m)) / (2 * k1);
            m2 = (-l - sqrt(l * l - 4 * k1 * m)) / (2 * k1);
            System.out.println("x1 = " + m1 + "; x2 = " + m2);
        } else System.out.println("Уравнение не имеет действительных корней");



    }
}
