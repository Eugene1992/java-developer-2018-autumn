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

        System.out.println();
        System.out.println("Richest Employee : ");
        getRichestEmployee(arrEmployees).print();
        Employee[] arrEmployeesSalary = getEmployeesInSalaryInterval(arrEmployees, 1000, 2000);

        System.out.println("Employees with salary in interval [1000; 2000]");
        if (arrEmployeesSalary.length == 0) {
            System.out.println("Sorry, in this interval no employees");
        } else {
            for (Employee aEmployee : arrEmployeesSalary) {
                aEmployee.print();
            }
        }

        System.out.println("All salary : " + getSalaryAll(arrEmployees));
        System.out.println();
        System.out.println("Employees with name Jack");

        Employee[] arrEmployeesName = getEmployeesByName(arrEmployees, "Jack");
        if (arrEmployeesName.length == 0) {
            System.out.println("Sorry, no Jack's");
        } else {
            for (Employee aEmployee : arrEmployeesName) {
                aEmployee.print();
            }
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
        int size = 0;
        for (Employee aEmployee : employees) {
            if ((aEmployee.salary >= salaryFrom) && (aEmployee.salary <= salaryTo)) {
                size++;
            }
        }

        Employee[] salaryEmployees = new Employee[size];
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
        int size = 0;

        for (Employee aEmployee : employees) {
            if (aEmployee.firstName.equals(name)) {
                size++;
            }
        }

        Employee[] nameEmployees = new Employee[size];
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
