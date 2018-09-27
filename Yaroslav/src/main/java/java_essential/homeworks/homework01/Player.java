package java_essential.homeworks.homework01;

/**
 * Клас необходимый для создания обькта типа игрок(Player).
 * Игрок имеет игровое поле(Board), булевое поле isComputer(которое показывает являеться ли
 * игрок компьютером или нет)
 * Ячейки игрового поля инициализируються прямо в конструкторе с помощью
 * метода initializeBoard(board)
 */

public class Player {
    private Board board;
    private boolean isComputer;

    public Player(int height, int width, int shipNumber, boolean isComputer) {
        this.board = new Board(height, width, shipNumber);
        initializeBoard(this.board);
        this.isComputer = isComputer;
    }

    public Board initializeBoard(Board board) {
        int counter = 0;
        for (int i = 1; i <= board.getWidth(); i++) {
            for (int j = 1; j <= board.getHeight(); j++) {
                board.getBoardBoxes()[counter] = new BoardBox(i, j);
                counter++;
            }
        }
        return board;
    }

    public Board getBoard() {
        return board;
    }

    public boolean isComputer() {
        return isComputer;
    }
}
