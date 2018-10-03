package java_essential_package.home_work_03;

public abstract class ContainsTwoSidesHeightAngle extends ContainsTwoSides {
    protected double alpha;

    public ContainsTwoSidesHeightAngle(double a, double b, double alpha) {
        super(a, b);
        this.alpha = alpha;
    }
}
