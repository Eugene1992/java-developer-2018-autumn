package java_essential.SeaBattle;

public class Player {
    private boolean isPc;
    private boolean isWon;
    private int fleet;
    private Board board;

    public Player(boolean isPc, int fleet) {
        this.isPc = isPc;
        this.isWon = false;
        this.fleet = fleet;
    }

    public Player() {
        this.isWon = false;
    }

    public void setisPc(boolean pc) {
        this.isPc = pc;
    }

    public boolean getisPc() {
        return this.isPc;
    }

    public boolean getisWon() {
        return this.isWon;
    }

    public void setisWon(boolean won) {
        this.isWon = won;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public int getFleet() {
        return fleet;
    }

    public void setFleet(int fleet) {
        this.fleet = fleet;
    }
}