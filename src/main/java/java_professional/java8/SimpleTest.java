package java_professional.java8;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class SimpleTest {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Anna", "Smith", 22, 10000, Arrays.asList("John", "Sara", "Barak", "Tom")),
                new Employee("John", "Smith", 32, 15000, Arrays.asList("Barak", "Tom")),
                new Employee("Cpt. Jack", "Sparrow", 53, 30000, Arrays.asList("Cpt. Jack", "Sara", "Tom")),
                new Employee("Tom", "Hanks", 15, 1000, Arrays.asList("John", "Cpt. Jack", "Sara", "Barak", "Tom")),
                new Employee("Sara", "Connor", 24, 20000, Arrays.asList("John", "Barak", "Tom")),
                new Employee("Barak", "Obama", 43, 100000, Arrays.asList("John", "Cpt. Jack", "Sara"))
        );

        Map<String, Long> collect = employees.stream()
                .filter(employee -> employee.age > 20 && employee.age < 40)
                .flatMap(employee -> employee.getFriendNames().stream())
                .collect(groupingBy(identity(), counting()));

        /*Map<String, Long> collect = new HashMap<>();
        for (Employee employee1 : employees) {
            if (employee1.age > 20 && employee1.age < 40) {
                for (String s : employee1.getFriendNames()) {
                    if (collect.containsKey(s)) {
                        Long aLong = collect.get(s);
                        collect.put(s, aLong++);
                    }
                }
            }
        }*/

        List<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.age > 20 && employee.age < 40) {
                names.add(employee.getFirstName());
            }
        }
        Collections.sort(names);

//        System.out.println(names);
        System.out.println(collect);

    }

    static class Employee {
        private String firstName;
        private String lastName;
        private int age;
        private int salary;
        private List<String> friendNames;

        public Employee(String firstName, String lastName, int age, int salary, List<String> friendNames) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.salary = salary;
            this.friendNames = friendNames;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public int getSalary() {
            return salary;
        }

        public List<String> getFriendNames() {
            return friendNames;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    ", friendNames=" + friendNames +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Employee employee = (Employee) o;

            if (age != employee.age) return false;
            if (salary != employee.salary) return false;
            if (firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) return false;
            if (lastName != null ? !lastName.equals(employee.lastName) : employee.lastName != null) return false;
            return friendNames != null ? friendNames.equals(employee.friendNames) : employee.friendNames == null;
        }

        @Override
        public int hashCode() {
            int result = firstName != null ? firstName.hashCode() : 0;
            result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
            result = 31 * result + age;
            result = 31 * result + salary;
            result = 31 * result + (friendNames != null ? friendNames.hashCode() : 0);
            return result;
        }
    }
}
