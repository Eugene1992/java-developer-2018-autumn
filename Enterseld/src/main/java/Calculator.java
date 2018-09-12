import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First Num");
        double a = scan.nextDouble();
        System.out.println("Num 2 ");
        double b = scan.nextDouble();
        System.out.println("Operation");
        String operation = scan.next();
        char Operation = operation.toCharArray()[0];

        switch (Operation) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0) System.out.println("Error");
                else System.out.println(a / b);
                break;
            case '%':
                if (b == 0) System.out.println("Error");
                else System.out.println(a % b);
                break;

        }
    }
}