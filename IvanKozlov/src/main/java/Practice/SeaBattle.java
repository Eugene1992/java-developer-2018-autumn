package Practice;

import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] myField = new String[4][4];
        String[][] computerField = new String[4][4];

        int randomCoordinates = (int) (Math.random() * 4);

        final String missed = "0";
        final String killed = "X";
        final String shipLocation = "+";
        final String emptyLocation = "-";

        String putYourShipXCoordinateMessage = "Enter your ship X coordinate in range from 0 to 4";
        String putYourShipYCoordinateMessage = "Enter your ship Y coordinate in range from 0 to 4";
        String shotXCoordinateMessage = "Enter your shot Y coordinate in range from 0 to 4";
        String shotYCoordinateMessage = "Enter your shot Y coordinate in range from 0 to 4";
        String playerMissedMessage = "You missed";
        String computerMissedMessage = "Computer missed";
        String playerKilledMessage = "Nice shot";
        String computerKilledMessage = "Computer made nice shot";
        String alreadyShotHereMessage = "You've already shot here, try another location";

        boolean playerWon = false;
        boolean computerWon = false;
        boolean gameIsOver = (playerWon || computerWon);

//        fill both field with empty places

        for (int i = 0; i < myField.length; i++) {
            for (int j = 0; j < myField[i].length; j++) {
                myField[i][j] = emptyLocation;
            }
        }

        for (int i = 0; i < computerField.length; i++) {
            for (int j = 0; j < computerField[i].length; j++) {
                computerField[i][j] = emptyLocation;
            }
        }

//       put 4 ships on computer field

        for (int i = 0; i < 4; i++) {
            String chosenShipLocation = computerField[randomCoordinates][randomCoordinates];
            if (chosenShipLocation.equals(emptyLocation)) {
                computerField[randomCoordinates][randomCoordinates] = shipLocation;
            }
        }

//        put 4 ships on players field

        for (int i = 0; i < 4; i++) {
            System.out.println(putYourShipXCoordinateMessage);
            int shipXCoordinate = scan.nextInt();

            if (shipXCoordinate >= 0 && shipXCoordinate <= 3) {
                System.out.println(putYourShipYCoordinateMessage);
                int shipYCoordinate = scan.nextInt();

                if (shipYCoordinate >= 0 && shipYCoordinate <= 3) {
                    myField[shipXCoordinate][shipYCoordinate] = shipLocation;
                }
            }
        }

//        game

        while (!gameIsOver) {
            System.out.println(shotXCoordinateMessage);
            int shotXCoordinate = scan.nextInt();

            if (shotXCoordinate >= 0 && shotXCoordinate <= 3) {
                System.out.println(shotYCoordinateMessage);
                int shotYCoordinate = scan.nextInt();

                if (shotYCoordinate >= 0 && shotYCoordinate <= 3) {

                    String playerShotCoordinate = computerField[shotXCoordinate][shotYCoordinate];

                    switch (playerShotCoordinate) {

                        case shipLocation:
                            computerField[shotXCoordinate][shotYCoordinate] = killed;
                            System.out.println(playerKilledMessage);

                            for (int i = 0; i < 4; i++) {
                                for (int j = 0; j < 4; j++) {

                                }
                            }
                            break;

                        case emptyLocation:
                            computerField[shotXCoordinate][shotYCoordinate] = missed;
                            System.out.println(playerMissedMessage);
                            break;

                        case missed:
                            computerField[shotXCoordinate][shotYCoordinate] = missed;
                            System.out.println(playerMissedMessage);
                            break;

                        case killed:
                            computerField[shotXCoordinate][shotYCoordinate] = missed;
                            System.out.println(playerMissedMessage);
                            break;

                        default:
                            System.out.println("Something went wrong :)");
                    }

                    String computerShotCoordinate = computerField[randomCoordinates][randomCoordinates];

                    switch (computerShotCoordinate) {
                        case shipLocation:
                            computerField[shotXCoordinate][shotYCoordinate] = killed;
                            System.out.println(computerKilledMessage);

                            for (int i = 0; i < 4; i++) {
                                for (int j = 0; j < 4; j++) {

                                }
                            }
                            break;

                        case emptyLocation:
                            computerField[shotXCoordinate][shotYCoordinate] = missed;
                            System.out.println(computerMissedMessage);
                            break;

                        case missed:
                            computerField[shotXCoordinate][shotYCoordinate] = missed;
                            System.out.println(computerMissedMessage);
                            break;

                        case killed:
                            computerField[shotXCoordinate][shotYCoordinate] = missed;
                            System.out.println(computerMissedMessage);
                            break;

                        default:
                            System.out.println("Something went wrong :)");
                    }
                }
            }
        }


    }
}
