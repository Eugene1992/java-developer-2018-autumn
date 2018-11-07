package java_professional.reflection;

import java.lang.reflect.*;

public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Employee employee = new Employee("John", "Johnson", 23);

        Class aClass = employee.getClass();
        Class<Employee> employeeClass = Employee.class;

        System.out.println("Name: " + aClass.getName());
        System.out.println("Simple name: " + aClass.getSimpleName());

        Class superclass = aClass.getSuperclass();
        System.out.println(superclass.getName());
        System.out.println(superclass.getSimpleName());

        Class[] interfaces = aClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface.getSimpleName());
        }

        Field[] declaredFields = aClass.getFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

        Field age = aClass.getDeclaredField("age");

        age.setAccessible(true);

        System.out.println(age.get(employee));

        age.set(employee, 100);

        System.out.println(employee.getAge());

        System.out.println(age.getType().getName());

        int modifiers = age.getModifiers();
        System.out.println(Modifier.isPrivate(modifiers));
        System.out.println(Modifier.isStatic(modifiers));

        Constructor[] constructors = aClass.getConstructors();

        for (Constructor constructor : constructors) {
            System.out.println(constructor.getParameterCount());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }
        }

        Constructor constructor = aClass.getConstructor(String.class, String.class, int.class);
        Employee anna = (Employee) constructor.newInstance("Anna", "Smith", 22);

        System.out.println(anna);

        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }

        Method sayHello = aClass.getDeclaredMethod("sayHello", String.class);
        sayHello.setAccessible(true);
        Object returnedResult = sayHello.invoke(employee, "Yevhenii");
        System.out.println(returnedResult);

        // TODO: 07.11.2018 Read about class loaders in jvm
        Class<?> human = Class.forName("java_professional.reflection.Human");
        Object o = human.newInstance();

        System.out.println(o);
    }
}
