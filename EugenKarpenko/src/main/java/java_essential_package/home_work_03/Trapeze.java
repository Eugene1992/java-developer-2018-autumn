package java_essential_package.home_work_03;

public class Trapeze extends ContainsTwoSidesHeight {

    public Trapeze(double a, double b, double h) {
        super(a, b, h);
    }

    @Override
    protected double getFigureArea() {
        return ((a + b) / 2) * h;
    }

    @Override
    protected String convertToString() {
        return "трапеции с параметрами (" + a + "," + b + ", Высота = " + h + ")";
    }
}

