package java_essential.home_work03;

public class Parallelogram extends Shape {
    private int height;
    private double angle;
    private int secondLength;

    public Parallelogram(int length, int secondLength, int height, double angle) {
        super(length);
        this.height = height;
        this.secondLength = secondLength;
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }

    public static double getSquareWithHeight(int length, int height) {
        square = length * height;
        return square;
    }

    public static double getSquareWithAngle(int length, int secondLength, int angle) {
        double radiansAngle = Math.toRadians(angle);
        square = length * secondLength * (Math.sin(radiansAngle));
        return square;
    }
}
