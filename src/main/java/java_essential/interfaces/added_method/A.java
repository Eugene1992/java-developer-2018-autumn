package java_essential.interfaces.added_method;

public interface A {
    void someMethod();

    default void anotherMethod() {

    }

    static void someAnotherMethod() {

    }
}
