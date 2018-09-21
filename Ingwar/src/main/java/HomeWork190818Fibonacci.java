import java.util.Scanner;

public class HomeWork190818Fibonacci {
    public static void main(String[] args) {
        //последовательность Фибоначчи
        Scanner scan = new Scanner(System.in);
        int beginSequence = 0;
        int nextSequence = 1;
        System.out.println("Input lenght of Fibonacci sequence");
        int lenghtFibonacci = scan.nextInt();
        int sumFibonacci = calculateFibonacciNumbers(lenghtFibonacci - 2, beginSequence, nextSequence);
        System.out.println("Sum of Fibonacci sequence of " + lenghtFibonacci + " numbers is " + sumFibonacci);
    }

    static int calculateFibonacciNumbers(int number, int firstNumber, int secondNumber) {
        if (number == 0) {
            return firstNumber + secondNumber;
        }
        return calculateFibonacciNumbers(--number, firstNumber + secondNumber, firstNumber);
    }
}
