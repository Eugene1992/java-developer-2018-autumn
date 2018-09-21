package java_starter.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int fibOne = 1, fibTwo = 1;
        System.out.println(fibonacci(n, fibOne, fibTwo) + " :  Ответ при n = " + n);
    }

    static long fibonacci(int n, long fibOne, long fibTwo) {

        if (n == 1) {
            return fibTwo;
        } else {
            fibOne += fibTwo;
            fibTwo = fibOne - fibTwo;
        }
        return fibonacci(--n, fibOne, fibTwo);
    }
}
