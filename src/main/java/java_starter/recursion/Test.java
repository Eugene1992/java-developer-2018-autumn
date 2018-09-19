package java_starter.recursion;

public class Test {
    public static void main(String[] args) {
        System.out.println(factorial(6));
        short s = 6;
        System.out.println(factorial(s));
    }

    static int factorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    static int factorial(short num) {
        if (num == 1) {
            return num;
        }

        return num * factorial(--num);
    }
}
