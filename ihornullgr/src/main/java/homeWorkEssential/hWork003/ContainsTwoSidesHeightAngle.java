package homeWorkEssential.hWork003;

public abstract class ContainsTwoSidesHeightAngle extends ContainsTwoSides {
    protected double angle;

    public ContainsTwoSidesHeightAngle(double a, double b, double angle) {
        super(a, b);
        this.angle = angle;
    }
}
