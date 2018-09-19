package java_starter.methods;

public class Test {
    public static void main(String[] args) {
        int totalSum = sum(10, 20);
//        sum(10, "10");

        System.out.println(totalSum);

        System.out.println(sum(5, 3));

        printHelloWorld();
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static void printHelloWorld() {
        System.out.println("Hello world!");
    }
}
