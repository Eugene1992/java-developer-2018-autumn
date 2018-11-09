package java_professional.java8;

import java_professional.java8.SimpleTest.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class StreamMethodsExamples {
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

        employees.stream()
                .filter(employee -> employee.getAge() > 20)
//                .skip(1)
                .distinct()
//                .map(employee -> employee.getFirstName())
//                .peek(s -> System.out.println("from peek method - " + s))
//                .sorted((o1, o2) -> o2.getSalary() - o1.getSalary())
//                .limit(2)
//                .mapToInt(value -> value.getSalary())
                .flatMap(employee -> employee.getFriendNames()
                        .stream()
                        .filter(name -> name.startsWith("a")))

                .forEach(System.out::println);

    }



}
