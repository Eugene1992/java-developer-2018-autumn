package java_essential.SeaBattle;

public class Board {
    private int boardHeight;
    private int boardwidth;
    private BoardBox[][] boxes;

    public Board(int boardHeight, int boardwidth) {
        this.boardHeight = boardHeight;
        this.boardwidth = boardwidth;
        this.boxes = createBoard();
    }

    public int getBoardHeight() {
        return boardHeight;
    }

    public int getBoardwidth() {
        return boardwidth;
    }

    private BoardBox[][] createBoard() {
        BoardBox[][] boxes = new BoardBox[boardHeight][boardwidth];
        for (int indexHigh = 0; indexHigh < boardHeight; indexHigh++) {
            for (int indexWidth = 0; indexWidth < boardwidth; indexWidth++) {
                boxes[indexHigh][indexWidth] = new BoardBox(indexHigh, indexWidth, "water");
            }
        }
        return boxes;
    }
}



