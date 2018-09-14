import java.util.Scanner;

public class HW3_Number7AndNumber8 {
    public static void main(String[] args) {
        // 7. Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number");
        int n = scan.nextInt();
        System.out.print(n);
        long fct = 1;
        while (n > 1) {
            fct *= n;
            n -= 1;
        }

        System.out.println(fct);

        System.out.println();
        //8. Выведите на экран все положительные делители натурального числа, введенного пользователем.
        System.out.println("Write number");
        int num = scan.nextInt();
        int divider = 1;
        String res = " Dividers are ";

        while (divider < num +1) {
            if (num % divider == 0) {
                res += divider + " ";
            }
            divider++;
        }

        System.out.println(num + res);


    }
}

