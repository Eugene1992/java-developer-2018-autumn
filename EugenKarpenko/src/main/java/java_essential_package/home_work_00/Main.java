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

    static Employee getMaxSalary(Employee[] listOfEmployees) {
        Employee result = listOfEmployees[0];
        for (Employee employee : listOfEmployees) {
            if (employee.salary > result.salary) {
                result = employee;
            }
        }
        return result;
    }

    //- Метод находит всех сотрудников с заданным интервалом зарплаты

    static Employee[] getSalaryInterval(Employee[] listOfEmployees, int startInterval, int endInterval) {
        Employee[] salaryEmployees = new Employee[listOfEmployees.length];
        int i = 0;

        for (Employee e : listOfEmployees) {
            if ((e.salary >= startInterval) && (e.salary <= endInterval)) {
                salaryEmployees[i] = e;
                i++;
            }
        }
        return salaryEmployees;
    }

    //Метод подсчитывает зарплату всех сотрудников

    static int calcEmployeesSalarySum(Employee[] listOfEmployees) {
        int sum = 0;
        for (Employee elem : listOfEmployees) {
            sum += elem.salary;
        }
        return sum;
    }

    //Метод находит всех сотрудников по заданному имени

    static Employee[] getEmployeesByFirstName(Employee[] listOfEmployees, String firstName) {
        Employee[] employeesName = new Employee[listOfEmployees.length];
        int i = 0;
        for (Employee elem : listOfEmployees) {
            if (elem.firstName == firstName) {
                employeesName[i] = elem;
                i++;
            }
        }
        return employeesName;
    }

    // Метод печатает красиво информацию о сотруднике(ах), например Employee[name="Yevhenii", age=22, salary=20000000]

    static void printEmployeesData(Employee listOfEmployees) {
        System.out.println("[name = " + listOfEmployees.firstName + " " + listOfEmployees.lastName + ", age = "
                + listOfEmployees.age + ", salary = " + listOfEmployees.salary + ", Married = "
                + listOfEmployees.isMarried + ", id = " + listOfEmployees.id + "]");
    }

    static void printEmployeesData(Employee[] listOfEmployees) {
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i] != null) {
                printEmployeesData(listOfEmployees[i]);
            }
        }
    }

    // Метод печатает рздел. линию

    static void printSeparatorLine() {
        System.out.println();
        System.out.println("__________________________________________________________________________________");
        System.out.println();
    }
    // Метод создает экземпляры объекта Employee

    static Employee[] createListOfEmployees(int count) {
        Employee[] listOfEmployees = new Employee[count];
        String[] firstNames = new String[]{"Petr", "Jane", "Alex", "Oleg", "Anna", "Jane", "Irina",
                "Ken", "Vlodimir", "Oleg"};
        String[] lastNames = new String[]{"Cooper", "Hunter", "Pot", "Overchuk", "Gese", "Fromm", "Misit",
                "Polor", "Perar", "Light"};
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
