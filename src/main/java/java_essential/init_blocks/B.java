package java_essential.init_blocks;

public class B extends A {
    static {
        System.out.println("Static ini block B");
    }

    {
        System.out.println("Non static ini block B");
    }

    public B() {
        System.out.println("Default constructor B");
    }

    public static void main(String[] args) {
        A a = new B();
    }
}
