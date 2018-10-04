package java_essential_package.home_work_03;

public class Square extends Shape {

    protected Square(double a) {
        super(a);
    }

    @Override
    protected double getFigureArea() {
        return a * a;
    }

    @Override
    protected String convertToString() {
        return "квадрата с параметрами (" + a + ")";
    }
}

