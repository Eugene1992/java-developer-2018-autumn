package HomeWork02;

import java.util.Scanner;

public class HomeWork_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write number:");
        int num = scan.nextInt();

        int a = 1;
        for (int i = 1; i <= num; i++){
            a = a*i;
        }
        System.out.println(num + "!=" + a);
    }
}

//7. Создайте программу, вычисляющую факториал натурального числа n,
// введенного пользователем.