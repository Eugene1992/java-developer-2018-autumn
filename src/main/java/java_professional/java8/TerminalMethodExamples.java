package java_professional.java8;

import java_professional.java8.SimpleTest.Employee;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class TerminalMethodExamples {
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

        Employee employee1 = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .findAny()
                .get();

        List<Employee> list = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .collect(toList());

        Set<Employee> set = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .collect(toSet());

        Map<String, Integer> collect = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .collect(toMap(Employee::getFirstName, Employee::getSalary, (oldValue, newValue) -> newValue));

        Map<String, Long> collect1 = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .collect(Collectors.groupingBy(employee -> employee.getFirstName(), counting()));

        long count = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .count();

        boolean isMoreThan50 = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .anyMatch(employee -> employee.getAge() > 50);

        System.out.println(isMoreThan50);

        boolean isAllMoreThan50 = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .allMatch(employee -> employee.getAge() > 50);

        System.out.println(isAllMoreThan50);


        boolean isNoOneMoreThan100 = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .noneMatch(employee -> employee.getAge() > 100);

        System.out.println(isNoOneMoreThan100);

        Employee min = employees.stream()
                .min((emp1, emp2) -> emp2.getAge() - emp1.getAge())
                .get();

        System.out.println(min);

        employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .forEach(System.out::println);

        Employee[] employees1 = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .toArray(Employee[]::new);

        List<Integer> strings = Arrays.asList(22, 2, 6, 7);

        Integer s = strings.stream()
                .reduce((left, right) -> left + right)
                .get();

        System.out.println(s);

        int sum = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .mapToInt(employee -> employee.getSalary())
                .sum();

        IntSummaryStatistics intSummaryStatistics = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .mapToInt(employee -> employee.getSalary())
                .summaryStatistics();

        System.out.println(intSummaryStatistics);


    }
}
