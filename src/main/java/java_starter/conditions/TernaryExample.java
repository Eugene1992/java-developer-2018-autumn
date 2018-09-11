package java_starter.conditions;

public class TernaryExample {
    public static void main(String[] args) {
        int a = 10;
        int b;

        if (a > 0) {
            b = 0;
        } else {
            b = 1;
        }

        System.out.println(b);

//      int c = (condition) ? (if true) : (if false);
        int c =    a > 0    ?     0     :      1    ;

        System.out.println(c);
    }
}
