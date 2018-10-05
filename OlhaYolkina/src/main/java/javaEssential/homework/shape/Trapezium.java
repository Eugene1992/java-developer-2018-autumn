package javaEssential.homework.shape;

public class Trapezium extends Quadrilateral {
    public Trapezium() {
        this.name = "Trapezium";
    }

    @Override
    protected double calculateSquare() {
        return (a + b) * h / 2;
    }
}
