package java_starter.recursion;

public class SecondStackTest {
    public static void main(String[] args) {
        System.out.println("Main start");
        a();
        System.out.println("Main end");
    }

    static void a() {
        System.out.println("a() start");
        System.out.println("a");
        b();
        System.out.println("a() end");
    }

    static void b() {
        System.out.println("b start");
        System.out.println("b");
        c();
        System.out.println("b() end");
    }

    static void c() {
        System.out.println("c() start");
        System.out.println("c");
        System.out.println("c() end");
    }
}
