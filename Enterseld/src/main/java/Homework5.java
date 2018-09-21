import java.util.Random;

public class Homework5 {

    //2. Переписать задачу по нахождению чисел Фибоначчи с помощью рекурссии.

        public static void main(String[] args) {
            Random rNum = new Random();
            int num = rNum.nextInt(49);
            long fib1 = 1, fib2 = 1;
            System.out.println("Fibonacci num " + num + " = " + recurs(num, fib1, fib2));
        }
        static long recurs(int num, long fib1, long fib2) {
            if (num == 1) {
                return fib2;
            } else {
                fib1 += fib2;
                fib2 = fib1 - fib2;
            }
            return recurs(--num, fib1, fib2);
        }
    }
