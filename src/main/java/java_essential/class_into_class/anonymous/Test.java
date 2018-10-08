package java_essential.class_into_class.anonymous;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("Some animal");

        Animal cat = new Animal("Barsik") {
            @Override
            public void sayHello() {
                System.out.println("Hello, i'm cat " + name);
            }
        };

        animal.sayHello();
        cat.sayHello();

        C c = new C() {
            @Override
            public void f() {

            }
        };

        C c2 = () -> {
            System.out.println();
        };

        C c1 = new CC() ;

    }

    interface C {
        void f();
    }

    static class CC implements C {

        @Override
        public void f() {

        }
    }
}
