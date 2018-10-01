package arenaBattle;

import java.util.Scanner;
import java.util.Random;

class arenaGame {
	public static void startGame() {
		Scanner scan = new Scanner(System.in);
		System.out.println("The great arena waiting for blood!");
		System.out.println("Input the battle squad aize:");
		int squadSize = scan.nextInt();
		Player[] players = new Player[2];
		System.out.println("Gathering battle squad for PC");
		players[0] = new Player(squadSize, scan, true);
		System.out.println("Gathering battle squad for Player");
		players[1] = new Player(squadSize, scan);
		System.out.println("Squads are ready. Let the battle begins!");
		Player looser = battle(players, scan);
		System.out.println(""+(looser.getisPc() ? "PC " : "Player ") + "lost this arena game!");
		System.out.println("The flock of ravens will devour the flash of the fallen.");
	}
	
	private static Player battle(Player[] players, Scanner scan) {
		Player looser = null;
		while (looser == null) {
			for (Player player : players) {
                if (checkLooser(player)) {
                    looser = player;
                    break;
                }
				if(player.getisPc()) {
					player.strike(player, players);
				} else {
					player.strike(player, players, scan);
				}
                player.showHealth(player);
                System.out.println();
			}
		}
		return looser;
	}
	
	private static boolean checkLooser(Player player) {
		boolean loser = true;
		for (Hero hero : player.getheroSquad()) {
			if(hero.getisAlive()) {
				loser = false;
			}
		}
		return loser;
	}
}
