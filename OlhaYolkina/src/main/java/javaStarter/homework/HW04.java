package javaStarter.homework;

import java.util.Random;

/**
 * 2. Переписать задачу по нахождению чисел Фибоначчи с помощью рекурссии.
 */
public class HW04 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(50);
        long fibonacci1 = 1, fibonacci2 = 1;
        System.out.println("Fibonacci[" + n + "] = " + recursion(n, fibonacci1, fibonacci2));
    }

    static long recursion(int n, long fibonacci1, long fibonacci2) {
        if (n == 1) {
            return fibonacci2;
        } else {
            fibonacci1 += fibonacci2;
            fibonacci2 = fibonacci1 - fibonacci2;
        }
        return recursion(--n, fibonacci1, fibonacci2);
    }
}
