package java_essential_package.home_work_00;

public class Main {
    public static void main(String[] args) {
        printSeparatorLine();
        Employee[] listOfEmployees = createListOfEmployees(10);
        System.out.println("Current list of employees: ");
        printEmployeesData(listOfEmployees);

        // Применение метода getMaxSalary

        printSeparatorLine();
        System.out.println("Richest employee: ");
        printEmployeesData(getMaxSalary(listOfEmployees));
        printSeparatorLine();

        // Применение метода getSalaryInterval

        System.out.println("Salary employee Interval: ");
        printEmployeesData(getSalaryInterval(listOfEmployees, 20000, 50000));
        printSeparatorLine();

        // Применение метода calcEmployeesSalarySum

        System.out.println("Calculate employees salary sum : ");
        System.out.println(calcEmployeesSalarySum(listOfEmployees));
        printSeparatorLine();

        // Применение метода getEmployeesByFirstName

        System.out.println("Get employees with the specified name: ");
        printEmployeesData(getEmployeesByFirstName(listOfEmployees, "Oleg"));
        printSeparatorLine();

    }
    //Метод находит сотрудника с максимальной зарплатой

    static Employee getMaxSalary(Employee[] employeesArray) {
        Employee result = employeesArray[0];
        for (Employee employee : employeesArray) {
            if (employee.salary > result.salary) {
                result = employee;
            }
        }
        return result;
    }

    //- Метод находит всех сотрудников с заданным интервалом зарплаты

    static Employee[] getSalaryInterval(Employee[] employeesArray, int startInterval, int endInterval) {
        Employee[] salaryEmployees = new Employee[employeesArray.length];
        int i = 0;

        for (Employee e : employeesArray) {
            if ((e.salary >= startInterval) && (e.salary <= endInterval)) {
                salaryEmployees[i] = e;
                i++;
            }
        }
        return salaryEmployees;
    }

    ////Метод подсчитывает зарплату всех сотрудников

    static int calcEmployeesSalarySum(Employee[] employeesArray) {
        int sum = 0;
        for (Employee elem : employeesArray) {
            sum += elem.salary;
        }
        return sum;
    }

    //- находят всех сотрудников по заданному имени

    static Employee[] getEmployeesByFirstName(Employee[] employeesArray, String firstName) {
        Employee[] employeesName = new Employee[employeesArray.length];
        int i = 0;
        for (Employee elem : employeesArray) {
            if (elem.firstName == firstName) {
                employeesName[i] = elem;
                i++;
            }
        }
        return employeesName;
    }

    // Метод печатает красиво информацию о сотруднике(ах), например Employee[name="Yevhenii", age=22, salary=20000000]

    static void printEmployeesData(Employee employeesArray) {
        System.out.println("[name = " + employeesArray.firstName + " " + employeesArray.lastName + ", age = "
                + employeesArray.age + ", salary = " + employeesArray.salary + ", Married = "
                + employeesArray.isMarried + ", id = " + employeesArray.id + "]");
    }

    static void printEmployeesData(Employee[] employeesArray) {
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i] != null) {
                printEmployeesData(employeesArray[i]);
            }
        }
    }

    static void printSeparatorLine() {
        System.out.println();
        System.out.println("__________________________________________________________________________________");
        System.out.println();
    }

    static Employee[] createListOfEmployees(int count) {
        Employee[] listOfEmployees = new Employee[count];
        String[] firstNames = new String[]{"Patric", "Jane", "Alex", "Oleg", "Anna", "Jane", "Irina",
                "Ken", "Vlodimir", "Oleg"};
        String[] lastNames = new String[]{"Cooper", "Brand", "Gese", "Bernick", "Gese", "Tulwar", "Camper",
                "Swann", "Kochinsky", "Longfort"};
        int[] ages = new int[]{35, 24, 19, 35, 42, 18, 28, 44, 25, 30};
        int[] salaries = new int[]{10000, 30000, 4500, 50000, 16000, 35000, 8000, 11000, 4300, 1000};
        boolean[] married = new boolean[]{false, true, false, true, true, false, false, true, true, true};
        for (int index = 0; index < listOfEmployees.length; index++) {
            listOfEmployees[index] = new Employee();
            listOfEmployees[index].id = index + 1;
            listOfEmployees[index].firstName = firstNames[index];
            listOfEmployees[index].lastName = lastNames[index];
            listOfEmployees[index].age = ages[index];
            listOfEmployees[index].salary = salaries[index];
            listOfEmployees[index].isMarried = married[index];
        }
        return listOfEmployees;
    }
}
