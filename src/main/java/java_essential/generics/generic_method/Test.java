package java_essential.generics.generic_method;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        print("Hello world", 2);
        print(777, 2);
        print(true, 2);

        List<? super B> list = new ArrayList<>();
        list.add(new C());
        list.add(new B());
//        list.add(new A());

/*        List<? extends B> list2 = new ArrayList<>();
        list2.add(new C());
        list2.add(new B());
        list2.add(new A());*/
//        list.add(new A());

    }


    static <E> void print(E e, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(e);
        }
    }

    static <E> E print(E e) {
        return e;
    }

    /*static <E, R> R convert(E e) {
        return e;
    }*/

    static class A {

    }

    static class B extends A {

    }

    static class C extends B {

    }
}
