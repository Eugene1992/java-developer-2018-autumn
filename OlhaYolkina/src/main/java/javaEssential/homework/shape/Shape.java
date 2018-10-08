package javaEssential.homework.shape;

public abstract class Shape {
    protected int a = 4;
    protected int h = 4;
    protected String name;

    protected abstract double calculateSquare();

    protected void outputSquare(double value) {
        System.out.println(name + " square = " + value);
    }

    ;
}
