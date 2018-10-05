package javaEssential.homework.shape;

import static java.lang.StrictMath.sin;

public class Rhombus extends Parallelogram {
    public Rhombus() {
        this.name = "Rhombus";
    }

    @Override
    protected double calculateSquareThroughAngle() {
        return a * a * sin(alpha);
    }
}
