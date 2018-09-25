package Homeworks.JavaEssential.Homework00;

import java.sql.SQLOutput;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int age;
    int salary;
    boolean isMarried;

    //- находят сотрудника с максимальной зарплатой

    static Employee getMaxSalaryEmployee(Employee[] array) {
        Employee maxSalaryEmployee = array[0];

        for (Employee employee : array) {
            if (employee.salary > maxSalaryEmployee.salary) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    //- находят всех сотрудников с заданным интервалом зарплаты

    static Employee[] getEmployeesWithSalaryRange(Employee[] employeesArray, int from, int to) {
        Employee[] employeesWithSalaryRange = new Employee[employeesArray.length];
        int counter = 0;

        for (Employee employee : employeesArray) {
            if (employee.salary >= from && employee.salary <= to) {
                employeesWithSalaryRange[counter] = employee;
                counter++;
            }
        }
        return employeesWithSalaryRange;
    }

    //- подсчитывает зарплату всех сотрудников

    static int getEmployeesSalarySum(Employee[] employeesArray) {
        int salarySum = 0;

        for (Employee employee : employeesArray) {
            salarySum += employee.salary;
        }
        return salarySum;
    }

    //- находят всех сотрудников по заданному имени

    static Employee[] getEmployeesByFirstName(Employee[] employeesArray, String firstName) {
        Employee[] employeesWithNeededName = new Employee[employeesArray.length];
        int counter = 0;

        for (Employee employee : employeesArray) {
            if (employee.firstName == firstName) {
                employeesWithNeededName[counter] = employee;
                counter++;
            }
        }
        return employeesWithNeededName;
    }

    //- печатает красиво информацию о сотруднике(ах), например Employee[name="Yevhenii", age=22, salary=20000000]

    static void printEmployeeData(Employee employee) {
        System.out.println("[Id = " + employee.id + ", First name = " + employee.firstName + ", Last name = " +
                employee.lastName + ", Age = " + employee.age + ", Salary = " + employee.salary + ", Married = " +
                employee.isMarried + "]");
    }

    static void printAllEmployeesDataFromArray(Employee[] employeesArray) {
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i] != null) {
                printEmployeeData(employeesArray[i]);
            }
        }
    }

    static void makeSeparatingBlankLine() {
        System.out.println("");
    }

    public static void main(String[] args) {

        Employee employeeOne = new Employee();
        Employee employeeTwo = new Employee();
        Employee employeeThree = new Employee();
        Employee employeeFour = new Employee();
        Employee employeeFive = new Employee();
        Employee employeeSix = new Employee();
        Employee employeeSeven = new Employee();
        Employee employeeEight = new Employee();
        Employee employeeNine = new Employee();
        Employee employeeTen = new Employee();

        Employee[] employees = new Employee[]{employeeOne, employeeTwo, employeeThree, employeeFour, employeeFive,
                employeeSix, employeeSeven, employeeEight, employeeNine, employeeTen};

        String[] employeesFirstNamesArray = new String[]{"John", "Alex", "Ann", "Jack", "Jim",
                "Steve", "Jenny", "Amy", "Kate", "Alex"};

        String[] employeesLastNamesArray = new String[]{"Black", "Walker", "Hard", "Daniels", "Beam",
                "Johnson", "West", "Smith", "Colt", "Daniels"};

        int[] employeesAgeArray = new int[]{22, 45, 18, 34, 38, 41, 16, 26, 54, 30};

        int[] employeesSalarisArray = new int[]{1500, 1800, 3400, 7000, 4500, 1000, 5200, 1900, 2600, 3000};

        boolean[] employeesMarriagesArray = new boolean[]{true, false, true, true, false, true, false, false, true, true};

        for (int i = 0; i < employees.length; i++) {
            employees[i].id = i + 1;
            employees[i].firstName = employeesFirstNamesArray[i];
            employees[i].lastName = employeesLastNamesArray[i];
            employees[i].age = employeesAgeArray[i];
            employees[i].salary = employeesSalarisArray[i];
            employees[i].isMarried = employeesMarriagesArray[i];
        }

        System.out.println("Max salary employee");
        printEmployeeData(getMaxSalaryEmployee(employees));
        makeSeparatingBlankLine();

        System.out.println("All employees with salary in range");
        printAllEmployeesDataFromArray(getEmployeesWithSalaryRange(employees, 4500, 6000));
        makeSeparatingBlankLine();

        System.out.println("Employees salary sum");
        System.out.println(getEmployeesSalarySum(employees));
        makeSeparatingBlankLine();

        System.out.println("Employees with the same name");
        printAllEmployeesDataFromArray(getEmployeesByFirstName(employees, "Alex"));

    }
}
