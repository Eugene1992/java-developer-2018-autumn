package java_essential.SeaBattle;

import java.util.Scanner;
import java.util.Random;

public class SeaBattle {
    public static void gameStart() {
        Player winner = game();
        System.out.println("winner is " + (winner.getisPc() ? "PC!" : "Player!"));
        System.out.println("Game over");
    }

    private static Player game() {
        Scanner scan = new Scanner(System.in);
        Player[] players = createPlayers(scan);
        Player winner = checkWinner(players);
        if (winner != null) {
            return winner;
        }
        createPlayerBoards(players, scan);
        placeFleets(players, scan);
        System.out.println(" ");
        System.out.println("Battle begins!");
        System.out.println(" ");
        while (winner == null) {
            for (Player player : players) {
                for (Player targetPlayer : players) {
                    if (targetPlayer != player) {
                        System.out.println((player.getisPc() ? "PC " : "Player ") + " fires");
                        shootVolley(player, targetPlayer, scan);
                        winner = checkWinner(players);
                        if (winner != null) {
                            return winner;
                        }
                        redrawBoards(players);
                        System.out.println("\n");
                    }
                }
            }
        }
        return winner;
    }

    private static void shootVolley(Player player, Player targetPlayer, Scanner scan) {
        boolean shotFired = false;
        while (!shotFired) {
            if (player.getisPc()) {
                int yAxis = new Random().nextInt(targetPlayer.getBoard().getBoardHeight());
                int xAxis = new Random().nextInt(targetPlayer.getBoard().getBoardWidth());
                shotFired = player.shotFired(yAxis, xAxis, targetPlayer);
            } else {
                System.out.println("Input Y coordinate for player shot, 0 - " + (targetPlayer.getBoard().getBoardHeight() - 1));
                int yAxis = scan.nextInt();
                System.out.println("Input X coordinate for player shot, 0 - " + (targetPlayer.getBoard().getBoardWidth() - 1));
                int xAxis = scan.nextInt();
                shotFired = player.shotFired(yAxis, xAxis, targetPlayer);
            }
        }
    }

    private static void placeFleets(Player[] players, Scanner scan) {
		for (Player player : players) {
			if (player.getisPc()) {
                formatFleet(player);
			} else {
                formatFleet(player, scan);
			}
		}
	}

    private static void formatFleet(Player player, Scanner scan) {
        System.out.println("Initialising player field");
        for (int ships = 0; ships < player.getFleet().length; ships++) {
            boolean boxSetted = false;
            while (!boxSetted) {
                System.out.println("Input ship coordinates on Y axis, 0 - " + (player.getBoard().getBoardHeight() - 1));
                int yAxis = scan.nextInt();
                System.out.println("Input ship coordinates on X axis, 0 - " + (player.getBoard().getBoardWidth() - 1));
                int xAxis = scan.nextInt();
                if (!(yAxis >= player.getBoard().getBoardHeight() || xAxis >= player.getBoard().getBoardWidth())) {
                    if (player.getBoard().getBoxes()[yAxis][xAxis].getStatus().equals("water")) {
                        player.getBoard().getBoxes()[yAxis][xAxis].setStatus("ship");
                        player.addShipToFleet(ships, yAxis, xAxis);
                        boxSetted = true;
                    }
                }
            }
        }
	}

    private static void formatFleet(Player player) {
		System.out.println("Initialising my field");
        for (int ships = 0; ships < player.getFleet().length; ships++) {
			boolean boxSetted = false;
			while (!boxSetted) {
                int yAxis = new Random().nextInt(player.getFleet().length);
                int xAxis = new Random().nextInt(player.getFleet().length);
                if (player.getBoard().getBoxes()[yAxis][xAxis].getStatus().equals("water")) {
					player.getBoard().getBoxes()[yAxis][xAxis].setStatus("ship");
                    player.addShipToFleet(ships, yAxis, xAxis);
					boxSetted = true;
				}
			}
		}
	}

    private static Player[] createPlayers(Scanner scan) {
        System.out.println("Input quantity of user players, for now - 1 for a game with PC");
        int quantityOfPlayers = scan.nextInt();
        System.out.println("Input size of player's fleet");
        int fleetSize = scan.nextInt();
        Player[] players = new Player[quantityOfPlayers + 1];
        players[0] = new Player(true, fleetSize);
        if (players.length == 1) {
            players[0].setisWon(true);
            return players;
        }
        for (int index = 1; index < players.length; index++) {
            players[index] = new Player(false, fleetSize);
        }
        return players;
    }

    private static Player checkWinner(Player[] players) {
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

    private static void redrawBoards(Player[] players) {
        for (Player player : players) {
            System.out.println((player.getisPc() ? " PC " : " Player ") + "board");
            int ships = 0;
            for (Ship ship : player.getFleet()) {
                if (ship.getisAlive()) {
                    ships++;
                }
            }
            System.out.println("Ships alive: " + ships);
            player.getBoard().drawBoard(player.getisPc());
            System.out.println(" ");
        }
    }
}
