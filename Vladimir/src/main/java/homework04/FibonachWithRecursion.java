package homework04;

import java.util.Scanner;

public class FibonachWithRecursion {
    static int fibonnachi(int yourAmountFibonnachi) {
        if (yourAmountFibonnachi == 1) {
            return 0;
        }
        if (yourAmountFibonnachi == 2) {
            return 1;
        }
        return fibonnachi(yourAmountFibonnachi - 2) + fibonnachi(yourAmountFibonnachi - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of Fibonnachi elements: ");
        int yourAmountFibonnachi = scan.nextInt();
        System.out.println(yourAmountFibonnachi + " Fibonnachi element: " + fibonnachi(yourAmountFibonnachi));
    }
}
