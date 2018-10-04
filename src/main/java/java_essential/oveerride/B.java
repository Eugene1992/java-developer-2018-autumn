package java_essential.oveerride;

public class B extends A {
    @Override
    protected int someMethod() {
        return 7;
    }

    @Override
    public D getSomeRef() {
        return new D();
    }

/*    @Override
    public C getSomeRefAgain() {
        return new C();
    }*/

    public static int s() {
        return 1;
    }
}
