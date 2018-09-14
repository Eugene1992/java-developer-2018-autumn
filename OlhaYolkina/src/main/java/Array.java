import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Scanner scan = new Scanner(System.in);

        System.out.println("Please write array");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scan.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}
