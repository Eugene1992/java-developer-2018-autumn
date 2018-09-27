package java_essential.incapsulation;

public class Test {
    public static void main(String[] args) {
        Employee one = new Employee("Anna", 20, 10000, false);

        Employee two = new Employee("Jack", 45, 20000, true);

        Employee three = new Employee();

        Employee four = new Employee("Jack", 45, 10000, true);

        one.sayHello();
        two.sayHello();
    }

    public static int getAverageSalary(Employee[] employees) {
        return getSumSalary(employees) / employees.length;
    }

    public static int getSumIndexedSalary(Employee[] employees, int index) {
        return getSumSalary(employees) * index;
    }

    private static int getSumSalary(Employee[] employees) {
        return 100;
    }
}
