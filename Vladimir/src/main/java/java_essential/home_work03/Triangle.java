package java_essential.home_work03;

public class Triangle extends Shape {
    private int height;
    private int secondLength;

    public Triangle(int length, int secondLength, int height) {
        super(length);
        this.height = height;
        this.secondLength = secondLength;
    }

    public double getSecondLength() {
        return secondLength;
    }

    public double height() {
        return height;
    }

    public static double getTriangleSquare(int length, int height) {
        square = (length * height) / 2;
        return square;
    }

}
