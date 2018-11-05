package homeworks.javaEssential.homework01.SeaBattleOOP;

import java.util.Scanner;

public class Utils {

    static String setCoordinateString = "Set your coordinate for ";
    static String[] xyArray = {" in x", "in y"};
    static String shipPlacementString = "ship placement";
    static String shotString = "makeSingleShotArray";

    static String notInRangeNumberMessage = "You number should be in range from 0 to 3 including";

    protected static void printSetShipOrShotLocationMessage(String shipOrShot, String xOryString) {
        writeMessage(setCoordinateString + shipOrShot + xOryString);
    }

    protected static void printNotInRangeMessage() {
        writeMessage(notInRangeNumberMessage);
    }

    String youMissedMessage = "You missed";
    String youHitMessage = "You hit";

    public static int getRandomNumberUpTo(int maxPossibleNumber) {
        return (int)(Math.random() * maxPossibleNumber);
    }

    protected static int scanUserInput() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    private static void writeMessage(String message) {
        System.out.println(message);
    }

}
