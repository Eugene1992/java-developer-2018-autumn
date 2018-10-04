package java_essential.oveerride;

public class A {
    private int anInt;

    protected int someMethod() {
        return 0;
    }

    public C getSomeRef() {
        return new C();
    }

    public D getSomeRefAgain() {
        return new D();
    }

    public static int s() {
        return 1;
    }
}
