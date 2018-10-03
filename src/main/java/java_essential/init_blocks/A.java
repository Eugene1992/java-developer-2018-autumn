package java_essential.init_blocks;

public class A {
    static {
        System.out.println("Static ini block A");
    }

    {
        System.out.println("Non static ini block A");
    }

    public A() {
        System.out.println("Default constructor A");
    }
}
