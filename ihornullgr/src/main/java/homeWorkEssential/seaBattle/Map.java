package homeWorkEssential.seaBattle;


public class Map {
    public final int width = 4;
    public final int height = 4;
    private char[] head; //заголовок ABCD
    private char[][] cells; //внутренние данные, печатаем клетки

    public Map() {
        head = new char[] {'A', 'B', 'C', 'D'};
        cells = new char[width][height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                cells[x][y] = ' '; // заполнение полей
            }
        }
    }

    public void draw() {
        int cordX = 1;
        int cordY = 0;

        System.out.print(' '); // устанавливаем пробел между текстом и цифрами
        for (int y = 0; y < width; y++) {
            System.out.print(' ');
            System.out.print(head [cordY++]);
        }
        System.out.println();

        for (int x = 0; x < height; x++) {
            System.out.print(cordX++);

            for (int y = 0; y < width; y++) { //убираем пробел между цифрой 10 и Х
                if (!(y == 0 && cordX == 11)) {
                    System.out.print(' ');
                }
                System.out.print(cells[x][y]); // вывод полей в консоль
            }
            System.out.print(' ');
            System.out.println("|");

        }
    }
}
