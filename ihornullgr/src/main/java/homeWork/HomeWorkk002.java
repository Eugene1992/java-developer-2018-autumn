package homeWork;

import java.util.Scanner;

public class HomeWorkk002 {
    public static void main(String[] args) {
//1. Создайте программу, выводящую на экран все четырёхзначные числа
// последовательности 1000 1003 1006 1009 1012 1015 ….
        for (int hw1 = 1000; hw1 < 1016; hw1 += 3) {
            System.out.println(hw1);
        }
//2. Создайте программу, выводящую на экран первые 55 элементов
// последовательности 1 3 5 7 9 11 13 15 17 ….
        for (int hw2 = 1; hw2 < 18; hw2 += 2) {
            System.out.println(hw2);
        }
//3. Создайте программу, выводящую на экран все неотрицательные элементы
// последовательности 90 85 80 75 70 65 60 ….
        for (int hw3 = 90; hw3 > 55; hw3 -= 5) {
            System.out.println(hw3);
        }
//4. Создайте программу, выводящую на экран первые 20 элементов
// последовательности 2 4 8 16 32 64 128 ….
        for (int hw4 = 2; hw4 < 129; hw4 *= 2) {
            System.out.println(hw4);
        }
//5. Выведите на экран первые 20 членов последовательности Фибоначчи.
        int a = 1;
        int b = 1;
        int c = 0;
        for (int hw5 = 0; hw5 < 20; hw5++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

//7. Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.
        int y = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input value");
        int input = scan.nextInt();
        for (int i = 1; i <= input; i++) {
            y = y * i;
        }
        System.out.print(input + "!= ");
        System.out.println(y);

//8. Выведите на экран все положительные делители натурального числа, введенного пользователем.

        int n;
        int count = 0;
        System.out.print("Input nature value - ");
        Scanner sr = new Scanner(System.in);
        n = sr.nextInt();
        System.out.print("Value " + n + " divided by - " );
        for(int i = 1; i <= n; i++){
            if ((n % i) == 0){
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("Number of dividers - " + count);
    }
}
