package java_essential.object_class_methods;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        Home home = new Home("Perova", 21);
        Employee anna = new Employee("Anna", 23, home);
//        System.out.println(anna);

        try {
            Employee clone = (Employee) anna.clone();
//            System.out.println(clone);

            Home cloneHome = clone.getHome();
            cloneHome.setStreet("Sverstuka");

//            System.out.println(anna);
//            System.out.println(clone);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Class<? extends Employee> aClass = anna.getClass();

        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());

        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Class<?> type = declaredField.getType();
            System.out.println(type.getSimpleName() + " " + declaredField.getName());
        }

        try {
            Field name = aClass.getDeclaredField("name");
            name.setAccessible(true);
            System.out.println(name.get(anna));
            name.set(anna, "Ivan");
            System.out.println(anna);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        Employee tom = new Employee("Tom", 22, new Home("Kreshchatyk", 2));
        Employee tomClone = new Employee("Tom", 22, new Home("Kreshchatyk", 2));

        System.out.println(tom.equals(tomClone));
    }
}
