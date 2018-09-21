package java_starter.logic;

public class AndTest {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int c = 2;

        if (a > b) {
            if (a > c) {
                System.out.println("a is max");
            }
        }

        if (a > b && a > c) {
            System.out.println("a is max");
        }
    }
}
