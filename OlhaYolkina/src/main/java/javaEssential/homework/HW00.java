package javaEssential.homework;

import java.util.Scanner;

public class HW00 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee[] arrEmployees = new Employee[10];
        for (int i = 0; i < arrEmployees.length; i++) {
            arrEmployees[i] = new Employee();
            arrEmployees[i].setEmployee(scan);
            arrEmployees[i].id = i;
        }
        for (int i = 0; i < arrEmployees.length; i++) {
            arrEmployees[i].print();
        }

        System.out.println("Richest Employee : ");
        getRichestEmployee(arrEmployees).print();
        Employee[] arrEmployeesSalary = getEmployeesInSalaryInterval(arrEmployees, 1000, 2000);

        for (Employee aEmployee : arrEmployeesSalary) {
            aEmployee.print();
        }

        System.out.println("All salary : " + getSalaryAll(arrEmployees));

        Employee[] arrEmployeesName = getEmployeesByName(arrEmployees, "Jack");

        for (Employee aEmployee : arrEmployeesName) {
            aEmployee.print();
        }
    }

    /**
     * - находят сотрудника с максимальной зарплатой
     */
    static Employee getRichestEmployee(Employee[] employees) {
        Employee richestEmployee = employees[0];

        for (Employee aEmployee : employees) {
            if (aEmployee.salary > richestEmployee.salary) {
                richestEmployee = aEmployee;
            }
        }
        return richestEmployee;
    }

    /**
     * - находят всех сотрудников с заданным интервалом зарплаты
     */
    static Employee[] getEmployeesInSalaryInterval(Employee[] employees, int salaryFrom, int salaryTo) {
        Employee[] salaryEmployees = new Employee[employees.length];
        int k = 0;

        for (Employee aEmployee : employees) {
            if ((aEmployee.salary >= salaryFrom) && (aEmployee.salary <= salaryTo)) {
                salaryEmployees[k] = aEmployee;
                k++;
            }
        }
        return salaryEmployees;
    }

    /**
     * - подсчитывает зарплату всех сотрудников
     */

    static int getSalaryAll(Employee[] employees) {
        int sumSalary = 0;

        for (Employee aEmployee : employees) {
            sumSalary += aEmployee.salary;
        }
        return sumSalary;
    }

    /**
     * - находят всех сотрудников по заданному имени
     */

    static Employee[] getEmployeesByName(Employee[] employees, String name) {
        Employee[] nameEmployees = new Employee[employees.length];
        int k = 0;

        for (Employee aEmployee : employees) {
            if (aEmployee.firstName.equals(name)) {
                nameEmployees[k] = aEmployee;
                k++;
            }
        }
        return nameEmployees;
    }
}
