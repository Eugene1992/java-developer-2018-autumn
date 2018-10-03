package java_essential_package.home_work_03;

public abstract class Shape {
    protected double a;

    protected Shape(double a) {
        this.a = a;
    }

    protected abstract double getFigureArea();

    protected abstract String convertToString();

}
