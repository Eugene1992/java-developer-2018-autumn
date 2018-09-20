package homeWork.homeWork004;

import java.util.Scanner;

//2. Переписать задачу по нахождению чисел Фибоначчи с помощью рекурссии.

public class RecursionFibon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(fibonacci(n));

    }

    static int fibonacci(int n) {
        if ((n == 1) || (n == 2)) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}







