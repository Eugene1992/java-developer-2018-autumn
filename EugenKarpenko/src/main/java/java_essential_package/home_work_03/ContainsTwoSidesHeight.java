package java_essential_package.home_work_03;

public abstract class ContainsTwoSidesHeight extends ContainsTwoSides {
    protected double h;

    public ContainsTwoSidesHeight(double a, double b, double h) {
        super(a, b);
        this.h = h;
    }
}
