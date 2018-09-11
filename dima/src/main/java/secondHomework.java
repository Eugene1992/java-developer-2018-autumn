// Задание №2 //
 import java.util.Scanner;
public class secondHomework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int Number = scan.nextInt();
        if ((Number % 2) == 0) {
            System.out.println("Число четное");
        } else System.out.println("Число не четное");
    }
}
