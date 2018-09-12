import java.util.Scanner;

public class Interval {
    /*Задание 8
    Используя IntelliJ IDEA, создайте класс Interval.
    Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
    промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
    Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
    выводится соответствующее сообщение.*/

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Num");
            double a = scan.nextDouble();

            if ((a < 0) & (a > 100)) System.out.println("Any Interval");
            else if ((a <= 14) & (a >= 0)) System.out.println("in [0 - 14]");
            else if ((a <= 15) & (a >= 35)) System.out.println("in [15 - 35]");
            else if ((a < 50) & (a >= 36)) System.out.println("in [36; 50]");
            else System.out.println("[50; 100]");
        }

}
