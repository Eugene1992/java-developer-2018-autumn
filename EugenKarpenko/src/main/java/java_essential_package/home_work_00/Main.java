package java_essential_package.home_work_00;

public class Main {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee();

        //Создать 10 объектов класса Employee

        firstEmployee.id = 1;
        firstEmployee.firstName = "Evgeniy";
        firstEmployee.lastName = "Karpenko";
        firstEmployee.age = 28;
        firstEmployee.salary = 10000;
        firstEmployee.isMarried = false;

        Employee secondEmployee = new Employee();
        secondEmployee.id = 2;
        secondEmployee.firstName = "Oleg";
        secondEmployee.lastName = "Shnurov";
        secondEmployee.age = 23;
        secondEmployee.salary = 9000;
        secondEmployee.isMarried = true;

        Employee thirdEmployee = new Employee();
        thirdEmployee.id = 3;
        thirdEmployee.firstName = "Olga";
        thirdEmployee.lastName = "Makarova";
        thirdEmployee.age = 27;
        thirdEmployee.salary = 4300;
        thirdEmployee.isMarried = false;

        Employee fourthEmployee = new Employee();
        fourthEmployee.id = 4;
        fourthEmployee.firstName = "Alex";
        fourthEmployee.lastName = "Parker";
        fourthEmployee.age = 33;
        fourthEmployee.salary = 15000;
        fourthEmployee.isMarried = true;

        Employee fifthEmployee = new Employee();
        fifthEmployee.id = 5;
        fifthEmployee.firstName = "Jon";
        fifthEmployee.lastName = "Kapustin";
        fifthEmployee.age = 21;
        fifthEmployee.salary = 1000;
        fifthEmployee.isMarried = false;

        Employee sixthEmployee = new Employee();
        sixthEmployee.id = 6;
        sixthEmployee.firstName = "Olga";
        sixthEmployee.lastName = "Fromm";
        sixthEmployee.age = 41;
        sixthEmployee.salary = 25000;
        sixthEmployee.isMarried = true;

        Employee seventhEmployee = new Employee();
        seventhEmployee.id = 7;
        seventhEmployee.firstName = "Richard";
        seventhEmployee.lastName = "Stricker";
        seventhEmployee.age = 27;
        seventhEmployee.salary = 32000;
        seventhEmployee.isMarried = true;

        Employee eighthEmployee = new Employee();
        eighthEmployee.id = 8;
        eighthEmployee.firstName = "Jesica";
        eighthEmployee.lastName = "Fortuna";
        eighthEmployee.age = 31;
        eighthEmployee.salary = 9800;
        eighthEmployee.isMarried = false;

        Employee ninthEmployee = new Employee();
        ninthEmployee.id = 9;
        ninthEmployee.firstName = "Artur";
        ninthEmployee.lastName = "Buhov";
        ninthEmployee.age = 23;
        ninthEmployee.salary = 32000;
        ninthEmployee.isMarried = true;

        Employee tenthEmployee = new Employee();
        tenthEmployee.id = 10;
        tenthEmployee.firstName = "Sonya";
        tenthEmployee.lastName = "Overchuk";
        tenthEmployee.age = 33;
        tenthEmployee.salary = 18000;
        tenthEmployee.isMarried = true;

        // Создаем массив getMaxSalary

        Employee[] employeesArray = new Employee[]{firstEmployee, secondEmployee, thirdEmployee, fourthEmployee,
                fifthEmployee, sixthEmployee, seventhEmployee, eighthEmployee, ninthEmployee, tenthEmployee};

        // Применение метода getMaxSalary

        printSeparatorLine();
        System.out.println("Richest employee: ");
        printEmployeesData(getMaxSalary(employeesArray));
        printSeparatorLine();

        // Применение метода getSalaryInterval

        System.out.println("Salary employee Interval: ");
        printAllEmployeesData(getSalaryInterval(employeesArray, 20000, 50000));
        printSeparatorLine();

        // Применение метода calcEmployeesSalarySum

        System.out.println("Calculate employees salary sum : ");
        System.out.println(calcEmployeesSalarySum(employeesArray));
        printSeparatorLine();

        // Применение метода getEmployeesByFirstName

        System.out.println("Get employees with the specified name: ");
        printAllEmployeesData(getEmployeesByFirstName(employeesArray, "Olga"));
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

    static Employee[] getEmployeesByFirstName(Employee[] employeesArray, String firsName) {
        Employee[] employeesName = new Employee[employeesArray.length];
        int i = 0;
        for (Employee elem : employeesArray) {
            if (elem.firstName == firsName) {
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

    static void printAllEmployeesData(Employee[] employeesArray) {
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
}







