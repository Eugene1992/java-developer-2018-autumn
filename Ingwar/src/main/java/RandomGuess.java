import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        int lowLimit = 1;
        int highLimit = 10;
        int random = lowLimit+(int)(Math.random()*highLimit);
        int countTry = 0;
        int userTry = 0;
        Scanner scan = new Scanner(System.in);
        while (userTry!=random) {
            System.out.println("Input your number between " + lowLimit + " and " + highLimit);
            System.out.println("or 0 for exit");
            countTry++;
            userTry = scan.nextInt();
            if (userTry == 0) {
                userTry = random;
                System.out.println("The game is lost, weakling!");
            } else {if (userTry != random) {
                System.out.println("Wrong number, try another.");
            } else {if (userTry == random) {
                System.out.println("You win! The number is " + random);
            }
            }
            }
        }
        System.out.println("Your number of tries is "+countTry);
    }
}
