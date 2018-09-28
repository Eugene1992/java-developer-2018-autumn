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

    public Ship[] getShips() {
        return ships;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public BoardBox[] getBoardBoxes() {
        return boardBoxes;
    }

    public int getShipNumber() {
        return shipNumber;
    }

}
