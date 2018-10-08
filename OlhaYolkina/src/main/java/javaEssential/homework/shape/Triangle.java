package javaEssential.homework.shape;

public class Triangle extends Shape {
    public Triangle() {
        this.name = "Triangle";
    }

    @Override
    protected double calculateSquare() {
        return a * h / 2;
    }
}
