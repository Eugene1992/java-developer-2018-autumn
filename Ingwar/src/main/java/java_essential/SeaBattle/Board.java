package java_essential.SeaBattle;

public class Board {
    private int boardHeight;
    private int boardWidth;
    private BoardBox[][] boxes;

    public Board(int boardHeight, int boardWidth) {
        this.boardHeight = boardHeight;
        this.boardWidth = boardWidth;
        this.boxes = createBoard();
    }

    public int getBoardHeight() {
        return boardHeight;
    }

    public int getBoardWidth() {
        return boardWidth;
    }

    private BoardBox[][] createBoard() {
        BoardBox[][] field = new BoardBox[boardHeight][boardWidth];
        for (int indexHigh = 0; indexHigh < boardHeight; indexHigh++) {
            for (int indexWidth = 0; indexWidth < boardWidth; indexWidth++) {
            	field[indexHigh][indexWidth] = new BoardBox(indexHigh, indexWidth, "water");
            }
        }
        return field;
    }

	public BoardBox[][] getBoxes() {
		return boxes;
	}

    public void drawBoard(boolean isPC) {
        String box = "";
        for (int yIndex = 0; yIndex < this.boardHeight; yIndex++) {
            String stringOut = "";
            for (int xIndex = 0; xIndex < this.boardWidth; xIndex++) {
                switch (this.boxes[yIndex][xIndex].getStatus()) {
                    case "ship":
                        if (isPC) {
                            box = "~";
                        } else {
                            box = "S";
                        }
                        break;
                    case "wreck":
                        box = "W";
                        break;
                    case "miss":
                        box = "*";
                        break;
                    default:
                        box = "~";
                }
                stringOut = stringOut + box + " ";
            }
            System.out.println(stringOut);
        }
    }
}



