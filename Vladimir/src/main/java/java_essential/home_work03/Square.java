package java_essential.home_work03;

public class Square extends Shape {

    public Square(int length) {
        super(length);
    }

    public static double getSquare(int length) {
        square = length * length;
        return square;
    }
}
