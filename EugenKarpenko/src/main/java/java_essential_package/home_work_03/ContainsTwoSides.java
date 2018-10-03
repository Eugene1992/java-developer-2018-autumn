package java_essential_package.home_work_03;

public abstract class ContainsTwoSides extends Shape {
    protected double b;

    public ContainsTwoSides(double a, double b) {
        super(a);
        this.b = b;
    }
}
