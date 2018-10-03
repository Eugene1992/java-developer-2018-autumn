package java_essential.home_work03;

public class Rectangle extends Shape {
    private int width;

    public Rectangle(int length, int width) {
        super(length);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public static double getSquare(int length, int width) {
        square = length * width;
        return square;
    }
}
