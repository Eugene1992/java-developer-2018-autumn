package javaStarter;

import java.util.Random;
import java.util.Scanner;

public class GameRandom {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int randomNumber = random.nextInt(10);
        int count = 0;
        int userNumber = 0;
        String word = "Y";

        System.out.println("Hello! This is Game. You should guess a number.");
        System.out.println("Good luck!");

        while (randomNumber == 0) {
            if (randomNumber == 0) {
                randomNumber = random.nextInt();
            }
        }

        while ((userNumber != randomNumber) && (word.equals("Y"))) {
            System.out.print("The number is enigmatic. In your opinion this number is ");
            userNumber = scan.nextInt();
            count++;

            if (userNumber == randomNumber) {
                System.out.println("You win! You guessed with " + count + " attempts");
            } else {
                System.out.println("No :(");
                System.out.println("Try again? Y/N");
                word = scan.next();

                while (!word.equals("N") && !word.equals("Y")) {
                    if (!word.equals("N") && !word.equals("Y")) {
                        System.out.println("Incorrect command. Please write 'Y' - Yes or 'N' - No");
                        word = scan.next();
                    }
                }
            }
        }
        if (word.equals("N")) {
            System.out.println("You lose");
        }
    }
}
