package javaEssential.homework.shape;

import static java.lang.StrictMath.sin;

public class Parallelogram extends Quadrilateral {
    protected int alpha = (int) Math.toRadians(90);
    protected int c = 4;

    public Parallelogram() {
        this.name = "Parallelogram";
    }

    @Override
    protected double calculateSquare() {
        return a * h;
    }

    protected double calculateSquareThroughAngle() {
        return a * c * sin(alpha);
    }
}
