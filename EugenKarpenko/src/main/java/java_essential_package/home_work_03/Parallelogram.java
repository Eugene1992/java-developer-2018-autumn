package java_essential_package.home_work_03;

public class Parallelogram extends ContainsTwoSidesHeightAngle {


    public Parallelogram(double a, double b, double alpha) {
        super(a, b, alpha);
    }

    @Override
    protected double getFigureArea() {
        return a * b * Math.sin((alpha * Math.PI) / 180);
    }

    @Override
    protected String convertToString() {
        return "параллелограмма с параметрами (" + a + ", " + b + ", Угол = " + alpha + ")";
    }
}
