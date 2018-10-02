package Hw;

import static Hw.Employee.*;

public class Hw1 {

    public static Employee[] fillEmployeesArray(Employee[] employees) {
        employees[0] = new Employee(1, "Алексей", "Ивлеев", 28, 4500, false);
        employees[1] = new Employee(2, "Олександр", "Кравец", 32, 7700, true);
        employees[2] = new Employee(3, "Алексей", "Петришин", 35, 9000, true);
        employees[3] = new Employee(4, "Марк", "Ющ", 35, 24000, true);
        employees[4] = new Employee(5, "Антон", "Король", 25, 4500, true);
        employees[5] = new Employee(6, "Николай", "Бабчук", 27, 14000, false);
        employees[6] = new Employee(7, "Мария", "Онищенко", 50, 25900, false);
        employees[7] = new Employee(8, "Алексей", "Максименко", 29, 24000, true);
        employees[8] = new Employee(9, "Клим", "Слыва", 30, 43000, false);
        employees[9] = new Employee(10, "Ольга", "Грэй", 55, 57000, false);
        return employees;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        fillEmployeesArray(employees);


        Employee richEmployee = getEmployeeWithMaxSalary(employees);
        System.out.println("Самая большая зарплата у: " + richEmployee.firstName + " с зарплатой " + richEmployee.salary);
        System.out.println("\n");
        System.out.println("Сума всех зарплат: " + sumSalaryOfAllEmployees(employees));
        System.out.println("\n");

        int from = 14000;
        int to = 27000;
        Employee[] employeesInInterval = getEmployeesInSalaryInterval(employees, from, to);
        System.out.println("Сотрудники, чья зарплата в диапазоне " + from + "грн до " + to + "грн");
        System.out.println(Employee.toString(employeesInInterval));

        String name = "Алексей";
        System.out.println("Все работники, чье имя " + name);
        Employee[] employeesByName = getEmployeesByName(employees, name);
        System.out.println(Employee.toString(employeesByName));

    }
}