package java_professional.java8;

public class LyambdaTest {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public String concat(String a, String b) {
                return a + b;
            }
        };

        A b = (String a1, String b1) -> {
            System.out.println();
            return a1 + b1;
        };

        B b1 = x -> {
            System.out.println(x);
            System.out.println(x);
            System.out.println(x);
        };
    }


    @FunctionalInterface
    static interface A {
        String concat(String a, String b);
        default void b() {}
        static void c() {}
    }

    @FunctionalInterface
    static interface B {
        void concat(String a);
    }
}
