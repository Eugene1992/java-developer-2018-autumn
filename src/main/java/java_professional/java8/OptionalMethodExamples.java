package java_professional.java8;

import java_professional.java8.SimpleTest.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class OptionalMethodExamples {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Anna", "Smith", 22, 10000, Arrays.asList("John", "Sara", "Barak", "Tom")),
                new Employee("Anna", "Smith", 22, 10000, Arrays.asList("John", "Sara", "Barak", "Tom")),
                new Employee("John", "Smith", 32, 15000, Arrays.asList("Barak", "Tom")),
                new Employee("Cpt. Jack", "Sparrow", 53, 30000, Arrays.asList("Cpt. Jack", "Sara", "Tom")),
                new Employee("Tom", "Hanks", 15, 1000, Arrays.asList("John", "Cpt. Jack", "Sara", "Barak", "Tom")),
                new Employee("Sara", "Connor", 24, 20000, Arrays.asList("John", "Barak", "Tom")),
                new Employee("Barak", "Obama", 43, 100000, Arrays.asList("John", "Cpt. Jack", "Sara"))
        );

        Optional<Employee> first = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .findFirst();

        Employee employee = first.get();

        if (first.isPresent()) {
            Employee employee1 = first.get();
        }

        Employee employee1 = first.orElse(new Employee());

        first.orElseGet(new Supplier<Employee>() {
            @Override
            public Employee get() {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                return new Employee();
            }
        });

        first.orElseThrow(
                () -> new IllegalStateException()
        );

        first.ifPresent(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {

            }
        });
    }

    static double count(int a, int b, int k) {
        double result = 10 * a + b * 0.12 + k;

        return result;
    }

    static double count(int a, int b, Supplier<Integer> coefFunc) {
        Integer coef = coefFunc.get();
        double result = 10 * a + b * 0.12 + coef;

        return result;
    }

    /*public static void main(String[] args) {
        count(10, 23, 1);

        count(10, 23, () -> 10 * 100);

        count(10, 23, new Supplier<Integer>() {
            @Override
            public Integer get() {
                int a = 10 * 100000;
                return a;
            }
        });
    }*/
}
