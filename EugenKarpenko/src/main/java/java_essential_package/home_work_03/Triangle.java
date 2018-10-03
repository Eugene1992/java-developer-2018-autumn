package java_essential_package.home_work_03;

public class Triangle extends Shape {

    public double h;

    protected Triangle(double a, double h) {
        super(a);
        this.h = h;
    }

    @Override
    protected double getFigureArea() {
        return (a * h) / 2;
    }

    @Override
    protected String convertToString() {
        return "треугольника с параметрами (" + a + ", Высота = " + h + ")";
    }
}
