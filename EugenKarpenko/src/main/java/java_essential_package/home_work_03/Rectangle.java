package java_essential_package.home_work_03;

public class Rectangle extends ContainsTwoSides {
    public Rectangle(double a, double b) {
        super(a, b);
    }


    @Override
    protected double getFigureArea() {
        return a * b;
    }

    @Override
    protected String convertToString() {
        return "прямоугольника с параметрами (" + a + ", " + b + ")";
    }
}
