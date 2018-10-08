package java_essential.class_into_class.local;

import java.io.Serializable;

public class Test {

    private static final String s = "Hello world!";

    public static void main(String[] args) {
        class AAA extends Object implements Serializable {
            public void f() {
                System.out.println(s);
            }
        }

        class BBB extends AAA {
        }

        AAA a = new AAA();
    }


    static void f() {
//        AAA a = new AAA();
    }
}
