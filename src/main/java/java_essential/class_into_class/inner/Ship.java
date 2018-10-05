package java_essential.class_into_class.inner;

import java.io.Serializable;

public class Ship {
    private String name;
    private static String someStaticShipField;

    public Ship(String name) {
        this.name = name;
    }

    public class Engine extends Object implements Serializable {

        private String name;

        public String getShipName() {
//            return this.name;
            System.out.println(someStaticShipField);
            return Ship.this.name;
        }

        class EngineInnerChild extends Engine {

        }
    }

    class EngineChild extends Engine {

    }

    public abstract static class Anchor extends Object implements Serializable {

        public void f() {
            System.out.println(someStaticShipField);
//            System.out.println(name);
        }
    }
}
