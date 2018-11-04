package homeworks.javaEssential.homework01.SeaBattleOOP;

public class BattleField {
    private int xLength = 4;
    private int yLength = 4;

    private Ship[] shipsArray = new Ship[4];
    private int[][] field = new int[4][4];

    private boolean hasShipsLeft;

    private boolean checkForShipLocation(Ship ship) {
        return this.field[(ship.getShipCoorginates()[0])][(ship.getShipCoorginates()[1])] == 1;
    }

    public BattleField() {
        for(int i = 0; i < 4; i++) {
            Ship ship = new Ship();
            if(checkForShipLocation(ship)) {
                System.out.println("alert");
                i--;
            } else {
                this.field[(ship.getShipCoorginates()[0])][(ship.getShipCoorginates()[1])] = 1;
                shipsArray[i] = ship;
            }
        }

        this.hasShipsLeft = true;
    }
}
