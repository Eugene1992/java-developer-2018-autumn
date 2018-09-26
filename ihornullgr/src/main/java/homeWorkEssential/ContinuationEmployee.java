package homeWorkEssential;

public class ContinuationEmployee {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee();
        firstEmployee.id = 1;
        firstEmployee.firstName = "Alan";
        firstEmployee.lastName = "Po";
        firstEmployee.age = 20;
        firstEmployee.salary = 22155;
        firstEmployee.isMarried = false;

        Employee secondEmployee = new Employee();
        secondEmployee.id = 2;
        secondEmployee.firstName = "Ihor";
        secondEmployee.lastName = "Rop";
        secondEmployee.age = 23; //eeeee
        secondEmployee.salary = 14000;
        secondEmployee.isMarried = true;

        Employee thirdEmployee = new Employee();
        thirdEmployee.id = 3;
        thirdEmployee.firstName = "Ivan";
        thirdEmployee.lastName = "Numer";
        thirdEmployee.age = 32;
        thirdEmployee.salary = 7000;
        thirdEmployee.isMarried = false;

        Employee fourEmployee = new Employee();
        fourEmployee.id = 4;
        fourEmployee.firstName = "Konan";
        fourEmployee.lastName = "Varvar";
        fourEmployee.age = 18;
        fourEmployee.salary = 11456;
        fourEmployee.isMarried = false;

        Employee fiveEmployee = new Employee();
        fiveEmployee.id = 5;
        fiveEmployee.firstName = "Arnold";
        fiveEmployee.lastName = "Swarc";
        fiveEmployee.age = 50;
        fiveEmployee.salary = 51100;
        fiveEmployee.isMarried = true;

        Employee sixEmployee = new Employee();
        sixEmployee.id = 6;
        sixEmployee.firstName = "Inna";
        sixEmployee.lastName = "Swarc";
        sixEmployee.age = 44;
        sixEmployee.salary = 51000;
        sixEmployee.isMarried = true;

        Employee sevenEmployee = new Employee();
        sevenEmployee.id = 7;
        sevenEmployee.firstName = "Inna";
        sevenEmployee.lastName = "Swarcof";
        sevenEmployee.age = 25;
        sevenEmployee.salary = 12000;
        sevenEmployee.isMarried = false;

        Employee eightEmployee = new Employee();
        eightEmployee.id = 8;
        eightEmployee.firstName = "Elif";
        eightEmployee.lastName = "Konan";
        eightEmployee.age = 55;
        eightEmployee.salary = 3300;
        eightEmployee.isMarried = false;

        Employee nineEmployee = new Employee();
        nineEmployee.id = 9;
        nineEmployee.firstName = "Gina";
        nineEmployee.lastName = "Swarc";
        nineEmployee.age = 60;
        nineEmployee.salary = 7566;
        nineEmployee.isMarried = false;

        Employee tenEmployee = new Employee();
        tenEmployee.id = 10;
        tenEmployee.firstName = "Karolina";
        tenEmployee.lastName = "Milner";
        tenEmployee.age = 33;
        tenEmployee.salary = 9000;
        tenEmployee.isMarried = true;

        Employee[] employees = new Employee[]{firstEmployee, secondEmployee, thirdEmployee, fourEmployee,
                fiveEmployee, sixEmployee, sevenEmployee, eightEmployee, nineEmployee, tenEmployee};

        System.out.println("Максимальная зарплата");
        printEmployee(getMoneyEmployee(employees));
        System.out.println("");

        System.out.println("находит всех сотрудников по заданому имени");
        printAllEmployee(searchEmploye(employees, "Inna"));
        System.out.println("");

        System.out.println("подсчитывает зарплату всех сотрудников");
        System.out.println(sumSalaryEmployee(employees));
        System.out.println("");

        System.out.println("находят всех сотрудников с заданным интервалом зарплаты");
        printAllEmployee(intervalSalaryEmployee(employees, 5000, 8000));

    }

    //- находят сотрудника с максимальной зарплатой
    static Employee getMoneyEmployee(Employee[] employees) {
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (employee.salary > result.salary) {
                result = employee;

            }
        }
        return result;
    }
    //- печатает красиво информацию о сотруднике(ах),
    // например Employee[name="Yevhenii", age=22, salary=20000000]

    static Employee printEmployee(Employee employees) {
        System.out.println("[ " + "id = " + employees.id + ", " + "first name = " + employees.firstName + ", " + "last name = " + employees.lastName + ", " +
                "age = " + employees.age + ", " + "salary = " + employees.salary + ", " + "married = " + employees.isMarried + " ]");
        return employees;
    }

    //Exception in thread "main" java.lang.NullPointerException
    static void printAllEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                printEmployee(employees[i]);
            }
        }
    }

    //- находят всех сотрудников по заданному имени
    static Employee[] searchEmploye(Employee[] employeesInput, String name) {
        Employee[] nameSearch = new Employee[employeesInput.length];
        int counter = 0;
        for (Employee employee : employeesInput) {
            if (employee.firstName == name) {
                nameSearch[counter] = employee;
                counter++;
            }
        }
        return nameSearch;
    }

    //подсчитывает зарплату всех сотрудников
    static int sumSalaryEmployee(Employee[] employees) {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.salary;
        }
        return sumSalary;
    }

    //находят всех сотрудников с заданным интервалом зарплаты
    static Employee[] intervalSalaryEmployee(Employee[] employees, int from, int to) {
        Employee[] intervalSearch = new Employee[employees.length];
        int counter = 0;
        for (Employee employee : employees) {
            if (employee.salary > from && employee.salary < to) {
                intervalSearch[counter] = employee;
                counter += 1;
            }
        }
        return intervalSearch;
    }
}
