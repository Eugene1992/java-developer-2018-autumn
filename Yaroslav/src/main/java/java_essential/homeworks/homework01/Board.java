package java_essential.homeworks.homework01;

/**
 * Клас необходимый для создания обьктов типа Board(игровое поле)
 * Игровое поле имеет ширину, высоту, количество кораблей, масив ячеек
 * игрового поля(BoardBox[]) и масив кораблей(Ship[])
 * Высота поля, ширина поля и количество кораблей передаються в конструктор
 * как параметры.
 * Масив кораблей создается прям в конструторе(его размер
 * равен количнству кораблей).
 * Масив ячеек поля создаеться также в конструкторе(его размер равен
 * произведению ширины и высоты игрового поля)
 */

public class Board {
    private Ship[] ships;
    private int height;
    private int width;
    private BoardBox[] boardBoxes;
    private int shipNumber;

    public Board(int height, int width, int shipNumber) {
        this.height = height;
        this.width = width;
        this.ships = new Ship[shipNumber];
        this.boardBoxes = new BoardBox[height * width];
        this.shipNumber = shipNumber;
    }

/*
    public boolean boardBoxIsEmpty(int x, int y){
        for (BoardBox boardBox : this.boardBoxes) {
            if(boardBox.getX() == x && boardBox.getY() == y
                    && !(boardBox.getStatus().equals("Empty"))){
                return false;
            }
        }
        return true;
    }

    public void changeBoardBoxStatus(int x, int y, String newStatus){
        for (BoardBox boardBox : this.boardBoxes) {
            if(boardBox.getX() == x && boardBox.getY() == y){
                boardBox.setStatus(newStatus);
            }
        }
    }



    public Ship placeShip(boolean isComputer){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        String newStatus;
        while(true) {
            if (isComputer) {
                Random rand = new Random();
                x = rand.nextInt(4);
                y = rand.nextInt(4);
                newStatus = "Enemy Ship";
            }
            else {
                System.out.print("Введите координату по x: ");
                x = sc.nextInt();
                System.out.print("Введите координату по y: ");
                y = sc.nextInt();
                newStatus = "Player Ship";
            }
            if(boardBoxIsEmpty(x, y)){
                break;
            }
            else if(!isComputer){
                System.out.println("В этом месте уже есть корабль. Выберите другую ячейку.");
            }
        }
        Ship ship = new Ship(x, y);
        changeBoardBoxStatus(x, y, newStatus);
        return ship;
    }


    public void placePlayerShips(boolean isComputer){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ships.length; i++) {
            ships[i] = placeShip(isComputer);
        }
        sc.close();
    }
*/

    public Ship[] getShips() {
        return ships;
    }

    public void setShips(Ship[] ships) {
        this.ships = ships;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public BoardBox[] getBoardBoxes() {
        return boardBoxes;
    }

    public void setBoardBoxes(BoardBox[] boardBoxes) {
        this.boardBoxes = boardBoxes;
    }

    public int getShipNumber() {
        return shipNumber;
    }

    public void setShipNumber(int shipNumber) {
        this.shipNumber = shipNumber;
    }
}
