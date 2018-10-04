package java_essential.home_work03;

public class Diamond extends Shape {
    private int height;
    private double angle;

    public Diamond(int length, int height, double angle) {
        super(length);
        this.height = height;
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }

    public static double getSquareWithHeight(int length, int height) {
        square = length * height;
        return square;
    }

    public static double getSquareWithAngle(int length, int angle) {
        double radiansAngle = Math.toRadians(angle);
        square = length * length * (Math.sin(radiansAngle));
        return square;
    }
}
