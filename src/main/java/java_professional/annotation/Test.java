package java_professional.annotation;

public class Test {
    public static void main(String[] args) {
        Employee anna = new Employee("Anna", "Smith", 22);

        Class<? extends Employee> aClass = anna.getClass();

        if (aClass.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = aClass.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.name());
            System.out.println(annotation.value());
        }

    }
}
