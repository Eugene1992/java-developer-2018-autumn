package homeWorkEssential.hWork003;

public class Parallelogram extends ContainsTwoSidesHeightAngle{

    protected Parallelogram(double a, double b, double angle) {
        super(a, b, angle);
    }

    @Override
    protected double getFigureArea() {
        return a * b * Math.sin(angle * Math.PI / 180);
    }

    @Override
    protected String convertToString() {
        return "паралелограмм с параметрами (" + a + ", " + b + ", Угол = " + angle + ")";

    }
}
