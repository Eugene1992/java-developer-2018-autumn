package java_essential.SeaBattle;

import java.util.Scanner;
import java.util.Random;

public class SeaBattle {
    public static void main(String[] args) {
        Player winner = game();

    }

    public static Player game() {
        Scanner scan = new Scanner(System.in);
        Player[] players = createPlayers(scan);
        Player winner = checkWinner(players);
        if (winner != null) {
            return winner;
        }
        createPlayerBoards(players, scan);
        placeFleets(players, scan);

        return winner;
    }

    private static void placeFleets(Player[] players, Scanner scan) {
    	System.out.println("Input fleet size");
    	int fleetSize = scan.nextInt();
		for (Player player : players) {
			if (player.getisPc()) {
				formatFleet(player, fleetSize);
			} else {
				formatFleet(player, fleetSize, scan);
			}
		}
		
	}

	private static void formatFleet(Player player, int fleetSize, Scanner scan) {
		System.out.println("");
		
	}
	
	private static void formatFleet(Player player, int fleetSize) {
		System.out.println("Initialising my field");
		for (int ships = 0; ships < fleetSize; ships++) {
			boolean boxSetted = false;
			while (!boxSetted) {
				int yAxis = new Random().nextInt(fleetSize-1);
				int xAxis = new Random().nextInt(fleetSize-1);
				if(player.getBoard().getBoxes()[yAxis][xAxis].getStatus() == "water") {
					player.getBoard().getBoxes()[yAxis][xAxis].setStatus("ship");
					boxSetted = true;
				}
			}
		}
	}

	public static Player[] createPlayers(Scanner scan) {
        System.out.println("Input quantity of user players, 1 for a game with PC");
        int quantityOfPlayers = scan.nextInt();
        System.out.println("Input size of player's fleet");
        int fleet = scan.nextInt();
        Player[] players = new Player[quantityOfPlayers + 1];
        players[0] = new Player(true, fleet);
        if (players.length == 1) {
            players[0].setisWon(true);
            return players;
        }
        for (int index = 1; index < players.length; index++) {
            players[index] = new Player(false, fleet);
        }
        return players;
    }

    public static Player checkWinner(Player[] players) {
        for (Player player : players) {
            if (player.getisWon()) {
                return player;
            }
        }
        return null;
    }

    private static void createPlayerBoards(Player[] players, Scanner scan) {
        boolean sizeSetted = false;
        int boardHigh = 0;
        int boardWidth = 0;
        while (!sizeSetted) {
            System.out.println("Input vertical size of the boards");
            boardHigh = scan.nextInt();
            System.out.println("Input horizontal size of the boards");
            boardWidth = scan.nextInt();
            if (boardHigh <= 0 || boardWidth <= 0) {
                System.out.println("Wrong boards size, try again!");
            } else {
                sizeSetted = true;
            }
        }
        for (Player player : players) {
            player.setBoard(new Board(boardHigh, boardWidth));
        }
        //return players;
    }

}
