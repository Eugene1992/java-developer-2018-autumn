package java_essential.interfaces.added_method;

public class Test {
    public static void main(String[] args) {
        A a = new B();

        a.anotherMethod();

        A.someAnotherMethod();
    }
}
