package java_essential.abstraction;

public class Triangle extends Shape {

    private int h;

    public Triangle(int a, int h) {
        super(a);
        this.h = h;
    }

    @Override
    protected double calcSquare() {
        return 0;
    }
}
