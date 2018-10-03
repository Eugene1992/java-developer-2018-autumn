package java_starter.homework02;

import java.util.Scanner;

public class TaskFrom7To8 {
    public static void main(String[] args) {
//        7. Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.
        Scanner sc7 = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc7.nextInt();
        long factorial = 1L;
        if (n == 0) {
            System.out.println("Factorial of your number - 1");
        } else if (n == 1) {
            System.out.println("Factorial of your number - 1");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of your number - " + factorial);
        }

//        8. Выведите на экран все положительные делители натурального числа, введенного пользователем.
        Scanner sc8 = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int naturalNumber = sc8.nextInt();
        String posDevider = "";
        int checkDevider;
        for (int i = naturalNumber; i > 0; i--) {
            checkDevider = naturalNumber % i;
            if (checkDevider == 0) {
                posDevider = posDevider + i + " ";
            }
        }
        System.out.println(posDevider);
    }
}
