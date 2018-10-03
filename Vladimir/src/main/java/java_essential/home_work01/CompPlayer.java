package java_essential.home_work01;

public class CompPlayer {
    private SeaBoard board;

    public CompPlayer(int length, int amountOfShip) {
        this.board = new SeaBoard(length, amountOfShip);
    }

    public SeaBoard getBoard() {
        return board;
    }

    //    Метод для рандомирования чисел
    public static int getSomeNumber(int seaSize) {
        return (int) (Math.random() * seaSize);
    }

    //    Метод для  присвоения координат кораблям
    public static void setCoordShip(SeaBoard board, int amountOfShip, int seaSize) {
        for (int i = 0; i < amountOfShip; i++) {
            boolean compAmountShip = false;
            while (compAmountShip == false) {
                int coordX = getSomeNumber(seaSize);
                System.out.println(coordX);
                int coordY = getSomeNumber(seaSize);
                System.out.println(coordY);
                if (board.getSeaBox()[coordX][coordY].gethaveSomething().equals("Have ship")) {
                    compAmountShip = false;
                } else {
                    Ship ship = new Ship(coordX, coordY);
                    board.getShips()[i] = ship;
                    board.getSeaBox()[coordX][coordY].setHaveSomething("Have ship");
                    compAmountShip = true;
                }
            }
        }
    }

    //    Метод для выстрела
    public static int shotComp(SeaBoard board, int seaSize, int amountOfShip) {
        boolean badMemory = false;
        while (badMemory == false) {
            int shotX = getSomeNumber(seaSize);
            int shotY = getSomeNumber(seaSize);
            for (Ship ships : board.getShips()) {
                if (ships.getCoordX() == shotX && ships.getCoordX() == shotY) {
                    ships.setIsAlive(false);
                    board.getSeaBox()[shotX][shotY].setHaveSomething("Sunken");
                    System.out.println("Comp sunken you ship!");
                    badMemory = true;
                    amountOfShip--;
                    break;
                } else {
//                    for (SeaBox seaBox : board.getSeaBox()) {
                    if (board.getSeaBox()[shotX][shotY].gethaveSomething().equals("Checked")) {
                        badMemory = false;
                        break;
                    } else {
                        board.getSeaBox()[shotX][shotY].setHaveSomething("Checked");
                        badMemory = true;
                        break;
                    }
//                    }
                }
            }
        }
        return amountOfShip;
    }
}

