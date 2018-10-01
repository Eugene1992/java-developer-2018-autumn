package java_essential.SeaBattle;

public class Player {
    private boolean isPc;
    private boolean isWon;
    private Ship[] fleet;
    private Board board;

    public Player(boolean isPc, int fleetSize) {
        this.isPc = isPc;
        this.isWon = false;
        this.fleet = new Ship[fleetSize];
        setFleet(fleetSize);
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

    public Ship[] getFleet() {
        return fleet;
    }

    public void setFleet(int size) {
        for (int index = 0; index < size; index++) {
            this.fleet[index] = new Ship();
        }
    }

    public void addShipToFleet(int index, int yAxis, int xAxis) {
        this.fleet[index] = new Ship(yAxis, xAxis);
    }

    public boolean shotFired(int yAxis, int xAxis, Player targetPlayer) {
        boolean shot = false;
        BoardBox targetBox = targetPlayer.getBoard().getBoxes()[yAxis][xAxis];
        switch (targetBox.getStatus()) {
            case "water":
                targetBox.setStatus("miss");
                System.out.println("Shot missed!");
                checkAjanced(yAxis, xAxis, targetPlayer.getBoard(), this.isPc);
                shot = true;
                break;
            case "ship":
                targetBox.setStatus("wreck");
                System.out.println("Direct hit!");
                for (Ship ship : targetPlayer.getFleet()) {
                    if (ship.getyAxis() == yAxis && ship.getxAxis() == xAxis) {
                        ship.setisAlive(false);
                    }
                }
                checkAjanced(yAxis, xAxis, targetPlayer.getBoard(), this.isPc);
                shot = true;
                checkWin(targetPlayer);
                break;
            default:
                if (!this.getisPc()) {
                    System.out.println("Wrong coordinates, try again");
                }
        }
        return shot;
    }

    private void checkWin(Player targetPlayer) {
        int wrecks = 0;
        for (Ship ship : targetPlayer.getFleet()) {
            if (!ship.getisAlive()) {
                wrecks++;
            }
        }
        if (wrecks == targetPlayer.getFleet().length) {
            this.isWon = true;
        }
    }

    private void checkAjanced(int yAxis, int xAxis, Board board, boolean isPc) {
        if (!isPc) {
            int targets = 0;
            int lowLine = yAxis - 1 > 0 ? yAxis - 1 : 0;
            int highLine = yAxis + 1 > 3 ? 3 : yAxis + 1;
            int lowBox = xAxis - 1 > 0 ? xAxis - 1 : 0;
            int highBox = xAxis + 1 > 3 ? 3 : xAxis + 1;
            for (int checkLine = lowLine; checkLine <= highLine; checkLine++) {
                for (int checkBox = lowBox; checkBox <= highBox; checkBox++) {
                    if (checkBox != xAxis || checkLine != xAxis) {
                        if (board.getBoxes()[checkLine][checkBox].getStatus().equals("ship")) {
                            targets++;
                        }
                    }
                }
            }
            if (targets > 0) {
                System.out.println("There is " + targets + " target(s) near this coordinates");
            }
        }
    }

}