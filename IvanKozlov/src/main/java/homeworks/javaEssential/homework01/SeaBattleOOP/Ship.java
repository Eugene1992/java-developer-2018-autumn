package homeworks.javaEssential.homework01.SeaBattleOOP;


import static homeworks.javaEssential.homework01.SeaBattleOOP.Utils.shipPlacementString;
import static homeworks.javaEssential.homework01.SeaBattleOOP.Utils.xyArray;

public class Ship {

    private int[] shipCoordintes;

    public int[] setSingleShipLocation() {
        int[] singleShipLocationArray = new int[2];

        for (int i = 0; i < singleShipLocationArray.length; i++) {
            Utils.printSetShipOrShotLocationMessage(shipPlacementString, xyArray[i]);
            int coordinate = Utils.scanUserInput();
            if(coordinate >= 0 && coordinate < 4) {
                singleShipLocationArray[i] = coordinate;
            } else {
                Utils.printNotInRangeMessage();
                i--;
            }
        }

        return singleShipLocationArray;
    }

    public int[] getShipCoorginates() {
        return shipCoordintes;
    }

    public Ship() {
        this.shipCoordintes = setSingleShipLocation();
    }
}
