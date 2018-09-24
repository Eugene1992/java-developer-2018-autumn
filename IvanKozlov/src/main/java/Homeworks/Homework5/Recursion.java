package Homeworks.Homework5;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(getFibonacciByNumber(5));
    }

    static int getFibonacciByNumber(int number) {
        if(number == 0) {
            return 0;
        } else if(number == 1) {
            return 1;
        }
        return getFibonacciByNumber(number - 1) + (getFibonacciByNumber(number - 2));
    }
}
