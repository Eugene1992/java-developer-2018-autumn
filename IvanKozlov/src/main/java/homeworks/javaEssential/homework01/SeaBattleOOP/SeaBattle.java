package homeworks.javaEssential.homework01.SeaBattleOOP;

public class SeaBattle {
    Player player;

    void startGame() {
        Player player = new Player(true);
        Player comp = new Player(false);

        while (player.getHasWonParameter() || comp.getHasWonParameter()) {
            this.player.makeSingleShotArray();
        }
    }

    void playGameRound() {

    }
}
