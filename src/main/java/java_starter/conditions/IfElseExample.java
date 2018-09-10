package java_starter.conditions;

public class IfElseExample {
    public static void main(String[] args) {
        int a = -10;

        if (a > 0) {
            System.out.println("a > 0");
        }
        if (a < 0) {
            System.out.println("a < 0");
        }
        if (a == 0) {
            System.out.println("a == 0");
        }
        a = 1000;
        if (a > 0) {
            System.out.println("a > 0");
        } else {
            if (a < 0) {
                System.out.println("a < 0");
            } else {
                System.out.println("a == 0");
            }
        }

        if (a > 0) {
            System.out.println("a > 0");
        } else if (a < 0) {
            System.out.println("a < 0");
        } else if (a == 0) {
            System.out.println("a == 0");
        }

        if (a > 0) {
            System.out.println("a > 0");
        } else if (a < 0) {
            System.out.println("a < 0");
        } else {
            System.out.println("a == 0");
        }
    }
}