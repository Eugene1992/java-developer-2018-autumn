package Hw;


public class Employee {
    int id;
    String firstName;
    String lastName;
    int age;
    int salary;
    boolean isMarried;

    Employee() {

    }

    Employee(int id, String firstName, String lastName, int age, int salary, boolean isMarried) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
    }

    public static Employee getEmployeeWithMaxSalary(Employee[] employees) {
        Employee e = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary > e.salary) {
                e = employees[i];
            }
        }
        return e;
    }

    public static Employee[] getEmployeesInSalaryInterval(Employee[] employees, int from, int to) {
        Employee[] employeesInInterval = new Employee[employees.length];
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary >= from && employees[i].salary <= to) {
                employeesInInterval[counter] = employees[i];
                counter++;
            }
        }
        return employeesInInterval;
    }

    public static int sumSalaryOfAllEmployees(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].salary;
        }
        return sum;
    }

    public static Employee[] getEmployeesByName(Employee[] employees, String name) {
        Employee[] employeesByName = new Employee[employees.length];
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].firstName.equals(name)) {
                employeesByName[counter] = employees[i];
                counter++;
            }
        }
        return employeesByName;
    }

    public static String toString(Employee employee) {
        String result = employee.firstName + " " + employee.lastName + ", зарплата = " + employee.salary
                + ", возраст = " + employee.age;
        if (employee.isMarried) {
            result += ", женат/замужем.";
        } else {
            result += ", не женат/не замужем.";
        }
        return result;
    }

    public static String toString(Employee[] employees) {
        String result = "";
        int counter = 1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                result += counter + ")" + toString(employees[i]) + "\n";
                counter++;
            }
        }
        return result;
    }


}
