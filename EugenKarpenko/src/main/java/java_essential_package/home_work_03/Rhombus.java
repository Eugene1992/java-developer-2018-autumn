package java_essential_package.home_work_03;

public class Rhombus extends Shape {
    private double alpha;

    protected Rhombus(double a, double alpha) {
        super(a);
        this.alpha = alpha;
    }

    @Override
    protected double getFigureArea() {
        return a * a * Math.sin((alpha * Math.PI) / 180);
    }

    @Override
    protected String convertToString() {
        return "ромба с параметрами (" + a + ", Угол = " + alpha + ")";
    }
}
