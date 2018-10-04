package java_essential.init_blocks;

public class InitBlocksExample {

    {
        b = 7;
        a = 1;
        c = 9;
        System.out.println("Non static init block");
    }

    static {
//        a = 10;
        c = 1;
        System.out.println("Static init block");
    }

    public int a;
    public final int b;
    public static int c;

    public InitBlocksExample() {
        System.out.println("Default constructor");
    }

    public static void main(String[] args) {
        InitBlocksExample initBlocksExample = new InitBlocksExample();
        System.out.println(initBlocksExample.a);
        System.out.println(InitBlocksExample.c);

        InitBlocksExample initBlocksExampleTwo = new InitBlocksExample();
        System.out.println(initBlocksExampleTwo.a);
        System.out.println(initBlocksExampleTwo.c);

        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a == b);
    }
}
