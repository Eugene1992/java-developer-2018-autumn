package java_starter.conditions;

public class DoubleTernaryExample {
    public static void main(String[] args) {
        int a = -7;
        int b;

        if (a > 0) {
            if (a == 7) {
                b = 777;
            } else {
                b = 888;
            }
        } else {
            b = 1;
        }

       int c = a > 0 ? a == 7 ? 777 : 888 : 1;

        System.out.println(b);
        System.out.println(c);
    }
}
