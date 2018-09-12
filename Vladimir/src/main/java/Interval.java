import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
/*  Задание 8
    Используя IntelliJ IDEA, создайте класс Interval.
    Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
    промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
    Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
    выводится соответствующее сообщение.*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = scan.nextInt();
        if (0 <= number && number <= 14) {
            System.out.println("Your number is in interval - [0 - 14]");
        }
        if (15 <= number && number <= 35) {
            System.out.println("Your number is in interval - [15 - 35]");
        }
        if (36 <= number && number <= 50) {
            System.out.println("Your number is in interval - [36 - 50]");
        }
        if (51 <= number && number <= 100) {
            System.out.println("Your number is in interval - [51 - 100]");
        }
        if (number < 0) {
            System.out.println("Your number is less than 0");
        }
        if (number > 100) {
            System.out.println("Your number is bigger than 100");
        }
    }
}
