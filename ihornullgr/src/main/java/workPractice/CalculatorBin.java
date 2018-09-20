package workPractice;

public class CalculatorBin {
    public static void main(String[] args) {
        int a = 77;

        int a1 = a / 2;
        int b1 = a % 2;

        int a2 = a1 / 2;
        int b2 = a1 % 2;

        int a3 = a2 / 2;
        int b3 = a2 % 2;

        int a4 = a3 / 2;
        int b4 = a3 % 2;

        int a5 = a4 / 2;
        int b5 = a4 % 2;

        int a6 = a5 / 2;
        int b6 = a5 % 2;

        int a7 = a6 / 2;
        int b7 = a6 % 2;

        System.out.println(a + " = " + b7 + b6 + b5 + b4 + b3 + b2 + b1);
    }
}
