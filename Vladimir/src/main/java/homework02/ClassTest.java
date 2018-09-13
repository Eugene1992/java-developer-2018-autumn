package homework02;

import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean congratilation = false;
        int num = 1;
        while (congratilation == false) {
            int x = (int) (Math.random() * 10);
            System.out.println("It's your " + num + " attempt");
            System.out.print("Enter your number: ");
            int yourNumber = sc.nextInt();
            if (yourNumber == x) {
                System.out.println("Congratulation!!! You are GREAT!!! ");
                congratilation = true;
            } else {
                System.out.println("You did not guess");
                System.out.println("Number was: " + x);
                System.out.println("If you don't want to play another one - enter 'n'. If you want to continue - enter 'y'");
                String choice = sc.next();
                switch (choice) {
                    case "n":
                        System.out.println("You are LOOSER");
                        congratilation = true;
                        break;
                    case "y":
                        System.out.println("Ok. Try again");
                        num++;
                        break;
                    default:
                        System.out.println("Error! You must have to play another one!!!");
                        num++;
                }
            }
        }
    }
}
