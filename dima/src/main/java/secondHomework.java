import java.util.Scanner;

public class secondHomework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Задание №2 //
        System.out.println("Введите число");
        int Number = scan.nextInt();
        if ((Number % 2) == 0) {
            System.out.println("Число четное");
        } else System.out.println("Число не четное");
        System.out.println("Введите число №1");
        int firstNumber = scan.nextInt();
        System.out.println("Введите число №2");
        int secondNumber = scan.nextInt();
        if ((firstNumber - 10) * (firstNumber - 10) < (secondNumber - 10) * (secondNumber - 10)) {
            System.out.println("Ближайшее к десяти число " + firstNumber);
        } else
            System.out.println("Ближайшее к десяти число " + secondNumber);
        System.out.println("Введите число 1");
        int q = scan.nextInt();
        System.out.println("Введите число 2");
        int w = scan.nextInt();
        System.out.println("Введите число 3");
        int e = scan.nextInt();
        if ((q * q) - (w * w) - (e * e) > 0) {
            System.out.println(" Наибольшее число " + q);
        }
        if ((w * w) - (q * q) - (e * e) > 0) {
            System.out.println(" Наибольшее число " + w);
        }
        if ((e * e) - (q * q) - (w * w) > 0) {
            System.out.println(" Наибольшее число " + e);
        }
        System.out.println("Введите число 1");
        int z = scan.nextInt();
        System.out.println("Введите число 2");
        int x = scan.nextInt();
        System.out.println("Введите число 3");
        int c = scan.nextInt();
        System.out.println("Введите число 4");
        int v = scan.nextInt();
        if ((z * z) - (x * x) - (c * c) < (v * v)) {
        System.out.println("Второе по величине число = " + z);}

        if ((x * x) - (z * z) - (c * c) < (v * v)) {
        System.out.println("Второе по величине число = " + x);}

        if ((c * c) - (x * x) - (z * z) < (v * v)) {
        System.out.println("Второе по величине число = " + 1);}


    }
}
