package java_essential.home_work03;

public class Trapeze extends Shape {
    private int height;
    private double angle;
    private int secondLength;

    public Trapeze(int length, int secondLength, int height, double angle) {
        super(length);
        this.height = height;
        this.secondLength = secondLength;
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }

    public static double getSquare(int length, int secondLength, int height) {
        square = ((length + secondLength) / 2) * height;
        return square;
    }
}
